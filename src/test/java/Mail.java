import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.mail.ru");
        driver.navigate().to("http://www.mail.ru");
    }
}
