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
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901,234.56"));
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
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901,234.56"));
		service.AppendNumberToBillAmount("7");
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$12,345,678,901,234.56"));
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
	
	
}
