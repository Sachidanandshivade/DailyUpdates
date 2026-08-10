package OOps;

public class Main {
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        // Fan f1 = new Fan(4, "Crompton", "blue");
        // System.out.println(f1.noofWings);
        // System.out.println(f1.brand);
        // System.out.println(f1.color);

        // // Creating object using default constructor
        // Fan f2 = new Fan();
        // System.out.println(f2.noofWings);
        // System.out.println(f2.brand);
        // System.out.println(f2.color);

        Developer dev;
        dev = new JavaDeveloper(); //upcasting
        dev.attendMeeting(); // calling inherited  method using parent reference
        dev.doProject(); // calling overridden method using parent reference
        ((JavaDeveloper) dev).learnJava();  // downcasting to access child class method

        dev = new PythonDeveloper();
        dev.attendMeeting();    
        dev.doProject();
        ((PythonDeveloper) dev).learnPython(); // downcasting to access child class method

        myMethod(new JavaDeveloper());
        myMethod(new PythonDeveloper());
    }

    static void myMethod(Developer dev) {
        dev.attendMeeting();
        dev.doProject();
        if(dev instanceof JavaDeveloper) {
            ((JavaDeveloper) dev).learnJava();
        }else {
            ((PythonDeveloper) dev).learnPython();
        }
    }
}
