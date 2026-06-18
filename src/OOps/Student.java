package OOps;

public class Student {
    int id;
    String name;
    char style;
    static int number = 10;

    static void display() {
        System.out.println("I am accessible without object creation");
    }

    void display1(){
        System.out.println("I cannot be accessed without object");
    }

    public void eat(){
        System.out.println("Yummy," +name +  " Likes it");
    }

    public void sleep(){
        System.out.print("ZZZZ " + style + " is sleeping");
    }

}
