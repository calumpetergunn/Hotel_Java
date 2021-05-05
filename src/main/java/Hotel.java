import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomsList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(){
        this.bedroomsList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
    }

    public int getBedrooms() {
        return this.bedroomsList.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRoomList.size();
    }
}
