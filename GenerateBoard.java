package com.example.java_lab_6;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public class GenerateBoard{
    public void Draw(GraphicsContext gc, Node nodesMatrix[][], int size){

        DrawNode drawNode = new DrawNode();
        for(int i = 0; i < size; i++){
            for(int j = 0; j< size; j++){
                drawNode.draw(gc, nodesMatrix[i][j], 0);
            }
        }

        DrawStick drawStick = new DrawStick();
        Random rand = new Random();
        double probability;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1; j++){
                probability = rand.nextDouble();
                if(probability < 0.7){
                    drawStick.draw(gc, nodesMatrix[i][j], nodesMatrix[i+1][j]);
                    nodesMatrix[i][j].setValue(0);
                    nodesMatrix[i][j].addNeighbour(nodesMatrix[i+1][j]);
                    nodesMatrix[i+1][j].setValue(0);
                    nodesMatrix[i+1][j].addNeighbour(nodesMatrix[i][j]);
                }
                probability = rand.nextDouble();
                if(probability < 0.7){
                    drawStick.draw(gc, nodesMatrix[i][j], nodesMatrix[i][j+1]);
                    nodesMatrix[i][j].setValue(0);
                    nodesMatrix[i][j].addNeighbour(nodesMatrix[i][j+1]);
                    nodesMatrix[i][j+1].setValue(0);
                    nodesMatrix[i][j+1].addNeighbour(nodesMatrix[i][j]);
                }
            }
        }
    }
}
