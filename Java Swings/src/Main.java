import views.RegistrationForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Thread: "+Thread.currentThread().getId());
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: "+Thread.currentThread().getId());
              new RegistrationForm();
            }
        });
    }
}
