package locators.com.test;

import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_VerifyRadioBtn {
    /*
        1. Open Chrome browser
        2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
        3. Verify “Check All” button text is “Check All”
        4. Click to “Check All” button
        5. Verify all check boxes are checked
        6. Verify button text changed to “Uncheck All”
     */
    @Test
    public void verifyRadioBtn() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement basketRadioBtn = driver.findElement(By.cssSelector("#basketball"));
        WebElement footballRadioBtn = driver.findElement(By.id("football"));
        WebElement hockeyRadioBtn = driver.findElement(By.id("hockey"));
        WebElement poloRadioBtn = driver.findElement(By.id("water_polo"));

        basketRadioBtn.click();
        Assert.assertTrue(basketRadioBtn.isSelected());
        Assert.assertFalse(footballRadioBtn.isSelected());
        Assert.assertFalse(hockeyRadioBtn.isSelected());
        Assert.assertFalse(poloRadioBtn.isSelected());

        footballRadioBtn.click();
        Assert.assertFalse(basketRadioBtn.isSelected());
        Assert.assertTrue(footballRadioBtn.isSelected());
        Assert.assertFalse(hockeyRadioBtn.isSelected());
        Assert.assertFalse(poloRadioBtn.isSelected());

        hockeyRadioBtn.click();
        Assert.assertFalse(basketRadioBtn.isSelected());
        Assert.assertFalse(footballRadioBtn.isSelected());
        Assert.assertTrue(hockeyRadioBtn.isSelected());
        Assert.assertFalse(poloRadioBtn.isSelected());

        poloRadioBtn.click();
        Assert.assertFalse(basketRadioBtn.isSelected());
        Assert.assertFalse(footballRadioBtn.isSelected());
        Assert.assertFalse(hockeyRadioBtn.isSelected());
        Assert.assertTrue(poloRadioBtn.isSelected());
        driver.quit();
    }
}
