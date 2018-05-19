package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	
	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}
	
}
