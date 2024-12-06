import java.awt.*;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x, y; // Ball position
    private int xVelocity, yVelocity; // Ball velocity
    private final int size; // Ball diameter
    private final int speed = 2; // Ball speed multiplier

    // Constructor to initialize ball properties
    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xVelocity = speed; // Initial horizontal movement
        this.yVelocity = -speed; // Initial vertical movement
    }

    // Draws the ball on the screen
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, size, size);
    }

    // Updates the ball's position based on its velocity
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Getters for ball properties
    public int getXpos() {
        return x;
    }

    public int getYpos() {
        return y;
    }

    public int getSize() {
        return size;
    }

    // Sets the ball's position
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Changes the horizontal direction of the ball
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    // Changes the vertical direction of the ball
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Allows adjustments to the ball's horizontal velocity
    public void setXVelocity(int velocity) {
        this.xVelocity = velocity * speed;
    }

    // Allows adjustments to the ball's vertical velocity
    public void setYVelocity(int velocity) {
        this.yVelocity = velocity * speed;
    }
}

