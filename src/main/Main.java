package main;
import test.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setHeight(10.2);
        myBox.setLength(8.1);
        myBox.setWidth(3.4);

        Box myBox2 = new Box();
        myBox2.setHeight(5);
        myBox2.setLength(5);
        myBox2.setWidth(5);
        double volume = myBox.getHeight() * myBox.getLength() * myBox.getWidth();
        System.out.println("myBox: "+volume);

        double volume2 = myBox2.getHeight() * myBox2.getLength() * myBox2.getWidth();
        System.out.println("myBox2: "+volume2);

        //////////////////////////////////

        Human Andrey = new Human();
        Human Maxim = new Human();
        Andrey.setAge(34);
        Andrey.setName("Andrey");
        Andrey.setWeight(80);

        Maxim.setAge(24);
        Maxim.setName("Maxim");
        Maxim.setWeight(90);

        float avgAge = (float) (Andrey.getAge() + Maxim.getAge()) / 2;
        System.out.println(avgAge);

        //////////////////////////////
        myBox.showVolume();
        myBox2.showVolume();
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());

        //////////////////////////////

        Dog dog1 = new Dog();
        dog1.setSpeed(5);
        dog1.setBreed("Кавказская");
        dog1.setName("Шарик");
        System.out.println(dog1.info());
        dog1.run();

        //////////////////////////////

        Rect rect = new Rect();
        rect.setInfo(22, 23);
        System.out.println(rect.perimeter());
        System.out.println(rect.square());

        //////////////////////////////
        Worker worker = new Worker("Иван", "Механик", 55000);
        System.out.println(worker.showInfo(10));

        //////////////////////////////
        Monster monster = new Monster(1,3,5);
        monster.voice(5, "gaga");

        /////////////////////////////////
        Box myBox3 = new Box(1,2,3);
        Box myBox4 = myBox3.newBox(myBox2);
        myBox4.showVolume();
        Box myBox5 = new Box(myBox3, myBox4);
        myBox5.showVolume();

        //////////////////////////////////
        String parseText = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String manName = parseText.substring(4, 8);
        int manAge = Integer.parseInt(parseText.substring(14,16));
        double manHeight = Double.parseDouble(parseText.substring(32,37));
        String manPost = parseText.substring(54,65);
        Man man = new Man(manName, manPost, manAge, manHeight);
        System.out.println(man.getAge());
        System.out.println(man.getName());
        System.out.println(man.getPost());
        System.out.println(man.getHeight());
        //////////////////////////////////
        ArrayList<Integer> listNum = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();
        ArrayList<String> listNew = new ArrayList<>();
        listNum.add(454);
        listNum.add(45);
        listNum.add(65);
        listNum.add(78);
        listNum.add(54);
        listNum.add(32);
        listNum.add(75);
        listNum.add(70);
        listNum.add(44);
        listNum.add(54);
        listStr.add("Name 1");
        listStr.add("Name 2");
        listStr.add("Name 3");
        listStr.add("Name 4");
        listStr.add("Name 5");
        listStr.add("Name 6");
        listStr.add("Name 7");
        listStr.add("Name 8");
        listStr.add("Name 9");
        listStr.add("Name 10");

        for (int i=0; i<listNum.size();i++) {
            listNew.add(listNum.get(i) +" - "+listStr.get(i));
        }
        for(String str: listNew) {
            System.out.println(str);
        }
    }
}
