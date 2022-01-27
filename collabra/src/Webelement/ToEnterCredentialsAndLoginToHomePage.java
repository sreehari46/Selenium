package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterCredentialsAndLoginToHomePage {

	public static void main(String[] args) throws InterruptedException {
		String testUrl="https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1642037127&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D360605%26redirect_uri%3Dhttps%253A%252F%252Fsecure.skype.com%252Fportal%252Flogin%253Freturn_url%253Dhttps%25253A%25252F%25252Fsecure.skype.com%25252Fportal%25252Foverview%26response_type%3Dpostgrant%26state%3Dd428a102e8a3817593d6857b&lc=1033&id=293290&mkt=en-US&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&client_flight=ReservedFlight33%2CReservedFlight67";
		String mailId="sreehariss46@gmail.com";
		String password="SHREEHARI#1";
		String expectedLoginPageTitle="Sign in to Skype";
		String expectedHomePageTitle="Sign in to Skype";
		//step1: open the browser and enter the url
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("browserLaunchedSuccessfully");
		driver.manage().window().maximize();
		System.out.println("browser is maximized successfully");
		driver.get(testUrl);
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("the login page is displayed properly");
		}else {
			System.out.println("login page is not displayed properly");
		}
		//enter user mailId into emailIdTextfield textfield
		WebElement d = driver.findElement(By.id("i0116"));
		d.clear();
		d.sendKeys(mailId);
		String actualUsernameEntered = d.getAttribute("value");
		if(actualUsernameEntered.equals(mailId)) {
			System.out.println("username is entered properly");
		}else {
			System.out.println("username is not entered properly");
		}
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='inline-block']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement a=driver.findElement(By.id("i0118"));
		a.clear();
		a.sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='inline-block']")).click();
		
	}

}
