package org.testing.utilities;



import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling {
	public static ExtentReports handlereport() {
		ExtentReports rep = new ExtentReports("C://Users//SACHIN//Downloads//YTReports.html",false);
		return rep;
	}
	

}
