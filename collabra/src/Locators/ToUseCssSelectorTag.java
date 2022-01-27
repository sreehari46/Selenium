package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelectorTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Search for Courses']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search for Courses']")).sendKeys("java");
		driver.findElement(By.cssSelector("input[value='go']")).click();
	}

}
