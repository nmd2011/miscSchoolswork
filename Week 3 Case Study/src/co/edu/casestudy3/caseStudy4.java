package co.edu.casestudy3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class caseStudy4 {
	static WebDriver driver;
	
	static void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\JavaPractice\\Practice\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.goindigo.in/?linkNav=home_header");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
	}
	
	static void findOneWay() {
		WebElement oneWay = driver.findElement(By.xpath("//*[@id=\"roundTrip\"]"));
		oneWay.click();
		/*if(oneWay.isEnabled()) {
			System.out.println("One way is checked");
		}
		else{
			System.out.println("One way not checked");
		};
		*/
	}
	


	public static void main(String[] args) {
		invokeBrowser();
		findOneWay();

	}

}
