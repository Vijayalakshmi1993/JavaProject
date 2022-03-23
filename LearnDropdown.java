package learn.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Step 1: Locate element:

		WebElement eleUsername = driver.findElement(By.id("username"));

		// Step 2: To type a value in a text field:
		eleUsername.sendKeys("Demosalesmanager");

		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Selecting Source as Directmail by using visible text
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown = new Select(eleSource);
		
		dropdown.selectByVisibleText("Direct Mail");
		
		
		
		//Selecting Industry as Healthcare by using index;
		
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select dropdown1 = new Select(eleIndustry);
		
		dropdown1.selectByIndex(7);
		
		
		
		//Selecting ownership as Partnership by using value:
		
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select dropdown2 = new Select(eleOwnership);
		
		dropdown2.selectByValue("OWN_PARTNERSHIP");
		}}