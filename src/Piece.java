
public class Piece
{
    private Player p;
    private Field f;
    
    public Piece(Player player)
    {
	this.p = player;
    }
    
    public Field getField()
    {
	return this.f;
    }
    
    public void setField(Field field)
    {
	this.f = field;
    }
}
