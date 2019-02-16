package com.daviddutra.functionalinterface.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFI {

    public static void main(String[] args) {
        List<Person> personList = loadList();

        System.out.println("Normal sort and loop");

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge().compareTo(p2.getAge());
            }
        });

        for (Person p : personList) {
            System.out.println(p);
        }

        personList = loadList();

        System.out.println("Lambda sort and loop");

        Collections.sort(personList, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));

        personList.forEach(person -> System.out.println(person));
    }

    protected static List<Person> loadList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("A", 10));
        personList.add(new Person("E", 50));
        personList.add(new Person("B", 20));
        personList.add(new Person("D", 40));
        personList.add(new Person("C", 30));

        return personList;
    }

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
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
