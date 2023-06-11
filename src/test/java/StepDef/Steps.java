package StepDef;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class Steps{
	    WebDriver driver = new ChromeDriver();

		@Given("User Launch browser")
		public void user_launch_browser() {
		   
          System.setProperty("webdriver.chrome.driver","C:\\Users\\NikhilaS\\Downloads\\chromedriver_win32"); 
          System.out.println("Test");
        // throw new io.cucumber.java.PendingException();
		}
		@And("opens URL {string}")
		public void opens_url(String string) {
		    driver.get("https://demo.opencart.com/");
		   //throw new io.cucumber.java.PendingException();
		}
		@When("User navigate to MyAccount menu")
		public void user_navigate_to_my_account_menu() {
		   //driver.findElement(By.xpath(""));
			System.out.println("Test");
		    throw new io.cucumber.java.PendingException();
		}

		
	}
	
