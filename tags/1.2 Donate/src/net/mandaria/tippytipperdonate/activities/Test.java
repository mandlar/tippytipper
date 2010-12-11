package net.mandaria.tippytipperdonate.activities;

import net.mandaria.tippytipperdonate.R;
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