import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Test;

public class FirstTest{
    private String pageUrl;
    private WebDriver driver;

    public FirstTest(String pageUrl, WebDriver driver) {
        this.pageUrl = pageUrl;
        this.driver = driver;
    }

    public FirstTest() {
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    @Test
    public void openPage(){
        driver.get(pageUrl);
    }
    @Test
    public void titleComparator(){
        assertEquals(driver.getTitle(),pageUrl);
    }
}