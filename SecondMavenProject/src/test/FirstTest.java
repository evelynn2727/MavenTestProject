import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class FirstTest{

    WebDriver driver;
    String pageUrl;
    @Before
   public void useThis() {
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
//        pageUrl = "https://allegro.pl";
        pageUrl="https://pl-pl.facebook.com/";
    }


//    @Test
//    public void openPage(){
//        driver.get(pageUrl);
//        assertEquals(driver.getTitle(),pageUrl);
//    }

    @Test
    public void loginTest(){
        driver.get(pageUrl);
        WebElement elem=driver.findElement(By.id("email"));
        elem.clear();
        elem.sendKeys("totalnieniewybaczalne.ep@gmail.com");
        elem=driver.findElement(By.id("pass"));
        elem.clear();
        elem.sendKeys("rudyrudowlosy23");
        elem=driver.findElement(By.id("u_0_2"));
        elem.click();
    }

    @After
    public void doThis()
    {
        driver.quit();
    }
}