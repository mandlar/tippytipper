package net.mandaria.tippytipper.activities;

import net.mandaria.tippytipper.R;
import android.app.Activity;
import android.os.Bundle;

public class Test extends Activity  {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
        setContentView(R.layout.test);  
        }
        catch(Exception ex)
        {
        	String test = "";
        }
        
    }

}