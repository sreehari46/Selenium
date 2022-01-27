package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClickAndSendActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.swiggy.com");
		
		driver.findElement(By.id("location")).sendKeys("Bangalore");
		driver.findElement(By.className("_2W-T9")).click();

	}

}
