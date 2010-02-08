package net.mandaria;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class Total extends Activity {

	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);  
        
        String BillAmount = ((TippyTipperApplication)this.getApplication()).getBillAmount();
        double bill_amount = Double.valueOf(BillAmount);
		bill_amount = bill_amount / 100;
		
		double tip = 0.15;
		
		double tip_amount = bill_amount * tip;
		
		double total_amount = bill_amount + tip_amount; 
		
		TextView lbl_amount = (TextView)findViewById(R.id.lbl_amount);
		TextView lbl_tip = (TextView)findViewById(R.id.lbl_tip);
		TextView lbl_total = (TextView)findViewById(R.id.lbl_total);
		
		lbl_amount.setText("$" + bill_amount);
		lbl_tip.setText("$" + tip_amount);
		lbl_total.setText("$" + total_amount);
		
    }
}
