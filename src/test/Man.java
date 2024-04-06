package test;

public class Man {
    private String name;
    private String post;
    private int age;
    private double height;

    public Man(String name, String post, int age, double height) {
        this.age = age;
        this.height = height;
        this.post = post;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
