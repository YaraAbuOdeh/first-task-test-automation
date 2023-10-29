package ballarddesigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ballarddesigns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://devwcs.ballarddesigns.com/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		System.out.println("Successfuly opend the website");
		
 
		
        //# Verify the logo is displayed
		WebElement logo =driver.findElement(By.cssSelector(".logo-anchor"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is displayed.");
		}else
			System.out.println("Logo is not displayed.");
		
		//#Verify the "E-mail sign up"is displayed
		WebElement signUp= driver.findElement(By.id("loginMyAccount"));
		if(signUp.isDisplayed()) {
			System.out.println("sign Up is displayed.");
		}else
			System.out.println("sign Up is not displayed.");
		
		
		//#Verify the my cart is displayed
		WebElement mycart= driver.findElement(By.cssSelector("#shoppingCart"));
		if(mycart.isDisplayed()) {
			System.out.println("my cart is displayed.");
		}else
			System.out.println("my cart is not displayed.");
		
		//Click on sign Up
		signUp.click();
		
		
		// Add valid Email and password
        WebElement emailInput = driver.findElement(By.id("logonId"));
        WebElement passwordInput = driver.findElement(By.id("logonPassword"));
        //correct email password qatest@gmail.com
        emailInput.sendKeys("qatest@gmail.com");
        //correct password 123456789y
        passwordInput.sendKeys("123456789y");

        // Click on Login
        WebElement loginButton = driver.findElement(By.id("logonButton"));
        loginButton.click();
        
        // Verify the user is logged in successfully
        WebElement accountNavigationLink = driver.findElement(By.id("welcome"));
        String expectedFirstName = "qa"; 

        if (accountNavigationLink.getText().contains(expectedFirstName)) {
            System.out.println("User is logged in successfully.");
        } else {
            System.out.println("User is not logged in successfully.");
	}
        
        // Get the title of the login form and verify it equals "Registered Members"
        WebElement loginForm = driver.findElement(By.id("welcome"));
        String loginFormTitle = loginForm.getText();
        if (loginFormTitle.equals("Welcome, qa!")) {
            System.out.println("Login form title is correct: " + loginFormTitle);
        } else {
            System.out.println("Login form title is incorrect.");
        }
	}

}
