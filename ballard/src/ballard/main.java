package ballard;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        BallardDesignsTest test = new BallardDesignsTest(driver);
        test.openWebsite();

        if (test.isLogoDisplayed()) {
            System.out.println("Logo is displayed.");
        } else {
            System.out.println("Logo is not displayed.");
        }

        if (test.isSignUpDisplayed()) {
            System.out.println("Sign Up is displayed.");
        } else {
            System.out.println("Sign Up is not displayed.");
        }

        if (test.isMyCartDisplayed()) {
            System.out.println("My cart is displayed.");
        } else {
            System.out.println("My cart is not displayed.");
        }

        test.isLogin("qatest@gmail.com", "123456789y");

        String expectedFirstName = "qa";
        if (test.verifyUserLoggedIn(expectedFirstName)) {
            System.out.println("User is logged in successfully.");
        } else {
            System.out.println("User is not logged in successfully.");
        }

        if (test.verifyLoginFormTitle()) {
            System.out.println("Login form title is correct.");
        } else {
            System.out.println("Login form title is incorrect.");
        }

        driver.quit();

	}

}
