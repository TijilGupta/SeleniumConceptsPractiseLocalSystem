package Tehbo.SeleniumConcepts;


import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.guru99.com/test/newtours/register.php"); 


		//whenever we interact with dropdown then in this case generally we check that it is an object of select class.

		Select CountryDropDown=new Select(driver.findElement(By.name("country"))); //we store the main element of Dropdown.
		//three ways to use select
		//by value
		//by index
		//by visible text
		CountryDropDown.selectByIndex(1);

		CountryDropDown.selectByValue("AMERICAN SAMOA");

		CountryDropDown.selectByVisibleText("ANTARCTICA");

		//fetch all the dropdown options in a List and print the same by using Enhanced Forloop
		List<WebElement> Alldropdownoptions=CountryDropDown.getOptions(); // In dropdown we use getOption()
		for(WebElement wee: Alldropdownoptions)  // we iterate webelement againt Alldropdownoptions
		{
			System.out.println(wee.getText());// if we take (wee) directly so we cant print webelement in console,so we can fetch by .gettext and print

		}
	}
}
