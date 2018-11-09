import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mail {
    @Test
    public void sendMessageTest() {

            System.setProperty("webdriver.chrome.driver", "Z:\\QA 2-2018\\Каневский\\Селениум\\ueu\\uu\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://hflabs.github.io/suggestions-demo/");
// проверка открытия страницы
            WebElement pageHeader =
                    driver.findElement(By.cssSelector(".page-header"));
            Assert.assertTrue(!pageHeader.isDisplayed(), "Не найден заголовок страницы");

            WebElement field =
                    driver.findElement(By.id("fullname-surname"));

            field.sendKeys("Петров");
            field = driver.findElement(By.id("fullname-name"));

            field.sendKeys("Петр");
            field = driver.findElement(By.id("fullname-patronymic"));

            field = driver.findElement(By.id("email"));
            field.sendKeys("pe@m.ru");

            field = driver.findElement(By.id("message"));
            field.sendKeys("Это важно");
            // проверим кнопку отправить
            WebElement button =
                    driver.findElement(By.xpath("//*[@id=\"feedback-form\"]/div[5]/button"));
            button.click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // проверим что тест выполнен успешно
            WebElement feedback =
                    driver.findElement(By.id("feedback-message"));

            Assert.assertTrue(feedback.isDisplayed(), "не найден результат отправки обращения");
            WebElement feedbackButton =
                    driver.findElement(By.xpath("//*[@id=\"feedback-message\"]/p[2]/button"));

            Assert.assertTrue(feedbackButton.isDisplayed(), "Не найден результат отправки сообщения");

            String controlValue = "Хорошо, я понял";
            Assert.assertEquals(feedbackButton.getText(), controlValue, "Текст в кнопке не " + "соответствует = " + controlValue);

        }
    }

