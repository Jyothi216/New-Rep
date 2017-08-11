package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonText {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		String Baseurl="https://letskodeit.teachable.com/p/practice";
		driver.get(Baseurl);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("opentab")).getText());
				
		driver.quit();
			
	}

}
