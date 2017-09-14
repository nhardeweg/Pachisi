                       
public class Piece
{
    private Player player;
    private Field field;
 
    
    public Piece(Player player, Field startfield)
    {
	this.player = player;
	this.setField(startfield);
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
