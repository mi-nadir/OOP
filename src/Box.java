public class Box {
    double width;
    double height;
    double length;

    Box() {

    }

    Box(double size) {
        this.width = size;
        this.height = size;
        this.length = size;
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(Box box1, Box box2) {
        this.width = box1.width+box2.width;
        this.height = box1.height+box2.height;
        this.length = box1.length+box2.length;
    }

    Box newBox(Box box) {
        return new Box(this.width+box.width, this.height+box.height, this.length+box.length);
    }

    void showVolume() {
        double volume = width*height*length;
        System.out.println(volume);
    }

    double volume() {
        double volume = width*height*length;
        return volume;
    }
}
