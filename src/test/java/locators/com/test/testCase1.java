package locators.com.test;

import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {
    public static void main(String[] args) throws InterruptedException {
        /*
         Go to Ebay
         Enter search term
         Click on search button
         Print number of results
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement searchTerm = driver.findElement(By.xpath("//input[@type = 'text']"));
        searchTerm.sendKeys("Term");
        WebElement clickSearch = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        clickSearch.click();
        WebElement printResult = driver.findElement(By.xpath("//*[@class='srp-controls__count-heading']"));
        String getPrintResult = printResult.getText();
        System.out.println("getPrintResult = " + getPrintResult);
        driver.quit();
    }
}
