public class PythonDeveloper extends Developer{

    @Override
    public void buildApp() {
        System.out.println("Python dev is building python app");
    }
    public void pythonTeam() {
        System.out.println("this is child specific class in python");
    }
}
