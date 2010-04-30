package net.mandaria.services;

import java.text.DecimalFormat;
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
	private double TotalAmountBeforeRounded = 0;
	private double TipPercentage = 0.15;
	private double SplitBillAmount = 0;
	private double SplitTipAmount = 0;
	private double SplitTotalAmount = 0;
	private int NumberOfPeople = 2;
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
	
	public String GetSplitBillAmount()
	{
		return nf.format(SplitBillAmount);
	}
	
	public String GetSplitTipAmount()
	{
		return nf.format(SplitTipAmount);
	}
	
	public String GetSplitTotalAmount()
	{
		return nf.format(SplitTotalAmount);
	}
	
	public String GetTipPercentage()
	{
		double percent = TipPercentage * 100;
		DecimalFormat dec = new DecimalFormat("0.0");
		return dec.format(percent) + "%";
	}
	
	public double GetTipPercentageAsDouble()
	{
		double percent = TipPercentage * 100;
		return percent;
	}
	
	public int GetNumberOfPeople()
	{
		return NumberOfPeople;
	}
	
	public int GetTipPercentageRounded()
	{
		int percent = (int)Math.round(TipPercentage * 100);
		return percent;
	}
	
	public void SetTipPercentage(double percent)
	{
		TipPercentage = percent;
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
    
    public void CalculateTip()
    {	
  		double tip_amount = BillAmount * TipPercentage;
  		tip_amount = Math.round(tip_amount * 100) / 100.0; // round tip to nearest penny
  		double total_amount = BillAmount + tip_amount; 
  		
  		TipAmount = tip_amount;
  		TotalAmount = total_amount;
  		TotalAmountBeforeRounded = TotalAmount;
    }
    
    public void CalculateTip(double percent)
    {
    	SetTipPercentage(percent);
    	CalculateTip();
    }
    
    public void RoundUp()
    {
    	TotalAmount = TotalAmountBeforeRounded;
    	TotalAmount = Math.ceil(TotalAmount);
    	TipAmount = TotalAmount - BillAmount;
    	TipPercentage = (TotalAmount/BillAmount) - 1;
    }
    
    public void RoundDown()
    {
    	if(Math.floor(TotalAmountBeforeRounded) >= BillAmount)
    	{
    		TotalAmount = TotalAmountBeforeRounded;
    		TotalAmount = Math.floor(TotalAmount);
    		TipAmount = TotalAmount - BillAmount;
    		TipPercentage = (TotalAmount/BillAmount) - 1;
    	}
    }
    
    public void SplitBill(int people)
    {
    	if(people < 1)
    		throw new IllegalArgumentException("Number of people cannot be below one.");
    	NumberOfPeople = people;
    	int SplitBillInteger = (int)(BillAmount * 100.0);
    	int SplitBillRemainder = (int)SplitBillInteger % NumberOfPeople;
    	if(SplitBillRemainder != 0)
    		SplitBillAmount = (double)SplitBillInteger - (double)SplitBillRemainder + (double)NumberOfPeople;
    	else
    		SplitBillAmount = (double)SplitBillInteger;
    	SplitBillAmount = SplitBillAmount / 100.0;
    	SplitBillAmount = SplitBillAmount / NumberOfPeople;
    	
    	// calculate tip TODO: Can be refactored with CalculateTip() function into a generic function for both places
    	double tip_amount = SplitBillAmount * TipPercentage;
  		tip_amount = Math.round(tip_amount * 100) / 100.0; // round tip to nearest penny
  		double total_amount = SplitBillAmount + tip_amount; 
  		
  		SplitTipAmount = tip_amount;
  		SplitTotalAmount = total_amount;
    }
    
}
