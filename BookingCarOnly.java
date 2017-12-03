package CarRental;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingCarOnly {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.com/Cars");
		
		//Pickup place specified
		driver.findElement(By.id("car-pickup-clp")).sendKeys("Bloomington, MN");
		
		//drop-off place specified
		driver.findElement(By.id("car-dropoff-clp")).sendKeys("Burnsville, MN");
		
		//pick-up date specified
		driver.findElement(By.id("car-pickup-date-clp")).click();
		driver.findElement(By.xpath("//*[@id='car-pickup-date-start-clp']/div/div/div[3]/table/tbody/tr[6]/td/button")).click();
		
		//pick-up time specified
		Select oSelect = new Select(driver.findElement(By.id("car-pickup-time-clp")));
		oSelect.selectByVisibleText("1:00 pm");
		
		//drop-off date specified
		driver.findElement(By.id("car-dropoff-date-clp")).click();
		driver.findElement(By.xpath("//*[@id='car-dropoff-date-end-clp']/div/div/div[3]/table/tbody/tr[5]/td[3]/button")).click();
		
		//drop-off time specified
		Select iSelect = new Select(driver.findElement(By.xpath("//*[@id='car-dropoff-time-clp']")));
		iSelect.selectByVisibleText("7:00 am");
		
		//Click on Search
		driver.findElement(By.xpath("//*[@id='gcw-cars-form-clp']/div[7]/label/button")).click();
		Thread.sleep(9000);
		
		
		
	}

}
