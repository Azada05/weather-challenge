

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse ProcessWeatherTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ProcessWeatherTest
{
    /**
     * Konstruktor fuer die Test-Klasse ProcessWeatherTest
     */
    public ProcessWeatherTest()
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
    public void testProcessingWeather()
    {
        ProcessWeather processW2 = new ProcessWeather();
        assertEquals(14, processW2.ProcessWeather());
    }
}

