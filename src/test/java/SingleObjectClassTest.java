import static org.testng.Assert.*;

public class SingleObjectClassTest {

    @org.testng.annotations.Test
    public void testGetInstance() {
        SingleObjectClass soc = SingleObjectClass.getInstance();
        soc.setNumber(5);

        assertEquals(5, soc.getNumber());
    }

    @org.testng.annotations.Test
    public void testGetNumber() {
        SingleObjectClass soc = SingleObjectClass.getInstance();
        soc.setNumber(5);

        assertEquals(5, soc.getNumber());
    }

    @org.testng.annotations.Test
    public void testSetNumber() {
        SingleObjectClass s1 = SingleObjectClass.getInstance();
        s1.setNumber(5);
        SingleObjectClass s2 = SingleObjectClass.getInstance();

        assertEquals(5, s1.getNumber());
        assertEquals(5, s2.getNumber());
        assertEquals(s1, s2);
    }
}