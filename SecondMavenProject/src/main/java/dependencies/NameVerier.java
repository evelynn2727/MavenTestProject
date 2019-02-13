package dependencies;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

public class NameVerier {
//    public static WebDriver driver;
//    public static final String BASE_URL = "https://javastart.pl/kurs/selenium";
    public static void main(String[] args) {
        String name = "Maciek";
        System.out.println(StringUtils.isAlpha(name));
      //  driver.get(BASE_URL);
    } }