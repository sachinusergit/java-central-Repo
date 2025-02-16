package org.testing.utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;
import org.testng.internal.TestListenerHelper.ListenerHolder;
import org.testng.internal.annotations.ListenersAnnotation;

import bsh.NameSource.Listener;

public class MyAnnotationTransformer implements IAnnotationTransformer{
     
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(MyRetryAnalyzer.class);
		
		// TODO Auto-generated method stub
			}


		
		
		
	}


