package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement txtusername;
	
	@FindBy(name="password")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlog;
	
	@FindBy(name="location")
	private WebElement droploc;
	
	@FindBy(name="hotels")
	private WebElement dhotel;
	
	@FindBy(name="room_type")
	private WebElement droselect;
	
	@FindBy(name="room_nos")
	private WebElement noroom;
	
	@FindBy(name="adult_room")
	private WebElement adultsroom;
	
	@FindBy(name="child_room")
	private WebElement childrenroom;
	
	@FindBy(name="Submit")
	private WebElement btnsearch;
	
	@FindBy(name="continue")
	private WebElement btncontinue;
	
	@FindBy(name="radiobutton_0")
	private WebElement btnselradio;
	
	
	
	@FindBy(name="first_name")
	private WebElement txtfirst;
	
	@FindBy(name="last_name")
	private WebElement txtlast;
	
	@FindBy(name="address")
	private WebElement txtaddress;
	
	@FindBy(name="cc_num")
	private WebElement txtcardno;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement selmonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement selyear;
	
	@FindBy(name="cc_cvv")
	private WebElement txtccvno;
	
	@FindBy(name="book_now")
	private WebElement btnbook;
	
	
	
	 public WebElement getTxtfirst() {
		return txtfirst;
	}
	 public WebElement getTxtlast() {
		return txtlast;
	}
	 public WebElement getTxtaddress() {
		return txtaddress;
	}
	 public WebElement getTxtcardno() {
		return txtcardno;
	}
	 public WebElement getCardtype() {
		return cardtype;
	}
	 public WebElement getSelmonth() {
		return selmonth;
	}
	 public WebElement getSelyear() {
		return selyear;
	}
	 public WebElement getTxtccvno() {
		return txtccvno;
	}
	 public WebElement getBtnbook() {
		return btnbook;
	}
	
	
	
	
	
	
	//getter
	public WebElement getDhotel() {
		return dhotel;
	}
	
	public WebElement getDroselect() {
		return droselect;
	}
	
	public WebElement getNoroom() {
		return noroom;
	}
	
	public WebElement getAdultsroom() {
		return adultsroom;
	}
	
	public WebElement getChildrenroom() {
		return childrenroom;
	}
	
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public WebElement getBtnselradio() {
		return btnselradio;
	}
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	public WebElement getBtnlog() {
		return btnlog;
	}
	
	public WebElement getDroploc() {
		return droploc;
	}
	
	
	
	
	
	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	

}
