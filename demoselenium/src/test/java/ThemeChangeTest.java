import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.ThemeSwitcherPage;
import utilities.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ThemeChangeTest {

    private WebDriver driver;
    private ThemeSwitcherPage themePage;

    @BeforeEach
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/WebDriver");
        driver.manage().window().maximize();
        themePage = new ThemeSwitcherPage(driver);
    }

    @Test
    public void testDarkToLightThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-dark");
        themePage.switchToTheme(".icon-theme-light");

        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("light"), "Light theme was not applied successfully.");

        printNotification("Dark to Light Theme Switch Test Passed!");
    }

    @Test
    public void testOsDefaultToLightThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-os-default");
        themePage.switchToTheme(".icon-theme-light");

        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("light"), "Light theme was not applied successfully.");

        printNotification("OS Default to Light Theme Switch Test Passed!");
    }

    @Test
    public void testOsDefaultToDarkThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-os-default");
        themePage.switchToTheme(".icon-theme-dark");

        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("dark"), "Dark theme was not applied successfully.");

        printNotification("OS Default to Dark Theme Switch Test Passed!");
    }

    @Test
    public void testLightToDarkThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-light");
        themePage.switchToTheme(".icon-theme-dark");

        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("dark"), "Dark theme was not applied successfully.");

        printNotification("Light to Dark Theme Switch Test Passed!");
    }
    @Test
    public void testDarkToOsDefaultThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-dark");
        themePage.switchToTheme(".icon-theme-os-default");

        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("os-default"), "OS default theme was not applied successfully.");
        printNotification("Dark to OS Default Theme Switch Test Passed!");
    }
   
    @Test
     public void testLightToOsDefaultThemeSwitch() throws InterruptedException {
        themePage.switchToTheme(".icon-theme-light");
        themePage.switchToTheme(".icon-theme-os-default");


        String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
        Assertions.assertTrue(currentClass.contains("os-default"), "OS default theme was not applied successfully.");
        printNotification("Light to OS Default Theme Switch Test Passed!");
    }

    private void printNotification(String message) {
        ((JavascriptExecutor) driver).executeScript(
            "const body = document.querySelector('body');" +
            "const notification = document.createElement('div');" +
            "notification.textContent = '" + message + "';" +
            "notification.style.position = 'fixed';" +
            "notification.style.bottom = '10px';" +
            "notification.style.right = '10px';" +
            "notification.style.backgroundColor = 'green';" +
            "notification.style.color = 'white';" +
            "notification.style.padding = '10px';" +
            "notification.style.borderRadius = '5px';" +
            "notification.style.zIndex = '10000';" +
            "body.appendChild(notification);" +
            "setTimeout(() => notification.remove(), 5000);"
        );
    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(5000); // Wait for 5 seconds to ensure the driver finishes all tasks.
            if (driver != null) {
                driver.quit(); // Close the browser after each test
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
