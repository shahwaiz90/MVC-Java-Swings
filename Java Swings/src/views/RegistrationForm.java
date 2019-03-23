package views;

import controllers.RegistrationController;
import models.UserData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements LoginView{
    private JTextField tfFullName;
    private JTextField tfEmail;
    private JPasswordField tfPassword;
    private JCheckBox cbTerms;
    private JPanel parentPanel;
    private JLabel fullName;
    private JButton createAccountButton;
    private JButton btnSignIn;
    private RegistrationController registrationController;

    public RegistrationForm(){

        add(parentPanel);
        System.out.println("RegistrationForm Thread: "+Thread.currentThread().getId());
        setTitle("Registration Screen");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        registrationController = new RegistrationController(this, new UserData());

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname = tfFullName.getText();
                String email = tfEmail.getText();
                String password = tfPassword.getPassword().toString();
                boolean termsSelected = cbTerms.isSelected();
                registrationController.handleRegistrationForm(fname, email, password, termsSelected);
            }
        });

        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
                dispose();
                setVisible(false);
            }
        });
    }

    @Override
    public void onSuccess(String message) {
        JOptionPane.showMessageDialog(parentPanel, message);
    }

    @Override
    public void onFailure(String message) {
        JOptionPane.showMessageDialog(parentPanel, message);
    }
}
