package atm.transaction;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import banking.Card;
import atm.ATM;
import atm.Session;
import banking.Message;
import banking.Money;
import banking.PhoneNumber;
import banking.Receipt;
import atm.physical.*;
import banking.AccountInformation;
import simulation.Simulation;


/**
 * The test class MobileTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MobileTest
{
    /**
     * Default constructor for test class MobileTest
     */
    private ATM atm;
    private Session session;
    private Card card;
    private int pin;
    private Mobile mobile; 
    private Simulation simulation;
    public MobileTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        atm = new ATM(42, "Gordon College", "First National Bank of Podunk",null);
        session= new Session(atm);
        atm.switchOn();
        atm.cardInserted();
        //simulation = new Simulation(atm);
        pin = 1234;
        card = new Card (2);
        mobile  = new Mobile(atm, session, card, pin);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

