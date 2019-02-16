package com.daviddutra.functionalinterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFI {

    public static void main(String[] args) {
        List<Person> personList = loadList();

        Function<Person, String> function = person -> {
            return person + " ...";
        };

        personList.forEach(person -> System.out.println(function.apply(person)));
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
