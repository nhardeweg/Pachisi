import java.util.Random;

public class Dice
{
    private Random rand;
    private boolean isNetworkDice;
    
    public Dice(boolean isNetworkDice)
    {
	rand = new Random(System.currentTimeMillis());
	this.isNetworkDice = isNetworkDice;
    }
    
    public Dice()
    {
	this(false);
    }
    
    public int roll()
    {
	if(isNetworkDice)
	{
	    return 4; // Platzhalter. Leb damit, Nils
	}
	else
	{
	    return rand.nextInt();
	}
    }
}
