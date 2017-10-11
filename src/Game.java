import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game
{    
    public static void main(String[] args)
    {
		Game g = new Game();
		g.play(4);
    }
    
    public void play(int playernum)
    {
		Board board = new Board4Players(); // enthält fields
		Player[] players = new Player[playernum];
		Dice dice = new Dice(false); //aktivenSpieler auswürfeln
		
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
		}
	
		active = 1;
		activePlayer = players[active];
		System.out.println("Spieler "+active+" beginnt!");
		boolean possible = true;
		int steps = 0;
		int moveP;
		// Spielschleife
		while(true)
		{
			if(possible == true){	//if piece was movable new activePlayer has to roll dice, else old activePlayer stays active and tries to move a different Piece
				steps = dice.roll();
				System.out.println(steps);
			}
		   
		   // Input by client to identify the piece that should be moved
		   
		   
		try {
			moveP = getPlayerInput();
		} catch (IOException e) {
			possible = false;
			System.out.println("Falsche Eingabe");
			continue;
		} // Exchange new Piece by the piece to be moved
		   
		   possible = activePlayer.movePiece(steps, moveP, board); //set possible for a piece
			
		   if(possible == false){ //start from anew when piece can't be moved
			   System.out.println("Bewegung nicht möglich");
			   continue;
		   }
		   active ++;
		   activePlayer= players[(active%playernum)];
		   System.out.println("Zug beendet. Spieler " + (active%playernum) + " ist am Zug");
		   board.printBoard();
		}
		
    }
    
    public int getPlayerInput() throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer 1-4:");
        int i = 0;
        try{
            i = Integer.parseInt(br.readLine());
            if(i > 4){
            	System.out.println(i + " ist nicht zwischen 1-4");
            	return getPlayerInput(); //maybe exception instead
            }
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        return i-1;
    }
    
    
}
