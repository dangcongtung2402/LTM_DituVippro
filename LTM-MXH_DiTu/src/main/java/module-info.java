module com.mesudy.ltmmxh_ditu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.sql;
    requires java.desktop;

    requires com.google.gson;
    requires jbcrypt;
    requires org.xerial.sqlitejdbc;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;

    opens com.mesudy.ltmmxh_ditu to javafx.fxml;
    opens com.mesudy.ltmmxh_ditu.common to com.google.gson, javafx.base;
    opens com.mesudy.ltmmxh_ditu.client to javafx.fxml;

    exports com.mesudy.ltmmxh_ditu;
    exports com.mesudy.ltmmxh_ditu.common;
    exports com.mesudy.ltmmxh_ditu.client;
    exports com.mesudy.ltmmxh_ditu.server;
}