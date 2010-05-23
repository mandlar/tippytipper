package net.mandaria.tippytipperdonate.activities;

import net.mandaria.tippytipperdonate.R;
import net.mandaria.tippytipperdonate.R.id;
import net.mandaria.tippytipperdonate.R.layout;
import net.mandaria.tippytipperdonate.R.menu;
import net.mandaria.tippytipperdonate.TippyTipperApplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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