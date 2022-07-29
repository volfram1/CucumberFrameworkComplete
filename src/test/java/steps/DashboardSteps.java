package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {
    @Then("user verifies all dashboard tabs")
    public void user_verifies_all_dashboard_tabs(DataTable dataTable) {
        List<String> expectedTabs = dataTable.asList(); // data coming from feature file
        List<String> actualTabs = new ArrayList<>(); //data coming from application

        for (WebElement ele:dashboardPage.dashboardTabs) {
           actualTabs.add(ele.getText());
        }
        System.out.println(actualTabs); // from execution
        System.out.println(expectedTabs); // from feature file

        Assert.assertEquals(actualTabs,expectedTabs);
        Assert.assertTrue(expectedTabs.equals(actualTabs));

    }
}
