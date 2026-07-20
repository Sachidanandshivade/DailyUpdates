//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char t ='Z';
        char x = '\u005A' ;
        char y = 	90;
        System.out.println(t);
        System.out.println(x);
        System.out.println(y);
        JavaDeveloper jav = new JavaDeveloper();
        PythonDeveloper py = new PythonDeveloper();
        jav.buildApp();
        py.buildApp();
        jav.javaTeam();
        py.pythonTeam();
    }
}