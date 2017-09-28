
public class Field
{
    private FieldType type;
    private Piece occupiedBy;
    private final int NUMBER;
    
    public Field(int number, FieldType type)
    {
	this.type = type;
	this.occupiedBy = null;
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
        return occupiedBy;
    }

    public void setOccupied(Piece occupied)
    {
        this.occupiedBy = occupied;
    }

    public int getNumber()
    {
        return this.NUMBER;
    }
}
