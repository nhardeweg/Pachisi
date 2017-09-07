
public class Player
{
    private final int    START;
    private final int    END;
    private final String NAME;
   
    public Player(int start, int end, String name)
    {
	this.START = start;
	this.END   = end;
	this.NAME  = name;
    }
    
    public int getStart()
    {
	return this.START;
    }
    
    public int getEnd()
    {
	return this.END;
    }
    
    public String getName()
    {
	return this.NAME;
    }
}
