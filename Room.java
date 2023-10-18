package Assignments;

public class Room {
    private static int roomCounter;
    private int roomNo;
    private int capacity;
    static{
        roomCounter = 0;
    }
    

    Room(){
        this.roomNo = 500+roomCounter;
        this.capacity = 4;
        roomCounter++;
    }

    public static int getRoomCounter() {
        return roomCounter;
    }

    public static void setRoomCounter(int roomCounter) {
        Room.roomCounter = roomCounter;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
