import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample {

	public static void main(String[] args) throws IOException {
		getData("logindetails");

	}

	
	public static void getData(String sheetName) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\selenium\\Datasheet\\Userlogin.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=getSheet(workbook);
		
		int pwdIndex=0,mailIndex=0;
		Iterator<Row> rows=sheet.iterator();
		
		Row firstrow=rows.next();
		int rowcount=0;
	
		
		
		mailIndex=getrowcount(firstrow,"Mail Id");
		pwdIndex=getrowcount(firstrow,"Pwd");
		
		
		
		while(rows.hasNext()) {
			
			Row r=rows.next();
			String mail,pwd;
			
			mail=r.getCell(mailIndex).getStringCellValue();
			pwd=r.getCell(pwdIndex).getStringCellValue();
			
			
			System.out.println("mail   "+mail+"pass    "+pwd);
			
		}
		
		
		

/*	Object[][] o=new Object[7][2]; 
		int i=0;
		while(rows.hasNext()) {
		rows.next();
		o[i][0]=getvalue(sheet,mailIndex,i+1);
		o[i][1]=getvalue(sheet,pwdIndex,i+1);
		
		System.out.println(o[i][0]+" "+o[i][1]+"     i="+i);
		i++;}
		
*/
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
			//System.out.println("cell="+r.getCell(k).getStringCellValue());
			//String s=Integer.toString((int) r.getCell(0).getNumericCellValue());
			//if(s.equalsIgnoreCase(m)) {
				//Iterator<Cell> c=r.cellIterator();
							value=r.getCell(index).getStringCellValue();
				//break;
			//}
			
			
			}
		
		
		return(value);
	}

	
	
	
	
	
	
	
	
	
}
	
	