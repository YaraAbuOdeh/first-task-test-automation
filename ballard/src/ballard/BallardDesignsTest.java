package ballard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BallardDesignsTest {
    private WebDriver driver;

    public BallardDesignsTest(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebsite() {
        driver.get("https://devwcs.ballarddesigns.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        System.out.println("Successfully opened the website");
    }

    public boolean isLogoDisplayed() {
        WebElement logo = driver.findElement(By.cssSelector(".logo-anchor"));
        return logo.isDisplayed();
    }

    public boolean isSignUpDisplayed() {
        WebElement signUp = driver.findElement(By.id("loginMyAccount"));
        return signUp.isDisplayed();
    }

    public boolean isMyCartDisplayed() {
        WebElement myCart = driver.findElement(By.cssSelector("#shoppingCart"));
        return myCart.isDisplayed();
    }

    public void isLogin(String email, String password) {
        WebElement signIn = driver.findElement(By.id("loginMyAccount"));
        signIn.click();

        WebElement emailInput = driver.findElement(By.id("logonId"));
        WebElement passwordInput = driver.findElement(By.id("logonPassword"));

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("logonButton"));
        loginButton.click();
    }

    public boolean verifyUserLoggedIn(String expectedFirstName) {
        WebElement accountNavigationLink = driver.findElement(By.id("welcome"));
        return accountNavigationLink.getText().contains(expectedFirstName);
    }

    public boolean verifyLoginFormTitle() {
        WebElement loginForm = driver.findElement(By.id("welcome"));
        return loginForm.getText().equals("Welcome, qa!");
    }


}
