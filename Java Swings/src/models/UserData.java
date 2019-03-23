package models;


import views.LoginView;

public class UserData {

    public void insertInDatabase(String fname, String email, String password, LoginView loginView){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    loginView.onSuccess("Registration Successful!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    loginView.onFailure("Registration Successful!!");
                }
            }
        }).start();
    }
}
