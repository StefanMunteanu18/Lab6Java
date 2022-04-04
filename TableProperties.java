package com.example.java_lab_6;

public abstract class TableProperties {
    private int upperBorder = 30;
    private int leftBorder = 30;
    private int spacing = 50;
    private int circleDiameter = 20;

    public int getUpperBorder() {
        return upperBorder;
    }

    public void setUpperBorder(int upperBorder) {
        this.upperBorder = upperBorder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public void setLeftBorder(int leftBorder) {
        this.leftBorder = leftBorder;
    }

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public int toPixelsX(int nodeXPosition) {  return leftBorder + nodeXPosition * spacing; }
    public int toPixelsY(int nodeYPosition){
        return upperBorder + nodeYPosition * spacing;
    }

    public int getCircleDiameter() {
        return circleDiameter;
    }

    public void setCircleDiameter(int circleDiameter) {
        this.circleDiameter = circleDiameter;
    }
}
