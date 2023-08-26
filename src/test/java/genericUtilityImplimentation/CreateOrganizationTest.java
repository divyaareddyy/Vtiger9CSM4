package genericUtilityImplimentation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrganizationTest {

	public static void main(String[] args)
	{
    // PropertiesUtility property= new PropertiesUtility();
    // ExcelUtility excel=new ExcelUtilty)();
    // Javautility jutil=new Javautility();
    // WebDriverUtilty webtill= new WebDriverUtilty(); 
		
       WebDriver driver= webUtil.launchBrowser(property.readFromProperties("browser"));
       webUtil.maximizeBrowser();
       webUtil.navigateToApp(property.readFromProperties("url"));
       webUtil.waitTillElementFound(Long.parseLong(property.readFromProperties("time")));t
       
     
     property.propertiesInitialization(IConstantPath.PROPERTIES_PATH);
     excel.excelInitialization(IConstantPath.EXCEL_PATH)
     
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http:/localhost:8888/);");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     if (driver.getTitle().contains("vtiger"));
      System.out.println("Login page displayed");
      
     else
    	 
      System.out.println("Login page not found"); 
     
     driver.findElement(By.name("user_name")).sendKeys("admin");
     driver.findElement(By.name("user_password")).sendKeys("admin");
     driver.findElement(By.id("submitButton")).submit();
     
     		
     
	}

}
