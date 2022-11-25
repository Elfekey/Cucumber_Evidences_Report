package All_cucumber_components;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Tests.BaseTest;
import gherkin.formatter.model.Result;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//add the maven dependencies  of cucumber    <<<<<>>>>
public class testScenarioStepDefinition   extends BaseTest { 

	@Given("User is on HRMLogin page {string}")
	public void loginTest(String url) {
		System.out.println(url);
//		driver.navigate().to(url);

	}

	@When("User enters username as {string} and password as {string}")
	public void goToHomePage(String userName, String passWord) {

		System.out.println("UserName : "+userName);
		System.out.println("Password : "+passWord);
//		screenShotsOb.takeFullScreenshot(tCName,tCDescription,driver);
//		driver.navigate().to("https://stackoverflow.com/questions/6912169/eclipse-enable-autocomplete-content-assist");


	}

	@Then("User should be able to login sucessfully and new page open")
	public void verifyLogin() {

		System.out.println("from then");
	}

	@Then("User should be able to see error message {string}")
	public void verifyErrorMessage(String expectedErrorMessage) {

		System.out.println("from Second then  2  "+expectedErrorMessage);
//		screenShotsOb.takeFullScreenshot(tCName,tCDescription,driver);
//		throw new SkipException("Skipppppp");
	}



}
