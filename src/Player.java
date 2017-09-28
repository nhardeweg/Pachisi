
public class Player
{
    private final int START;
    private final int END;
    private final String NAME;
    private Piece [] pieces =new Piece[4]; ;
   
    public Player(int start, int end, String name)
    {
		this.START = start;
		this.END   = end;
		this.NAME  = name;
    	for(int i = 0; i < pieces.length; i++){
    		Piece p = new Piece();
    		pieces[i] = p;		
    	}
    }
    
    public int getStart()
    {
    	return this.START;
    }
    
    public int getEnd()
    {
    	return this.END;
    }
    
    public String getName()
    {
    	return this.NAME;
    }
    
    public boolean movePiece(int steps, int piece, Board board)
    {
    	Field currentField = pieces[piece].getField();
    	int currentFieldNumber = 0;
    	
    	if (currentField != null) {
    		currentFieldNumber = currentField.getNumber();
    	}
    	
    	Field newField = board.getFieldByNumber(currentFieldNumber + steps);
    	
    	if (newField.getOccupied() != null) {
    		if(myPiece(newField.getOccupied())){
    			return false;
    		}
    		newField.getOccupied().setField(null);
    		pieces[piece].setField(newField);
    	}
    	newField.setOccupied(this.pieces[piece]);
    	return true;
    }
    
    public int inStrikeRange(int steps, Board board)
    {
    	for(int i = 0; i< this.pieces.length; i++) {
    		Field currentField = pieces[i].getField();
        	int currentFieldNumber = 0;
        	
        	if (currentField != null) {
        		currentFieldNumber = currentField.getNumber();
        	}
        	
        	Field newField = board.getFieldByNumber(currentFieldNumber + steps);
        	
        	if (newField.getOccupied() != null) {
        		if(myPiece(newField.getOccupied())){
        			return i;
        		}
        	}
    	}
    	
    	return -1;
    }
    
    public boolean myPiece(Piece piece){
    	boolean myPiece = false;
    	for( int i = 0; i < pieces.length; i++){
    		if(pieces[i].getField() == piece.getField()){
    			myPiece = true;
    		}
    	}
    	return myPiece;
    }
    
}
