import java.util.List;

public abstract class Board
{
    protected Field[] fields;
    protected Field[][] huts; // Start
    protected Field[][] homes; // Ziel
    protected int SIZE;
    protected int PLAYERS;
     
    public void initFields()
    {
	this.fields = new Field[this.SIZE];
	this.huts = new Field[this.PLAYERS][4];
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
		this.huts[i][j] = new Field(j,FieldType.Hut);
		this.homes[i][j] = new Field(j, FieldType.Home);
	    }
	
    }
    public Field[] getFields()
    {
	return this.fields;
    }
    
    public Field[][] getHuts()
    {
	return this.huts;
    }
    
    public Field[][] getHomes()
    {
	return this.homes;
    }
    
    public int getSize()
    {
	return this.SIZE;
    }
}
