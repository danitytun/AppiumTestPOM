package stepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pom.CalculatorForm;

public class CalculateStep {
    WebDriver driver = Hook.driver;
    CalculatorForm form;
    @Given("The calculator app is opened")
    public void the_calculator_app_is_opened() {
        form = new CalculatorForm(this.driver);
    }

    @When("The user enters a calculation")
    public void the_user_enters_a_calculation() {
        form.EnterNumber("123");
        form.EnterOperator("+");
        form.EnterNumber("987");
        form.EnterEqual();
    }

    @Then("The correct result will be showed")
    public void the_correct_result_will_be_showed() {
        form.ShowResult("1.110");
    }
}
