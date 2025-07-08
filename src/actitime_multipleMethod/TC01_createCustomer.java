package actitime_multipleMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01_createCustomer {

	WebDriverWait wait;
	
	private By taskButton=By.xpath("//*[text()='Tasks']");
	private By addNewButton=By.xpath("//*[@*='addNewButton']");
	private By newCustomer=By.xpath("//*[text()='New Customer']");
	private By enterName=By.xpath("//*[@*='customerNameDiv']//*[@*='Enter Customer Name']");
	private By dropdownList=By.xpath("//*[@*='selectedItem']//*[text()='- Select Customer -']");
	private By selectDropdownItem=By.xpath("//*[@*='searchItemList']//*[text()='Our company']");
	private By createCustomerButton=By.xpath("//*[text()='Create Customer']");
	
	public TC01_createCustomer(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createCustomerExecute() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(taskButton));
		driver.findElement(taskButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(addNewButton));
		driver.findElement(addNewButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(newCustomer));
		driver.findElement(newCustomer).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(enterName));
		driver.findElement(enterName).sendKeys("Aryan");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownList));
		driver.findElement(dropdownList).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectDropdownItem));
		driver.findElement(selectDropdownItem).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(createCustomerButton));
		driver.findElement(createCustomerButton).click();
	}
}
