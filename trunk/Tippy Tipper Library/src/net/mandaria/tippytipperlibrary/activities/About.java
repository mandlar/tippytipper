package net.mandaria.tippytipperlibrary.activities;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.flurry.android.FlurryAgent;

public class About extends SherlockActivity  {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);  

		getSupportActionBar().setTitle(getString(R.string.about));
		
		TextView lbl_AboutDetails = (TextView)findViewById(R.id.lbl_AboutDetails);
		lbl_AboutDetails.setMovementMethod(LinkMovementMethod.getInstance()); // makes links clickable
		lbl_AboutDetails.setText(Html.fromHtml(getString(R.string.aboutdetails)));
		
		String version = "1.0";
		try
		{
			version = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
		}
		catch(NameNotFoundException ex)
		{

		}
		
		TextView lbl_VersionNumber = (TextView)findViewById(R.id.lbl_VersionNumber);
		lbl_VersionNumber.setText(" v." + version);
		
		Button btn_BuyDonateVersion = (Button)findViewById(R.id.btn_BuyDonateVersion);
		btn_BuyDonateVersion.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				FlurryAgent.onEvent("radio reddit - About - Go Pro");
				
				String url = TippyTipperApplication.getPaidVersionLink();
				
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
			}
		});
		
		if(TippyTipperApplication.isProVersion(this))
		{
			btn_BuyDonateVersion.setEnabled(false);
			btn_BuyDonateVersion.setText(getString(R.string.thanks_for_purchasing));
		}
		
		Button btn_VisitBryanDennyCom = (Button)findViewById(R.id.btn_VisitBryanDennyCom);
		btn_VisitBryanDennyCom.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				FlurryAgent.onEvent("radio reddit - About - radioreddit.com");
				
				String url = "http://www.bryandenny.com";
				
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
				
			}
		});
		
		Button btn_MoreAppsByDev = (Button)findViewById(R.id.btn_MoreAppsByDev);
		btn_MoreAppsByDev.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				FlurryAgent.onEvent("radio reddit - About - Help translate");
				
				String url = "http://www.bryandenny.com/software/";
				
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
				
			}
		});
		
		Button btn_SourceCodeProject = (Button)findViewById(R.id.btn_SourceCodeProject);
		btn_SourceCodeProject.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				FlurryAgent.onEvent("radio reddit - About - Source code project");
				
				String url = "https://code.google.com/p/tippytipper/";
				
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
				
			}
		});
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
}