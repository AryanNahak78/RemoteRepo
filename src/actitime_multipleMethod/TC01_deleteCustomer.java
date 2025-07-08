package actitime_multipleMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01_deleteCustomer {

	WebDriver driver;
	WebDriverWait wait;
	
	private By AryanSettingButton=By.xpath("//*[@*='itemsContainer']//*[text()='Aryan']/../..//*[@*='editButton']");
	private By ActionsDropDown=By.xpath("(//*[@*='actionButton']//*[text()='ACTIONS'])[1]");
	private By deleteButton=By.xpath("//*[@*='display: inline-block;']//*[text()='Delete']");
	private By confirmDeleteButton=By.xpath("//*[text()='Delete permanently']");
	
	public TC01_deleteCustomer(WebDriver driver) {
		this.driver=driver;
	}
	
	public void deleteCustomerExecute() throws InterruptedException {
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(AryanSettingButton));
		driver.findElement(AryanSettingButton).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ActionsDropDown));
		driver.findElement(ActionsDropDown).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
		driver.findElement(deleteButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmDeleteButton));
		driver.findElement(confirmDeleteButton).click();
	}
}
