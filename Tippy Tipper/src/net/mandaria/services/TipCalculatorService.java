package net.mandaria.services;

import java.text.NumberFormat;

import net.mandaria.R;
import net.mandaria.TippyTipperApplication;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorService 
{
	private String BillEntry = "";
	private double BillAmount = 0;
	private double TipAmount = 0;
	private double TotalAmount = 0;
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public TipCalculatorService()
	{
		
	}
	
	public String GetBillAmount() 
	{
		
		return nf.format(BillAmount);
    }
	
	public String GetTipAmount()
	{
		return nf.format(TipAmount);
	}
	
	public String GetTotalAmount()
	{
		return nf.format(TotalAmount);
	}
    
    public void AppendNumberToBillAmount(String number)
    {
    	if(BillEntry.length() < 15)
    	{
	    	BillEntry = BillEntry + "" + number;
    	}
    	double amount = Double.valueOf(BillEntry);
    	amount = amount / 100;
    	BillAmount = amount; 
    }
    
    public void RemoveEndNumberFromBillAmount()
    {
    	if(BillEntry.length() > 1)
    	{
    		BillEntry = BillEntry.substring(0, BillEntry.length() - 1);
    		double amount = Double.valueOf(BillEntry);
    		amount = amount / 100;
    		BillAmount = amount;
    	}
    	else 
    	{
    		BillEntry = "";
    		BillAmount = 0;
		}
    }
    
    public void ClearBillAmount()
    {
    	BillEntry = "";
    	BillAmount = 0;
    }
    
    public void CalculateTip(double percent)
    {	
  		double tip_amount = BillAmount * percent;
  		double total_amount = BillAmount + tip_amount; 
  		
  		TipAmount = tip_amount;
  		TotalAmount = total_amount;
    }
    
}