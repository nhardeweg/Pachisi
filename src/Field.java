
public class Field
{
    private FieldType type;
    private Piece occupied;
    private final int NUMBER;
    
    public Field(int number, FieldType type)
    {
	this.type = type;
	this.occupied = null;
	this.NUMBER = number;
    }
    
    public Field(int number)
    {
	this(number,FieldType.Default);
    }

    public FieldType getType()
    {
        return this.type;
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
