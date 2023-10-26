package org.example.project.steps;

import io.cucumber.java.en.And;
import org.example.project.pages.AssertFilledFieldsBTripPage;
import org.example.project.utils.BasePage;


public class AssertFilledFieldsBTripSteps extends BasePage {
    AssertFilledFieldsBTripPage assertFilledFieldsBTripPage = new AssertFilledFieldsBTripPage();

    @And("^Проверяем значения заполненных полей: город прибытия \"([^\"]*)\", город выбытия \"([^\"]*)\"$")
    public void assertFilledFieldCity(String arrivalCityName, String departureCityName)  {
        assertFilledFieldsBTripPage.assertFilledFieldOfCity(arrivalCityName, departureCityName);
    }
    @And("^Проверяем значения заполненных полей: дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void assertFilledFieldDate(String returnDate, String departureDate)  {
        assertFilledFieldsBTripPage.assertFilledFieldOfDate(returnDate, departureDate);
    }
    @And("^Проверяем значения остальных заполненных полей: чекбокс, подразделение \"([^\"]*)\"$")
    public void assertFieldsBTrip(String devision)  {
        assertFilledFieldsBTripPage.assertFilledField(devision);
    }

    @And("^Нажать \"Сохранить и закрыть\"")
    public void SaveAndClose() {
        assertFilledFieldsBTripPage.saveAndClose();
    }

    @And("^Проверяем отображение сообщения о наличии незаполненных полей")
    public void assertMessage() {
        assertFilledFieldsBTripPage.assertMessage();
    }
}
