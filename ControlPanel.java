package com.example.java_lab_6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;


import java.io.File;

public class ControlPanel extends HBox {
    private Canvas canvas;

    public ControlPanel(){
        Button load = new Button("Load");
        Button save = new Button("Save");
        this.setSpacing(50);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(load, save);

        EventHandler<ActionEvent> press = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                WritableImage wim = new WritableImage((int)canvas.getWidth(), (int)canvas.getHeight());
                canvas.snapshot(null, wim);
                File file = new File("CanvasImage.png");
                try {
                    //save function
                } catch (Exception s) {
                }
            }
        };
        save.setOnAction(press);


    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
