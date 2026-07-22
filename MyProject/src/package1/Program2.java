package package1;

import package2.Program4;

public class Program2 extends Program1{
    @Override
    Program4 method() {  // this should always have equal or higher visibility than parent method
        System.out.println("inside child method");
        System.out.println("this should always have equal or higher visibility than parent method");
        System.out.println("The return type of overridden method should be same as parent method, or co - variant return type");

        Program4 p1 = new Program4();
        return p1;
    }
    public static void main(String[] args) {
        Program2 p = new Program2();
        p.method();
    }
}

