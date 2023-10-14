package Tehbo.SeleniumConcepts;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonANDCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/radio.html");
		
		Boolean isEnabled=driver.findElement(By.id("vfb-7-1")).isEnabled();
		System.out.println(isEnabled);
		
		Boolean selected=driver.findElement(By.id("vfb-7-1")).isSelected();
		System.out.println(selected);
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		Boolean isSelected=driver.findElement(By.id("vfb-7-1")).isSelected();
		System.out.println(isSelected);
		
		//driver.findElement(By.id("vfb-7-2")).click();
		
		//CheckBoxes
		
		driver.findElement(By.cssSelector("input[value='checkbox1']")).click();
		
		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
		
		driver.findElement(By.xpath("//input[@value='checkbox3'][@name='webform']")).click();
		
		WebElement Demo= driver.findElement(By.linkText("Demo Site"));
		
		String text=Demo.getText();
		System.out.println(text);
		
		List<WebElement> allRadioButtonCheckBoxes=driver.findElements(By.name("webform")); //we store the main element which is common is all.
		
		System.out.println(allRadioButtonCheckBoxes.size());
		
		for(int i=0; i<allRadioButtonCheckBoxes.size(); i++)
		{
			if(allRadioButtonCheckBoxes.get(i).getAttribute("value").equals("Option 3"))
			{
			    allRadioButtonCheckBoxes.get(i).click();
			}
			
		}
		
		
		
		
		
		

		}



	}

