package test;

public class Dog {
    private String name;
    private String breed;
    private int speed;

    public void run() {
        String text = "";
        for(int i=0;i<speed;i++) {
            text += "бегу";
            if(i != (speed-1)) {
                text += ", ";
            }
        }
        System.out.println(text);
    }

    public String info() {
        return "Кличка: "+name+"\nПорода: "+breed+"\nСкорость: "+speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
