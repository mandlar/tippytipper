package net.mandaria.activities;

import net.mandaria.R;
import net.mandaria.TippyTipperApplication;
import net.mandaria.R.id;
import net.mandaria.R.layout;
import net.mandaria.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class Total extends Activity {

	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);
        
        double defaultTipPercentage = (double)Settings.getDefaultTipPercentage(getBaseContext());
		
        CalculateTip(defaultTipPercentage);
        
        View btn_SplitBill = findViewById(R.id.btn_SplitBill);
        btn_SplitBill.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		Intent i = new Intent(getBaseContext(), SplitBill.class);
            		startActivity(i);
            	}
            });
		
        View btn_round_down = findViewById(R.id.btn_round_down);
        btn_round_down.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		RoundDown();
            	}
            });
        
        View btn_round_up = findViewById(R.id.btn_round_up);
        btn_round_up.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		RoundUp();
            	}
            });
        
        View btn_TipAmount1 = findViewById(R.id.btn_TipAmount1);
        btn_TipAmount1.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		CalculateTip(10.0);
        	}
        });
        
        View btn_TipAmount2 = findViewById(R.id.btn_TipAmount2);
        btn_TipAmount2.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		CalculateTip(15.0);
        	}
        });
        
        View btn_TipAmount3 = findViewById(R.id.btn_TipAmount3);
        btn_TipAmount3.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		CalculateTip(20.0);
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
						CalculateTip((double)progress);
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
					// TODO Auto-generated method stub
					
				}
			});
		
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
  		}
  		return false;
  	}
    
    private void CalculateTip(Double percent)
    {
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		appState.service.CalculateTip(percent/100);

		BindData();
    }
    
    private void RoundDown()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.RoundDown();
    	
    	BindData();
    }
    
    private void RoundUp()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.RoundUp();
    	
    	BindData();
    }
    
    private void BindData()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	
    	TextView lbl_amount = (TextView)findViewById(R.id.lbl_amount);
		TextView lbl_tip = (TextView)findViewById(R.id.lbl_tip);
		TextView lbl_total = (TextView)findViewById(R.id.lbl_total);
		TextView lbl_tip_percentage = (TextView)findViewById(R.id.lbl_tip_percentage);
		SeekBar seek_tip_percentage = (SeekBar)findViewById(R.id.seek_tip_percentage);
		
		lbl_tip_percentage.setText(appState.service.GetTipPercentage());
		lbl_amount.setText(appState.service.GetBillAmount());
		lbl_tip.setText(appState.service.GetTipAmount());
		lbl_total.setText(appState.service.GetTotalAmount());
		seek_tip_percentage.setProgress(appState.service.GetTipPercentageRounded());
    }
}
