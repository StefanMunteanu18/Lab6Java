package com.example.java_lab_6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class ConfigPanel extends HBox {
    public int size = 0;
    public boolean sizeChosen = false;
    public DrawingPanel draw;
    public ConfigPanel(){
        draw = new DrawingPanel();
        draw.setSize(4);
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        Spinner tableSizeSpinner = new Spinner(4, 10, 4);
        size = (int) tableSizeSpinner.getValue();
        tableSizeSpinner.setPrefSize(60,20);
        Label tableSizeLabel = new Label("Select table size: ");
        tableSizeLabel.setFont(new Font(18));
        Button createTable = new Button("Create");

        EventHandler<ActionEvent> press = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                size = (int) tableSizeSpinner.getValue();
                sizeChosen = true;
                System.out.println(size);
                draw.setSize(size);
            }
        };
        createTable.setOnAction(press);


        this.getChildren().addAll(tableSizeLabel, tableSizeSpinner, createTable);
    }

    public DrawingPanel getDraw() {
        return draw;
    }
}
