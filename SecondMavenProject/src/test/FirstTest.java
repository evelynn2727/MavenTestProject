import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class FirstTest{

    WebDriver driver;
    String pageUrl;
    @Before
   public void useThis() {
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        pageUrl = "https://allegro.pl";
    }


    @Test
    public void openPage(){
        driver.get(pageUrl);
        assertEquals(driver.getTitle(),pageUrl);
    }

    @After
    public void doThis()
    {
        driver.quit();
    }
}