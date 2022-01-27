package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyParentInNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.close();

	}

}
