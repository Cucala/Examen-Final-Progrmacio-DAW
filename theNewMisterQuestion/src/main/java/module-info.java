module daw.programacio.thenewmisterquestion {
    requires javafx.controls;
    requires javafx.fxml;


    opens daw.programacio.thenewmisterquestion to javafx.fxml;
    exports daw.programacio.thenewmisterquestion;
    exports daw.programacio.thenewmisterquestion.controllers;
    opens daw.programacio.thenewmisterquestion.controllers to javafx.fxml;
}