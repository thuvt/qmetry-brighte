package com.brighte.loc;

public interface HowMuchCanIBorrowLoc {
	
	static final String MARITAL_STATUS_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[2]';'desc':'Marital status ddl'}";
	
	static final String DEPENDANTS_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[3]//div[@class=\"select-wrapper\"]';'desc':'Dependants ddl'}";
	
	static final String BASE_NET_INCOME_AMOUNT = "{'locator':'id=base-net-income-amount';'desc':'Base net income amt'}";
	static final String BASE_NET_INCOME_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[4]//span[@class=\"input-group-addon\"]';'desc':'Base net income frequency ddl'}";
	
	static final String PARTNER_BASE_NET_INCOME_AMOUNT = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[5]//input[@id=\"partners-base-net-income-amount\"]';'desc':'Partner base net income amt'}";
	static final String PARTNER_BASE_NET_INCOME_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[5]//div[@class=\"select-wrapper\"]';'desc':'Partner base net income frequency ddl'}";
	
	static final String OTHER_TAXABLE_NET_INCOME_AMOUNT = "{'locator':'id=other-taxable-net-income-amount';'desc':'Partner base net income amt'}";
	static final String OTHER_TAXABLE_NET_INCOME_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[6]//div[@class=\"select-wrapper\"]';'desc':'Partner base net income frequency ddl'}";
	
	static final String MORTAGE_REPAYMENT_AMOUNT = "{'locator':'id=mortgage-repayment-amount';'desc':'Mortgage repayment amt'}";
	static final String MORTAGE_REPAYMENT_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[7]//div[@class=\"select-wrapper\"]';'desc':'Mortgage repayment frequency ddl'}";
	
	static final String OTHER_LOAN_COMMITMENTS_AMOUNT = "{'locator':'id=other-loan-commitments-amount';'desc':'Other loan commitments amt'}";
	static final String OTHER_LOAN_COMMITMENTS_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[8]//div[@class=\"select-wrapper\"]';'desc':'Other loan commitments frequency ddl'}";
	
	static final String HOUSEHOLD_CREDIT_CARD_LIMIT_AMOUNT = "{'locator':'id=household-credit-card-limit-amount';'desc':'Household credit card limit amt'}";
	
	static final String HOUSEHOLD_LIVING_COST_AMOUNT = "{'locator':'id=household-living-costs-amount';'desc':'Household living costs amt'}";
	static final String HOUSEHOLD_LIVING_COST_FREQUENCY_DDL = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[10]//div[@class=\"select-wrapper\"]';'desc':'Household living costs frequency ddl'}";
	
	static final String CALCULATE_LIMIT = "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]//button';'desc':'Calculate limit btn'}";
	
	static String createSelectedMaritalStatus(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[2]//span[contains(text(),\\'"+ value + "\\')]';'desc':'Marital status'}";
	}
	
	static String createSelectedDependants(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[3]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Dependants'}";
	}
	
	static String createSelectedBaseNetIncomeFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[4]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Base net income frequency'}";
	}
	
	static String createSelectedPartnerBaseNetIncomeFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[5]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Partner base net income frequency'}";
	}
	
	static String createSelectedOtherTaxableNetIncomeFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[6]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Partner base net income frequency'}";
	}
	
	static String createSelectedMortageRepaymentFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[7]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Mortgage repayment frequency'}";
	}
	
	static String createSelectedOtherLoanCommitmentFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[8]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Other loan commitments frequency'}";
	}
	
	static String createSelectedHouseholdLivingCostFreq(String value) {
		return "{'locator':'xpath=//form[@id=\"pre-approval-how-much-can-i-borrow-form\"]/div[10]//span[@class=\"input-group-addon\"]//span[contains(text(),\\'"+ value +"\\')]';'desc':'Household living costs frequency'}";
	}
}
