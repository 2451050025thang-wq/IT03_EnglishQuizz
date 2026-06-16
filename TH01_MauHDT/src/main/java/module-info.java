module com.mycompany.th01_mauhdt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.th01_mauhdt to javafx.fxml;
    exports com.mycompany.th01_mauhdt;
}
