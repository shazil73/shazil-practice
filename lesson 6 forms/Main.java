
import java.awt.*;

class LoginScreen extends Frame {

    LoginScreen() {
        setSize(500, 500);

        Label usernameLabel = new Label("Username");
        usernameLabel.setBounds(20, 20, 100, 20);
        add(usernameLabel);

        TextField usernameField = new TextField();
        usernameField.setBounds(130, 20, 150, 20);
        add(usernameField);

        Label passwordLabel = new Label("Password");
        passwordLabel.setBounds(20, 60, 100, 20);
        add(passwordLabel);

        TextField passwordField = new TextField();
        passwordField.setBounds(130, 60, 150, 20);
        add(passwordField);

        Button loginButton = new Button("Login");
        loginButton.setBounds(100, 100, 100, 20);
        add(loginButton);
        
        setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
    }
}
