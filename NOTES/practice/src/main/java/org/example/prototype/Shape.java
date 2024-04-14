package org.example.prototype;

import java.awt.*;

public abstract class Shape implements Cloneable {

    private String name;
    private Color color;

    public Shape() {
        this.name = "Shape";
        this.color = Color.BLACK;
    }


    abstract void reset();
    public String getName(){ return this.name; }
    public Color getColor() {return this.color; }
    public void setName(String name) { this.name = name; }
    public void setColor(Color color) { this.color = color; }

    @Override
    public Shape clone() throws CloneNotSupportedException{
        Shape shape = (Shape) super.clone();
        shape.initialize();
        return shape;
    }

    public void initialize(){
        this.name = "Shape";
        this.color = Color.BLACK;
        reset();
    }

}
