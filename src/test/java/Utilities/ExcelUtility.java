package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.*;

public class ExcelUtility {
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int columnCount) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException Ex) {
            System.out.println(Ex.getMessage());
        }
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> rowCount = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                rowCount.add(sheet.getRow(i).getCell(j).toString());
            }
            matrix.add(rowCount);
        }
        return matrix;
    }

    public static void writeToExcel(String path, Scenario scenario) {
        File file = new File(path);
        if (!file.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Page1");
            Row newRow = sheet.createRow(0);
            Cell cell1 = newRow.createCell(0);
            cell1.setCellValue(scenario.getName());
            Cell cell2 = newRow.createCell(1);
            cell2.setCellValue(scenario.getStatus().toString());
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception Ex) {
                System.out.println(Ex.getMessage());
            }
        } else {
            FileInputStream inputStream = null;
            Workbook workbook = null;
            Sheet sheet = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            } catch (Exception Ex) {
                System.out.println(Ex.getMessage());
            }
            int lastRowIndex = sheet.getPhysicalNumberOfRows();
            Row newRow = sheet.createRow(lastRowIndex);
            Cell cell1 = newRow.createCell(0);
            cell1.setCellValue(scenario.getName());
            Cell cell2 = newRow.createCell(1);
            cell2.setCellValue(scenario.getStatus().toString());
            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception Ex) {
                System.out.println(Ex.getMessage());
            }
        }
    }
}
