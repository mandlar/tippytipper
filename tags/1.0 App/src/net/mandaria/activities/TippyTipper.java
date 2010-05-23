package net.mandaria.activities;

import net.mandaria.R;
import net.mandaria.TippyTipperApplication;
import net.mandaria.R.id;
import net.mandaria.R.layout;
import net.mandaria.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class TippyTipper extends Activity  {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);  
        
        // Setup click listeners for buttons
        View btn_one = findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("1");
            	}
            });
        View btn_two = findViewById(R.id.btn_two);
        btn_two.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("2");
            	}
            });
        View btn_three = findViewById(R.id.btn_three);
        btn_three.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("3");
            	}
            });
        View btn_four = findViewById(R.id.btn_four);
        btn_four.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("4");
            	}
            });
        View btn_five = findViewById(R.id.btn_five);
        btn_five.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("5");
            	}
            });
        View btn_six = findViewById(R.id.btn_six);
        btn_six.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("6");
            	}
            });
        View btn_seven = findViewById(R.id.btn_seven);
        btn_seven.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("7");
            	}
            });
        View btn_eight = findViewById(R.id.btn_eight);
        btn_eight.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("8");
            	}
            });
        View btn_nine = findViewById(R.id.btn_nine);
        btn_nine.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddBillAmount("9");
            	}
            });
        View btn_zero = findViewById(R.id.btn_zero);
        btn_zero.setOnClickListener(new OnClickListener() 
	        {
	        	public void onClick(View v) 
	        	{
	        		AddBillAmount("0");
	        	}
	        });
        View btn_delete = findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		RemoveBillAmount();
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
            		CalcualteTipWithDefaultTipPercentage();
            		
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
  	public boolean onCreateOptionsMenu(Menu menu)
  	{
  		super.onCreateOptionsMenu(menu);
  		MenuInflater inflater = getMenuInflater();
  		inflater.inflate(R.menu.menu, menu);
  		return true;
  	}

  	@Override
  	public boolean onOptionsItemSelected(MenuItem item)
  	{
  		switch(item.getItemId())
  		{
  			case R.id.settings:
  				startActivity(new Intent(this, Settings.class));
  				return true;
  			case R.id.about:
  				startActivity(new Intent(this, About.class));
				return true;
  		}
  		return false;
  	}
  	
  	private void CalcualteTipWithDefaultTipPercentage()
  	{
  		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		double defaultTipPercentage = (double)Settings.getDefaultTipPercentage(getBaseContext());
		float excludeTaxRate = (float)Settings.getExcludeTaxRate(getBaseContext());
		
		appState.service.CalculateTip(defaultTipPercentage/100.0, excludeTaxRate/100.0);
  	}
    
    private void AddBillAmount(String number)
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.AppendNumberToBillAmount(number);
    	
		EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
		txt_amount.setText(appState.service.GetBillAmount());
    }
    
    private void RemoveBillAmount()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.RemoveEndNumberFromBillAmount();
    	
    	EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
		txt_amount.setText(appState.service.GetBillAmount());
    }
 
}