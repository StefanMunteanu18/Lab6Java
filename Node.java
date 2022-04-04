package com.example.java_lab_6;

import java.util.ArrayList;

public class Node {
    private int xPositionTableMatrix;
    private int yPositionTableMatrix;
    private int value = -1;



    private ArrayList<Node> neighbours = new ArrayList<Node>();

    public Node(int x, int y) {
        this.xPositionTableMatrix = x;
        this.yPositionTableMatrix = y;
    }

    public int getxPositionTableMatrix() {
        return xPositionTableMatrix;
    }

    public void setxPositionTableMatrix(int xPositionTableMatrix) {
        this.xPositionTableMatrix = xPositionTableMatrix;
    }

    public int getyPositionTableMatrix() {
        return yPositionTableMatrix;
    }

    public void setyPositionTableMatrix(int yPositionTableMatrix) {
        this.yPositionTableMatrix = yPositionTableMatrix;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Node> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour (Node node){
        this.neighbours.add(node);
    }

    public void setValue(int value) {
        this.value = value;
    }
}
