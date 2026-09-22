package pet;

public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("hh");
        dog.setHealth(70);
        dog.setKeep("疏远");
        dog.setLei("牧羊犬");
        System.out.println(dog.getName());
        System.out.println(dog.getHealth());
        System.out.println(dog.getKeep());
        System.out.println(dog.getLei());


        Penguin penguin = new Penguin();
        penguin.setName("hh");
        penguin.setHealth(70);
        penguin.setKeep("亲亲");
        penguin.setNv("n");

        System.out.println(penguin.getName());
        System.out.println(penguin.getHealth());
        System.out.println(penguin.getKeep());
        System.out.println(penguin.getNv());

    }
}
