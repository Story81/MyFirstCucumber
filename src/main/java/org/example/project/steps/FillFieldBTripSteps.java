package org.example.project.steps;

import io.cucumber.java.en.And;
import org.example.project.pages.FillFieldsOfBTripPage;

public class FillFieldBTripSteps {

    @And("^Выбираем подразделение \"([^\"]*)\"$")
    public void filledFieldDivision(String devision) {
        FillFieldsOfBTripPage fillFieldsOfBTripPage = new FillFieldsOfBTripPage();
        fillFieldsOfBTripPage.FilledFieldBTrip_Division(devision);
    }

    @And("Активируем чекбокс 'Заказ билетов'")
    public void filledFieldTickets() {
        FillFieldsOfBTripPage fillFieldsOfBTripPage = new FillFieldsOfBTripPage();
        fillFieldsOfBTripPage.FilledFieldBTrip_Tickets();
    }

    @And("^Заполняем поля командировки: город прибытия \"([^\"]*)\", город выбытия \"([^\"]*)\", дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void filledField(String inputArrivalCity, String inputDepartureCity, String departureDate, String returnDate) {
        FillFieldsOfBTripPage fillFieldsOfBTripPage = new FillFieldsOfBTripPage();
        fillFieldsOfBTripPage.FilledFieldBTrip_Date(inputArrivalCity, inputDepartureCity, departureDate, returnDate);
    }
}
