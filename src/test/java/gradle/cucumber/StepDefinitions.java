package gradle.cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    
	WebDriver driver;

    @When("I open Firefox")
    public void i_open_firefox() 
    {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
    
    @When("I search WorldCup")
    public void i_search_worldcup() 
    {
        WebElement recherche = driver.findElement(By.name("q"));
        recherche.sendKeys("World cup");
    }
    
    @When("I open Chrome")
    public void i_open_chrome() 
    {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
    
    @Then("^I close the browser$")
    public void i_close_the_browser()
    {
    	driver.quit();
    }
    
}
