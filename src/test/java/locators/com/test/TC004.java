package locators.com.test;

import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC004 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
        3. Locate all the WebElements on the page using XPATH locator only (total of 6)
           a. “Home” link
           b. “Forgot password” header
           c. “E-mail” text
           d. E-mail input box
           e. “Retrieve password” button
         4.Print text of a,b,c,e and put some email to d
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");

        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.findElement(By.xpath("//a[text()='Forgot Password']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("td@gmail.com");
        driver.findElement(By.xpath("//button[@id='form_submit']")).click();

        WebElement confMessage = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        String getConfMessage = confMessage.getText();
        System.out.println("getConfMessage = " + getConfMessage);

        String clickHome = "//a[contains(text(),'Home')]";
        WebElement clickHomePage = driver.findElement(By.xpath(clickHome));
        clickHomePage.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
