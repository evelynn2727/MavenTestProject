//package dependencies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestMain {
    public static void main(String[] args) throws java.lang.IllegalStateException {
        String pageUrl="https://allegro.pl/";
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");

        FirstTest ft;
        ft = new FirstTest(pageUrl, driver);
        ft.openPage();
        ft.titleComparator();
    }
}
