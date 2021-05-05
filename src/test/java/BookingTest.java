import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;


    @Before
    public void setUp(){
        bedroom = new Bedroom(11, 2, "double");
        booking = new Booking(bedroom, 3);

    }

    @Test
    public void bookingHasNightsBooked(){
        assertEquals(3, booking.getNightsBooked());
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }
}
