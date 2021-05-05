import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("Mouthful");
        guest = new Guest("Purple Fantasia");
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("Mouthful", diningRoom.getName());
    }

    @Test
    public void diningRoomStartsWithNoGuests(){
        assertEquals(0, diningRoom.getGuests());
    }
}
