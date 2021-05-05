import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if(this.capacity > this.getGuests()) {
            this.guests.add(guest);
        }
    }

    public Guest removeGuest(Guest guest) {
        this.guests.remove(0);
        return null;
    }
}
