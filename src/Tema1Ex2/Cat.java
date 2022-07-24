package Tema1Ex2;

public class Cat extends Animal {
    String favoriteFood;

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
        this.favoriteFood = favoriteFood;
    }

    @Override
    void scoateSunet() {
        System.out.println("Miau Miau!");;
    }
}
