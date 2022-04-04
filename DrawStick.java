package com.example.java_lab_6;

import javafx.scene.canvas.GraphicsContext;

public class DrawStick extends TableProperties{
    public void draw(GraphicsContext gc, Node nodeA, Node nodeB){
        gc.setLineWidth(5);
        gc.strokeLine(toPixelsX(nodeA.getxPositionTableMatrix()),
                toPixelsY(nodeA.getyPositionTableMatrix()),
                toPixelsX(nodeB.getxPositionTableMatrix()),
                toPixelsY(nodeB.getyPositionTableMatrix()));
    }
}
