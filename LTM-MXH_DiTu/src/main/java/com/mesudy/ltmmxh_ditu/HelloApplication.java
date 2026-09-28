package com.mesudy.ltmmxh_ditu;

import com.mesudy.ltmmxh_ditu.client.MainUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        MainUI mainUI = new MainUI(stage);
        mainUI.showLoginScene();
    }

    public static void main(String[] args) {
        launch(args);
    }
}