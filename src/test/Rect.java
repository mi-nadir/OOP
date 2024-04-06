package test;

public class Rect {
    private int width;
    private int height;

    public void setInfo(int width, int height) {
        this.height = height;
        this.width = width;
    }
    public int perimeter() {
        return (this.height + this.width)*2;
    }
    public int square() {
        return this.width * this.height;
    }
}
