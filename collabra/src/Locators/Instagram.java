package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("sreehari");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("ABCD123");

	}

}
