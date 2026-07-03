package OOps;

public class Main {
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Fan f1 = new Fan(4, "Crompton", "blue");
        System.out.println(f1.noofWings);
        System.out.println(f1.brand);
        System.out.println(f1.color);

        // Creating object using default constructor
        Fan f2 = new Fan();
        System.out.println(f2.noofWings);
        System.out.println(f2.brand);
        System.out.println(f2.color);
    }
}
