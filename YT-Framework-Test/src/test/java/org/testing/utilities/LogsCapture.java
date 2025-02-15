package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeSuite;

public class LogsCapture {

	  @BeforeSuite
		public static void takelog(String classname, String msg) {
			DOMConfigurator.configure("../YT-Framework-Test/Layout.xml");
			Logger l = Logger.getLogger(classname);
			l.info(msg);
			
			
		}
		// TODO Auto-generated constructor stub
	}


