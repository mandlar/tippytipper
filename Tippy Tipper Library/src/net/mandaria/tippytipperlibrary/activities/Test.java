package net.mandaria.tippytipperlibrary.activities;

import net.mandaria.tippytipperlibrary.R;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class Test extends SherlockActivity  {
	
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