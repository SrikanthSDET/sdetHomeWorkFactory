package utills;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static String[][] readDataFromExcel(String fileName) {
		String[][] data=null;
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
			XSSFSheet ws = wb.getSheetAt(0);
			int rowCount = ws.getLastRowNum();
			int cellCount = ws.getRow(0).getLastCellNum();
			data = new String[rowCount][cellCount];
			for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
					String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cellValue);
					data[i-1][j]=cellValue;
				}				
			}
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}
	
}
