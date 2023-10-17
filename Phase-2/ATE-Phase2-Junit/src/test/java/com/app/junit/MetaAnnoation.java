package com.app.junit;



import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;

@Target({ElementType.TYPE,ElementType.METHOD})

@Retention(RetentionPolicy.RUNTIME) // when will annotation be triggered
@Tag("dev")  // name of the annotation
@Test  // our annotation is replica of @test annotation


public interface MetaAnnoation {

	Class<? extends Annotation> annotationType();

}
