package org.example.project.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.example.project.pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("^Открыта страница авторизации: вводим логин \"([^\"]*)\", пароль \"([^\"]*)\"$")
    public void login(String login, String password) {
        loginPage.enterLoginAndPassword(login, password);
        loginPage.submitClick();
    }
}
