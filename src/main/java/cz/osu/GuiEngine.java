package cz.osu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class GuiEngine implements KeyListener {

    /**
     * The GUI window.
     */
    private final JFrame window;

    /**
     * The color of the background of image in the window.
     */
    private final Color background;

    /**
     * The image where all shapes and point are drawn. It's a part of the window.
     */
    private final BufferedImage image;

    /**
     * The list of shapes in the GUI window.
     */
    private final List<Shape> shapes;

    private Point lastPoint;

    /**
     * The basic constructor of the GUI engine.
     */
    public GuiEngine() {
        window = new JFrame();
        setWindow();

        background = Color.BLACK;

        image = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_INT_RGB);
        setImage();

        shapes = new ArrayList<>();
    }

    /**
     * Sets all properties of the window.
     */
    private void setWindow() {
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        addWindowListeners();
        window.setResizable(false);
        window.setVisible(true);
    }

    private void addWindowListeners() {
        window.addKeyListener(this);
    }

    /**
     * Sets the image for drawing.
     */
    private void setImage() {
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(getBackground());
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

        // Workaround
        try {
            Thread.sleep(40);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        printImage();
    }

    /**
     * Prints the current image to the window.
     */
    private void printImage() {
        window.getGraphics().drawImage(image,0,0,null);
    }

    /**
     * Adds {@linkplain Shape} into the list of all shapes.
     * @param shape The {@linkplain Shape} object.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Prints all shapes into the GUI.
     */
    public void printEnvironment() {
        shapes.forEach(shape -> {
            shape.draw(this);
        });
    }

    /**
     * Gets the color of the background.
     * @return The {@linkplain Color}.
     */
    public Color getBackground() {
        return background;
    }

    /**
     * Puts a pixel in the image.
     * @param x The X axis of the pixel.
     * @param y The Y axis of the pixel.
     * @param color The color of the pixel.
     */
    public void putPixel(int x, int y, Color color) {
        image.setRGB(x, y, color.getRGB());

        lastPoint = new Point(x,y,color, this);
        printImage();
    }

    /**
     * Gets the color of the pixel on axis (x,y).
     * @param x The X axis of the pixel.
     * @param y The Y axis of the pixel.
     * @return The color of the pixel.
     */
    public Color getPixel(int x, int y) {
        return new Color(image.getRGB(x, y));
    }

    /**
     * Pauses the application for 'duration' ms.
     * @param duration The duration in milliseconds.
     */
    public void pause(int duration) {
        try {
            Thread.sleep(duration);
        }

        catch (InterruptedException e) {
            System.out.println("An error occurred in pause method.");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            lastPoint.erase();
            lastPoint.shiftCoordinates(-1,0);
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            lastPoint.shiftCoordinates(1,0);
            lastPoint.draw();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
