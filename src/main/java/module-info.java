module com.maksdave.touch {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires javafx.media;


    opens com.maksdave.touch to javafx.fxml;
    exports com.maksdave.touch;
    exports com.maksdave.touch.controller;
    exports com.maksdave.touch.interfaces;
    opens com.maksdave.touch.interfaces to javafx.fxml;

}