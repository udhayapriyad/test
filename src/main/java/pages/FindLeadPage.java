package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadPage extends MyLeads {
	
	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	String DeletedID="";
	//Type FirstName in  FindLeadsTab
	@FindBy(how=How.XPATH ,using="(//input[@ name='firstName'])[3]")
	private WebElement eleFName;
	public FindLeadPage typeFName(String data) {
		type(eleFName,data);
		return this;		
	}
	
	
	//Click FindLead
	@FindBy(how=How.XPATH ,using="//button[text()='Find Leads']")
	private WebElement eleFindLead;
	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		click(eleFindLead);
		Thread.sleep(6000);	
		return this;	
	}
	
	//Click FirstCol in the Grid
	@FindBy(how=How.XPATH ,using="(//a[@class='linktext'])[4]")
	private WebElement eleID;
	public ViewLead clickFirstCol() throws InterruptedException {
		Thread.sleep(3000);
		myDeleteId= getTheID()  ;
		click(eleID);
		return new ViewLead();		
	}
	
	
	//Click FirstCol in the Grid and Return to Merge Lead
	@FindBy(how=How.XPATH ,using="(//a[@class='linktext'])[4]")
	private WebElement eleMergeID;
	public MergeLeadsPage clickFirstID() throws InterruptedException {
		Thread.sleep(3000);
		click(eleMergeID);
		return new MergeLeadsPage();		
	}
		
		
		

	//Click PhoneTab
	@FindBy(how=How.XPATH ,using="//span[text() ='Phone']")
	private WebElement elePhoneTab;
	public FindLeadPage clickPhoneTabButton() {
		click(elePhoneTab);
		return this;		
	}
	
	//Type PhoneNo in  FindLeadsTab
	@FindBy(how=How.XPATH ,using="(//input[@ name='phoneNumber'])")
	private WebElement elePhoneNo;
	public FindLeadPage typePhoneNo(String data) {
		type(elePhoneNo,data);
		return this;		
	}	
	
	//Get the ID of the firstCol
	@FindBy(how=How.XPATH ,using="(//a[@class='linktext'])[4]")
	private WebElement eleID1;
	public String getTheID()  {
		DeletedID = getText(eleID1);
		System.out.println("GetID  :"+DeletedID);
		return DeletedID;		
	}
	
	//Type ID  in  FindLeadsTab for DeleteLead
	@FindBy(how=How.XPATH ,using="(//input[@ name='id'])")
	private WebElement eleIDno;
	public FindLeadPage typeID() throws InterruptedException {
		System.out.println("TypeDeleteId  :"+myDeleteId);
		Thread.sleep(3000);
		type(eleIDno,myDeleteId);
		return this;		
	}
	// Type Lead ID in the Find Lead
	public FindLeadPage typeLeadID(String data) throws InterruptedException {
		type(eleIDno,data);
		return this;		
	}
	
	
	//Click on the Email Tab
	@FindBy(how=How.XPATH ,using="//span[text() ='Email']")
	private WebElement eleEmailTab;
	public FindLeadPage clickEmailTabButton() {
		click(eleEmailTab);
		return this;		
	}
	
	
	//Type PhoneNo in  FindLeadsTab
	@FindBy(how=How.XPATH ,using="(//input[@ name='emailAddress'])")
	private WebElement eleEmailID;
	public FindLeadPage typeEmailID(String data) {
		type(eleEmailID,data);
		return this;		
	}	
	
	
	
}