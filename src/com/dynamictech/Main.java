package com.dynamictech;


public class Main {

    public static void main(String[] args) {
        Fish2 fish2 = new Fish2(12,true);
        fish2.setSize(7);
        System.out.println(fish2.getSize());
        fish2.setHungry(false);
        System.out.println(fish2.getHungry());

        Fruit fruit = new Fruit(12.0);
        Integer ecoRating = fruit.getEcoRating();
        fruit.setEcoRating(3);
        fruit.setEcoRating(-5);

    }

}
