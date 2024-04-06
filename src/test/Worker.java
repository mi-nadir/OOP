package test;

public class Worker {
    private String name;
    private String post;
    private int salary;

    public Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String showInfo(int i) {
        return "Имя: "+this.name+"\nДолжность: "+post+"\nЗарплата: "+salary+"\nЗарплата за "+i+" мес: "+(i*salary);
    }
}
