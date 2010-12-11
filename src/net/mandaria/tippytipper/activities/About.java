package net.mandaria.tippytipper.activities;

import com.flurry.android.FlurryAgent;

import net.mandaria.tippytipper.R;
import android.app.Activity;
import android.os.Bundle;

public class About extends Activity  {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);  
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