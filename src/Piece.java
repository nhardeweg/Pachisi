
public class Piece
{
    private Player player;
    private Field field;
    
    public Piece(Player player)
    {
	this.player = player;
    }
    
    public Field getField()
    {
	return this.field;
    }
    
    public void setField(Field field)
    {
	this.field = field;
    }
}
