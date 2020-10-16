package com.brighte.steps;

import java.util.Map;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.brighte.pom.ApplyPage;
import com.brighte.pom.DetailsPage;
import com.brighte.pom.HowMuchCanIBorrowPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CalculateLimitSteps {
	
	DetailsPage detailsPage = new DetailsPage();
	HowMuchCanIBorrowPage howMuchCanIBorrowPage = new HowMuchCanIBorrowPage();
	ApplyPage applyPage = new ApplyPage();
	
	@QAFTestStep(description="Go to the page")
	public void goToThePage(){
		detailsPage.launchPage(null);
	}
	
	@QAFTestStep(description="Add basic details and Continue to the next page {0}")
	public void addBasicDetailsAndContinueToTheNextPage(Map<String, String> data){
		detailsPage.addBasicDetails(data);
	}
	
	@QAFTestStep(description="Add more household details and Calculate Limit {0}")
	public void addMoreHouseholdDetailsAndCalculateLimit(Map<String, String> data){
		howMuchCanIBorrowPage.addHouseHoldDetails(data);
	}
	
	@QAFTestStep(description="Assert the amount user is eligible and maximum repayment amount {0}")
	public void assertTheAmountUserIsEligibleAndMaximumRepaymentAmount(Map<String, String> data){
		applyPage.verifyEligibility(data);
	}
	
}
