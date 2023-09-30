package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Contact_Us_Steps {

    private WebDriver driver;

    @Before
    public void setup() {

     //  System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") +
     //           "/src/main/java/drivers/chromedriver.exec");

       // System.setProperty("webdriver.chrome.driver", "/src/main/java/drivers/chromedriver");
       System.setProperty("webdriver.chrome.driver","/Users/ibrahimhalilkalkan/Downloads/chromedriver");//That's solved problem

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();


    }
    @After
    public void tearDown(){
       // driver.quit();
    }

    public String generateRandomNumber(int length) {

        return RandomStringUtils.randomNumeric(length);
    }

    @Given("I access the webdriver university contact us page")
    public void ı_access_the_webdriver_university_contact_us_page() {

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a unique first name")
    public void ı_enter_a_unique_first_name() {

        driver.findElement(By.xpath("//input[@name='first_name']")).
                sendKeys("AutoFN" + generateRandomNumber(5));


    }
    @And("I enter a unique last name")
    public void ı_enter_a_unique_last_name() {
        driver.findElement(By.xpath("//input[@name='last_name']")).
                sendKeys("AutoLN"+ generateRandomNumber(5));
    }

    @And("I enter a unique email address")
    public void ı_enter_a_unique_email_address() {
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("AutoEmail" + generateRandomNumber(10) + "@mail.com");

    }
    @And("I enter a unique comment")
    public void ı_enter_a_unique_comment() {
        System.out.println("Test5");

    }
    @And("I click on the submit button")
    public void ı_click_on_the_submit_button() {
        System.out.println("Test6");

    }
    @Then("I should be presented with a successful contact us submission message")
    public void ı_should_be_presented_with_a_successful_contact_us_submission_message() {
        System.out.println("Test7");

    }



}
