package com.example.java_lab_6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawNode extends TableProperties{
    public void draw(GraphicsContext gc, Node node, int colorValue) {
        switch (colorValue){
        case 1:
            gc.setFill(Color.RED);
            break;
        case 2:
            gc.setFill(Color.BLUE);
            break;
        default:
            gc.setFill(Color.WHITE);
        }
        gc.strokeOval(toPixelsX(node.getxPositionTableMatrix()) - getCircleDiameter() / 2,
                toPixelsY(node.getyPositionTableMatrix()) - getCircleDiameter() / 2,
                getCircleDiameter(),
                getCircleDiameter());
        gc.fillOval(toPixelsX(node.getxPositionTableMatrix()) - getCircleDiameter() / 2,
                toPixelsY(node.getyPositionTableMatrix()) - getCircleDiameter() / 2,
                getCircleDiameter(),
                getCircleDiameter());
    }
}
