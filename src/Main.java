public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 8.1;
        myBox.width = 3.4;

        Box myBox2 = new Box();
        myBox2.height = 5;
        myBox2.length = 5;
        myBox2.width = 5;
        double volume = myBox.height * myBox.length * myBox.width;
        System.out.println(volume);

        double volume2 = myBox2.height * myBox2.length * myBox2.width;
        System.out.println(volume2);

        Human Andrey = new Human();
        Human Maxim = new Human();
        Andrey.age = 34;
        Andrey.name = "Andrey";
        Andrey.weight = 80;

        Maxim.age = 24;
        Maxim.name = "Maxim";
        Maxim.weight = 90;

        float avgAge = (float) (Andrey.age + Maxim.age) / 2;
        System.out.println(avgAge);
    }
}