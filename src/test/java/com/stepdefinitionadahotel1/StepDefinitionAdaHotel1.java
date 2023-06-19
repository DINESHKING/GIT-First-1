package com.stepdefinitionadahotel1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClassAda;
import com.pojoada.LoginPojoAda;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionAdaHotel1 extends BaseClassAda {
    LoginPojoAda lp;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    launchBrowser();
	    launchUrl("http://adactinhotelapp.com/index.php");
	    maximizeWindow(); 
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    lp = new LoginPojoAda();
        insertText(lp.getTxtuser(), "Mdineshslm");	
        insertText(lp.getTxtPass(), "7667872174");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_Login_Button() {
		lp = new LoginPojoAda();
		btnClick(lp.getBtnLogin());
	}

	@Then("User verifies home page is displayed")
	public void user_verifies_home_page_is_displayed() {
	    System.out.println("Login Done");
	}

	@When("User Selects the location of Hotel")
	public void user_Selects_the_location_of_Hotel() {
	    WebElement location = lp.getLocation();
	    insertText(location, "New");
	}

	@When("User Selects the Hotels Name")
	public void user_Selects_the_Hotels_Name() {
	   WebElement hotelname = lp.getHotelname();
	   insertText(hotelname, "Hotel Sun");
	}

	@When("User Selects the RoomType")
	public void user_Selects_the_RoomType() {
		WebElement room_type = lp.getRoom_type();
		insertText(room_type, "Super");
	}

	@When("User Selects the Number of Rooms")
	public void user_Selects_the_Number_of_Rooms() {
	    WebElement no_room = lp.getNo_room();
	    insertText(no_room, "One");
	}

	@When("User Selects the CheckIn Date")
	public void user_Selects_the_CheckIn_Date() {
		WebElement cin_date = lp.getCin_date();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value','10/05/2023')", cin_date);
	}

	@When("User Selects the CheckOut Date")
	public void user_Selects_the_CheckOut_Date() {
	    WebElement cout_date = lp.getCout_date();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value','12/05/2023')", cout_date);
	}

	@When("User Selects the Adults Per Room")
	public void user_Selects_the_Adults_Per_Room() {
	    WebElement adult_room = lp.getAdult_room();
	    lp.insertText(adult_room, "2");
	}

	@When("User Selects the Childrens Per Room")
	public void user_Selects_the_Childrens_Per_Room() {
    WebElement child_room = lp.getChild_room();
    lp.insertText(child_room, "2");

	}

	@When("User clicks on Search Button")
	public void user_clicks_on_Search_Button() {
	    WebElement submit = lp.getSubmit();
	    lp.btnClick(submit);
	}

	@When("User click on Radio Button To Select The Hotel")
	public void user_click_on_Radio_Button_To_Select_The_Hotel() {
	    WebElement radiobtn = lp.getRadiobtn();
	    lp.btnClick(radiobtn);
	}

	@When("User clicks on Continue Button")
	public void user_clicks_on_Continue_Button() {
	    WebElement continue_btn = lp.getContinue_btn();
	    lp.btnClick(continue_btn);
	}

	@When("User Enters First Name")
	public void user_Enters_First_Name() {
	   WebElement firstname = lp.getFirstname();
	   lp.insertText(firstname, "M");
	}

	@When("User Enters Last Name")
	public void user_Enters_Last_Name() {
	    WebElement lastname = lp.getLastname();
	    lp.insertText(lastname, "Dinesh");
	}

	@When("User Enters Billing Address")
	public void user_Enters_Billing_Address() {
	    WebElement address = lp.getAddress();
	    lp.insertText(address, "71/72 Padayaiyappa Salai- 635421");
	}

	@When("User Enters Valid Credit Card Number")
	public void user_Enters_Valid_Credit_Card_Number() {
     WebElement credit_card_number = lp.getCredit_card_number();
     lp.insertText(credit_card_number, "1234567890123456");

	}

	@When("User Selects Credit Card Type")
	public void user_Selects_Credit_Card_Type() {
    WebElement credit_card_type = lp.getCredit_card_type();
    lp.insertText(credit_card_type, "Visa");

	}

	@When("User Selects Expiry Date")
	public void user_Selects_Expiry_Date() {
	    WebElement expMnth = lp.getExpMnth();
	    lp.insertText(expMnth, "Feb");
	    WebElement expYr = lp.getExpYr();
	    lp.insertText(expYr, "2022");
	    
	}

	@When("User Enters CVV Number")
	public void user_Enters_CVV_Number() {
	    WebElement cvv_no = lp.getCvv_no();
	    lp.insertText(cvv_no, "123");
	}

	@When("User Clicks on Book Now Button")
	public void user_Clicks_on_Book_Now_Button() throws InterruptedException {
	   WebElement bookbtn = lp.getBookbtn();
	   lp.btnClick(bookbtn);
	   Thread.sleep(8000);
	}

	@When("User Gets The Order ID")
	public void user_Gets_The_Order_ID() throws InterruptedException {
		WebElement orderid = lp.getOrderid();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        Object number = j.executeScript("return arguments[0].getAttribute('value')", orderid);
        System.out.println(number);
	}



	
}
