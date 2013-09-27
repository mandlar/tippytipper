package net.mandaria.tippytipperlibrary.activities;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import net.mandaria.tippytipperlibrary.tasks.GetAdRefreshRateTask;
import net.mandaria.tippytipperlibrary.tasks.GetInHouseAdsPercentageTask;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.flurry.android.FlurryAgent;

public class Total extends SherlockActivity {
	
	WebView adView;
	LinearLayout div_ads;
	
	private long mLastAdServedMillis = 0; // last ad update
	private Handler mHandler = new Handler();

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        
        TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
        
        calculateTip(appState.service.getTipPercentageAsDouble());
        
        View btn_SplitBill = findViewById(R.id.btn_SplitBill);
        btn_SplitBill.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		splitBillWithDefaultNumberOfPeople();
            		
            		Intent i = new Intent(getBaseContext(), SplitBill.class);
            		startActivity(i);
            	}
            });
//        Drawable d_SplitBill = findViewById(R.id.btn_SplitBill).getBackground();
//        int green = Color.parseColor("#216C2A");
//        PorterDuffColorFilter filter_green = new PorterDuffColorFilter(green, PorterDuff.Mode.SRC_ATOP);
//        d_SplitBill.setColorFilter(filter_green);
		
        View btn_round_down = findViewById(R.id.btn_round_down);
        btn_round_down.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		roundDown();
            	}
            });
        
        View btn_round_up = findViewById(R.id.btn_round_up);
        btn_round_up.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		roundUp();
            	}
            });
		
		SeekBar seek_tip_percentage = (SeekBar)findViewById(R.id.seek_tip_percentage);
		seek_tip_percentage.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
			{	
				@Override
				public void onProgressChanged(SeekBar seekBar, int progress,
						boolean fromUser)
				{
					if(fromUser)
					{
						calculateTip((double)progress);
					}
				}

				@Override
				public void onStartTrackingTouch(SeekBar seekBar)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onStopTrackingTouch(SeekBar seekBar)
				{
					tipPercentageSliderOnStopTouch();
				}
			});
		
		adView = (WebView)findViewById(R.id.ad);
		div_ads = (LinearLayout)findViewById(R.id.div_ads);
    }
    
    /* Called after onCreate or onRestart */
	@Override
	public void onStart()
	{
		super.onStart();
		boolean enableErrorLogging = Settings.getEnableErrorLogging(getBaseContext());
        String API = getString(R.string.flurrykey);
        if(!API.equals("") && enableErrorLogging == true)
		{
			FlurryAgent.setContinueSessionMillis(30000);
			FlurryAgent.onStartSession(this, API);
		}
        
        UpdateAdValues();
		
		refreshBillAmount();
		
		Button btn_TipAmount1 = (Button)findViewById(R.id.btn_TipAmount1);
        double tipPercentagePresetOne = Settings.getTipPercentagePresetOne(getBaseContext());
        btn_TipAmount1.setText((int)tipPercentagePresetOne + "%");
        btn_TipAmount1.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		double tipPercentagePresetOne = Settings.getTipPercentagePresetOne(getBaseContext());
        		calculateTip(tipPercentagePresetOne);
        		
        		Map<String, String> params = new HashMap<String, String>();
        		params.put("Tip Percentage Preset", String.valueOf(tipPercentagePresetOne));
        		FlurryAgent.onEvent("Tip Preset One Button", params);
        	}
        });
        
        Button btn_TipAmount2 = (Button)findViewById(R.id.btn_TipAmount2);
        double tipPercentagePresetTwo = Settings.getTipPercentagePresetTwo(getBaseContext());
        btn_TipAmount2.setText((int)tipPercentagePresetTwo + "%");
        btn_TipAmount2.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		double tipPercentagePresetTwo = Settings.getTipPercentagePresetTwo(getBaseContext());
        		calculateTip(tipPercentagePresetTwo);
        		
        		Map<String, String> params = new HashMap<String, String>();
        		params.put("Tip Percentage Preset", String.valueOf(tipPercentagePresetTwo));
        		FlurryAgent.onEvent("Tip Preset Two Button", params);
        	}
        });
        
        Button btn_TipAmount3 = (Button)findViewById(R.id.btn_TipAmount3);
        double tipPercentagePresetThree = Settings.getTipPercentagePresetThree(getBaseContext());
        btn_TipAmount3.setText((int)tipPercentagePresetThree + "%");
        btn_TipAmount3.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		double tipPercentagePresetThree = Settings.getTipPercentagePresetThree(getBaseContext());
        		calculateTip(tipPercentagePresetThree);
        		
        		Map<String, String> params = new HashMap<String, String>();
        		params.put("Tip Percentage Preset", String.valueOf(tipPercentagePresetThree));
        		FlurryAgent.onEvent("Tip Preset Three Button", params);
        	}
        });
	}
	
	 @Override
	public void onStop()
    {
       super.onStop();
       FlurryAgent.onEndSession(this);
    }
    
    @Override
  	public boolean onCreateOptionsMenu(Menu menu)
  	{
  		super.onCreateOptionsMenu(menu);
  		MenuInflater inflater = getSupportMenuInflater();
  		inflater.inflate(R.menu.menu, menu);
  		FlurryAgent.onEvent("Menu Button");
  		return true;
  	}
    
    @Override
	protected void onResume()
	{
		super.onResume();

		startUpdateTimer();
		displayAd();
	}
    
    @Override
	protected void onPause()
	{
		super.onPause();
		stopUpdateTimer();
	}

	private void startUpdateTimer()
	{
		mHandler.removeCallbacks(mUpdateTimeTask);
		mHandler.postDelayed(mUpdateTimeTask, 0);
	}

	private void stopUpdateTimer()
	{
		mHandler.removeCallbacks(mUpdateTimeTask);
	}

  	@Override
  	public boolean onOptionsItemSelected(MenuItem item)
  	{
  		if (item.getItemId() == R.id.settings)
		{
			startActivity(new Intent(this, Settings.class));
			FlurryAgent.onEvent("Settings Button");
			return true;
		}
		else if (item.getItemId() == R.id.about)
		{
			startActivity(new Intent(this, About.class));
			FlurryAgent.onEvent("About Button");
			return true;
		}
  		return false;
  	}
  	
  	private void tipPercentageSliderOnStopTouch()
  	{
  		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		Map<String, String> params = new HashMap<String, String>();
		params.put("Bill Amount", appState.service.getBillAmount());
		params.put("Tax Amount", appState.service.getTaxAmount());
		params.put("Tip Amount", appState.service.getTipAmount());
		params.put("Tip Percentage", appState.service.getTipPercentage());
		params.put("Tax Percentage", appState.service.getTaxPercentage());
		
		FlurryAgent.onEvent("Tip Percentage Slider", params);
  	}
  	
  	private void splitBillWithDefaultNumberOfPeople()
  	{
  		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
  		int numberOfPeople = Settings.getDefaultNumberOfPeopleToSplitBill(getBaseContext());
  		
  		Map<String, String> params = new HashMap<String, String>();
		params.put("Default Number Of People", String.valueOf(numberOfPeople));
		params.put("Bill Amount", appState.service.getBillAmount());
		params.put("Tax Amount", appState.service.getTaxAmount());
		params.put("Tip Amount", appState.service.getTipAmount());
		params.put("Total Amount", appState.service.getTotalAmount());
		params.put("Tip Percentage", appState.service.getTipPercentage());
		params.put("Tax Percentage", appState.service.getTaxPercentage());
		FlurryAgent.onEvent("Split Bill Button", params);
		
		appState.service.splitBill(numberOfPeople);
  	}
    
    private void calculateTip(Double percent)
    {
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		float excludeTaxRate = Settings.getExcludeTaxRate(getBaseContext());
		boolean enableExcludeTaxRate = Settings.getEnableExcludeTaxRate(getBaseContext());
		if(enableExcludeTaxRate == false)
			excludeTaxRate = 0;
		
		//appState.service.CalculateTip(percent/100.0);
		appState.service.calculateTip(percent/100.0, excludeTaxRate/100.0);

		bindData();
    }
    
    private void roundDown()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	boolean roundTip = Settings.isSetToRoundByTip(getBaseContext());
    	
    	String preRoundTipAmount = appState.service.getTipAmount();
    	String preRoundTotalAmount = appState.service.getTotalAmount();
    	
    	appState.service.roundDown(roundTip);
    	
    	Map<String, String> params = new HashMap<String, String>();
		params.put("Round Tip", String.valueOf(roundTip));
		params.put("Pre Round Tip Amount", preRoundTipAmount);
		params.put("Pre Round Total Amount", preRoundTotalAmount);
		params.put("Bill Amount", appState.service.getBillAmount());
		params.put("Tax Amount", appState.service.getTaxAmount());
		params.put("Tip Amount", appState.service.getTipAmount());
		params.put("Total Amount", appState.service.getTotalAmount());
    	FlurryAgent.onEvent("Round Down Button", params);
    	
    	bindData();
    }
    
    private void roundUp()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	boolean roundTip = Settings.isSetToRoundByTip(getBaseContext());
    	
    	String preRoundTipAmount = appState.service.getTipAmount();
    	String preRoundTotalAmount = appState.service.getTotalAmount();
    	
    	appState.service.roundUp(roundTip);
    	
    	Map<String, String> params = new HashMap<String, String>();
		params.put("Round Tip", String.valueOf(roundTip));
		params.put("Pre Round Tip Amount", preRoundTipAmount);
		params.put("Pre Round Total Amount", preRoundTotalAmount);
		params.put("Bill Amount", appState.service.getBillAmount());
		params.put("Tax Amount", appState.service.getTaxAmount());
		params.put("Tip Amount", appState.service.getTipAmount());
		params.put("Total Amount", appState.service.getTotalAmount());
    	FlurryAgent.onEvent("Round Up Button", params);
    	
    	bindData();
    }
    
    public void refreshBillAmount()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		double tipPercent = appState.service.getTipPercentageAsDouble();
		float excludeTaxRate = Settings.getExcludeTaxRate(getBaseContext());
		boolean enableExcludeTaxRate = Settings.getEnableExcludeTaxRate(getBaseContext());
		if(enableExcludeTaxRate == false)
			excludeTaxRate = 0;
		
		if(excludeTaxRate == 0)
		{
			appState.service.refreshBillAmount();
			appState.service.calculateTip(appState.service.getTipPercentageAsDouble()/100.0, excludeTaxRate);
			bindData();
		}
		else
			calculateTip(tipPercent);
    }
    
    private void bindData()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	
    	TextView lbl_bill_amount = (TextView)findViewById(R.id.lbl_bill_amount);
		TextView lbl_tip_amount = (TextView)findViewById(R.id.lbl_tip_amount);
		TextView lbl_total_amount = (TextView)findViewById(R.id.lbl_total_amount);
		//TextView lbl_tip_percentage = (TextView)findViewById(R.id.lbl_tip_percentage);
		SeekBar seek_tip_percentage = (SeekBar)findViewById(R.id.seek_tip_percentage);
		View inflated_excludetax = findViewById(R.id.inflated_excludeTax);
		TextView lbl_tip_text = (TextView)findViewById(R.id.lbl_tip_text);
		
		float excludeTaxRate = Settings.getExcludeTaxRate(getBaseContext());
		boolean enableExcludeTaxRate = Settings.getEnableExcludeTaxRate(getBaseContext());
		if(enableExcludeTaxRate == false)
			excludeTaxRate = 0;
		
		if(excludeTaxRate != 0)
		{
			ViewStub stub_excludeTax = (ViewStub)findViewById(R.id.stub_excludeTax);
			if(stub_excludeTax != null)
				stub_excludeTax.setVisibility(View.VISIBLE);
			else if(inflated_excludetax != null)
				inflated_excludetax.setVisibility(View.VISIBLE);
			TextView lbl_tax_amount = (TextView)findViewById(R.id.lbl_tax_amount);
			lbl_tax_amount.setText(appState.service.getTaxAmount());
			
			// Add (tax%): to label
			TextView lbl_tax_text = (TextView)findViewById(R.id.lbl_tax_text);
			String tax_text = lbl_tax_text.getText().toString();
			if(!tax_text.contains(appState.service.getTaxPercentage()))
				lbl_tax_text.setText(this.getString(R.string.tax).replace(":", " (" + appState.service.getTaxPercentage() + "):"));
		}
		else
		{
			if(inflated_excludetax != null)
				inflated_excludetax.setVisibility(View.GONE);
		}

		// Add (tip%): to label
		String tip_text = lbl_tip_text.getText().toString();
		if(!tip_text.contains(appState.service.getTipPercentage()))
			lbl_tip_text.setText(this.getString(R.string.tip).replace(":", " (" + appState.service.getTipPercentage() + "):"));
		
		//lbl_tip_percentage.setText(appState.service.GetTipPercentage());
		lbl_bill_amount.setText(appState.service.getBillAmount());
		lbl_tip_amount.setText(appState.service.getTipAmount());
		lbl_total_amount.setText(appState.service.getTotalAmount());
		seek_tip_percentage.setProgress(appState.service.getTipPercentageRounded());
    }
    
    private Runnable mUpdateTimeTask = new Runnable()
	{
		@Override
		public void run()
		{
			// Refresh the ads
			if((SystemClock.elapsedRealtime() - mLastAdServedMillis) > Settings.getAdRefreshRate(Total.this))
			{
				displayAd();
				mLastAdServedMillis = SystemClock.elapsedRealtime();
			}

			mHandler.postDelayed(this, 1000); // update every 1 second
		}
		
	};
	
	private void UpdateAdValues() 
	{
		GetAdRefreshRateTask task_adrefreshrate = (GetAdRefreshRateTask) new GetAdRefreshRateTask(getApplication(), this, Locale.getDefault()).execute();
	
		GetInHouseAdsPercentageTask task_inhouseadspercentage = (GetInHouseAdsPercentageTask) new GetInHouseAdsPercentageTask(getApplication(), this, Locale.getDefault()).execute();
	}
	
	// Used to show ads or a banner message (e.g. radioreddit.com is down)
	private void displayAd()
	{
		Random r = new Random();
		int randomInt = r.nextInt(100);
		
		// Display in house ad
		if(randomInt < Settings.getInHouseAdsPercentage(this) && Settings.getEnableAds(this))
		{
			div_ads.setVisibility(View.VISIBLE);
			
			// Setup handler for 404's
			adView.setWebViewClient(new WebViewClient() 
			{
			    @Override
			    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) 
			    {
			    	//displayOfflineAd(); 
			    	// For now, just don't display any ads
			    	div_ads.setVisibility(View.GONE);
					
			        super.onReceivedError(view, errorCode, description, failingUrl);
			    }
			    
			    @Override
			    public boolean shouldOverrideUrlLoading(WebView view, String url) 
			    {
			    	try
			    	{ 
				    	Intent i = new Intent(Intent.ACTION_VIEW);
				    	i.setData(Uri.parse(url));
				    	startActivity(i);
			    	}
			    	catch(Exception ex)
			    	{
			    		// TODO: this should be made into it's own string
			    		Toast.makeText(Total.this, "Web Browser Error: Application is not installed on your phone", Toast.LENGTH_LONG).show();
			    	}
			    	return true;
			    	
			    }

			 });

			int applicationID = TippyTipperApplication.getApplicationID(Total.this);
			
			// Request an ad
			adView.loadUrl("http://www.bryandenny.com/software/android/default.aspx?id=" + applicationID);
			//Toast.makeText(getApplicationContext(), "Show inhouse ad " + randomInt, Toast.LENGTH_LONG).show();
		}
		else // display no ads
		{
			div_ads.setVisibility(View.GONE);
		}
	}
}
