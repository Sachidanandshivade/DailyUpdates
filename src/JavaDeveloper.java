public class JavaDeveloper extends Developer{

    @Override
    public void buildApp() {
        System.out.println("java dev is building java app");
    }

    public void javaTeam(){
        System.out.println("this is a child specific method");
    }
}
