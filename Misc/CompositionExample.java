package Misc;

//child class
class Room {
    private String roomType;
    Room (String roomType) {
        this.roomType = roomType;
    }

    void displayRoom() {
        System.out.println("Room Type: " + roomType);
    }
}

// Parent class (Composition)
class House {
    private String houseName;
    private Room room; // Composition

    House (String houseName, String roomType) {
        this.houseName = houseName;
        //Room is created within the House class
        this.room = new Room(roomType); 
    }

    void displayHouse() {
        System.out.println("House Name: " + houseName);
        room.displayRoom();
    }
}

//Main class
public class CompositionExample {
    public static void main(String[] args) {
        //House has Room object
        House house = new House("MyHome", "Living Room");

        house.displayHouse();

        //Room cannot exist independently of House
        System.out.println("Room cannot exist independently of House.");
    }
}

