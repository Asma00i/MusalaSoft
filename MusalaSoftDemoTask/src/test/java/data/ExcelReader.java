package data;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static FileInputStream fis;

    public FileInputStream getFileInputStream()
    {
        String filePath = System.getProperty(".\\Datasheet.xlsx");
        File scrFile = new File (filePath);
        try{
            fis = new FileInputStream(scrFile);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Test Data Sheet Not Found" + e.getMessage());
            System.exit(0);
        }
        return fis;
    }

    public Object [][] getExcelData() throws IOException {
        fis = getFileInputStream();
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);


        int TotalNumberOfRows = (sheet.getLastRowNum()+1);
        int TotalNumberOfCols = 4;

        String [][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];
        for (int i = 0; i < TotalNumberOfRows;i++)
        {
            for (int j= 0; j< TotalNumberOfCols; j++){
                XSSFRow row =sheet.getRow(i);
                arrayExcelData [i][j] = row.getCell(j).toString();
            }
        }
    wb.close();
        return arrayExcelData;



    }
}