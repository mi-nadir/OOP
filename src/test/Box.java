package test;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box() {

    }

    public Box(double size) {
        this.width = size;
        this.height = size;
        this.length = size;
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box box1, Box box2) {
        this.width = box1.width+box2.width;
        this.height = box1.height+box2.height;
        this.length = box1.length+box2.length;
    }

    public Box newBox(Box box) {
        return new Box(this.width+box.width, this.height+box.height, this.length+box.length);
    }

    public void showVolume() {
        double volume = width*height*length;
        System.out.println(volume);
    }

    public double volume() {
        double volume = width*height*length;
        return volume;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
