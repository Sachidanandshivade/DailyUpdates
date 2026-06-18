package OOps;

import static OOps.Student.display;
import static OOps.Student.number;

public class StudentApp {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name= "sachi";

        //static method
        display();

        // non- static method
        s1.display1();

        //static variable
        System.out.println(number);


       /* s1.eat();
        s1.sleep();
        System.out.println();
        Course c1 = new Course();
        c1.course_name = "Full Stack Programming";
        c1.duration = 6;
        c1.Mentor_name="sandesh";

        c1.start();
        c1.learn();
        c1.end();
        */
    }
}
