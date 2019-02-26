import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstTest extends BasePage{

    String pageUrl;
    @Before
   public void useThis() {
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
        driver.close();
    }
}