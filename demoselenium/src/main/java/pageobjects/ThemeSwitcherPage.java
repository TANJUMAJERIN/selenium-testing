package pageobjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThemeSwitcherPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By themeSwitcherMenu = By.cssSelector(".theme-switcher-menu");

    public ThemeSwitcherPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToTheme(String themeSelector) throws InterruptedException {
        WebElement themeSwitcher = wait.until(ExpectedConditions.elementToBeClickable(themeSwitcherMenu));
        slowClick(themeSwitcher);

        WebElement themeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(themeSelector)));
        slowClick(themeButton);

        Thread.sleep(3000); // Wait for the theme to apply
    }

    private void slowClick(WebElement element) throws InterruptedException {
        element.click();
        Thread.sleep(2000); // Wait 2 seconds to allow theme change
    }
}
