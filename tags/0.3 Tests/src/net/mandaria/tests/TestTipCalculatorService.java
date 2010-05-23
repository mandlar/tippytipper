package net.mandaria.tests;

import static org.junit.Assert.*;
import net.mandaria.services.*;

import org.junit.Test;
import org.junit.Assert.*;


public class TestTipCalculatorService
{
	
	@Test public void EmptyBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
	};
	
	@Test public void AppendNumberToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
	};
	
	@Test public void AppendTwoNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
	};
	
	@Test public void AppendThreeNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
	};
	
	@Test public void AppendFourNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
	};
	
	@Test public void AppendFiveNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
	};
	
	@Test public void AppendSixNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234.56"));
	};
	
	@Test public void AppendSevenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
	};
	
	@Test public void AppendEightNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
	};
	
	@Test public void AppendNineNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
	};
	
	@Test public void AppendTenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
	};
	
	@Test public void AppendElevenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
	};
	
	@Test public void AppendTwelveNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
	};
	
	@Test public void AppendThirteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901.23"));
	};
	
	@Test public void AppendFourteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789,012.34"));
	};
	
	@Test public void AppendFifteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789,012.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void AppendSixteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789,012.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void AppendSeventeenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount().equals("$12.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount().equals("$123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount().equals("$1,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount().equals("$12,345.67"));
		service.AppendNumberToBillAmount("8");
		assertTrue(service.GetBillAmount().equals("$123,456.78"));
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount().equals("$1,234,567.89"));
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678.90"));
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901.23"));
		service.AppendNumberToBillAmount("4");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$123,456,789,012.34"));
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
		service.AppendNumberToBillAmount("6");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void ClearBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.ClearBillAmount();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
	}
	
	@Test public void ClearBillAmountAfterAddingValueToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("2");
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.ClearBillAmount();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
	}
	
	@Test public void RemoveNumberFromEmptyBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.RemoveEndNumberFromBillAmount();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
	}
	
	@Test public void RemoveNumberFromBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("2");
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
		service.RemoveEndNumberFromBillAmount();
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.RemoveEndNumberFromBillAmount();
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.RemoveEndNumberFromBillAmount();
		assertTrue(service.GetBillAmount().equals("$0.00"));
	}
	
	@Test public void GetTipAndTotalFromZeroBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$0.00"));
	}
	
	@Test public void GetTipAndTotalFromZeroBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$0.00"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.00"));
		assertTrue(service.GetTaxPercentage(), service.GetTaxPercentage().equals("7.00%"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountTenPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountTenPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.94"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.94"));
		
	}
	
	@Test public void GetTipAndTotalFromFifteenDollarAndFifteenCentsBillAmountTenPercentTipRoundingErrorBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.52"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.67"));
	}
	
	@Test public void GetTipAndTotalFromFifteenDollarAndFifteenCentsBillAmountTenPercentTipRoundingErrorBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.42"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.57"));
	}
	
	@Test public void GetTipAndTotalFromNineDollarsAndNintyNineCentsBillAmountTenPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("9");
		service.AppendNumberToBillAmount("9");
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.99"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));  // rounds up from $0.999 to $1.00
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.99"));
	}
	
	@Test public void GetTipAndTotalFromNineDollarsAndNintyNineCentsBillAmountTenPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("9");
		service.AppendNumberToBillAmount("9");
		service.AppendNumberToBillAmount("9");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.99"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.34"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.93"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.92"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountZeroPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountZeroPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
	}
	
	@Test public void RoundUpIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundUpIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipUpIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.50"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.50"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("20.0%"));
	}
	
	@Test public void RoundTipUpIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.40"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.40"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("21.4%"));
	}
	
	@Test public void RoundUpNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.50"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("4.8%"));
	}
	
	@Test public void RoundUpNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.50"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("5.1%"));
	}
	
	@Test public void RoundTipUpNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.58"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.08"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("19.0%"));
	}
	
	@Test public void RoundTipUpNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.47"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.97"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("20.4%"));
	}
	
	@Test public void RoundDownIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundDownIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipDownIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.50"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.50"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("10.0%"));
	}
	
	@Test public void RoundTipDownIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.40"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.40"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("10.7%"));
	}
	
	@Test public void RoundDownNonIntegerMinimumBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundDownNonIntegerMinimumBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipDownNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.58"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$12.08"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("9.5%"));
	}
	
	@Test public void RoundTipDownNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.50"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.47"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.97"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.81"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.69"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.50"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("10.2%"));
	}
	
	
	@Test public void RoundDownNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.50"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.50"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("10.0%"));
	}
	
	@Test public void RoundDownNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.40"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.40"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.35"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.65"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$11.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("10.7%"));
	}
	
	@Test public void RoundUpThenRoundDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.27"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.42"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("18.8%"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("12.2%"));
	}
	
	@Test public void RoundUpThenRoundDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.12"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.27"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("20.1%"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("13.1%"));
	}
	
	@Test public void RoundTipUpThenRoundDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.27"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.42"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$3.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("19.8%"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("13.2%"));
	}
	
	@Test public void RoundTipUpThenRoundDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.12"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.27"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$3.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("21.2%"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("14.1%"));
	}
	
	@Test public void RoundDownThenUpDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.27"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.42"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("12.2%"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("18.8%"));
	}
	
	@Test public void RoundDownThenUpDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.12"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.27"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("13.1%"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("20.1%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.27"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.42"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("13.2%"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$3.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("19.8%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.15, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.12"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.27"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$2.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$17.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("14.1%"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$3.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$18.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("21.2%"));
	}
	
	@Test public void RoundUpThenRoundDownBillAmountLowerTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.04);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.61"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.76"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("5.6%"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("5.6%"));
	}
	
	@Test public void RoundUpThenRoundDownBillAmountLowerTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.04, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.57"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.72"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("6.0%"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("6.0%"));
	}
	
	@Test public void RoundTipUpThenRoundDownBillAmountLowerTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.04);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.61"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.76"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("6.6%"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipUpThenRoundDownBillAmountLowerTipPercentageBoundaryConditionExcludeTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.04, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.57"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.72"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("7.1%"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundDownThenUpDownBillAmountUpperTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.4);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$6.06"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.21"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$5.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("38.6%"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$6.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$22.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("45.2%"));
	}
	
	@Test public void RoundDownThenUpDownBillAmountUpperTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.4, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$5.66"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$20.81"));
		service.RoundDown(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$4.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$20.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("34.3%"));
		service.RoundUp(false);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$5.85"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.00"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("41.3%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountUpperTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.4);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$6.06"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.21"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$6.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("39.6%"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$7.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$22.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("46.2%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountUpperTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.4, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$5.66"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$20.81"));
		service.RoundDown(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$5.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$20.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("35.3%"));
		service.RoundUp(true);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$6.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$21.15"));
		assertTrue(service.GetTipPercentage(), service.GetTipPercentage().equals("42.4%"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsTwoPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.52"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.67"));
		service.SplitBill(2);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$7.57"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.76"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$8.34"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsTwoPeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.42"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.57"));
		service.SplitBill(2);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$7.08"));
		assertTrue(service.GetSplitTaxAmount(), service.GetSplitTaxAmount().equals("$0.49"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.71"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$8.29"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsThreePeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.52"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.67"));
		service.SplitBill(3);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$5.05"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.50"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$5.56"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsThreePeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.42"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.57"));
		service.SplitBill(3);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$4.72"));
		assertTrue(service.GetSplitTaxAmount(), service.GetSplitTaxAmount().equals("$0.33"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.47"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$5.53"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsFourPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.52"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.67"));
		service.SplitBill(4);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$3.78"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.38"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$4.17"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsFourPeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10, 0.07);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$14.16"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.99"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.42"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.57"));
		service.SplitBill(4);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$3.54"));
		assertTrue(service.GetSplitTaxAmount(), service.GetSplitTaxAmount().equals("$0.24"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.35"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$4.15"));
	}
	
	@Test public void SplitBillFifteenDollarsFifteenCentsZeroPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		service.CalculateTip(0.10);
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$1.52"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$16.67"));
		try
		{
			service.SplitBill(0);
			assertTrue("Exception should be thrown and this should not be hit", false);
		}
		catch(IllegalArgumentException ex)
		{
			assertTrue("Exception thrown", true);
		}
	}
	
	@Test public void OffByOneCentBug1()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		//1. Set Tax rate to 34%
		//3. Set Tip to 0%
		service.CalculateTip(0.0, 0.34);
		//4. Total is $15.16
		//Should be $15.15
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$11.31"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$3.84"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.15"));
	}
	
	@Test public void OffByOneCentBug2()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		//1. Set Tax rate to 28%
		//3. Set Tip to 0%
		service.CalculateTip(0.0, 0.28);
		//4. Total is $15.16
		//Should be $15.15
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$11.84"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$3.31"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.15"));
	}
	
	@Test public void OffByOneCentBug3()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("5");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$15.15"));
		//1. Set Tax rate to 43%
		//3. Set Tip to 0%
		service.CalculateTip(0.0, 0.43);
		//4. Total is $15.14
		//Should be $15.15
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.59"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$4.56"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$15.15"));
	}
	
	@Test public void BugWithSplitTotalUnderByAPenny()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
		//1. Set total amount to $10.00
		service.AppendNumberToBillAmount("1");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		service.AppendNumberToBillAmount("0");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$10.00"));
		//Bug only occurs when tax rate is set to anything but 0
		service.CalculateTip(0.0, 0.01);
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$9.90"));
		assertTrue(service.GetTaxAmount(), service.GetTaxAmount().equals("$0.10"));
		assertTrue(service.GetTipAmount(), service.GetTipAmount().equals("$0.00"));
		assertTrue(service.GetTotalAmount(), service.GetTotalAmount().equals("$10.00"));
		//2. Split bill by three people
		service.SplitBill(3);
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$3.30"));
		assertTrue(service.GetSplitTaxAmount(), service.GetSplitTaxAmount().equals("$0.03"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.00"));
		//3. Shows total as $3.33.  
		//Should be $3.34/each to not be under $10.00 when summed.
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$3.34"));
	}
}
