package JavaUtilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class Dataprovider01 {
  @DataProvider(name = "signing")
  public String[][] getexceldata() throws IOException {
  String [][] data = new String[1][2];		
  String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
  FileInputStream input1=new FileInputStream(excelpath);	 
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowcount=sheet.getPhysicalNumberOfRows();	 
		for(int i=0;i<rowcount;i++)   {	 
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  	}
		return data;   }

	@DataProvider(name = "signing1")
	public String[][] getexceldata1() throws IOException {
	String [][] data = new String[1][2];	
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
	FileInputStream input1=new FileInputStream(excelpath);	 
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	XSSFSheet sheet=workbook.getSheet("Sheet2");
	int rowcount=sheet.getPhysicalNumberOfRows();	 
	for(int i=0;i<1;i++)   {	 
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  	}
	return data;    }
	
	@DataProvider(name = "signing2")
	public String[][] getexceldata2() throws IOException {
	String [][] data = new String[1][2];	
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
	FileInputStream input1=new FileInputStream(excelpath);	 
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	XSSFSheet sheet=workbook.getSheet("Sheet3");
	int rowcount=sheet.getPhysicalNumberOfRows();	 
		for(int i=0;i<1;i++)	{	 
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  }
	return data;  }
	
	@DataProvider(name = "purchase")
	public String[][] getexceldata3() throws IOException {
	String [][] data = new String[1][5];	
	String excelpath="C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab1.xlsx";
	FileInputStream input1=new FileInputStream(excelpath);	 
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=0;i<1;i++)    {	 
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
   	System.out.println(data[i][1]);
	data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println(data[i][2]);
	data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
	System.out.println(data[i][3]);
	data[i][4]= String.valueOf(sheet.getRow(i).getCell(4).getRawValue());
	System.out.println(data[i][4]);   	}
		return data;   }
	
	@DataProvider(name = "purchase1")
	public String[][] getexceldata4() throws IOException {
	String [][] data = new String[1][5];	
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab1.xlsx";
	FileInputStream input1=new FileInputStream(excelpath);	 
		XSSFWorkbook workbook=new XSSFWorkbook(input1);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<1;i++)	{	 
		data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data[i][0]);
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);
	data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println(data[i][2]);
	data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
	System.out.println(data[i][3]);
	data[i][4]= String.valueOf(sheet.getRow(i).getCell(4).getRawValue());
    System.out.println(data[i][4]);  	}
		return data;	}       }

