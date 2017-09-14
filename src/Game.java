
public class Game
{    
    public static void main(String[] args)
    {
	Game g = new Game();
	g.play(2);
    }
    
    public void play(int playernum)
    {
	Board board = new Board4Players(); // enthält fields
	Player[] players = new Player[playernum];
	Piece[][] pieces = new Piece[playernum][4];
	Dice dice = new Dice(false);
	
	Player activePlayer;
	int active; 

	int j, start;
	for(int i = 0; i < playernum; i++) // Playeriteration
	{
	    if(playernum == 2 && i == 1)
		j = i+1;
	    else
		j = i;
	    start = j*10+40;
	    players[i] = new Player(start%40,(start-1)%40, "Player "+(i+1));
	    for(int z = 0; z < 4; z++) // Figuriteration
	    {
		pieces[i][z] = new Piece(players[i], board.getHuts()[i][z]);
		board.getHuts()[i][z].setOccupied(pieces[i][z]);
	    }
	}

	active = dice.roll();
	activePlayer = players[active];
	System.out.println("Spieler "+active+" beginnt!");
	
	// Spielschleife
	while(true)
	{
	    
	}
    }
}
