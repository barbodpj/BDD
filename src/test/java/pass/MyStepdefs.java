package pass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;

import org.junit.Assert;

public class MyStepdefs {
    private Pass pass;
    private int grade;
    private int result;

    @Before
    public void before() {
        pass = new Pass();
    }

    @Given("^Input value (\\d+)$")
    public void inputValue(int arg0) {
        grade = arg0;
    }

    @When("^I check if he has passed$")
    public void checkPass() {
        result = pass.isPass(grade);
    }

    @Then("^I expect the result (\\d)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

}
