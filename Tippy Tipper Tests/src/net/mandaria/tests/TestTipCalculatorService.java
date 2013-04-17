package net.mandaria.tests;

import static org.junit.Assert.assertTrue;
import net.mandaria.tippytipperlibrary.services.TipCalculatorService;

import org.junit.Test;


public class TestTipCalculatorService
{
	
	@Test public void EmptyBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
	};
	
	@Test public void appendNumberToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
	};
	
	@Test public void AppendTwoNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
	};
	
	@Test public void AppendThreeNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
	};
	
	@Test public void AppendFourNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
	};
	
	@Test public void AppendFiveNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
	};
	
	@Test public void AppendSixNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234.56"));
	};
	
	@Test public void AppendSevenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
	};
	
	@Test public void AppendEightNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
	};
	
	@Test public void AppendNineNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
	};
	
	@Test public void AppendTenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
	};
	
	@Test public void AppendElevenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
	};
	
	@Test public void AppendTwelveNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
	};
	
	@Test public void AppendThirteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678,901.23"));
	};
	
	@Test public void AppendFourteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678,901.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789,012.34"));
	};
	
	@Test public void AppendFifteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678,901.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789,012.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void AppendSixteenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678,901.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789,012.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void AppendSeventeenNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount().equals("$12.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount().equals("$123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount().equals("$1,234.56"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount().equals("$12,345.67"));
		service.appendNumberToBillAmount("8");
		assertTrue(service.getBillAmount().equals("$123,456.78"));
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount().equals("$1,234,567.89"));
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678.90"));
		service.appendNumberToBillAmount("1");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789.01"));
		service.appendNumberToBillAmount("2");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890.12"));
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$12,345,678,901.23"));
		service.appendNumberToBillAmount("4");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$123,456,789,012.34"));
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
		service.appendNumberToBillAmount("6");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
		service.appendNumberToBillAmount("7");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$1,234,567,890,123.45"));
	};
	
	@Test public void clearBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.clearBillAmount();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
	}
	
	@Test public void clearBillAmountAfterAddingValueToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("2");
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.clearBillAmount();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
	}
	
	@Test public void RemoveNumberFromEmptyBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.removeEndNumberFromBillAmount();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
	}
	
	@Test public void RemoveNumberFromBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("2");
		service.appendNumberToBillAmount("3");
		assertTrue(service.getBillAmount().equals("$1.23"));
		service.removeEndNumberFromBillAmount();
		assertTrue(service.getBillAmount().equals("$0.12"));
		service.removeEndNumberFromBillAmount();
		assertTrue(service.getBillAmount().equals("$0.01"));
		service.removeEndNumberFromBillAmount();
		assertTrue(service.getBillAmount().equals("$0.00"));
	}
	
	@Test public void GetTipAndTotalFromZeroBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$0.00"));
	}
	
	@Test public void GetTipAndTotalFromZeroBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$0.00"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.00"));
		assertTrue(service.getTaxPercentage(), service.getTaxPercentage().equals("7.0%"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountTenPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountTenPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.94"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.94"));
		
	}
	
	@Test public void GetTipAndTotalFromFifteenDollarAndFifteenCentsBillAmountTenPercentTipRoundingErrorBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.52"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.67"));
	}
	
	@Test public void GetTipAndTotalFromFifteenDollarAndFifteenCentsBillAmountTenPercentTipRoundingErrorBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.42"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.57"));
	}
	
	@Test public void GetTipAndTotalFromNineDollarsAndNintyNineCentsBillAmountTenPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("9");
		service.appendNumberToBillAmount("9");
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.99"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));  // rounds up from $0.999 to $1.00
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.99"));
	}
	
	@Test public void GetTipAndTotalFromNineDollarsAndNintyNineCentsBillAmountTenPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("9");
		service.appendNumberToBillAmount("9");
		service.appendNumberToBillAmount("9");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.99"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.34"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.93"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.92"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountZeroPercentTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
	}
	
	@Test public void GetTipAndTotalFromTenDollarBillAmountZeroPercentTipExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
	}
	
	@Test public void GetTipAndTotalFromOneHundredDollarBillAmountZeroPercentTipExcludeTaxThreeDecimalPlaces8_875()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$100.00"));
		service.calculateTip(0, 0.08875);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$91.85"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$8.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$100.00"));
	}
	
	@Test public void GetTipAndTotalFromOneHundredDollarBillAmountZeroPercentTipExcludeTaxThreeDecimalPlaces8_675()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$100.00"));
		service.calculateTip(0, 0.08675);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$92.02"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$7.98"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$100.00"));
	}
	
	@Test public void roundUpIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void roundUpIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipUpIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.50"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.50"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("20.0%"));
	}
	
	@Test public void RoundTipUpIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.40"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.40"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("21.4%"));
	}
	
	@Test public void roundUpNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.50"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("4.8%"));
	}
	
	@Test public void roundUpNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.50"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("5.1%"));
	}
	
	@Test public void RoundTipUpNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.58"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.08"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("19.0%"));
	}
	
	@Test public void RoundTipUpNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.47"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.97"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("20.4%"));
	}
	
	@Test public void roundDownIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void roundDownIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipDownIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.50"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.50"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("10.0%"));
	}
	
	@Test public void RoundTipDownIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.40"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.40"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("10.7%"));
	}
	
	@Test public void roundDownNonIntegerMinimumBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void roundDownNonIntegerMinimumBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipDownNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.58"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$12.08"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("9.5%"));
	}
	
	@Test public void RoundTipDownNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.50"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.47"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.97"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.81"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.69"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.50"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("10.2%"));
	}
	
	
	@Test public void roundDownNonIntegerBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.50"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.50"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("10.0%"));
	}
	
	@Test public void roundDownNonIntegerBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.40"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.40"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.35"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.65"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$11.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("10.7%"));
	}
	
	@Test public void roundUpThenroundDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.27"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.42"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("18.8%"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("12.2%"));
	}
	
	@Test public void roundUpThenroundDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.12"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.27"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("20.1%"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("13.1%"));
	}
	
	@Test public void RoundTipUpThenroundDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.27"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.42"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$3.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("19.8%"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("13.2%"));
	}
	
	@Test public void RoundTipUpThenroundDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.12"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.27"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$3.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("21.2%"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("14.1%"));
	}
	
	@Test public void roundDownThenUpDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.27"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.42"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("12.2%"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("18.8%"));
	}
	
	@Test public void roundDownThenUpDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.12"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.27"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("13.1%"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("20.1%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.27"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.42"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("13.2%"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$3.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("19.8%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.15, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.12"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.27"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$2.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$17.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("14.1%"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$3.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$18.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("21.2%"));
	}
	
	@Test public void roundUpThenroundDownBillAmountLowerTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.04);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.61"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.76"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("5.6%"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("5.6%"));
	}
	
	@Test public void roundUpThenroundDownBillAmountLowerTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.04, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.57"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.72"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("6.0%"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("6.0%"));
	}
	
	@Test public void RoundTipUpThenroundDownBillAmountLowerTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.04);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.61"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.76"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("6.6%"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void RoundTipUpThenroundDownBillAmountLowerTipPercentageBoundaryConditionExcludeTip()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.04, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.57"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.72"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("7.1%"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("0.0%"));
	}
	
	@Test public void roundDownThenUpDownBillAmountUpperTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.4);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$6.06"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.21"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$5.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("38.6%"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$6.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$22.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("45.2%"));
	}
	
	@Test public void roundDownThenUpDownBillAmountUpperTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.4, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$5.66"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$20.81"));
		service.roundDown(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$4.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$20.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("34.3%"));
		service.roundUp(false);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$5.85"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.00"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("41.3%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountUpperTipPercentageBoundaryCondition()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.4);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$6.06"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.21"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$6.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("39.6%"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$7.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$22.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("46.2%"));
	}
	
	@Test public void RoundTipDownThenUpDownBillAmountUpperTipPercentageBoundaryConditionExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.4, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$5.66"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$20.81"));
		service.roundDown(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$5.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$20.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("35.3%"));
		service.roundUp(true);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$6.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$21.15"));
		assertTrue(service.getTipPercentage(), service.getTipPercentage().equals("42.4%"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsTwoPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.52"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.67"));
		service.splitBill(2);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$7.57"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.76"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$8.34"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsTwoPeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.42"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.57"));
		service.splitBill(2);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$7.08"));
		assertTrue(service.getSplitTaxAmount(), service.getSplitTaxAmount().equals("$0.49"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.71"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$8.29"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsThreePeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.52"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.67"));
		service.splitBill(3);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$5.05"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.50"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$5.56"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsThreePeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.42"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.57"));
		service.splitBill(3);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$4.72"));
		assertTrue(service.getSplitTaxAmount(), service.getSplitTaxAmount().equals("$0.33"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.47"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$5.53"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsFourPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.52"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.67"));
		service.splitBill(4);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$3.78"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.38"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$4.17"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsFourPeopleExcludeTax()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10, 0.07);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$14.16"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.99"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.42"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.57"));
		service.splitBill(4);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$3.54"));
		assertTrue(service.getSplitTaxAmount(), service.getSplitTaxAmount().equals("$0.24"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.35"));
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$4.15"));
	}
	
	@Test public void splitBillFifteenDollarsFifteenCentsZeroPeople()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		service.calculateTip(0.10);
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$1.52"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$16.67"));
		try
		{
			service.splitBill(0);
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
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		//1. Set Tax rate to 34%
		//3. Set Tip to 0%
		service.calculateTip(0.0, 0.34);
		//4. Total is $15.16
		//Should be $15.15
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$11.31"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$3.84"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.15"));
	}
	
	@Test public void OffByOneCentBug2()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		//1. Set Tax rate to 28%
		//3. Set Tip to 0%
		service.calculateTip(0.0, 0.28);
		//4. Total is $15.16
		//Should be $15.15
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$11.84"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$3.31"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.15"));
	}
	
	@Test public void OffByOneCentBug3()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		//2. Enter Bill $15.15
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("5");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$15.15"));
		//1. Set Tax rate to 43%
		//3. Set Tip to 0%
		service.calculateTip(0.0, 0.43);
		//4. Total is $15.14
		//Should be $15.15
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.59"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$4.56"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$15.15"));
	}
	
	@Test public void BugWithSplitTotalUnderByAPenny()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$0.00"));
		//1. Set total amount to $10.00
		service.appendNumberToBillAmount("1");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		service.appendNumberToBillAmount("0");
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$10.00"));
		//Bug only occurs when tax rate is set to anything but 0
		service.calculateTip(0.0, 0.01);
		assertTrue(service.getBillAmount(), service.getBillAmount().equals("$9.90"));
		assertTrue(service.getTaxAmount(), service.getTaxAmount().equals("$0.10"));
		assertTrue(service.getTipAmount(), service.getTipAmount().equals("$0.00"));
		assertTrue(service.getTotalAmount(), service.getTotalAmount().equals("$10.00"));
		//2. Split bill by three people
		service.splitBill(3);
		assertTrue(service.getSplitBillAmount(), service.getSplitBillAmount().equals("$3.30"));
		assertTrue(service.getSplitTaxAmount(), service.getSplitTaxAmount().equals("$0.03"));
		assertTrue(service.getSplitTipAmount(), service.getSplitTipAmount().equals("$0.00"));
		//3. Shows total as $3.33.  
		//Should be $3.34/each to not be under $10.00 when summed.
		assertTrue(service.getSplitTotalAmount(), service.getSplitTotalAmount().equals("$3.34"));
	}
}
