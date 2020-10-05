package cz.osu;

import java.awt.*;

public class Point {

    /**
     * The X axis of the {@linkplain Point}.
     */
    private int x;

    /**
     * The Y axis of the {@linkplain Point}.
     */
    private int y;

    /**
     * The {@linkplain Color} of the {@linkplain Point}.
     */
    private Color color;

    /**
     * The {@linkplain GuiEngine} that handles drawing points into the GUI.
     */
    private final GuiEngine guiEngine;

    /**
     * The basic constructor that construct the basic {@linkplain Point}
     * @param x The X axis.
     * @param y The Y axis.
     * @param color The color of the point.
     * @param guiEngine The {@linkplain GuiEngine} that handles operations with GUI.
     */
    public Point(int x, int y, Color color, GuiEngine guiEngine) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.guiEngine = guiEngine;
    }

    /**
     *The basic constructor that constructs only the {@linkplain GuiEngine}.
     * @param guiEngine The {@linkplain GuiEngine} that handles operations with GUI.
     */
    public Point(GuiEngine guiEngine) {
        this(0, 0, Color.red, guiEngine);
    }

    /**
     * The constructor that copies the {@linkplain Point} parameter into itself.
     * @param point The {@linkplain Point} object to be copied.
     */
    public Point(Point point) {
        this.setX(point.getX());
        this.setY(point.getY());
        this.setColor(point.getColor());
        this.guiEngine = point.guiEngine;
    }

    /**
     * Gets the X axis of the {@linkplain Point}.
     * @return The X axis.
     */
    public int getX() {
        return x;
    }

    /**
     * Set the X axis of the {@linkplain Point}.
     * @param x The X axis to be set.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the Y axis of the {@linkplain Point}.
     * @return The Y axis.
     */
    public int getY() {
        return y;
    }

    /**
     * Set the Y axis of the {@linkplain Point}.
     * @param y The Y axis to be set.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the color of the {@linkplain Point}.
     * @return The {@linkplain Color} of the {@linkplain Point}.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the color of the {@linkplain Point}.
     * @param color The {@linkplain Color} to be set.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Shift coordinates to the arbitrary location.
     * @param shiftX The value how much should be X axis shifted.
     * @param shiftY The value how much should be Y axis shifted.
     */
    public void shiftCoordinates(int shiftX, int shiftY) {
        this.setX(getX() + shiftX);
        this.setY(getY() + shiftY);
    }

    /**
     * Draw the point into the GUI.
     */
    public void draw() {
        guiEngine.putPixel(getX(), getY(), color);
    }

    /**
     * Erases the point from the GUI.
     */
    public void erase() {
        guiEngine.putPixel(getX(), getY(), guiEngine.getBackground());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
