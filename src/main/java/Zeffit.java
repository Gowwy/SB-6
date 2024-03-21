/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{
    private static final int GREEN_THRESHOLD = 1;
    private static final int BLUE_THRESHOLD = 2;
    private static final int RED_THRESHOLD = 3;
    private static final int EXPLODE_THRESHOLD = 4;

    private int hits;

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        hits = 0; // hit count
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        hits++; //hit = hit + 1
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        return hits == 0;
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        return hits >= GREEN_THRESHOLD && hits < BLUE_THRESHOLD;
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        return hits >= BLUE_THRESHOLD && hits < RED_THRESHOLD;
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        return hits >= RED_THRESHOLD && hits < EXPLODE_THRESHOLD;
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        return hits >= EXPLODE_THRESHOLD;
    }
}

