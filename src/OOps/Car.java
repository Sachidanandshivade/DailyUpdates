package OOps;

public class Car {
   static String brand;
    String  EngineType;
    String Color;
    int NOofWheels;

      // non static
    void drive(){
        System.out.println(brand + " Car drives at speed: " +100);
    }

   static void start(){
        System.out.println( brand  + " Car engine has been Started");
    }

    void stop(){
        System.out.println(brand +" Car Engine Stopped");
    }

}
