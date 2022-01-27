package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrlOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}

}
