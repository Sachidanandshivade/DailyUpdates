package OOps;

public class CarApp {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand= "BMW";
        c1.EngineType = " Diesel";
        c1.Color = "Black";
        c1.NOofWheels = 4;// c1 is called as object reference not variable

        c1.start();
        c1.drive();
        c1.stop();
    }
}
