package net.mandaria.tippytipper.services;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TipCalculatorService 
{
	private String billEntry = "";
	private double billAmount = 0;
	private double billAmountBeforeTax = 0;
	private double taxAmount = 0;
	private double tipAmount = 0;
	private double tipAmountBeforeRounded = 0;
	private double totalAmount = 0;
	private double totalAmountBeforeRounded = 0;
	private double tipPercentage = 0.15;
	private double taxPercentage = 0;
	private double splitBillAmount = 0;
	private double splitTaxAmount = 0;
	private double splitTipAmount = 0;
	private double splittotalAmount = 0;
	private double splitAdjustment = 0;
	private int numberOfPeople = 2;
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public TipCalculatorService()
	{
		
	}
	
	public String getBillAmount() 
	{
		return nf.format(billAmount);
    }
	
	public String getTipAmount()
	{
		return nf.format(tipAmount);
	}
	
	public String getTotalAmount()
	{
		return nf.format(totalAmount);
	}
	
	public String getTaxAmount()
	{
		return nf.format(taxAmount);
	}
	
	public String getSplitBillAmount()
	{
		return nf.format(splitBillAmount);
	}
	
	public String getSplitTaxAmount()
	{
		return nf.format(splitTaxAmount);
	}
	
	public String getSplitTipAmount()
	{
		return nf.format(splitTipAmount);
	}
	
	public String getSplitAdjustment()
	{
		return nf.format(splitAdjustment);
	}
	
	public String getSplitTotalAmount()
	{
		return nf.format(splittotalAmount);
	}
	
	public String getTipPercentage()
	{
		double percent = tipPercentage * 100;
		DecimalFormat dec = new DecimalFormat("0.0");
		return dec.format(percent) + "%";
	}
	
	public String getTaxPercentage()
	{
		double percent = taxPercentage * 100;
		DecimalFormat dec = new DecimalFormat("0.0##");
		return dec.format(percent) + "%";
	}
	
	public double getTipPercentageAsDouble()
	{
		double percent = tipPercentage * 100;
		return percent;
	}
	
	public int getNumberOfPeople()
	{
		return numberOfPeople;
	}

	public int getTipPercentageRounded()
	{
		int percent = (int)Math.round(tipPercentage * 100);
		return percent;
	}
	
	public void setTipPercentage(double percent)
	{
		tipPercentage = percent;
	}
	
	public void setTaxPercentage(double percent)
	{
		taxPercentage = percent;
	}
	
	public void refreshBillAmount()
	{
		double amount;
		try
		{
			amount = Double.valueOf(billEntry);
		}
		catch(Exception ex)
		{
			amount = 0;
		}
    	amount = amount / 100;
    	billAmount = amount; 
    	billAmountBeforeTax = billAmount;
	}
    
    public void appendNumberToBillAmount(String number)
    {
    	if(billEntry.length() < 15)
    	{
	    	billEntry = billEntry + "" + number;
    	}
    	double amount = Double.valueOf(billEntry);
    	amount = amount / 100;
    	billAmount = amount; 
    	billAmountBeforeTax = billAmount;
    }
    
    public void removeEndNumberFromBillAmount()
    {
    	if(billEntry.length() > 1)
    	{
    		billEntry = billEntry.substring(0, billEntry.length() - 1);
    		double amount = Double.valueOf(billEntry);
    		amount = amount / 100;
    		billAmount = amount;
    	}
    	else 
    	{
    		billEntry = "";
    		billAmount = 0;
		}
    	billAmountBeforeTax = billAmount;
    }
    
    public void clearBillAmount()
    {
    	billEntry = "";
    	billAmount = 0;
    	billAmountBeforeTax = billAmount;
    }
    
    public void calculateTip()
    {	
    	if(taxPercentage > 0)
    	{
    		billAmount = billAmountBeforeTax;
    		double bill_amount = billAmount / (1 + taxPercentage);
    		double bill_amount_rounded = Math.round(bill_amount * 100) / 100.0; // round bill to nearest penny
    		billAmount = bill_amount_rounded;
    		
    		double tax_amount = bill_amount * taxPercentage; // Note: must calculate tax off of non-rounded bill amount to avoid off by 1 cent errors
    		tax_amount = Math.round(tax_amount * 100) / 100.0; // round tax to nearest penny
    		taxAmount = tax_amount;
    	}
    	else
    	{
    		taxAmount = 0;
    	}
    	
  		double tip_amount = billAmount * tipPercentage;
  		tip_amount = Math.round(tip_amount * 100) / 100.0; // round tip to nearest penny
  		double total_amount = billAmount + taxAmount + tip_amount; 
  		
  		tipAmount = tip_amount;
  		totalAmount = total_amount;
  		totalAmountBeforeRounded = totalAmount;
  		tipAmountBeforeRounded = tipAmount;
    }
    
    public void calculateTip(double percent)
    {
    	setTipPercentage(percent);
    	calculateTip();
    }
    
    public void calculateTip(double percent, double taxPercent)
    {
    	setTaxPercentage(taxPercent);
    	calculateTip(percent);
    }
    
    public void roundUp(boolean roundTip)
    {
    	if(roundTip)
    	{
    		tipAmount = tipAmountBeforeRounded;
    		tipAmount = Math.ceil(tipAmount);
    		totalAmount = billAmount + taxAmount + tipAmount;
    	}
    	else
    	{
    		totalAmount = totalAmountBeforeRounded;
        	totalAmount = Math.ceil(totalAmount);
        	tipAmount = totalAmount - billAmount - taxAmount;
    	}
    	tipPercentage = ((totalAmount - taxAmount)/billAmount) - 1;
    }
    
    public void roundDown(boolean roundTip)
    {
    	if(roundTip)
    	{
    		tipAmount = tipAmountBeforeRounded;
    		tipAmount = Math.floor(tipAmount);
    		totalAmount = billAmount + taxAmount + tipAmount;
    		tipPercentage = ((totalAmount - taxAmount)/billAmount) - 1;
    	}
    	else
    	{
	    	if(Math.floor(totalAmountBeforeRounded) >= (billAmount + taxAmount))
	    	{
	    		totalAmount = totalAmountBeforeRounded;
	    		totalAmount = Math.floor(totalAmount);
	    		tipAmount = totalAmount - billAmount - taxAmount;
	    		tipPercentage = ((totalAmount - taxAmount)/billAmount) - 1;
	    	}
    	}
    }
    
    public void splitBill(int people)
    {
    	if(people < 1)
    		throw new IllegalArgumentException("Number of people cannot be below one.");
    	numberOfPeople = people;
    	
//    	int splitTotalInteger = (int)(totalAmount *100.0);
//    	int splitTotalRemainder = (int)SplitTotalInteger % numberOfPeople;
//    	double Adjustment = 0;
//    	if(splitTotalRemainder != 0)
//    		Adjustment = -(double)SplitTotalRemainder + (double)numberOfPeople;
//    	Adjustment = (Math.round(Adjustment/numberOfPeople)/100.0);
    	
    	
//    	int splitBillInteger = (int)(billAmount * 100.0);
//    	int splitBillRemainder = (int)splitBillInteger % numberOfPeople;
//    	if(splitBillRemainder != 0)
//    		splitBillAmount = (double)splitBillInteger - (double)splitBillRemainder + (double)numberOfPeople;
//    	else
//    		splitBillAmount = (double)splitBillInteger;
    	//splitBillAmount = splitBillAmount / 100.0;
    	//splitBillAmount = splitBillAmount / numberOfPeople;
    	
    	splitBillAmount = Math.floor((billAmount / numberOfPeople) * 100.0)/100.0;
    	
    	
    	// calculate tip TODO: Can be refactored with CalculateTip() function into a generic function for both places
    	double tax_amount = 0;
    	if(taxPercentage > 0)
    	{
    		//tax_amount = splitBillAmount * taxPercentage;
    		//tax_amount = Math.floor(tax_amount * 100) / 100.0; // round tax to nearest penny
    		//tax_amount = tax_amount + Adjustment;
    		
    		tax_amount = Math.floor((taxAmount / numberOfPeople) * 100.0) / 100.0; 
    	}
    	else
    	{
    		tax_amount = 0;
    	}
    	
    	//double tip_amount = splitBillAmount * tipPercentage;
  		double tip_amount = Math.floor((tipAmount / numberOfPeople) * 100.0) / 100.0; // round tip to nearest penny
  		double total_amount = splitBillAmount + tax_amount + tip_amount; 
  		
  		// if off by one penny, adjust the amount to reflect this correctly by increasing the tax_amount
  		double adjustment = 0;
  		if(total_amount < Math.ceil((totalAmount/numberOfPeople)*100.0)/100.0)
  		{
  			adjustment =  Math.round((Math.ceil((totalAmount/numberOfPeople)*100.0)/100.0 - total_amount)*100.0)/100.0;//Math.round((totalAmount - (total_amount * numberOfPeople))*100.0)/100.0;
  			total_amount = total_amount + adjustment;
  			
  		}
  		
  		splitAdjustment = adjustment;
  		splitTaxAmount = tax_amount;
  		splitTipAmount = tip_amount;
  		splittotalAmount = total_amount;
    }
    
}
