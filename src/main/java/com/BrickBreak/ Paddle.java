package com.BrickBreak;


import java.awt.Color;
import java.awt.Graphics;


// Class author: Ian Kim
// Date created: 12/17/25
// General description: This class defines the paddle which is played by the player along with the necessary methods that control it.





public class Paddle {
    private int x;
    private int y;
    private int velocity;
    private int width;
    private int height;
   
    // constructor:
    public Paddle (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    // methods for the positions x and y, width and height
    public void setX (int initialX) {
        this.x = initialX;
    }
    public void setY (int initialY) {
        this.y = initialY;
    }
    public int getX () {
        return this.x;
    }
    public int getY () {
        return this.y;
    }


    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }


    // methods to calculate velocity (calling Z to be the speed limit of paddle)
    public void setVelocity(int initialVelocity) {
        velocity = initialVelocity;
    }
    public void addVelocity(int additionalVelocity) {
        velocity += additionalVelocity;
    }
    public int getVelocity() {
        return velocity;
    }


    // precondition: g is assigned some value
    // postcondition: the paddle is drawn at (x,y) with dimensions "width" and "height"
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
    }
   
    // Precondition: n/a input
    // Postcondition: x is now x+velocity
    public void move() {
        x += velocity;


    }
}

