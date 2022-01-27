package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetHeightAndWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Dimension dimension =driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("height: " +height+ "and width " +width);

	}

}
