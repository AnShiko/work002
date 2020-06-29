package com.geekbrains.work002;

public class Main {

    public static void main(String[] args) {


        Moving[] participant = {

                new Human("Зеленый", 200, 2),
                new Cat("Барсик", 500, 5),
                new Robot("Громозека", 1000, 0),
        };

        for (Moving moving : participant) {
            moving.run(250);
            moving.jump(5, 250);
        }
    }
}