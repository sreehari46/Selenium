package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllWindowsExceptOneWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		String expectedParentPageTitle="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		
		Set<String> allWindowIds=driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualPageTitle=driver.getTitle();
			if(!expectedParentPageTitle.equals(actualPageTitle)) {
				Thread.sleep(2000);
				driver.close();
			}
		}

	}

}
