package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel parentPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;

    LoginForm(){
        add(parentPanel);
        setTitle("Login Screen");
        System.out.println("LoginForm Thread: "+Thread.currentThread().getId());
        setSize(500,350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm();
                registrationForm.setVisible(true);
                setVisible(false);
                dispose();
            }
        });
    }
}
