package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelAppCompleteLoginStep {
	
	public WebDriver driver;
	public String baseUrl;	
	
	@Given("^Open chrome and navigate to hotel web application$")
	public void open_chrome_and_navigate_to_hotel_web_application() throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/DaveImac/Desktop/ChromeDriver/chromedriver");   
		driver = new ChromeDriver();
	    baseUrl = "http://www.adactin.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/HotelApp/");
		driver.findElement(By.id("username")).clear();
		
	}

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Exception {
		driver.findElement(By.id("username")).sendKeys("DaveAuto");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("hana667917");
	    driver.findElement(By.id("login")).click();   
	}

	@Then("^User Should be able to login successfuly$")
	public void user_Should_be_able_to_login_successfuly() throws Exception {
		System.out.println("Hotel App User Is loged in Successfuly");
	}

	@Then("^User select location, number of rooms, and gender specification$")
	public void user_select_location_number_of_rooms_and_gender_specification() throws Exception {
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
	    new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
	    new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
	}

	@When("^User hit the submit button$")
	public void user_hit_the_submit_button() throws Exception {
		driver.findElement(By.id("Submit")).click();
	}

	@Then("^User should be able to navigate to the next page$")
	public void user_should_be_able_to_navigate_to_the_next_page() throws Exception {
		System.out.println("Hotel App User is redirected to the Next Page");
	   
	}

	@Then("^User select radio button and continue$")
	public void user_select_radio_button_and_continue() throws Exception {
		 driver.findElement(By.id("radiobutton_2")).click();
		 driver.findElement(By.id("continue")).click();
	    
	}

	@Then("^User enter Full name, Address and payment information$")
	public void user_enter_Full_name_Address_and_payment_information() throws Exception {
		driver.findElement(By.id("first_name")).clear();
	    driver.findElement(By.id("first_name")).sendKeys("Dave");
	    driver.findElement(By.id("last_name")).clear();
	    driver.findElement(By.id("last_name")).sendKeys("C");
	    driver.findElement(By.id("address")).clear();
	    driver.findElement(By.id("address")).sendKeys("7517 Maple Ave Apt#113\nTakoma Park MD 20853");
	    driver.findElement(By.id("cc_num")).clear();
	    driver.findElement(By.id("cc_num")).sendKeys("2469432674325435");
	    new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("Master Card");
	    new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("September");
	    new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2021");
	    driver.findElement(By.id("cc_cvv")).clear();
	    driver.findElement(By.id("cc_cvv")).sendKeys("253");
	}

	@When("^User hit book now button$")
	public void user_hit_book_now_button() throws Exception {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("^User should be able to navigate to the logout page$")
	public void user_should_be_able_to_navigate_to_the_logout_page() throws Exception {
	    System.out.println("User is redirected to the Logout Page Successfuly");
	}

	@When("^User hit the logout link$")
	public void user_hit_the_logout_link() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Click here to login again")).click();
	}

	@Then("^User Should loged out and navigated to the main page$")
	public void user_Should_loged_out_and_navigated_to_the_main_page() throws Exception {
	    System.out.println("User loged out and redirected to the main login page Successfuly");
	    driver.close();
	}


}
