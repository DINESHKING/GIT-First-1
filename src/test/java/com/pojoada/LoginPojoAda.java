package com.pojoada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClassAda;

public class LoginPojoAda extends BaseClassAda {
public LoginPojoAda() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement txtuser;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(name="login")
	private WebElement btnLogin;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotelname;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement no_room;
	@FindBy(id="datepick_in")
	private WebElement cin_date;
	@FindBy(id="datepick_out")
	private WebElement cout_date;
    @FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement continue_btn;
	@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement credit_card_number;
	@FindBy(id="cc_type")
	private WebElement credit_card_type;
	@FindBy(id="cc_exp_month")
	private WebElement expMnth;
	@FindBy(id="cc_exp_year")
	private WebElement expYr;
	@FindBy(id="cc_cvv")
	private WebElement cvv_no;
	@FindBy(id="book_now")
	private WebElement bookbtn;
	@FindBy(name="order_no")
	private WebElement orderid;
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotelname() {
		return hotelname;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getNo_room() {
		return no_room;
	}
	public WebElement getCin_date() {
		return cin_date;
	}
	public WebElement getCout_date() {
		return cout_date;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinue_btn() {
		return continue_btn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit_card_number() {
		return credit_card_number;
	}
	public WebElement getCredit_card_type() {
		return credit_card_type;
	}
	public WebElement getExpMnth() {
		return expMnth;
	}
	public WebElement getExpYr() {
		return expYr;
	}
	public WebElement getCvv_no() {
		return cvv_no;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	
	
	
}
