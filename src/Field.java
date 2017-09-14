
public class Field
{
    private boolean isHome;
    private Piece occupied;
    private final int NUMBER;
    
    public Field(boolean isHome, int number)
    {
	this.isHome = isHome;
	this.occupied = null;
	this.NUMBER = number;
    }

    public boolean isHome()
    {
        return isHome;
    }

    public void setHome(boolean isHome)
    {
        this.isHome = isHome;
    }

    public Piece getOccupied()
    {
        return occupied;
    }

    public void setOccupied(Piece occupied)
    {
        this.occupied = occupied;
    }

    public int getNUMBER()
    {
        return this.NUMBER;
    }
}
