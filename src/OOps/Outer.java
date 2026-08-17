package OOps;

public class Outer {
    int a = 10;
    static int b = 20;

    void outerDisplay() {
        System.out.println("Outer class");
        System.out.println(a);
        System.out.println(b);
    }

    class Inner {
        int p = 30;
        static int q = 40;
        void innerDisplay() {
            System.out.println("Inner Class");
            System.out.println(p);
            System.out.println(q);
        }
    }
}
