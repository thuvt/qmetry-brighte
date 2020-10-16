package com.brighte.pom;

import java.util.Map;

import com.brighte.loc.DetailsLoc;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class DetailsPage extends WebDriverBaseTestPage<WebDriverTestPage> implements DetailsLoc {
	
	@FindBy(locator = NAME)
	private QAFWebElement name;
	
	@FindBy(locator = MOBILE)
	private QAFWebElement mobile;
	
	@FindBy(locator = EMAIL)
	private QAFWebElement email;
	
	@FindBy(locator = CONTINUE)
	private QAFWebElement continueBtn;
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("pre-approvals/details");
	}

	public void addBasicDetails(Map<String, String> data) {
		getName().sendKeys(String.valueOf(data.get("NAME")));
		getMobile().sendKeys(String.valueOf(data.get("MOBILE")));
		getEmail().sendKeys(String.valueOf(data.get("EMAIL")));
		getContinueBtn().click();
	}

	
	public QAFWebElement getName() {
		return name;
	}

	public QAFWebElement getMobile() {
		return mobile;
	}

	public QAFWebElement getEmail() {
		return email;
	}
	
	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	
}
