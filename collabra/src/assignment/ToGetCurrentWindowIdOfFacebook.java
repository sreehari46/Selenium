package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentWindowIdOfFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		String WindowId = driver.getWindowHandle();
		System.out.println(WindowId);

	}

}
