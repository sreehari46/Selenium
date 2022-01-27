package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementInZomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com");
		
		driver.findElement(By.name("q")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.id("latrecorded_tab")).click();

	}

}
