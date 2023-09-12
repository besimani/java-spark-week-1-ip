module ke.co.safaricom.javasparkweek1ip {
    requires javafx.controls;
    requires javafx.fxml;


    opens ke.co.safaricom to javafx.fxml;
    exports ke.co.safaricom;
}