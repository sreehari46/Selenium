package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTitlesInAlphaBeticalOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allWindowIds = driver.getWindowHandles();
	    for(String Title: allWindowIds) {
	    driver.switchTo().window(Title);
	    String Title1=driver.getTitle();
		
		

	}

}
}