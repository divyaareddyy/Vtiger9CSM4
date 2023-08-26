package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	//Declaration
		@FindBy(xpath="//img[@alt='Create Contact...']")
		public WebElement plusButton;
		
	 //Initialization
		public  void OrganizationsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void clickPlusButton()
		{
			plusButton.click();
		}

}
