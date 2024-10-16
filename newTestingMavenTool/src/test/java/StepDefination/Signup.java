package StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
 
	/*WebDriver driver;

@Given("User is navigated to the signup page")
public void user_is_navigated_to_the_signup_page() {
	
	       driver=new EdgeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://automationexercise.com/login");
	    	
}

@When("user enter the name and email")
public void user_enter_the_name_and_email(io.cucumber.datatable.DataTable dataTable) {
   driver.findElement(By.name("name")).sendKeys("namrata");
   driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("ns.nmrtasingh@gmail.com");
}

@When("click on signup Button")
public void click_on_signup_button() {
    driver.findElement(By.xpath("//button[.='Signup']")).click();
}

@Then("user navigate to the information page")
public void user_navigate_to_the_information_page() {
    String act=driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
    String exp="ENTER ACCOUNT INFORMATION";
    assertEquals(act,exp);  
}
 */
	WebDriver driver;
	@Given("user navigate to the signup page")
	public void user_navigate_to_the_signup_page() {
		   driver = new EdgeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://automationexercise.com/login");
	}

	@When("user input the (.*)and(.*)$")
	public void user_input_the_fullname_and_emailid(String name,String mail) {
		   driver.findElement(By.name("name")).sendKeys(name);
		   driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(mail);
	}

	@When("Click on the signup button")
	public void click_on_the_signup_button() {
		driver.findElement(By.xpath("//button[.='Signup']")).click();
	}

	@Then("user should navigate to the information page with valid data")
	public void user_should_navigate_to_the_information_page_with_valid_data() {
		String act=driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	    String exp="ENTER ACCOUNT INFORMATION";
	    assertEquals(act,exp);  
	}
	
}
