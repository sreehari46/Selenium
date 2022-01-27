package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiosaavn.com/");
		
		driver.findElement(By.cssSelector("a[title='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Browse']")).click();
		
		
	}

}
