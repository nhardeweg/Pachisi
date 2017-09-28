                       
public class Piece
{
    private Field field;
 
    
    public Piece()
    {
		this.field = null;  // null = hut
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
