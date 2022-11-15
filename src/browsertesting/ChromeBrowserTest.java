package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximize window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the page title
        System.out.println("Page title is : " + driver.getTitle());

        //Get current url
        System.out.println("Current url is : " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Enter username in username field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("prime");

        //Enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("prime123");

        //Close the driver
        driver.close();
    }
}