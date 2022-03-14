package locators.com.test;

import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase2 {
    public static void main(String[] args) {

        /*
         Go to Ebay
         Enter search Selenium
         Click on search button
         Verify number of results
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement searchSelenium = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchSelenium.sendKeys("Selenium");

        WebElement clickSearch = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        clickSearch.click();

        WebElement verifySelenium = driver.findElement(By.xpath("//span[contains(text(),'selenium')]"));
        String expectVerifySelenium = verifySelenium.getText();
        String actualVerifySelenium = "selenium";

        if (expectVerifySelenium.equals(actualVerifySelenium)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.quit();
    }
}
