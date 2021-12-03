package com.amigoscode;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Qui", 25));
        supermarket.add(new Person("Thao", 21));
        supermarket.add(new Person("Tam", 21));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static class Person{
        String name;
        Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }
    }
}
