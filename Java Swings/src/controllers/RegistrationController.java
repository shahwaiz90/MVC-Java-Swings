package controllers;

import models.UserData;
import views.LoginView;

public class RegistrationController {
    private LoginView loginView;
    private UserData userData;

    public RegistrationController(LoginView loginView, UserData userData){
        this.loginView = loginView;
        this.userData  = userData;
    }

    public void handleRegistrationForm(String fname, String email, String password, boolean terms){
        if(terms) {
            if (!fname.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                userData.insertInDatabase(fname, email, password, loginView);
            } else {
                loginView.onFailure("Please fill up the form!");
            }
        }else{
            loginView.onFailure("Please accept the terms and conditions");
        }
    }
}
