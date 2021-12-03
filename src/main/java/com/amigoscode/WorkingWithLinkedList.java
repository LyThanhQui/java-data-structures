package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args){
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Qui", 26));
        linkedList.add(new Person("Thao", 21));
        linkedList.addFirst(new Person("Tam", 21));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
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
