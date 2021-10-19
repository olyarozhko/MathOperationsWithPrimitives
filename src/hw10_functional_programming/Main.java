package hw10_functional_programming;

import hw10_functional_programming.Person.Gender;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.of(
                        new Person("Petro", 25, Gender.MALE),
                        new Person("Olena", 19, Gender.FEMALE),
                        new Person("Marek", 50, Gender.MALE),
                        new Person("John", 10, Gender.MALE),
                        new Person("Jane", 70, Gender.FEMALE),
                        new Person("Brittney", 43, Gender.FEMALE)
                )
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .map(person -> person.getName() + " - " + person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender {
        MALE,
        FEMALE
    }

}