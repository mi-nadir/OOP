public class Worker {
    String name;
    String post;
    int salary;

    Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String showInfo(int i) {
        return "Имя: "+this.name+"\nДолжность: "+post+"\nЗарплата: "+salary+"\nЗарплата за "+i+" мес: "+(i*salary);
    }
}
