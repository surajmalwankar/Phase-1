package com.app.Listerner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(ItestListernClass.class)

public class TestListener {
	

	@Test(priority='1')
	public void method1()
	{
		System.out.println("Executing method1");
	}
	
	@Test(priority='2')
	public void method2()
	{
		System.out.println("Executing method1");
		Assert.assertTrue(false);
	}
	


}
