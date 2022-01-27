package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		WebElement ToGetAllignment = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
        Rectangle ActualAllignment = ToGetAllignment.getRect();
        
        WebElement b=driver.findElement(By.id("pass"));
        Rectangle c=b.getRect();
        
        if(ActualAllignment==(c)) {
        	System.out.println("Matching");
        }
        else
        	System.out.println("not matching");
	}

}
