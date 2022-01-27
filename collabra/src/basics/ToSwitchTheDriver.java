package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedWindowTitle="ICICI";
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
				Thread.sleep(2000);
				break;
			}
			
		}
		driver.quit();

	}

}
