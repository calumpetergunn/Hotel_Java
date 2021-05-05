import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Purple Fantasia");

    }

    @Test
    public void hasName(){
        assertEquals("Purple Fantasia", guest.getName());
    }


}
