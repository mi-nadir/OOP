public class Box {
    double width;
    double height;
    double length;

    void showVolume() {
        double volume = width*height*length;
        System.out.println(volume);
    }

    double volume() {
        double volume = width*height*length;
        return volume;
    }
}
