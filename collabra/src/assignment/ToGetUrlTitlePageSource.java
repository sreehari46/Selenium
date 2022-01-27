package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetUrlTitlePageSource {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(driver.getTitle());
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
