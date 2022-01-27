package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allWindowsIds = driver.getWindowHandles();
		for(String windowid : allWindowsIds) {
		System.out.println(windowid);
		
		}
		driver.quit();
}
}
