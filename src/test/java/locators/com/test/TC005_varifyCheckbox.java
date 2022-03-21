package locators.com.test;

import locators.com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_varifyCheckbox {

    /*
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/checkboxes
        3. Verify “Success – Check box is checked” message is NOT displayed.
        4. Click to checkbox under “Single Checkbox Demo” section
        5. Verify “Success – Check box is checked” message is displayed.
     */
    @Test
    public void verifyCheckbox() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        Thread.sleep(3000);
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));
        checkbox1.click();
        checkbox2.click();
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertFalse(checkbox2.isSelected());
        driver.quit();
    }
}
