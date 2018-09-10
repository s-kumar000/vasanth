package pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Example {
	public WebDriver driver;
	@Given("The user will open the demoQa website")
	public void the_user_will_open_the_demoQa_website() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasanth Kumar\\eclipse-workspace\\Cucumber\\src\\test\\java\\browserDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/registration/");
	}

	@When("The user will fill the user registeration form")
	public void the_user_will_fill_the_user_registeration_form(DataTable name) {
	    List <String> nameList=name.asList(String.class);
	    driver.findElement(By.id("name_3_firstname")).sendKeys(nameList.get(0));
	    driver.findElement(By.id("name_3_lastname")).sendKeys(nameList.get(1));
	    Select country=new Select(driver.findElement(By.id("dropdown_7")));
	    country.selectByVisibleText(nameList.get(2));
	    Select month=new Select(driver.findElement(By.id("mm_date_8")));
	    month.selectByVisibleText(nameList.get(3));
	    Select day=new Select(driver.findElement(By.id("dd_date_8")));
	    day.selectByVisibleText(nameList.get(4));
	    Select year=new Select(driver.findElement(By.id("yy_date_8")));
	    year.selectByVisibleText(nameList.get(5));
	    driver.findElement(By.id("phone_9")).sendKeys(nameList.get(6));
	    driver.findElement(By.id("username")).sendKeys(nameList.get(7));
	    driver.findElement(By.id("email_1")).sendKeys(nameList.get(8));
	    
	}

	@Then("The user wil verify the given data")
	public void the_user_wil_verify_the_given_data() {
	    Assert.assertEquals("Vasanth",driver.findElement(By.id("name_3_firstname")).getAttribute("value") );
	    Assert.assertEquals("Kumar",driver.findElement(By.id("name_3_lastname")).getAttribute("value") );
	    Assert.assertEquals("India",driver.findElement(By.id("dropdown_7")).getAttribute("value") );
	    Assert.assertEquals("01",driver.findElement(By.id("mm_date_8")).getAttribute("value") );
	    Assert.assertEquals("01",driver.findElement(By.id("dd_date_8")).getAttribute("value") );
	    Assert.assertEquals("2001",driver.findElement(By.id("yy_date_8")).getAttribute("value") );
	    Assert.assertEquals("12345689",driver.findElement(By.id("phone_9")).getAttribute("value") );
	    Assert.assertEquals("kumar00",driver.findElement(By.id("username")).getAttribute("value") );
	    Assert.assertEquals("kumar@gmail.com",driver.findElement(By.id("name_3_firstname")).getAttribute("value") );
	    
	}

	@When("The user click the hobby and status{string}")
	public void the_user_click_the_hobby_and_status(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("The user will verify the selection{string}")
	public void the_user_will_verify_the_selection(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
