import java.util.List;

public abstract class Board
{
    protected Field[] fields;
    protected int[] starts;
    protected int SIZE;
    protected int PLAYERS;
     
    public void initFields()
    {
	this.fields = new Field[this.SIZE];
	this.starts = new int[this.PLAYERS];
	
	for(int i = 0; i < this.SIZE; i++)
	{
	    this.fields[i] = new Field(false, i);
	    if(i % (this.SIZE / this.PLAYERS) == 0)
	    {
		this.starts[i/(this.SIZE / this.PLAYERS)] = i;
	    }
	}
    }
}
