import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    public void testAbbr4(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Пользователь/Downloads/chromedriver_win32/" +
                "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.getTitle(); // => "Google"

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"

        driver.quit();

    }



}
