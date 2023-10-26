package org.example.project.pages;

import org.example.project.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

import static org.example.project.properties.TestProperties.getInstance;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertFilledFieldsBTripPage extends BasePage {


    private final Properties properties = getInstance().getProperties();
    @FindBy(xpath = "//option[@value='7']")                //поле подразделение
    private WebElement divisionField;
    @FindBy(xpath = "//a[@id='company-selector-show']")    //кнопка Открыть список
    private WebElement listOfCompanies;
    @FindBy(xpath = "//span[@class= 'select2-chosen']")
    private WebElement nameCompany;
    @FindBy(xpath = "//input[@data-name='field__1']")        //чекбокс "Заказ билетов"
    private WebElement checkBoxTickets;
    @FindBy(xpath = "//input[@name='crm_business_trip[departureCity]']")
    private WebElement departureCity;
    @FindBy(xpath = "//input[@name='crm_business_trip[arrivalCity]']")
    private WebElement arrivalCity;
    @FindBy(xpath = "//input[contains(@id, 'date_selector_crm_business_trip_departureDatePlan')]")
    private WebElement dateField;
    @FindBy(xpath = "//input[contains(@id, 'date_selector_crm_business_trip_returnDatePlan')]")
    private WebElement returnDateField;
    @FindBy(xpath = "//button[contains(text(), 'Сохранить и закрыть')]")
    private WebElement saveAndCloseBtn;
    @FindBy(xpath = "//span[@class='validation-failed']")
    private WebElement validationMessage;


    public void assertFilledField(String devision) {
        assertAll("!!! Поле заполнено неверно: ",
                () -> assertEquals("Отдел внутренней разработки",
                        divisionField.getText(), "Подразделение!!!"),
                () -> assertEquals(devision,
                        nameCompany.getText(), "Организация"),
                () -> assertEquals("true",
                        checkBoxTickets.getAttribute("checked"), "чекбокс: Заказ билетов"));
    }

    public void assertFilledFieldOfCity(String inputArrivalCity, String inputDepartureCity)  {
        assertAll("!!! Поле (город прибытия/выбытия) заполнено неверно: ",
                () -> assertEquals(inputDepartureCity, departureCity.getAttribute("value"), "Город выбытия"),
                () -> assertEquals(inputArrivalCity, arrivalCity.getAttribute("value"), "Город прибытия"));

    }
    public void assertFilledFieldOfDate(String returnDate, String departureDate) {
        assertAll("!!! Поле (дата прибытия/выбытия) заполнено неверно: ",
                () -> assertEquals(departureDate, dateField.getAttribute("value"), "Даты выбытия"),
                () -> assertEquals(returnDate, returnDateField.getAttribute("value"), "Даты прибытия"));
    }

    public void saveAndClose() {
        saveAndCloseBtn.click();
        loading();
    }

    //    Проверка отображения сообщения о незаполненном поле
    public void assertMessage() {
        validationMessage.click();
        String validation_failed = "Список командируемых сотрудников не может быть пустым";
        assertEquals(validation_failed,
                validationMessage.getText(), "Сообщение о пустом списке сотрудников отсутствует");
    }

}
