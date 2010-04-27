package net.mandaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SplitBill extends Activity {

	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitbill);  
        
        SplitBill(2);
		
        View btn_add_person = findViewById(R.id.btn_add_person);
        btn_add_person.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		AddPerson();
            	}
            });
        
        View btn_remove_person = findViewById(R.id.btn_remove_person);
        btn_remove_person.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		RemovePerson();
            	}
            });
    }
    
    private void AddPerson()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	int people = appState.service.GetNumberOfPeople() + 1;
    	
    	SplitBill(people);
    }
    
    private void RemovePerson()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	int people = appState.service.GetNumberOfPeople() - 1;
    	
    	if(people > 1)
    		SplitBill(people);
    }
    
    private void SplitBill(int people)
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	appState.service.SplitBill(people);
    	
    	BindData();
    }
    
    private void BindData()
    {
    	TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
    	
    	TextView lbl_split_amount = (TextView)findViewById(R.id.lbl_split_amount);
		TextView lbl_split_tip = (TextView)findViewById(R.id.lbl_split_tip);
		TextView lbl_split_total = (TextView)findViewById(R.id.lbl_split_total);
		TextView lbl_NumberOfPeople = (TextView)findViewById(R.id.lbl_NumberOfPeople);
		
		lbl_split_amount.setText(appState.service.GetSplitBillAmount());
		lbl_split_tip.setText(appState.service.GetSplitTipAmount());
		lbl_split_total.setText(appState.service.GetSplitTotalAmount());
		lbl_NumberOfPeople.setText(Integer.toString(appState.service.GetNumberOfPeople()));
		
    }
}