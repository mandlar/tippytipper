package net.mandaria;

import java.math.BigDecimal;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class TippyTipper extends Activity  {
	
	private String BillAmount = "";
	
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
        View btn_ok = findViewById(R.id.btn_ok);
        btn_zero.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		
            	}
            });
    }
    
    private void AddBillAmount(String number)
    {
    	BillAmount = BillAmount + "" + number;
    	double amount = Double.valueOf(BillAmount);
    	amount = amount / 100;
		EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
		txt_amount.setText("$" + Double.toString(amount));
    	
    }
    
    private void RemoveBillAmount()
    {
    	if(BillAmount.length() > 1)
    	{
    		BillAmount = BillAmount.substring(0, BillAmount.length() - 1);
    		double amount = Double.valueOf(BillAmount);
    		amount = amount / 100;
    		EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
    		txt_amount.setText("$" + Double.toString(amount));
    	}
    	else 
    	{
    		BillAmount = "";
    		EditText txt_amount = (EditText)findViewById(R.id.txt_amount);
    		txt_amount.setText("");
		}
    }
 
}