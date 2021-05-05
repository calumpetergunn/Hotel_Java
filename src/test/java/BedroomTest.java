import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setUp(){
        bedroom = new Bedroom(11, 2, "double");
        guest = new Guest("Purple Fantasia");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(11, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void hasRoomType(){
        assertEquals("double", bedroom.getRoomType());
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void cantAddGuestsIfFull(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getGuests());
    }

}
