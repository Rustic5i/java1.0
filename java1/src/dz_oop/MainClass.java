package dz_oop;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cat c1 = new Cat("Barsik");
        //Cat c2 = new Cat("Oleg");
        //Dog d1 = new Dog("Буги");
        //Dog d2 = new Dog("Буги man");

        System.out.println("Введите дистанцию бега");
        int l = sc.nextInt();
        System.out.println("Введите дистанцию заплыва");
        int x = sc.nextInt();

        Animal[] arr = {new Cat("Barsik"),
                new Cat("Oleg"),
                new Dog("Буги"),
                new Dog("Буги man")};

        for (Animal a1: arr) {
            if (!a1.onDistance){ continue;} a1.run(l);
            if (!a1.onDistance){ continue; }a1.swim(x);
        }

        for (Animal a1: arr) {
            if (a1.isOnDistance()){
                System.out.println(a1.getName()+" Выйграл");
            }
        }
    }
}
