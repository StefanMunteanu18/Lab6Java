package com.example.java_lab_6;

import javafx.scene.canvas.GraphicsContext;

public class DrawGrid extends TableProperties{
    public void draw(GraphicsContext gc, int size){
        gc.setLineWidth(1);

        //draw horizontal lines
        for(int i = 0; i < size; i++){
            gc.strokeLine(getLeftBorder(),getUpperBorder() + i * getSpacing(), (size - 1) * getSpacing() + getLeftBorder(), getUpperBorder() + i * getSpacing());
        }
        //draw vertical lines
        for(int i = 0; i < size; i++){
            gc.strokeLine(getLeftBorder() + i * getSpacing(), getUpperBorder(), getLeftBorder() + i * getSpacing(), (size - 1) * getSpacing() + getUpperBorder());
        }
    }
}
