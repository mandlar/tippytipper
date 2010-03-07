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
	
	public TipCalculatorService()
	{
		
	}
	
	public String GetBillAmount() 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(BillAmount);
        //return "$" + BillAmount;
    }
	
	public String GetTipAmount()
	{
		return "$" + TipAmount;
	}
	
	public String GetTotalAmount()
	{
		return "$" + TotalAmount;
	}

   /* public void setBillAmmount(String BillAmmunt) 
    {
        this.BillAmount = BillAmmunt;
    }*/
    
    public void AppendNumberToBillAmount(String number)
    {
    	if(BillEntry.length() < 16)
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
        double bill_amount = Double.valueOf(BillEntry);
  		bill_amount = bill_amount / 100;
  		
  		double tip_amount = bill_amount * percent;
  		double total_amount = bill_amount + tip_amount; 
  		
  		TipAmount = tip_amount;
  		TotalAmount = total_amount;
  		
    }
    
}
