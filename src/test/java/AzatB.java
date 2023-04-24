import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AzatB extends BaseTest {
    @Test
    public void textInputTest() {

        getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement textInput = getDriver().findElement(By.xpath("//input[@name='my-text']"));
        WebElement submitButton = getDriver().findElement(By.xpath("//button[@type='submit']"));

        textInput.sendKeys("Selenium");
        submitButton.click();

        WebElement message = getDriver().findElement(By.xpath("//p[@id='message']"));
        String value = message.getText();

        Assert.assertEquals(value,"Received!");
    }

    @Test
    public void inputPasswordTest() {
        getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement inputPassword = getDriver().findElement(By.xpath("//input[@name='my-password']"));
        WebElement submitButton = getDriver().findElement(By.xpath("//button[@type='submit']"));

        inputPassword.sendKeys("123456qwertY!");
        submitButton.click();

        WebElement message = getDriver().findElement(By.xpath("//p[@id='message']"));
        String value = message.getText();

        Assert.assertEquals(value,"Received!");
    }
}
