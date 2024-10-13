package utulity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class BaseTest {

    protected WebDriver driver;

    public static String generateRandomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder email = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            email.append(chars.charAt(random.nextInt(chars.length())));
        }
        email.append("@gmail.com");
        return email.toString();
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com.tr/ref=nav_bb_logo");
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void navigate(String direction) {
        switch (direction) {
            case "back":
                driver.navigate().back();
            case "forward":
                driver.navigate().forward();
            case "refresh":
                driver.navigate().refresh();
        }
    }

    @After
    public void tearDown() {
        // driver.quit();
    }
}
