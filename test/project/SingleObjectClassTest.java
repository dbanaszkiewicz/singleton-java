package project;

import org.junit.Assert;
import org.junit.Test;

public class SingleObjectClassTest {

    @Test
    public void getSomeNumber() {
        SingleObjectClass soc = SingleObjectClass.GiveMeMyObject();
        soc.SetSomeNumber(5);

        Assert.assertEquals(5, soc.GetSomeNumber());
    }

    @Test
    public void setSomeNumber() {
        SingleObjectClass soc = SingleObjectClass.GiveMeMyObject();
        soc.SetSomeNumber(8);

        Assert.assertEquals(8, soc.GetSomeNumber());
    }

    @Test
    public void giveMeMyObject() {
        SingleObjectClass s1 = SingleObjectClass.GiveMeMyObject();
        s1.SetSomeNumber(5);
        SingleObjectClass s2 = SingleObjectClass.GiveMeMyObject();

        Assert.assertEquals(5, s1.GetSomeNumber());
        Assert.assertEquals(5, s2.GetSomeNumber());
        Assert.assertSame(s1, s2);
    }
}