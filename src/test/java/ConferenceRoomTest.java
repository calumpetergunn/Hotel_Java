import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {



        private ConferenceRoom conferenceRoom;
        private Guest guest;

        @Before
        public void setUp() {
            conferenceRoom = new ConferenceRoom("Boardroom", 10);
            guest = new Guest("Purple Fantasia");
        }

        @Test
        public void hasName(){
            assertEquals("Boardroom", conferenceRoom.getName());
        }

        @Test
        public void hasCapacity(){
            assertEquals(10, conferenceRoom.getCapacity());
        }

        @Test
        public void guestsStartsEmpty(){
            assertEquals(0, conferenceRoom.getGuests());
        }


        @Test
        public void canAddGuests(){
            conferenceRoom.addGuest(guest);
            assertEquals(1, conferenceRoom.getGuests());
        }

        @Test
        public void cantAddGuestsIfFull(){
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            conferenceRoom.addGuest(guest);
            assertEquals(10, conferenceRoom.getGuests());
        }

}
