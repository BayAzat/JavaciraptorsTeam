import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AzatB {
    @Test

    public static class FirstScriptTest extends BaseTest {
// Проверка input
        @Test
        public void eightComponents() throws InterruptedException {


            getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

            String title = getDriver().getTitle();
            assertEquals("Web form", title);

            getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            WebElement textBox = getDriver().findElement(By.name("my-text"));
            WebElement submitButton = getDriver().findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = getDriver().findElement(By.id("message"));
            String value = message.getText();
            assertEquals("Received!", value);
        }

        @Test
        public void testSecond() throws InterruptedException {

            getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

            String title = getDriver().getTitle();
            assertEquals("Web form", title);

            Thread.sleep(2000);

            WebElement textBox = getDriver().findElement(By.name("my-text"));
            WebElement submitButton = getDriver().findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = getDriver().findElement(By.id("message"));
            String value = message.getText();
            assertEquals("Received!", value);
        }
    }

}
