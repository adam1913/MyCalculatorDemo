package hbcu.stay.ready.ttime;

import org.junit.Test;
import org.junit.Assert;

public class DisplayTest {



    @Test
    public void switchDisplayModeTest() {
        Display display = new Display();
        display.switchDisplayMode();
        String actual = display.displayMode;
        String expected = "octal";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsTest() {
        Display display = new Display();
        display.switchUnitsMode();
        String actual = display.unitsMode;
        String expected = "Radians";
        Assert.assertEquals(expected,actual);
    }
}

