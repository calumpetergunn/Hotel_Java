import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name){
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getGuests() {
        return this.guests.size();
    }
}
