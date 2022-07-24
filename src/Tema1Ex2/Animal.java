package Tema1Ex2;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void scoateSunet() {
        System.out.println("Sunet de animal");
    }

    void afiseazaAnimal() {
        System.out.println("Nume: " + name);
        System.out.println("Varsta: " + age);
        System.out.println("Greutate: " + weight);
    }
}
