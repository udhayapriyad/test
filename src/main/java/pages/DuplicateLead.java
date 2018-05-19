package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DuplicateLead extends ViewLead{
	public DuplicateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	//Click CreateLead Button
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreatetLead;
	public ViewLead clickCreateLead() {
	click(eleCreatetLead);
		return new ViewLead();		
	}
	
}