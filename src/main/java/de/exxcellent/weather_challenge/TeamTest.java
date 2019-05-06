

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse TeamTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TeamTest
{
    /**
     * Konstruktor fuer die Test-Klasse TeamTest
     */
    public TeamTest()
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
    public void testCreatingTeam()
    {
        Team team1 = new Team("Liverpool", 4, 3);
        assertEquals(4, team1.getGoals());
        assertEquals(3, team1.getGoalsAllowed());
        assertEquals("Liverpool", team1.getTeamName());
    }
}

