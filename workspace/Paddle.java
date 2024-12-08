//Vijay Kannan
//12/7/2024
//Brickbreaker code for a game that moves around a paddle to hit a ball!

import java.awt.Graphics;
import java.awt.*;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
    private int x, y; // Paddle position
    private int width, height; // Paddle dimensions
    private int velocity; // Paddle movement speed
    private final int speed = 8; // Paddle speed multiplier

    // Constructor to initialize paddle properties
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0; // Initial stationary state
    }

    // Draws the paddle on the screen
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    // Updates the paddle's position based on its velocity
    public void move() {
        x += velocity;
        // Prevent the paddle from going out of bounds
        if (x < 0) x = 0;
        if (x > 682 - width) x = 682 - width; // 682 is the window width
    }

    // Getters for paddle properties
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getVelocity() {
        return velocity;
    }

    // Sets the paddle's position
    public void setX(int x) {
        this.x = x;
    }

    // Adjusts the paddle's velocity
    public void addVelocity(int delta) {
        this.velocity = delta * speed;
    }

    // Resets the paddle's velocity
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}

