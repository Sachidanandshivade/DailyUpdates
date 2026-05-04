package OOps;

public class Car {
    String brand;
    int NoOfWheels;
    double speed;
    double width;
    double height;
    int noOfEngines;
    boolean haveExhaust;


    void drive(){

    }

    void start(){

    }
    void stop(){

    }
    public static void main(String[] args){
        Car c1 = new Car(); // c1 is called as object reference not variable
        c1.drive();
        c1.start();
        c1.stop();
    }
}
