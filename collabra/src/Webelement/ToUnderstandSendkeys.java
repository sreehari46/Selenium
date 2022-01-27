package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement EmailTextField = driver.findElement(By.id("email"));
		EmailTextField.clear();
		EmailTextField.sendKeys("sree","","hari");
		EmailTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		EmailTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement PwdTextField= driver.findElement(By.id("pass"));
		PwdTextField.clear();
		Thread.sleep(2000);
		PwdTextField.sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("login")).click();
		

	}

}
