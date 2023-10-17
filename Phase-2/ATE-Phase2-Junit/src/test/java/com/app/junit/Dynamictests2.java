package com.app.junit;

import java.util.stream.Stream;
import java.util.Collection;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;

public class Dynamictests2 {
	
	@TestFactory
	public Stream<DynamicTest> dynamicTestsforPalindrome()  // here DynamicTest is class generating testcase at runtime
	{
		return Stream.of("pop","mom","dad","madam").map(inputText ->
		
		DynamicTest.dynamicTest(inputText,
			
				() -> Assertions.assertTrue(Myutils.isPalindrome(inputText)))	
				
				
				);
		
	}

}
