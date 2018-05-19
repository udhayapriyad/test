package pages;

import org.openqa.selenium.support.PageFactory;

public class FindLeadWindow extends MergeLeadsPage {
	
	public FindLeadWindow() {		
		PageFactory.initElements(driver,this);
	}	 
	
	public FindLeadPage SwitchTOWindow() throws InterruptedException
	{
		switchToWindow(1);
		Thread.sleep(3000);
		return new FindLeadPage();
	}
	
}
