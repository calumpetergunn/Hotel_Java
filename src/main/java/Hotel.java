import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroomsList;
    private ArrayList<ConferenceRoom> conferenceRoomList;
    private HashMap<String, Integer> roomsByType;

    public Hotel() {
        this.bedroomsList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
        this.roomsByType = new HashMap<>();
    }

    public int getBedrooms() {
        return this.bedroomsList.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRoomList.size();
    }


    public Booking bookRoom(Bedroom bedroom, int nightsBooked) {
        Booking booking = new Booking(bedroom, nightsBooked);
        return booking;
    }

    public int billForBooking(Booking booking) {
        int totalCost = booking.getNightsBooked() * booking.getBedroom().getNightlyRate();
        return totalCost;
    }

    public void AddBedroom(Bedroom bedroom) {
        this.bedroomsList.add(bedroom);
        String roomType = bedroom.getRoomType();
        if (this.roomsByType.containsKey(roomType)) {
            int roomCount = this.roomsByType.get(roomType);
            roomCount++;
            this.roomsByType.put(roomType, roomCount);
        } else {
            this.roomsByType.put(roomType, 1);
        }

    }

    public int roomTypeCount(String roomType) {
        return this.roomsByType.get(roomType);
    }
}

