package org.example.project.steps;

import io.cucumber.java.en.And;
import org.example.project.pages.AssertFilledFieldsBTripPage;
import org.example.project.utils.BasePage;


public class AssertFilledFieldsBTripSteps extends BasePage {
    AssertFilledFieldsBTripPage assertFilledFieldsBTripPage = new AssertFilledFieldsBTripPage();

    @And("^Проверяем заполненные поля командировки")
    public void assertFieldsBTrip() {
        assertFilledFieldsBTripPage.assertFilledField();
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
