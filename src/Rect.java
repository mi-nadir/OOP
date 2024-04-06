public class Rect {
    int width;
    int height;

    void setInfo(int width, int height) {
        this.height = height;
        this.width = width;
    }
    int perimeter() {
        return (this.height + this.width)*2;
    }
    int square() {
        return this.width * this.height;
    }
}
