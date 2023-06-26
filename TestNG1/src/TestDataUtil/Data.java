package TestDataUtil;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


class Data {
		
	public static Object[][] getData(String sheetName) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\selenium\\Datasheet\\Userlogin.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=getSheet(workbook);
		
		//@SuppressWarnings("unused")
		int pwdIndex,mailIndex;
		
		Iterator<Row> rows=sheet.iterator();
		Iterator<Row> r1=rows;
		int rowcount=0;
		while(r1.hasNext()) {
			r1.next();
			rowcount++;
			
		}
		
		Row firstrow=rows.next();
		
		mailIndex=getrowcount(firstrow,"Mail Id");
		pwdIndex=getrowcount(firstrow,"Pwd");
		int i=0;
		
		Object[][] o=new Object[rowcount-1][]; 
		while(rows.hasNext()) {
			
			rows.next();

			o[i][0]=getvalue(sheet,mailIndex,i);
			o[i][1]=getvalue(sheet,pwdIndex,i);
			i++;

			
			
		}
		
		
		return o;
		
		

			}
	
	
	public static XSSFSheet getSheet(XSSFWorkbook workbook) {
		int count=workbook.getNumberOfSheets();
		XSSFSheet a = null;
		
		for(int i=0;i<count;i++) {
			//System.out.println(workbook.getSheetName(i));
			if(workbook.getSheetName(i).equalsIgnoreCase("logindetails")) {
				
				a=workbook.getSheetAt(i);
				break;
			}
			
		}
		return a;
		
	}
			
	public static int getrowcount(Row firstrow,String rowvalue) {
		int row=0;
		Iterator<Cell> cells=firstrow.cellIterator();
		
	while(cells.hasNext()){
			
			Cell value=cells.next();
			//System.out.println("cell="+value.getStringCellValue());
			
			
			if(value.getStringCellValue().equalsIgnoreCase(rowvalue)) {
				break;		
			}
			
			row++;
		}
		
		return row;
	}
	
	
	
	
	
	public static String getvalue(XSSFSheet x,int index,int user) {
		String m=Integer.toString(user);
		
		String value="";
		Iterator<Row> rows=x.iterator();
		rows.next();
		
		
			while(rows.hasNext()){
			
			Row r=rows.next();
			
			String s=Integer.toString((int) r.getCell(0).getNumericCellValue());
			if(s.equalsIgnoreCase(m)) {
				
							value=r.getCell(index).getStringCellValue();
				break;
			}
			
			
			}
		
		
		return(value);
	}
	
	
	
	
}
