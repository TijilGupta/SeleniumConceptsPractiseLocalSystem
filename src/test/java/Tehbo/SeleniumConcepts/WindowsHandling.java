package Tehbo.SeleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Launching the site.
		driver.get("https://demo.guru99.com/popup.php");
		
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		
		//on that page there is a link in which we click.
		driver.findElement(By.linkText("Click Here")).click();
		
		//To handle all openend Window
		Set<String> Allwindows=driver.getWindowHandles();
		System.out.println(Allwindows);
		
		Iterator<String> iterator=Allwindows.iterator();  //Iterator we use to iterate the elements of a collection.
		
		while(iterator.hasNext())  //.hasNext check that elements r present or no.
		{
			String Mwindow=iterator.next();  //.Next() point the main window.
			
			if(!MainWindow.equalsIgnoreCase(Mwindow))
			{
				//Switching to Child Window
			    driver.switchTo().window(Mwindow);
			    driver.findElement(By.name("emailid")).sendKeys("Tijil93@");
			    driver.findElement(By.name("btnLogin")).click();
			    
			    //closing the child window
			    driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
	}

}
