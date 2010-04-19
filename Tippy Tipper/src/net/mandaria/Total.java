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
        
        TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
        appState.service.CalculateTip(0.15);
		
		TextView lbl_amount = (TextView)findViewById(R.id.lbl_amount);
		TextView lbl_tip = (TextView)findViewById(R.id.lbl_tip);
		TextView lbl_total = (TextView)findViewById(R.id.lbl_total);
		
		lbl_amount.setText(appState.service.GetBillAmount());
		lbl_tip.setText(appState.service.GetTipAmount());
		lbl_total.setText(appState.service.GetTotalAmount());
		
    }
}
