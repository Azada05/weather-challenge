

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse ProcessFootballTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ProcessFootballTest
{
    /**
     * Konstruktor fuer die Test-Klasse ProcessFootballTest
     */
    public ProcessFootballTest()
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
    public void testProcessingFootballData()
    {
        ProcessFootball processF1 = new ProcessFootball();
        assertEquals("Aston_Villa", processF1.ProcessFootball());
    }
}

