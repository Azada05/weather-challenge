

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse DayTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DayTest
{
    /**
     * Konstruktor fuer die Test-Klasse DayTest
     */
    public DayTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCreatingDay()
    {
        Day day1 = new Day("3", 40, 23);
        assertEquals("3", day1.getDayId());
        assertEquals(23, day1.getMnT());
        assertEquals(40, day1.getMxT());
    }
}

