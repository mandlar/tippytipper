package net.mandaria.tests;

import static org.junit.Assert.*;
import net.mandaria.services.*;

import org.junit.Test;
import org.junit.Assert.*;


public class TestTipCalculatorService
{
	
	@Test public void Test_EmptyBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		assertTrue(service.GetBillAmount(), service.GetBillAmount().equals("$0.00"));
	};
	
	@Test public void Test_AppendNumberToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
	};
	
	@Test public void Test_AppendTwoNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
	};
	
	@Test public void Test_AppendThreeNumbersToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		assertTrue(service.GetBillAmount().equals("$0.01"));
		service.AppendNumberToBillAmount("2");
		assertTrue(service.GetBillAmount().equals("$0.12"));
		service.AppendNumberToBillAmount("3");
		assertTrue(service.GetBillAmount().equals("$1.23"));
	};
	
	@Test public void Test_AppendFourNumbersToBillAmount()
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
	
	@Test public void Test_AppendFiveNumbersToBillAmount()
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
	
	@Test public void Test_AppendSixNumbersToBillAmount()
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
	
	@Test public void Test_AppendSevenNumbersToBillAmount()
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
	
	@Test public void Test_AppendEightNumbersToBillAmount()
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
	
	@Test public void Test_AppendNineNumbersToBillAmount()
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
	
	@Test public void Test_AppendTenNumbersToBillAmount()
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
	
	@Test public void Test_AppendElevenNumbersToBillAmount()
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
	
	@Test public void Test_AppendTwelveNumbersToBillAmount()
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
	
	@Test public void Test_AppendThirteenNumbersToBillAmount()
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
	
	@Test public void Test_AppendFourteenNumbersToBillAmount()
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
	
	@Test public void Test_AppendFifteenNumbersToBillAmount()
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
	
	@Test public void Test_AppendSixteenNumbersToBillAmount()
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
}
