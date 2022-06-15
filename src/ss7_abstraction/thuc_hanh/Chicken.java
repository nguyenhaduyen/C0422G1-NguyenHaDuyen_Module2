package ss7_abstraction.thuc_hanh;

public class Chicken extends Animal implements Edible {

    @Override
    public void makeSound() {
        System.out.println("Ec Ec");
    }

    @Override
    public String howToEat() {
        return "Co the luoc ga de an";
    }
}
