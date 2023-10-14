package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

		public static void main(String[] args) {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			String eTitle="Demo Guru99 Page";
            String aTitle="";
            
            driver.get("http://demo.guru99.com/test/guru99home/");
            
            aTitle=driver.getTitle();
            
            //compare the actual title with expected title
            if(aTitle.contentEquals(eTitle))
            {
            	System.out.println("Test passed");
            }
            else
            {
            	System.out.println("Test Failed");
            }
            //Explicitwait Syntax
            
                WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
                
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium")));
                
                driver.findElement(By.linkText("Selenium")).click();
                
                		
		}

    
            
}


