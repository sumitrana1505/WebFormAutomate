import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebformAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Chirag");
        driver.findElement(By.id("input-lastname")).sendKeys("Chauhan");
        driver.findElement(By.id("input-email")).sendKeys("chiragchauhan9@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9914848784");
        driver.findElement(By.id("input-password")).sendKeys("Chirag123123");
        driver.findElement(By.id("input-confirm")).sendKeys("Chirag123123");

        if (driver.findElement(By.name("newsletter")).isDisplayed()) {
            if (!driver.findElement(By.xpath("//input[@name=\"newsletter\"][1]")).isSelected()) {
                driver.findElement(By.xpath("//input[@name=\"newsletter\"][1]")).click();
            }
        }
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
}
