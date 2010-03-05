package net.mandaria.tests;

import static org.junit.Assert.*;
import net.mandaria.services.*;

import org.junit.Test;
import org.junit.Assert.*;


public class TestTipCalculatorService
{
	@Test public void Test_AppendNumberToBillAmount()
	{
		TipCalculatorService service = new TipCalculatorService();
		service.AppendNumberToBillAmount("1");
		String test = service.GetBillAmount();
		assertTrue(service.GetBillAmount().equals("$0.01"));
	};
}
