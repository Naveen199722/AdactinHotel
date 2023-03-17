package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	//1 browser launch
	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		return driver;
	}
	
	//2 urlLaunch
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		}
	
	//3 wait
	public static void implicityWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	
	//4 sendKeys
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
		}
	
	//5 click
	public static void buttonclick(WebElement e) {
		e.click();
	}
	
	//6 findElement
	public static  WebElement  findElement(String ln,String lv) {
		WebElement value=null;
		if(ln.equals("id")) {
			value=driver.findElement(By.id(lv));
		}
		else if(ln.equals("name")) {
			value=driver.findElement(By.name(lv));
		}
		else if(ln.equals("xpath")) {
			value=driver.findElement(By.xpath(lv));
		}
		return value;
	}
	
	//7 getTitle
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		

	}
	
	//8 getCurrenturl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}
	
	//9 close
	public static void close() {
		driver.close();
		

	}
	
	//10 quit
	public static void quit() {
		driver.quit();

	}
	
	//11 get text
	public static String getText(WebElement gt) {
		String text = gt.getText();
		return text;
		

	}
	
	//12 getAttribute
	public static String getAttribute(WebElement ga) {
		String attribute = ga.getAttribute("value");
		return attribute;
		

	}
	
	//13 Actions
	//MovetoElement
	public static void moveToElement(WebElement mte) {
		Actions a=new Actions(driver);
		a.moveToElement(mte).perform();
		

	}
	
	//14 drag and drop
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
		

	}
	
	//15 doubleClick
	public static void doubleClick(WebElement dc) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		
	}
	
	//16 context Click
	public static void contextClick(WebElement ct) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
		
		}
	
	//17 Select
	//SelectByIndex
	public static void selectByIndex(WebElement sbi,int index) {
		Select s=new Select(sbi);
		s.selectByIndex(index);
		
	}
	
	//18 SelectByValue
	public static void selectByValue(WebElement sbv,String value) {
		Select s=new Select(sbv);
		s.selectByValue(value);
		

	}
	
	//19 SelectByVisible
	public static void selectByVisible(WebElement sbv,String text) {
		Select s=new Select(sbv);
		s.selectByVisibleText(text);
		

	}
	
	//20 getFirst Selected Option
	public static void getFirstSelectedOption(WebElement gfs) {
		Select s=new Select(gfs);
		s.getFirstSelectedOption();
		
	}
	
	//21 Refresh
	public static void refresh() {
		driver.navigate().refresh();

	}
	
	//22 isMultiple
	public static boolean isMultiple(WebElement e) {
		Select s=new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
		
	}
	
	//23 deSelectByIndex
	public static void deSelectByIndex(WebElement ds,int index) {
		Select s=new Select(ds);
		s.deselectByIndex(index);

	}
	
	//24 deSelectByValue
	public static void deSelectByvalue(WebElement dv,String value) {
		Select s=new Select(dv);
		s.deselectByValue(value);
		
		}
	
	//25 deSelectByVisibleText
	public static void deSelectByVisibleText(WebElement i,String value) {
		Select s=new Select(i);
		s.deselectByVisibleText(value);
		}
	
	//26 getOption
	public static String getOption(WebElement op,int index) {
		Select s=new Select(op);
		List<WebElement> options = s.getOptions();
		WebElement we = options.get(index);
		String text = we.getText();
		return text;
		

	}
	
	//27 deSelectAll
	public static void deSelectAll(WebElement dsa,int index) {
		Select s=new Select(dsa);
		List<WebElement> o = s.getOptions();
		for(int i=0;i<o.size();i++) {
			s.selectByIndex(i);
		}
		s.deselectAll();

	}
	
	//28 isDisplayed
	public static boolean isDisplayed(WebElement id) {
		boolean displayed = id.isDisplayed();
		return displayed;
		}
	
	//29 isSelected
	public static boolean isSelected(WebElement is) {
		boolean selected = is.isSelected();
		return selected;
		}
	
	//30 isEnabled
	public static boolean isEnabled(WebElement ie) {
		boolean enabled = ie.isEnabled();
		return enabled;
		}
	
	//Excel Read
	public static String excelDate(String excelName,String sheetName,int rowNo,int cellNo) throws IOException {

		File lc=new File("C:\\Users\\Naveen Kumar\\eclipse-workspace\\MavenProjects\\src\\test\\resources\\"+excelName+".xlsx");
		
		FileInputStream fs=new FileInputStream(lc);
		
		Workbook wb=new XSSFWorkbook(fs);
		
		Sheet s = wb.getSheet(sheetName);
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		
		int cell = c.getCellType();
		String value=null;
		if(cell==1) {
			 value = c.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				 value = new SimpleDateFormat("dd-mm-yyyy").format(c.getDateCellValue());
			}
			else {
				 value = String.valueOf((long) c.getNumericCellValue());
				
			}
		}
		return value;
		

	}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		

	}
	
	public static void timesout() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	
	

		


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
