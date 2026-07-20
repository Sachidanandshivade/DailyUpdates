public class ConstructorChaining {

    String roomType;
    double roomRate;
    int roomNumber;

    public ConstructorChaining(String roomType) {
        this(roomType, 100.0, 0);
    }

    public ConstructorChaining(String roomType, double roomRate) {
        this(roomType, roomRate, 0);
    }

    public ConstructorChaining(String roomType, double roomRate, int roomNumber) {
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.roomNumber = roomNumber;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Rate: $" + roomRate);
        System.out.println("Room Number: " + roomNumber);
    }


    public static void main(String[] args) {
        ConstructorChaining room1 = new ConstructorChaining("Standard");
        ConstructorChaining room2 = new ConstructorChaining("Deluxe", 150.0);
        ConstructorChaining room3 = new ConstructorChaining("Suite", 300.0, 101);

        room1.displayRoomDetails();
        System.out.println();

        room2.displayRoomDetails();
        System.out.println();

        room3.displayRoomDetails();
    }
 }

