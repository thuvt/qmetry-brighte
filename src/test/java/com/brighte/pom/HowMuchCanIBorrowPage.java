package com.brighte.pom;

import java.util.Map;

import com.brighte.loc.DetailsLoc;
import com.brighte.loc.HowMuchCanIBorrowLoc;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HowMuchCanIBorrowPage extends WebDriverBaseTestPage<WebDriverTestPage> implements HowMuchCanIBorrowLoc {

	@FindBy(locator = MARITAL_STATUS_DDL)
	private QAFWebElement maritalStatusDdl;
	
	@FindBy(locator = DEPENDANTS_DDL)
	private QAFWebElement dependantsDdl;

	@FindBy(locator = BASE_NET_INCOME_AMOUNT)
	private QAFWebElement baseNetIncomeAmount;
	
	@FindBy(locator = BASE_NET_INCOME_FREQUENCY_DDL)
	private QAFWebElement baseNetIncomeFrequencyDdl;

	@FindBy(locator = PARTNER_BASE_NET_INCOME_AMOUNT)
	private QAFWebElement partnersBaseNetIncomeAmount;
	
	@FindBy(locator = PARTNER_BASE_NET_INCOME_FREQUENCY_DDL)
	private QAFWebElement partnersBaseNetIncomeFrequencyDdl;
	
	@FindBy(locator = OTHER_TAXABLE_NET_INCOME_AMOUNT)
	private QAFWebElement otherTaxableNetIncomeAmount;
	
	@FindBy(locator = OTHER_TAXABLE_NET_INCOME_FREQUENCY_DDL)
	private QAFWebElement otherTaxableNetIncomeFrequencyDdl;
	
	@FindBy(locator = MORTAGE_REPAYMENT_AMOUNT)
	private QAFWebElement mortgageRepaymentAmount;
	
	@FindBy(locator = MORTAGE_REPAYMENT_FREQUENCY_DDL)
	private QAFWebElement mortgageRepaymentFrequencyDdl;
	
	@FindBy(locator = OTHER_LOAN_COMMITMENTS_AMOUNT)
	private QAFWebElement otherLoanCommitmentsAmount;
	
	@FindBy(locator = OTHER_LOAN_COMMITMENTS_FREQUENCY_DDL)
	private QAFWebElement otherLoanCommitmentsFrequencyDdl;
	
	@FindBy(locator = HOUSEHOLD_CREDIT_CARD_LIMIT_AMOUNT)
	private QAFWebElement householdCreditCardLimitAmount;
	
	@FindBy(locator = HOUSEHOLD_LIVING_COST_AMOUNT)
	private QAFWebElement householdLivingCostsAmount;
	
	@FindBy(locator = HOUSEHOLD_LIVING_COST_FREQUENCY_DDL)
	private QAFWebElement householdLivingCostsFrequencyDdl;
	
	@FindBy(locator = CALCULATE_LIMIT)
	private QAFWebElement calculateLimit;

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("pre-approvals/how-much-can-i-borrow");
	}
	
	public void addHouseHoldDetails(Map<String, String> data) {
		
		getMaritalStatusDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedMaritalStatus(data.get("MARITAL_STATUS")));
		
		getDependantsDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedDependants(data.get("DEPENDANTS")));
		
		getBaseNetIncomeAmount().sendKeys(String.valueOf(data.get("BASE_NET_INCOME_AMOUNT")));
		getBaseNetIncomeFrequencyDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedBaseNetIncomeFreq(data.get("BASE_NET_INCOME_FREQUENCY")));
		
		if (data.get("MARITAL_STATUS").equalsIgnoreCase("Married") || data.get("MARITAL_STATUS").equalsIgnoreCase("Defacto")) {
			getPartnersBaseNetIncomeAmount().sendKeys(String.valueOf(data.get("PARTNER_BASE_NET_INCOME_AMOUNT")));
			getPartnersBaseNetIncomeFrequencyDdl().click();
			doSelect(HowMuchCanIBorrowLoc.createSelectedPartnerBaseNetIncomeFreq(data.get("PARTNER_BASE_NET_INCOME_FREQUENCY")));	
		}
		
		getOtherTaxableNetIncomeAmount().sendKeys(String.valueOf(data.get("OTHER_TAXABLE_NET_INCOME_AMOUNT")));
		getOtherTaxableNetIncomeFrequencyDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedOtherTaxableNetIncomeFreq(data.get("OTHER_TAXABLE_NET_INCOME_FREQUENCY")));
		
		getMortgageRepaymentAmount().sendKeys(String.valueOf(data.get("MORTAGE_REPAYMENT_AMOUNT")));
		getMortgageRepaymentFrequencyDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedMortageRepaymentFreq(data.get("MORTAGE_REPAYMENT_FREQUENCY")));
		
		getOtherLoanCommitmentsAmount().sendKeys(String.valueOf(data.get("OTHER_LOAN_COMMITMENTS_AMOUNT")));
		getOtherLoanCommitmentsFrequencyDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedOtherLoanCommitmentFreq(data.get("OTHER_LOAN_COMMITMENTS_FREQUENCY")));
		
		getHouseholdCreditCardLimitAmount().sendKeys(String.valueOf(data.get("HOUSEHOLD_CREDIT_CARD_LIMIT_AMOUNT")));
		
		getHouseholdLivingCostsAmount().sendKeys(String.valueOf(data.get("HOUSEHOLD_LIVING_COST_AMOUNT")));
		getHouseholdLivingCostsFrequencyDdl().click();
		doSelect(HowMuchCanIBorrowLoc.createSelectedHouseholdLivingCostFreq(data.get("HOUSEHOLD_LIVING_COST_FREQUENCY")));
		
		getCalculateLimit().click();
	
	}
	
	public QAFWebElement getMaritalStatusDdl() {
		return maritalStatusDdl;
	}

	public QAFWebElement getDependantsDdl() {
		return dependantsDdl;
	}

	public QAFWebElement getBaseNetIncomeAmount() {
		return baseNetIncomeAmount;
	}

	public QAFWebElement getBaseNetIncomeFrequencyDdl() {
		return baseNetIncomeFrequencyDdl;
	}

	public QAFWebElement getPartnersBaseNetIncomeAmount() {
		return partnersBaseNetIncomeAmount;
	}

	public QAFWebElement getPartnersBaseNetIncomeFrequencyDdl() {
		return partnersBaseNetIncomeFrequencyDdl;
	}

	public QAFWebElement getOtherTaxableNetIncomeAmount() {
		return otherTaxableNetIncomeAmount;
	}

	public QAFWebElement getOtherTaxableNetIncomeFrequencyDdl() {
		return otherTaxableNetIncomeFrequencyDdl;
	}

	public QAFWebElement getMortgageRepaymentAmount() {
		return mortgageRepaymentAmount;
	}

	public QAFWebElement getMortgageRepaymentFrequencyDdl() {
		return mortgageRepaymentFrequencyDdl;
	}

	public QAFWebElement getOtherLoanCommitmentsAmount() {
		return otherLoanCommitmentsAmount;
	}

	public QAFWebElement getOtherLoanCommitmentsFrequencyDdl() {
		return otherLoanCommitmentsFrequencyDdl;
	}

	public QAFWebElement getHouseholdCreditCardLimitAmount() {
		return householdCreditCardLimitAmount;
	}

	public QAFWebElement getHouseholdLivingCostsAmount() {
		return householdLivingCostsAmount;
	}

	public QAFWebElement getHouseholdLivingCostsFrequencyDdl() {
		return householdLivingCostsFrequencyDdl;
	}

	public QAFWebElement getCalculateLimit() {
		return calculateLimit;
	}

	public void doSelect(String loc) {
		QAFExtendedWebElement element = new QAFExtendedWebElement(loc);
		element.click();
	}
	
}
