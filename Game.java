package com.example.java_lab_6;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.w3c.dom.events.Event;

import java.nio.file.FileSystemAlreadyExistsException;

public class Game extends TableProperties{
    private Node[][] nodesMatrix;
    private int playerTurn;
    private int winner;

    public Game(int size){
        this.nodesMatrix = new Node[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                this.nodesMatrix[i][j] = new Node(i, j);
            }
        }

        this.playerTurn = 1;
        this.winner = 0;
    }

    private boolean moveDone = false;

    public void setClick(Canvas canvas, GraphicsContext graphics_context){
        canvas.setOnMouseClicked(event -> {
            double x = event.getX(), y = event.getY();
            System.out.println(x);
            System.out.println(y);
            int i = -1, j = -1;
            x = x - 30;
            y = y - 30;
            if (x % 50 <= 10 || x % 50 >= 40) {
                if (x % 50 >= 40) {
                    x = x + 10;
                }
                i = (int) x / 50;

                System.out.println(i);
            }
            if (y % 50 <= 10 || y % 50 >= 40) {
                if (y % 50 >= 40) {
                    y = y + 10;
                }
                j = (int) y / 50;
                System.out.println(j);
            }
            if (i >= 0 && j >= 0 && nodesMatrix[i][j].getValue() == 0) {
                DrawNode drawNode = new DrawNode();
                drawNode.draw(graphics_context, nodesMatrix[i][j], playerTurn);
                nodesMatrix[i][j].setValue(playerTurn);
                boolean declareWinner = true;
                for(Node node : nodesMatrix[i][j].getNeighbours()){
                    if(node.getValue() == 0){
                        declareWinner = false;
                    }
                }
                if(declareWinner == true){
                    this.setWinner(playerTurn);
                }
                if(winner == 0) {
                    if (playerTurn == 1) {
                        playerTurn = 2;
                    } else {
                        playerTurn = 1;
                    }
                    moveDone = true;
                }
                else {
                    WinnerNotification.display("WINNER", "THE WINNER IS ", Integer.toString(winner));
                    System.exit(0);
                    System.out.println("Aaaaaaaaaaa");
                }
            }
        });
    }

    public void play(Canvas canvas, GraphicsContext graphics_context){
        setClick(canvas, graphics_context);
    }

    public Node[][] getNodesMatrix() {
        return nodesMatrix;
    }

    public void setNodesMatrix(Node[][] nodesMatrix) {
        this.nodesMatrix = nodesMatrix;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}
