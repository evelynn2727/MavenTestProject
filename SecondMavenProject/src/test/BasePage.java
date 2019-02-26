import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA-Projects\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage(WebDriver driver) {
        setDriver(driver);
    }
    public void close(){
        driver.quit();
    }
}
