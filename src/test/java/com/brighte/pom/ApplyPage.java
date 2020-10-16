package com.brighte.pom;

import java.util.Map;

import com.brighte.loc.ApplyLoc;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ApplyPage extends WebDriverBaseTestPage<WebDriverTestPage> implements ApplyLoc {
	
	@FindBy(locator = ELIGIBLE_AMOUNT)
	private QAFWebElement eligibleAmount;
	
	@FindBy(locator = REPAYMENT_AMOUNT)
	private QAFWebElement maximumRepaymentAmount;
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("pre-approvals/apply");
	}

	public void verifyEligibility(Map<String, String> data) {
		getEligibleAmount().verifyText(String.valueOf(data.get("EXPECTED_ELIGIBLE_AMOUNT")));
		getMaximumRepaymentAmount().assertText(String.valueOf(data.get("EXPECTED_REPAYMENT_AMOUNT")));
	}

	public QAFWebElement getEligibleAmount() {
		return eligibleAmount;
	}

	public QAFWebElement getMaximumRepaymentAmount() {
		return maximumRepaymentAmount;
	}

	

}
