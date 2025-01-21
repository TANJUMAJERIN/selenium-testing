// // import org.junit.jupiter.api.AfterEach;
// // import org.junit.jupiter.api.BeforeEach;
// // import org.junit.jupiter.api.Test;
// // import org.openqa.selenium.By;
// // import org.openqa.selenium.WebDriver;
// // import org.openqa.selenium.WebElement;
// // import org.openqa.selenium.support.ui.ExpectedConditions;
// // import org.openqa.selenium.support.ui.WebDriverWait;
// // import utilities.WebDriverManager;

// // import java.time.Duration;

// // import org.junit.jupiter.api.Assertions;

// // public class ThemeChangeTest {

// //     private WebDriver driver;

// //     @BeforeEach
// //     public void setUp() {
// //         driver = WebDriverManager.getDriver();
// //         driver.get("https://developer.mozilla.org/en-US/docs/Web/WebDriver");
// //         driver.manage().window().maximize();
// //     }

// //     @Test
// //     public void testLightThemeSwitch() throws InterruptedException {
// //         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement themeSwitcher = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".theme-switcher-menu")));
// //         slowClick(themeSwitcher);

// //         WebElement lightThemeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-theme-light")));
// //         slowClick(lightThemeButton);
// //         Thread.sleep(3000); // Wait for the theme to apply

// //         String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
// //         Assertions.assertTrue(currentClass.contains("light"), "Light theme was not applied successfully.");
// //     }

// //     @Test
// //     public void testDarkThemeSwitch() throws InterruptedException {
// //         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement themeSwitcher = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".theme-switcher-menu")));
// //         slowClick(themeSwitcher);

// //         WebElement darkThemeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-theme-dark")));
// //         slowClick(darkThemeButton);
// //         Thread.sleep(3000); // Wait for the theme to apply

// //         String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
// //         Assertions.assertTrue(currentClass.contains("dark"), "Dark theme was not applied successfully.");
// //     }

// //     @Test
// //     public void testOsDefaultThemeSwitch() throws InterruptedException {
// //         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// //         WebElement themeSwitcher = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".theme-switcher-menu")));
// //         slowClick(themeSwitcher);

// //         WebElement osDefaultButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-theme-os-default")));
// //         slowClick(osDefaultButton);
// //         Thread.sleep(3000); // Wait for the theme to apply

// //         String currentClass = driver.findElement(By.tagName("html")).getAttribute("class");
// //         Assertions.assertTrue(currentClass.contains("os-default"), "OS default theme was not applied successfully.");
// //     }

// //     @AfterEach
// //     public void tearDown() {
// //         if (driver != null) {
// //             driver.quit(); // Close the browser after each test
// //         }
// //     }

// //     private void slowClick(WebElement element) throws InterruptedException {
// //         element.click();
// //         Thread.sleep(2000); // Wait 2 seconds to allow theme change
// //     }
// // }



