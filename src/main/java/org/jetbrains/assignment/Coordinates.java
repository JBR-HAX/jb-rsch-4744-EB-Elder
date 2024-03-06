package org.jetbrains.assignment;

public class Coordinates {
    private int X;
    private int Y;

    public Coordinates(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getAsJSON()
    {
        return String.format("{\"x\":%d, \"y\":%d}", this.X, this.Y);
    }
}
