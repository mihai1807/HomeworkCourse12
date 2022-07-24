package Tema1Ex2;
public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Pisica1", 2, 3.5);
        Animal cat2 = new Cat("Pisica2", 3, 4.5);
        Animal cat3 = new Cat("Pisica3", 4, 5.5);
        Animal dog1 = new Dog("Caine1", 2, 3.5);
        Animal dog2 = new Dog("Caine2", 3, 4.5);
        Animal dog3 = new Dog("Caine3", 4, 5.5);
        Animal[] animals = {cat1, cat2, cat3, dog1, dog2, dog3};
        averageAge(animals);
        afiseazaPisici(animals);
        latraAnimal(animals);
    }

    public static void averageAge(Animal[] listaDeAnimaale) {
        int sum = 0;
        for (Animal animal : listaDeAnimaale) {
            sum += animal.age;
        }
        System.out.println("Media varstei animalelor este: " + sum / listaDeAnimaale.length);
    }

    public static void afiseazaPisici(Animal[] listaDeAnimaale) {
        for (Animal animal : listaDeAnimaale) {
            if (animal instanceof Cat) animal.afiseazaAnimal();
        }
    }

    public static void latraAnimal(Animal[] listaDeAnimaale) {
        for (Animal animal : listaDeAnimaale) {
            if (animal instanceof Dog) animal.scoateSunet();
        }
    }
}
