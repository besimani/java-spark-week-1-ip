package ke.co.safaricom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Service {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}