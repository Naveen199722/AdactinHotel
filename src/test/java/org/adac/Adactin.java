package org.adac;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;

public class Adactin extends BaseClass{
	
	public static void main(String[] args) {
		
		
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximize();
		timesout();
		
		LoginPage l=new LoginPage();
		sendKeys(l.getTxtusername(), "KumarN2297");
		sendKeys(l.getTxtpassword(), "NKumar@2297");
		buttonclick(l.getBtnlog());
		
		
		selectByIndex(l.getDroploc(), 4);
		selectByIndex(l.getDhotel(), 2);
		selectByVisible(l.getDroselect(), "Double");
		selectByIndex(l.getNoroom(), 3);
		selectByIndex(l.getAdultsroom(), 1);
		selectByIndex(l.getChildrenroom(), 2);
		buttonclick(l.getBtnsearch());
		
		
		buttonclick(l.getBtnselradio());
		buttonclick(l.getBtncontinue());
		
		sendKeys(l.getTxtfirst(), "kumar");
		sendKeys(l.getTxtlast(), "vel");
		sendKeys(l.getTxtaddress(), "chennai");
		sendKeys(l.getTxtcardno(), "1234567890123456");
		selectByIndex(l.getCardtype(), 2);
		selectByIndex(l.getSelmonth(), 5);
		selectByIndex(l.getSelyear(), 6);
		sendKeys(l.getTxtccvno(), "123");
		buttonclick(l.getBtnbook());
		
		WebElement order = driver.findElement(By.name("order_no"));
		String text = order.getText();
		System.out.println(text);
		
	}
	
	

}
