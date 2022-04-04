package com.example.java_lab_6;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.w3c.dom.events.MouseEvent;

public class DrawingPanel extends VBox{
    private GraphicsContext graphics_context;
    private Canvas canvas;

    public DrawingPanel(){
        canvas = new Canvas(300, 300);
        graphics_context = canvas.getGraphicsContext2D();

        this.getChildren().add(canvas);
    }

    public void setSize(int size){
        canvas.setWidth(60*size);
        canvas.setHeight(60*size);
        graphics_context.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        DrawGrid drawGrid= new DrawGrid();
        drawGrid.draw(graphics_context, size);


        Game game = new Game(size);
        GenerateBoard generateBoard = new GenerateBoard();
        generateBoard.Draw(graphics_context, game.getNodesMatrix(), size);
        game.play(canvas, graphics_context);
    }

    public GraphicsContext getGraphics_context() {
        return graphics_context;
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
