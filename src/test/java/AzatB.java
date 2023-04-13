import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AzatB {
    @Test

    public static class FirstScriptTest {

        @Test
        public void eightComponents() throws InterruptedException {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");

            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            String title = driver.getTitle();
            assertEquals("Web form", title);

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            WebElement textBox = driver.findElement(By.name("my-text"));
            WebElement submitButton = driver.findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = driver.findElement(By.id("message"));
            String value = message.getText();
            assertEquals("Received!", value);

            driver.quit();
        }

        @Test
        public void testSecond() throws InterruptedException {

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");

            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            String title = driver.getTitle();
            assertEquals("Web form", title);

            Thread.sleep(2000);

            WebElement textBox = driver.findElement(By.name("my-text"));
            WebElement submitButton = driver.findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = driver.findElement(By.id("message"));
            String value = message.getText();
            assertEquals("Received!", value);

            driver.quit();
        }
    }

}