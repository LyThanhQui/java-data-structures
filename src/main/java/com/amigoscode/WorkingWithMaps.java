package com.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Qui", 26));
        map.put(2, new Person("Thao", 21));
        map.put(3, new Person("Tam", 21));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person)->{
            System.out.println(key + "-" + person);
        });

        System.out.println(map.getOrDefault(3, new Person("default", 20)));
        System.out.println(map.values());

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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
