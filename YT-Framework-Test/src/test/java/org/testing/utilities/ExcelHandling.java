package org.testing.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelHandling {

    public void readParticularCell(int rowNumber, int columnNumber) {
        String excelFilePath = "C:\\Users\\SACHIN\\Downloads\\Excel.xlsx";

        FileInputStream fis = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream(new File(excelFilePath));
            workbook = new XSSFWorkbook(fis);

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Get the specific row
            Row row = sheet.getRow(rowNumber);

            if (row != null) {
                // Get the specific cell
                Cell cell = row.getCell(columnNumber);

                if (cell != null) {
                    // Get the cell value based on cell type
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.println("Cell Value: " + cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println("Cell Value: " + cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.println("Cell Value: " + cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            System.out.println("Cell Value: " + cell.getCellFormula());
                            break;
                        default:
                            System.out.println("Unknown Cell Type");
                    }
                } else {
                    System.out.println("Cell is empty.");
                }
            } else {
                System.out.println("Row is empty.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
    }
//    @Test
//    public void testReadParticularCell() {
//        readParticularCell(2, 2); // Example: Read the cell at row 0, column 0
//    }



		
//   
//		public String readParticularRow(int r) 
//		{
//		
//			        String excelFilePath = "C:\\Users\\SACHIN\\Downloads\\Excel.xlsx";
//
//			        FileInputStream fis = null;
//			        Workbook workbook = null;
//
//			        try {
//			            fis = new FileInputStream(new File(excelFilePath));
//			            workbook = new XSSFWorkbook(fis);
//
//			            // Get the first sheet from the workbook
//			            Sheet sheet = workbook.getSheetAt(0);
//
//			            // Iterate through each row in the sheet
//			            for (Row row : sheet) {
//			                // Print each cell in the row
//			                for (Cell cell : row) {
//			                    switch (cell.getCellType()) {
//			                        case STRING:
//			                            System.out.print(cell.getStringCellValue() + "\t");
//			                            break;
//			                        case NUMERIC:
//			                            System.out.print(cell.getNumericCellValue() + "\t");
//			                            break;
//			                        case BOOLEAN:
//			                            System.out.print(cell.getBooleanCellValue() + "\t");
//			                            break;
//			                        case FORMULA:
//			                            System.out.print(cell.getCellFormula() + "\t");
//			                            break;
//			                        default:
//			                            System.out.print("Unknown Cell Type\t");
//			                    }
//			                }
//			                System.out.println(); // Move to the next line after printing all cells in a row
//			            }
//
//			        } catch (IOException e) {
//			            e.printStackTrace();
//			        } finally {
//			            try {
//			                if (workbook != null) {
//			                    workbook.close();
//			                }
//			                if (fis != null) {
//			                    fis.close();
//			                }
//			            } catch (IOException ex) {
//			                ex.printStackTrace();
//			            }
//			        }
//					return excelFilePath;
//		}
//			    
//		
//			        public static void main1(String[] args) {
//		             ExcelHandling excelHandling = new ExcelHandling();
//			        excelHandling.readParticularRow(1);; // Print all rows from the first sheet
//			    }
//		
//		

		


			 
			            
			            public void getSheetRange(int initialRow, int endRow, int initialCol, int endCol) {
			                String excelFilePath = "C:\\Users\\SACHIN\\Downloads\\Excel.xlsx";

			                FileInputStream fis = null;
			                Workbook workbook = null;

			                try {
			                    fis = new FileInputStream(new File(excelFilePath));
			                    workbook = new XSSFWorkbook(fis);

			                    // Get the first sheet from the workbook
			                    Sheet sheet = workbook.getSheetAt(0);

			                    // Ensure 'initialRow' and 'endRow' are within valid range
			                    if (initialRow <= sheet.getFirstRowNum()) {
			                        initialRow = sheet.getFirstRowNum();
			                    }
			                    if (endRow >= sheet.getLastRowNum()) {
			                        endRow = sheet.getLastRowNum();
			                    }

			                    // Iterate through rows within the specified range
			                    for (int rowIndex = initialRow; rowIndex <= endRow; rowIndex++) {
			                        Row row = sheet.getRow(rowIndex);
			                        if (row != null) {
			                            // Iterate through columns within the specified range
			                            for (int colIndex = initialCol; colIndex <= endCol; colIndex++) {
			                                Cell cell = row.getCell(colIndex);
			                                if (cell != null) {
			                                    // Get the cell value based on cell type
			                                    switch (cell.getCellType()) {
			                                        case STRING:
			                                            System.out.print(cell.getStringCellValue() + "\t");
			                                            break;
			                                        case NUMERIC:
			                                            System.out.print(cell.getNumericCellValue() + "\t");
			                                            break;
			                                        case BOOLEAN:
			                                            System.out.print(cell.getBooleanCellValue() + "\t");
			                                            break;
			                                        case FORMULA:
			                                            System.out.print(cell.getCellFormula() + "\t");
			                                            break;
			                                        default:
			                                            System.out.print("Unknown Cell Type\t");
			                                    }
			                                } else {
			                                    System.out.print("Empty Cell\t");
			                                }
			                            }
			                            System.out.println(); // Move to the next line after printing all columns in a row
			                        } else {
			                            System.out.println("Empty Row");
			                        }
			                    }

			                } catch (IOException e) {
			                    e.printStackTrace();
			                } finally {
			                    try {
			                        if (workbook != null) {
			                            workbook.close();
			                        }
			                        if (fis != null) {
			                            fis.close();
			                        }
			                    } catch (IOException ex) {
			                        ex.printStackTrace();
			                    }
		
			                    
			                }
				
							
			
							
			            }
//			            @Test
//			            public void testgetSheetRange() {
//			            	getSheetRange(1,6,1,5);
//			            }
	
       }
       
			     
			        
			        	
			        



		

		
		
		 
		
	


