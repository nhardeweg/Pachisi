import java.util.List;

public abstract class Board
{
    protected Field[] fields;
    protected Field[][] homes; // Ziel
    protected int SIZE;
    protected int PLAYERS;
     
    public void initFields()
    {
		this.fields = new Field[this.SIZE];
		this.homes = new Field[this.PLAYERS][4];
		
		// Normale Felder
		for(int i = 0; i < this.SIZE; i++)
		{
		    this.fields[i] = new Field(i);
		}
		// Huts & Homes angeben
		for(int i = 0; i < this.PLAYERS; i++)
		    for(int j = 0; j < 4; j++)
		    {
				this.homes[i][j] = new Field(j, FieldType.Home);
		    }
	
    }
    public Field[] getFields()
    {
    	return this.fields;
    }
    
    public Field[][] getHomes()
    {
    	return this.homes;
    }
    
    public int getSize()
    {
    	return this.SIZE;
    }

    public Field getFieldByNumber(int num)
    {
    	for(int i = 0; i < this.fields.length; i++) {
    		if (this.fields[i].getNumber() == num) {
    			return this.fields[i];
    		}
    	}
    	return null;
    }
}
