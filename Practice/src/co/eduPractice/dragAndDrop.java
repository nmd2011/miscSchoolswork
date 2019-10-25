package co.eduPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class dragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\JavaPractice\\Practice\\Selenium Jar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tgroudan/AppData/Local/Temp/Temp1_Additional%20Files%20(2).zip/alerts.html");
		//driver.get("file:///C:/Users/tgroudan/AppData/Local/Temp/Temp1_Additional%20Files%20(2).zip/alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("What the? Selenium");
        alert.accept();
		
		
		
		
		
		
		
		
		
		
		/*
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();  

		//driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();  
		Alert promptAlert  = driver.switchTo().alert();
		 promptAlert.sendKeys("Yes");
		
		 
		
		
		/*
		
		Alert promptAlert  = driver.switchTo().alert()
		 String alertText = promptAlert .getText();
		 System.out.println("Alert text is " + alertText);
		 //Send some text to the alert
		 promptAlert.sendKeys("Yes");
		 Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		 promptAlert .accept();
		
*/
	

	}

}
