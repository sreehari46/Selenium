package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://skillrary.com/user/login");
		
		String ActualValue="Sreehari@gmail.com";
		
		WebElement TheValue = driver.findElement(By.name("email"));
		TheValue.clear();
		TheValue.sendKeys(ActualValue);
		String EnteredData=TheValue.getAttribute("value");
		if(EnteredData.equals(ActualValue)) {
			System.out.println(ActualValue);
			System.out.println("Entered data is matching");
		}
		

	}

}
