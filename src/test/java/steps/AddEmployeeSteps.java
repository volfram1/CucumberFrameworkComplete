package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(employeeSearchPage.pimOption);

    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(employeeSearchPage.addEmployeeOption);
    }
    @When("user enters first name middle name and last name")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText(addEmployeePage.firstNameField, "Aga");
        sendText(addEmployeePage.middleNameField,"agggga");
        sendText(addEmployeePage.lastNameField, "Tommm");

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("employee added");
    }

    @When("user enters {string} {string} {string}")
    public void user_enters(String firstNameValue, String middleNameValue, String lastNameValue) {
        sendText(addEmployeePage.firstNameField, firstNameValue);
        sendText(addEmployeePage.middleNameField, middleNameValue);
        sendText(addEmployeePage.lastNameField, lastNameValue);
    }

    @When("user enters {string} {string} and {string}")
    public void user_enters_and(String firstName, String middleName, String lastName) {
        sendText(addEmployeePage.firstNameField, firstName);
        sendText(addEmployeePage.middleNameField, middleName);
        sendText(addEmployeePage.lastNameField, lastName);
    }

    @When("user provides multiple data and verify they are added")
    public void user_provides_multiple_data_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();
        for (Map<String, String> employee :employeeNames) {
            System.out.println(employee);
            String firstNameValue = employee.get("firstName");
            String middleNameValue = employee.get("middleName");
            String lastNameValue = employee.get("lastName");

            System.out.println(firstNameValue+" "+middleNameValue+" "+lastNameValue);
            sendText(addEmployeePage.firstNameField, firstNameValue);
            sendText(addEmployeePage.middleNameField, middleNameValue);
            sendText(addEmployeePage.lastNameField, lastNameValue);

            click(addEmployeePage.saveButton);
            Thread.sleep(2000);
            click(employeeSearchPage.addEmployeeOption);


        }
    }
    @When("user adds multiple employees from excel file using {string} sheet and verified the user added")
    public void user_adds_multiple_employees_from_excel_file_using_sheet_and_verified_the_user_added(String sheetName) {
        List<Map<String,String >> newEmployees = ExcelReader.excelIntoMap(Constants.TESTDATA_PATH, sheetName);
        Iterator<Map<String,String>> itr = newEmployees.iterator();

        while(itr.hasNext()){ //checks whether the next element exist or not
            //returns the key and the value for employees
            Map<String,String> mapNewEmp = itr.next();
            System.out.println(mapNewEmp.get("FirstName"));
            System.out.println(mapNewEmp.get("MiddleName"));
            System.out.println(mapNewEmp.get("LastName"));

        }

    }
}
