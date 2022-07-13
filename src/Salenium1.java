import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salenium1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Java Selenium 4.1.4\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Enter Charactors");
//		driver.findElement(By.xpath("//input[@id='concessionBooking']")).click();
//		driver.findElement(By.xpath("//label[@for='passBooking']")).click();
		
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");

		System.out.println("practice for git");
	}

}
