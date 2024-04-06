public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String text = "";
        for(int i=0;i<speed;i++) {
            text += "бегу";
            if(i != (speed-1)) {
                text += ", ";
            }
        }
        System.out.println(text);
    }

    String info() {
        return "Кличка: "+name+"\nПорода: "+breed+"\nСкорость: "+speed;
    }
}
