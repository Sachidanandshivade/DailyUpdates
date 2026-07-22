package package1;

import package2.Program3;

public class Program1 {
    Program3 method() { // default method
        System.out.println("Inside Parent method");
        Program3 p = new Program3();
        return p;
    }
}
