package com.example.java_lab_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFrame extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        VBox layout = new VBox();
        ConfigPanel config = new ConfigPanel();
        DrawingPanel draw = config.getDraw();


        ControlPanel control = new ControlPanel();
        control.setCanvas(config.getDraw().getCanvas());
        layout.getChildren().addAll(config, draw, control);

        //layout.getChildren().add(button2);

        Scene scene = new Scene(layout, 800, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}