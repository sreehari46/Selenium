package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		String ExpectedTitle = "Please identify yourself";
		
		WebElement FirstElement = driver.findElement(By.id("headerContainer"));
String ActualElement = FirstElement.getText();
if(ExpectedTitle.equals(ActualElement)) {
	System.out.println(ActualElement);
}
	}

}
