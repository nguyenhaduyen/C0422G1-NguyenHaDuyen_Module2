package ss7_abstraction.thuc_hanh;

public class Test {
    public static void main(String[] args) {
     Animal chicken = new Chicken(); // khoi tao bien chicken thuoc kieu du lieu animal
        System.out.println( ((Chicken)chicken).howToEat()); // ep con chicken la con chicken, cai dauf la kieu eps, cai sau la bien ep de bien bien ep thanh kieur can ep
        Tiger tiger = new Tiger();
        tiger.makeSound();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit f: fruits
             ) {
            System.out.println(f.howToEat());

        }
        }

    }

