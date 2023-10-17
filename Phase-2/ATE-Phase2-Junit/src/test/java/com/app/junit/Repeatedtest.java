package com.app.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

public class Repeatedtest {
	// we will not use @test annotation 
	
	@RepeatedTest(3)
	
	// executr htis test 3 times
	@DisplayName("repeatedtests")
	
	public void repeatmessage()
	{
		System.out.println("i am okk");
	}
	
	@Test
	public void Assumptions()
	{
		boolean isDBServerup =true;
		//boolean isDBServerup = true;
		
		Assumptions.assumeTrue(isDBServerup,"server is not Up");
		
		System.out.println("Create tables and inster data");
		
	}
	

}
