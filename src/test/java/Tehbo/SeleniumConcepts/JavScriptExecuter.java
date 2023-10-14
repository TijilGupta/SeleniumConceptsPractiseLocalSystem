package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JavScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



		driver.get("https://demo.guru99.com/V4/");

		//we cant create object of interface but javascriptExecuter create object by type casting.
		JavascriptExecutor js=(JavascriptExecutor)driver;

		//Login to Guru
		driver.findElement(By.name("uid")).sendKeys("Tijil");
		driver.findElement(By.name("password")).sendKeys("hddhhxsk");

		WebElement button=driver.findElement(By.name("btnLogin"));
		//perform click operation with the help of javaScript executer
		js.executeScript("arguments[0].click();",button);


		Thread.sleep(5000);
         //one alert will come so we handling that alert by accept
		driver.switchTo().alert().accept();
        
		//this alert created by me
		js.executeScript("alert('welcome to Guru99')");
	}

}
