package net.mandaria.services;

import net.mandaria.R;
import net.mandaria.TippyTipperApplication;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorService 
{
	private String BillEntry = "";
	private String BillAmount = "";
	private String TipAmount = "";
	private String TotalAmount = "";
	
	public TipCalculatorService()
	{
		
	}
	
	public String GetBillAmount() 
	{
        return "$" + BillAmount;
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
    	BillEntry = BillEntry + "" + number;
    	double amount = Double.valueOf(BillEntry);
    	amount = amount / 100;
    	BillAmount = Double.toString(amount);    	
    }
    
    public void RemoveEndNumberFromBillAmount()
    {
    	if(BillEntry.length() > 1)
    	{
    		BillEntry = BillEntry.substring(0, BillEntry.length() - 1);
    		double amount = Double.valueOf(BillEntry);
    		amount = amount / 100;
    		BillAmount = Double.toString(amount);
    	}
    	else 
    	{
    		BillEntry = "";
    		BillAmount = "";
		}
    }
    
    public void ClearBillAmount()
    {
    	BillEntry = "";
    	BillAmount = "";
    }
    
    public void CalculateTip(double percent)
    {
        double bill_amount = Double.valueOf(BillEntry);
  		bill_amount = bill_amount / 100;
  		
  		double tip_amount = bill_amount * percent;
  		double total_amount = bill_amount + tip_amount; 
  		
  		TipAmount = Double.toString(tip_amount);
  		TotalAmount = Double.toString(total_amount);
  		
    }
    
}
