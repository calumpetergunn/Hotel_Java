import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuests() {
        return this.guests.size();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void addGuest(Guest guest) {
        if (this.capacity > this.getGuests()) {
            this.guests.add(guest);
        }
    }

    public Guest removeGuest(Guest guest) {
        this.guests.remove(0);
        return null;
    }
}
