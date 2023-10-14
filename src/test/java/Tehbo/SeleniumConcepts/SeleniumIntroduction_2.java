package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntroduction_2 {

	public static void main(String[] args) {
		
		String URL="https:/www.youtube.com/";
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		driver.manage().window().maximize();
		
		//implicit wait-selenium page is loading i will wait for 5sec for every action/command before failing the program.if it find the elements in 2sec so it will execute nextone.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		   driver.get(URL);
		 String PageTitle1= driver.getTitle();
		 System.out.println("title of the page"+PageTitle1);

		 driver.navigate().to("https://www/.amazon.com/");
		 String PageTitle2= driver.getTitle();
		 System.out.println("title of the page"+PageTitle2);

		
		driver.navigate().back();
		System.out.println("Back--> title of the page"+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Forward--> title of the page"+driver.getTitle());
		
		driver.navigate().refresh();
		
		//close command will close only current active tab in which we r working
		//driver.close();
		
		//quit is use to close all tabs which opened by selenium
		driver.quit();
		
		
	}

}
