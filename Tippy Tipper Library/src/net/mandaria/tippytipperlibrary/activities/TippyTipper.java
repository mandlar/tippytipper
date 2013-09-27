package net.mandaria.tippytipperlibrary.activities;

import java.util.HashMap;
import java.util.Map;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.flurry.android.FlurryAgent;

public class TippyTipper extends SherlockActivity  {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  
     
        bindData();
        
        // Setup click listeners for buttons
        View btn_one = findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("1");
            		FlurryAgent.onEvent("1 Button");
            	}
            });
        View btn_two = findViewById(R.id.btn_two);
        btn_two.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("2");
            		FlurryAgent.onEvent("2 Button");
            	}
            });
        View btn_three = findViewById(R.id.btn_three);
        btn_three.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("3");
            		FlurryAgent.onEvent("3 Button");
            	}
            });
        View btn_four = findViewById(R.id.btn_four);
        btn_four.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("4");
            		FlurryAgent.onEvent("4 Button");
            	}
            });
        View btn_five = findViewById(R.id.btn_five);
        btn_five.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("5");
            		FlurryAgent.onEvent("5 Button");
            	}
            });
        View btn_six = findViewById(R.id.btn_six);
        btn_six.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("6");
            		FlurryAgent.onEvent("6 Button");
            	}
            });
        View btn_seven = findViewById(R.id.btn_seven);
        btn_seven.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("7");
            		FlurryAgent.onEvent("7 Button");
            	}
            });
        View btn_eight = findViewById(R.id.btn_eight);
        btn_eight.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("8");
            		FlurryAgent.onEvent("8 Button");
            	}
            });
        View btn_nine = findViewById(R.id.btn_nine);
        btn_nine.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		addBillAmount("9");
            		FlurryAgent.onEvent("9 Button");
            	}
            });
        View btn_zero = findViewById(R.id.btn_zero);
        btn_zero.setOnClickListener(new OnClickListener() 
	        {
	        	public void onClick(View v) 
	        	{
	        		addBillAmount("0");
	        		FlurryAgent.onEvent("0 Button");
	        	}
	        });
        View btn_delete = findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		removeBillAmount();
            		FlurryAgent.onEvent("Delete Button");
            	}
            });
        
        btn_delete.setOnLongClickListener(new OnLongClickListener()
			{
				public boolean onLongClick(View v)
				{
					clearBillAmount();
					return true;
				}
			});
        
        // Added Clear Button -- Maintained the Long-Click Delete -- SPDJR
        View btn_clear = findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		clearBillAmount();
            		FlurryAgent.onEvent("Clear Button");
            	}
            });
        
        btn_clear.setOnLongClickListener(new OnLongClickListener()
			{
				public boolean onLongClick(View v)
				{
					clearBillAmount();
					return true;
				}
			});
        
        
//        Drawable d_delete = findViewById(R.id.btn_delete).getBackground();
//        int red = Color.parseColor("#8E1609");
//        PorterDuffColorFilter filter_red = new PorterDuffColorFilter(red, PorterDuff.Mode.SRC_ATOP);
//        d_delete.setColorFilter(filter_red);

        View btn_ok = findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		calcualteTipWithDefaultTipPercentage();
            		
            		Intent i = new Intent(getBaseContext(), Total.class);//new Intent(this, Total.class);
            		startActivity(i);
            	}
            });
//        Drawable d_ok = findViewById(R.id.btn_ok).getBackground();
//        int green = Color.parseColor("#216C2A");
//        PorterDuffColorFilter filter_green = new PorterDuffColorFilter(green, PorterDuff.Mode.SRC_ATOP);
//        d_ok.setColorFilter(filter_green);
    }
    
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
    }
    
    @Override
	public void onStop()
    {
       super.onStop();
      
       FlurryAgent.onEndSession(this);
    }
    
    @Override
    public void onDestroy()
    {
    	super.onDestroy();
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
		else if (item.getItemId() == R.id.email_feedback) {
			FlurryAgent.onEvent("Email Feedback");
			SendEmail();
			return true;
		} 
  		return false;
  	}
  	
  	private void SendEmail()
	{
		// Setup an intent to send email
		Intent sendIntent;
		sendIntent = new Intent(Intent.ACTION_SEND);
		sendIntent.setType("application/octet-stream");
		// Address
		sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { getString(R.string.email_address) });
		// Subject
		String appName = getString(R.string.app_name);
		String version = "";
		try
		{
			version = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
		}
		catch(NameNotFoundException e)
		{

		}

		sendIntent.putExtra(Intent.EXTRA_SUBJECT, appName + " " + version);
		// Body
		String body = "\n\n\n\n\n";
		body += getString(R.string.email_using_custom_rom) + "\n";
		body += "--------------------\n";
		body += getString(R.string.email_do_not_edit_message) + "\n\n";
		body += "BOARD: " + Build.BOARD + "\n";
		body += "BRAND: " + Build.BRAND + "\n";
		body += "CPU_ABI: " + Build.CPU_ABI + "\n";
		body += "DEVICE: " + Build.DEVICE + "\n";
		body += "DISPLAY: " + Build.DISPLAY + "\n";
		body += "FINGERPRINT: " + Build.FINGERPRINT + "\n";
		body += "HOST: " + Build.HOST + "\n";
		body += "ID: " + Build.ID + "\n";
		body += "MANUFACTURER: " + Build.MANUFACTURER + "\n";
		body += "MODEL: " + Build.MODEL + "\n";
		body += "PRODUCT: " + Build.PRODUCT + "\n";
		body += "TAGS: " + Build.TAGS + "\n";
		body += "TIME: " + Build.TIME + "\n";
		body += "TYPE: " + Build.TYPE + "\n";
		body += "USER: " + Build.USER + "\n";
		body += "VERSION.CODENAME: " + Build.VERSION.CODENAME + "\n";
		body += "VERSION.INCREMENTAL: " + Build.VERSION.INCREMENTAL + "\n";
		body += "VERSION.RELEASE: " + Build.VERSION.RELEASE + "\n";
		body += "VERSION.SDK: " + Build.VERSION.SDK + "\n";
		body += "VERSION.SDK_INT: " + Build.VERSION.SDK_INT + "\n";

		sendIntent.putExtra(Intent.EXTRA_TEXT, body);
		startActivity(Intent.createChooser(sendIntent, "Send Mail"));
	}
  	
  	private void calcualteTipWithDefaultTipPercentage()
  	{
  		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		double defaultTipPercentage = Settings.getDefaultTipPercentage(getBaseContext());
		float excludeTaxRate = Settings.getExcludeTaxRate(getBaseContext());
		boolean enableExcludeTaxRate = Settings.getEnableExcludeTaxRate(getBaseContext());
		if(enableExcludeTaxRate == false)
			excludeTaxRate = 0;
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("Default Tip Percentage", String.valueOf(defaultTipPercentage));
		params.put("Exclude Tax Rate", String.valueOf(excludeTaxRate));
		params.put("Bill Amount", appState.service.getBillAmount());
		FlurryAgent.onEvent("OK Button", params);
		
		appState.service.calculateTip(defaultTipPercentage/100.0, excludeTaxRate/100.0);
  	}
    
    private void addBillAmount(String number)
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.appendNumberToBillAmount(number);
    	
		bindData();
    }
    
    private void removeBillAmount()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.removeEndNumberFromBillAmount();
    	
    	bindData();
    }
    
    private void clearBillAmount()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.clearBillAmount();
    	
    	bindData();
    }
    
    private void bindData()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
   
    	EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
		txt_amount.setText(appState.service.getBillAmount());
    }
 
}