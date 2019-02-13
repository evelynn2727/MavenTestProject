package dependencies;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameVerier {
    public static void main(String[] args) throws java.lang.IllegalStateException {
        String name = "Maciek";
        System.out.println(StringUtils.isAlpha(name));
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

    } }