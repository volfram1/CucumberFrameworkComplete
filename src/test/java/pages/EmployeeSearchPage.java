package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement idField;

    @FindBy(id="empsearch_id")
    public WebElement nameField;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeOption;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver,this);
    }
}
