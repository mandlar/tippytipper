package net.mandaria;

import android.app.Activity;
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
		
        CalculateTip(15.0);
		
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
