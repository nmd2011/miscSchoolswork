package co.edu.casestudy3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class caseStudy3 {
	static WebDriver driver;
	
	
	static void invokeBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\JavaPractice\\Practice\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.edureka.co/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
	}
	
	static void seleniumSearch() {		 
		WebElement search = driver.findElement(By.name("user_v1[query]"));
		search.sendKeys("Selenium");
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-button-top")));
		searchButton.click();
		WebElement seleniumCourse = driver.findElement(By.xpath("//*[@id=\"add-master-courses\"]/a/div[1] "));
		seleniumCourse.click();
		String pageTitle = driver.getTitle();
		System.out.println("The title of the selenium masters page is " +pageTitle);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='giTrackElementHeader'][contains(text(),'Courses')]")).click();
		String allCourses = driver.getTitle();
		System.out.println("The title of the all results page is " + allCourses);
	}

	public static void main(String[] args) {
		invokeBrowser();
		seleniumSearch();
		
	}

}
