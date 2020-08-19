package com.qa.day8;
import java.util.*;

public class Person {
    private String name;
    private int age;
    private String jobTitle;

    @Override
    public String toString() {
        return String.format("Name: " + name + " age: " + age + " job title: " + jobTitle);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Dave";
        person1.age = 27;
        person1.jobTitle = "Plumber";
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 55;
        person2.jobTitle = "Mechanic";
        Person person3 = new Person();
        person3.name = "Tadas";
        person3.age = 25;
        person3.jobTitle = "Teacher";
        Person person4 = new Person();
        person4.name = "Angelina";
        person4.age = 23;
        person4.jobTitle = "Biomechnical Engineer";
        List<Person> people = Arrays.asList(person1, person2, person3, person3);
            people.forEach(System.out::println);
        Person test = new Person();
        test.searchName(people, "Tadas");
    }

    public String searchName(List<Person> listOfNames, String specificName) {
        List<Person> names = listOfNames;
        String name =
                names.stream()
                    .filter(str -> Boolean.parseBoolean(str.name = specificName))
                    .toString();
        System.out.println(name);
        return name;
    }
}
