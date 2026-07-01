package OOps;


 /*constructor is  a special method in java that is automatically called when object is created. It helps in initialize the objects */
public class Constructor {
    String name;
    int age;
    String grade;
    String school;

    public Constructor(String n,int a,String g, String s){
        name = n;
        age= a;
        grade = g;
        school = s;
    }

    void display(){
        System.out.println(name + age + grade + school);
    }
}
