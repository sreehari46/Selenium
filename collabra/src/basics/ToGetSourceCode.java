package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
}

}
