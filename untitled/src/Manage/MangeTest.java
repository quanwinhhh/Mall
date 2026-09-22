package Manage;

public class MangeTest {
    public static void main(String[] args) {
        Mange mange1 = new Mange();
        mange1.setName("oi");
        mange1.setPassword("123456");
        Mange mange = new Mange();
        mange.setName("oip");
        mange.setPassword("123456qq");

        System.out.println(mange.getName());
        System.out.println(mange.getPassword());
        System.out.println(mange);

        System.out.println(mange1.getName());
        System.out.println(mange1.getPassword());
        System.out.println(mange);

    }
}
