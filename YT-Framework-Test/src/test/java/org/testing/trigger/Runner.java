package org.testing.trigger;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner {
	
	public static void main(String[] args) throws BiffException, IOException {  
		XmlSuite xS = new XmlSuite();
		xS.setName("Suite1");
		
		XmlTest xT = new XmlTest(xS);
		File f = new File("C:\\Users\\SACHIN\\Downloads\\Book.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s = wk.getSheet(0);
		int rows = s.getRows();
		ArrayList<XmlClass> al = new ArrayList<XmlClass>();
		for(int i=1; i<rows; i++) {
			Cell c = s.getCell(4,i);
			if(c.getContents().equals("Y")) {
				Cell pkg = s.getCell(2,i);
				Cell class_name = s.getCell(3,i);
				
				String v = pkg.getContents() + "." + class_name.getContents();
				XmlClass c1 = new XmlClass(v);
				al.add(c1);
			}
		}
		
		System.out.println(al.size());
		xT.setClasses(al);
		ArrayList<XmlTest> al2=new ArrayList<XmlTest>();
		al2.add(xT);
		xS.setTests(al2);
		
		ArrayList<XmlSuite> al3= new ArrayList<XmlSuite>();
		al3.add(xS);
		
		TestNG t=new TestNG();
		t.setXmlSuites(al3);
		t.run();

		
	}
		
}


//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.TestNG;
//
//import org.testng.annotations.Test;
//import org.testng.xml.XmlClass;
//import org.testng.xml.XmlSuite;
//import org.testng.xml.XmlTest;
//
//
//
//public class Runner {
//	@Test
//	public Workbook statuscheck() throws IOException {  
//        XmlSuite xS = new XmlSuite();
//        xS.setName("Suite1");
//        
//        XmlTest xT = new XmlTest(xS);
//        String excelFilePath = "C:\\Users\\SACHIN\\Downloads\\Book.xlsx";
//
//        FileInputStream fis = new FileInputStream(new File(excelFilePath));
//             Workbook workbook = new XSSFWorkbook(fis);
//            
//            Sheet sheet = workbook.getSheetAt(0);
//            int rows = sheet.getPhysicalNumberOfRows();
//            ArrayList<XmlClass> al = new ArrayList<XmlClass>();
//            
//            for (int i = 1; i <= rows; i++) {  // Start from row 1 (skipping header)
//                Row row = sheet.getRow(i);
//                if (row != null) {
//                    Cell statusCell = row.getCell(4);
//                    if (statusCell != null && statusCell.getCellType() == CellType.STRING && 
//                        "Y".equals(statusCell.getStringCellValue())) {
//
//                        Cell pkgCell = row.getCell(2);
//                        Cell classCell = row.getCell(3);
//                        
//                        if (pkgCell != null && classCell != null) {
//                            String pkg = pkgCell.getStringCellValue();
//                            String className = classCell.getStringCellValue();
//                            String fullClassName = pkg + "." + className;
//
//                            System.out.println("Adding class: " + fullClassName);  // Debugging print
//
//                            XmlClass xmlClass = new XmlClass(fullClassName);
//                            al.add(xmlClass);
//                        } else {
//                            System.out.println("Empty package or class name at row " + i);
//                        }
//                    } else {
//                        System.out.println("Test case at row " + i + " is not marked 'Y'");
//                    }
//                } else {
//                    System.out.println("Empty row at index " + i);
//                }
//            }
//            
//            System.out.println("Total classes added: " + al.size());
//            xT.setClasses(al);
//            ArrayList<XmlTest> testList = new ArrayList<XmlTest>();
//            testList.add(xT);
//            xS.setTests(testList);
//            
//            ArrayList<XmlSuite> suiteList = new ArrayList<XmlSuite>();
//            suiteList.add(xS);
//            
//            TestNG testNG = new TestNG();
//            testNG.setXmlSuites(suiteList);
//            testNG.run();
//			return workbook;
//        }
//    }
//
//	
	




