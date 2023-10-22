package org.example.project.steps;

import io.cucumber.java.en.And;
import org.example.project.pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @And("^Открываем страницу оформления заявки на новую командировку$")
    public void filterByAssignment() {
        mainPage.costsClick();
        mainPage.assignmentClick();
    }
}
