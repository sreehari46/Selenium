package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTitlesOfNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String PageTitle=driver.getTitle();
			System.out.println(PageTitle);
			Thread.sleep(2000);
			driver.close();

	}

}
}