package basic;
//package java_io;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//public class excel_read {
//
//	public static void main(String[] args) {
//        try {
//            // create a FileInputStream object to read the excel file
//             FileInputStream file = new FileInputStream(new File("C:\\Users\\jagad\\OneDrive\\Documents\\heart.xml"));
//
//            // create a Workbook object to represent the excel file
//            Workbook workbook = WorkbookFactory.create(file);
//
//            // get the first sheet from the workbook
//            Sheet sheet = workbook.getSheetAt(0);
//
//            // loop through each row in the sheet
//            for (Row row : sheet) {
//                // loop through each cell in the row
//                for (Cell cell : row) {
//                    // print the cell value
//                    System.out.print(cell.toString() + "\t");
//                }
//                System.out.println();
//            }

//            // close the workbook and file objects
//            workbook.close();
//            file.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }// TODO Auto-generated method stub
//
//	}
//
// 	
//}
