module bl {
    requires javafx.controls;
    requires javafx.fxml;

    opens bl to javafx.fxml;
    exports bl;
}
