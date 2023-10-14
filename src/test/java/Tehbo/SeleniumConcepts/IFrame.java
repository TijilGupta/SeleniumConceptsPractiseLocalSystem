package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame("a077aa5e");
		
		System.out.println("we r switch to iframe");
		
		//click the iframe
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		System.out.println("*******we are done******");
        
		
		//To move back to the parent frame.
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
