package Tehbo.SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseTest {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://demo.guru99.com/test/newtours/register.php"); 
			
			String PageTitle=driver.getTitle();
			System.out.println(PageTitle);
			
			driver.findElement(By.name("firstName")).sendKeys("Tijil");
			driver.findElement(By.name("lastName")).sendKeys("Gupta");
			driver.findElement(By.name("phone")).sendKeys("9921608162");
			driver.findElement(By.name("userName")).sendKeys("tijilgupta93");
			
			Select allCountryName=new Select(driver.findElement(By.name("country")));
			
			allCountryName.selectByIndex(3);
			List<WebElement> ListOfCountry=allCountryName.getOptions();
			
			for(WebElement wee:ListOfCountry)
			{
			System.out.println(wee.getText());	
			}
			driver.findElement(By.linkText("Flights")).click();

			
			
			//Alert alert=driver.switchTo().alert();

			//String alertMessage=alert.getText();
			//System.out.println(alertMessage);

			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//span[@class='ns-32avy-e-21']")).click();
            //alert.accept();
           // alert.sendKeys("");
			//alert.dismiss();

			 List<WebElement> allRadioandCheckBox=driver.findElements(By.name("tripType")); //we store all the RAdioand Check box in findelements i.e list Webelement
				System.out.println(allRadioandCheckBox.size());  //Return 6
				
				//we have to iterate/traverse to get the element
				for(int i=0; i<allRadioandCheckBox.size(); i++) {
					if(allRadioandCheckBox.get(i).getAttribute("Value").equals("roundtrip"))// in list we use .get() to fetch the element.
					{
						allRadioandCheckBox.get(i).click();
					}
					Select Passenger=new Select(driver.findElement(By.name("passCount")));
					Passenger.selectByIndex(1);
					Passenger.selectByValue("2");

					Select Month=new Select(driver.findElement(By.name("fromMonth")));
					Month.selectByIndex(1);
				}
		}
}
