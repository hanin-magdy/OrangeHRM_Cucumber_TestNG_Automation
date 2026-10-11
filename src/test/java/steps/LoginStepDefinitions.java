package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;

public class LoginStepDefinitions {

   private WebDriver driver ;

   @Given("The regular user is in the login page of orangeHRM")
    public void the_regular_user_is_in_the_login_page_of_orange_hrm() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("The user enter valid credentials")
//    @When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_Credentials(io.cucumber.datatable.DataTable table) {

        Map<String,String> data = table.asMap(String.class,String.class);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys(data.get("username"));
        driver.findElement(By.name("password")).sendKeys(data.get("password"));

        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

    }
    @Then("The user will be redirected to the homePage")
    public void the_user_will_be_redirected_to_the_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h6")));
        Assert.assertEquals(driver.findElement(By.tagName("h6")).getText(),"Dashboard",
                "You are not redirected to the homePage");
        driver.quit();

    }

}
