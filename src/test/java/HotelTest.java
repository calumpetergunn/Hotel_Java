import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(11, 2, "double");
        conferenceRoom = new ConferenceRoom("Boardroom", 10);
        guest = new Guest("Purple Fantasia");
    }

    @Test
    public void bedroomListStartsEmpty(){
        assertEquals(0, hotel.getBedrooms());
    }

    @Test
    public void conferenceRoomListStartsEmpty(){
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.getGuests());

    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.getGuests());

    }
}