import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application
{    
    public static void main(String[] args) 
    {
	launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
	BoardGUI gui = new BoardGUI(primaryStage);
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
	
	active = dice.roll();
	activePlayer = players[active];
	System.out.println("Spieler "+active+" beginnt!");
		
	// Spielschleife
	while(true)
	{
	   int steps = dice.roll();
		   
	   // Input by client to identify the piece that should be moved
	   //TODO
	   int movePiece = 1; // Exchange new Piece by the piece to be moved
		   
	   activePlayer.movePiece(steps, movePiece, board);
		   
	}
    }
}
