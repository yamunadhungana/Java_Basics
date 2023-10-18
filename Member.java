package Assignments;

public class Member {
    private int memberId;
    private String name;
    private Room room;

    Member(int memberId, String name){
        super();
        this.memberId = memberId;
        this.name = name;
       // this.room = room;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
