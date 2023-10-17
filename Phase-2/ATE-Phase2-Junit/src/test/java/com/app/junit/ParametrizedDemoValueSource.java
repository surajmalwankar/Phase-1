package com.app.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParametrizedDemoValueSource {
	
	//@ValueSource : this annotation will store multiple input values of different datatypes
		// String, integer, boolean
		// @ValueSource is a provider of test data
		// @Test annotation cannot pass parameter values of the method
		// we will use @ParameterizedTest
		// it needs a source of values -> ValueSource
		// @ParameterizedTest will create a new test for every test data 
		// every test will have a unique name
		
		 @ParameterizedTest(name = "checkblanks {arguments}")
		  @ValueSource(strings = {"abc","xyz",""})
		  @EmptySource
		 public void checkblanks(String value) 
		 { 
			 Assertions.assertTrue(StringUtils.isBlank(value)); // input is null or not
		System.out.println(value);
		}
		 
		
		 @ParameterizedTest(name = "null source")
		  @NullSource
		 public void checkblanks2(String value) 
		 { 
			 Assertions.assertTrue(StringUtils.isBlank(value)); // input is null or not
		System.out.println(value);
		}
		 
		 
		 @ParameterizedTest(name = "null and Empty source")
		  @NullAndEmptySource
		 public void checkblanks3(String value) 
		 { 
			 Assertions.assertTrue(StringUtils.isBlank(value)); // input is null or not
		
		}
		
		@ParameterizedTest(name = "{index} - Run test with arguments = {0}")
		@ValueSource(ints = {11,12,13,4,5})
		public void valueSourcedemo(int args)
		{
			System.out.println("The integer value is " + args);
		}
	}

