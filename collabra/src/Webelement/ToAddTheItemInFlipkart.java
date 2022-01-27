package Webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddTheItemInFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		Thread.sleep(2000);
		
		//Adding 1st product
		driver.findElement(By.name("q")).sendKeys("iphone 12",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
		addToCart(driver,"Buy Apple iPhone 12 Mini ( 64 GB Storage ) Online at Best Price On Flipkart.com");
		
		//Adding 2nd product
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("mi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (SeaBlue, 32 GB)']")).click();
		addToCart(driver,"Mi Redmi 9A ( 32 GB Storage, 2 GB RAM ) Online at Best Price On Flipkart.com");
	}
		public static void addToCart(WebDriver driver,String ExpectedTitle) {
			String ParentWindowId=driver.getWindowHandle();
			Set<String> allWindowIds=driver.getWindowHandles();
			allWindowIds.remove(ParentWindowId);
			
			for(String windowId:allWindowIds) {
				driver.switchTo().window(windowId);
				String actualPageTitle=driver.getTitle();
				if(actualPageTitle.equals(ExpectedTitle)) {
					System.out.println("driver control switched");
				}
			}
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.switchTo().window(ParentWindowId);
		}
}
		

	