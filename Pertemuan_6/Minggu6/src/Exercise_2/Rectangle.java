/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_2;

/**
 *
 * @author rivan
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
        
    public Rectangle(double width, double length){
        super();
        this.width = width; 
        this.length = length;
    }

    public Rectangle(double width, double length, String 
        color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString(){
        super.toString();
        return "A rectangle with width = " + this.width + 
                " and length = " + this.length + 
                ", which is a subclass of " + 
                super.toString();
    }
}
