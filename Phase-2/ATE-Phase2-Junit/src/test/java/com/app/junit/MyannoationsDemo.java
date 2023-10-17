package com.app.junit;

import java.lang.annotation.Annotation;

public class MyannoationsDemo implements MetaAnnoation {
	
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@MetaAnnoation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
	


}
