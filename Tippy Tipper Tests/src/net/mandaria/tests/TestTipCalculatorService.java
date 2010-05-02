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
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$7.58"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.76"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$8.34"));
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
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.51"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$5.56"));
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
		assertTrue(service.GetSplitBillAmount(), service.GetSplitBillAmount().equals("$3.79"));
		assertTrue(service.GetSplitTipAmount(), service.GetSplitTipAmount().equals("$0.38"));
		assertTrue(service.GetSplitTotalAmount(), service.GetSplitTotalAmount().equals("$4.17"));
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
	
}
