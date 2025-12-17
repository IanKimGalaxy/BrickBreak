package com.BrickBreak;
import java.awt.*;


//  Class author:  Ian Kim
//  Date created:  12/17/25
//  General description:   This class defines a ball for the game as well as the necessary methods to interact with it








public class Ball {


    private int x;
    private int y;
    private int x_Velocity;
    private int y_Velocity;
    private int size;
   
    //constructor:
    public Ball (int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }


    // methods for the positions x and y, and size of ball
    public void setX (int initialX) {
        this.x = initialX;
    }
    public void setY (int initialY) {
        this.y = initialY;
    }
    public int getXpos () {
        return this.x;
    }
    public int getYpos () {
        return this.y;
    }
    public int getSize() {
        return size;
    }


    // methods to calculate velocity
    public void setXVelocity(int x_Velocity) {
        this.x_Velocity = x_Velocity;
    }
    public void setYVelocity(int y_Velocity) {
        this.y_Velocity = y_Velocity;
    }
   
    // Precondition: n/a input
    // Postcondition: x_Velocity changes direction
    public void reverseX() {
        x_Velocity *= -1;
    }
       
    // Precondition: n/a input
    // Postcondition: yVelocity changes direction
    public void reverseY() {
        y_Velocity *= -1;
    }


    // Precondition: n/a input
    // Postcondition: ball's x and y components of Velocity are added to the ball's x and y positions
    public void move() {
        x += x_Velocity;
        y += y_Velocity;
    }


    // Precondition: g is assigned some value
    // Postcondition: ball is drawn at the (x,y)
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.drawOval(x, y, size, size);
    }
}

