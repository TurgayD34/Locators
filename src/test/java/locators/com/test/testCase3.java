package locators.com.test;

import com.google.common.base.Verify;
import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase3 {
    public static void main(String[] args) throws InterruptedException {

        /*
         Go to Wikipedia.org
         Enter search term, Selenium Webdriver
         Click on search button

         Click on search results 'Selenium (Software)'
         Verify Url ends with 'Selenium (Software)'
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(3000);

        WebElement searchWiki = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchWiki.sendKeys("Selenium Webdriver");

        WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        searchBtn.click();

        WebElement resultSelenium = driver.findElement(By.xpath("//*[@id='mw-search-top-table']/div[2]"));
        String getResultSelenium = resultSelenium.getText();
        System.out.println("getResultSelenium = " + getResultSelenium);


        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://en.wikipedia.org/wiki/Special:Search?search=Selenium+Webdriver&go=Go&ns0=1";

        if (expectedUrl.equals(currentUrl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
            System.out.println("currentUrl = " + currentUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        driver.quit();
    }
}
