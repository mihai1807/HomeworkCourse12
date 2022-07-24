package Tema1Ex2;

public class Dog extends Animal{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void scoateSunet() {
        System.out.println("Ham Ham!");;
    }
}
