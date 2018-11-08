import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.google.com");
    }

}
