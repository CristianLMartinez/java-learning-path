package org.example.prototype;


public class Square extends Shape {

    public int side;

    public Square( int side){
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    void reset() {
        this.side = 3;
    }

}
