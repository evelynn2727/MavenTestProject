package dependencies;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class NameVerier {
    public static void main(String[] args) throws java.lang.IllegalStateException {
        String name = "Maciek";
        System.out.println(StringUtils.isAlpha(name));
//        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");
//
//        String pageUrl="https://allegro.pl/";
//        WebDriver driver = new ChromeDriver();
//        driver.get(pageUrl);
//        System.out.println();
//        assertEquals(driver.getTitle(),pageUrl);
    } }