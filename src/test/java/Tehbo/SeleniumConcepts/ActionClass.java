package Tehbo.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Actions action=new Actions(driver);
		
		WebElement uname=driver.findElement(By.id("email"));
		action.moveToElement(uname).click().keyDown(Keys.SHIFT).sendKeys("Tijil").build().perform();
		
		WebElement password=driver.findElement(By.id("pass"));
		action.moveToElement(password).contextClick().build().perform();
		
		//How to enter text without using SendKeys.....By Using Action class we can enter text
		//It is an interfae iterator use for moving one element to another/use to iterate the elements of the collection
		

	}

}
