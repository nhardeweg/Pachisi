
public class Player
{
    private final int START;
    private final int END;
    private final String NAME;
    private Piece [] pieces =new Piece[4];
   
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
    	printPieces();
    	Piece p = pieces[piece];
    	System.out.println(p);
    	Field currentField = p.getField();
    	int currentFieldNumber;
    	if (currentField != null) {
    		currentFieldNumber = currentField.getNumber();
    	}
    	else currentFieldNumber = this.START;
    	if((currentFieldNumber < END && (currentFieldNumber+steps) >= START) || (END == 39 && (currentFieldNumber+steps)>39)){
    		//move steps until END, if the steps left are <= 4 piece can move, else not
    		
    		return true;
    	}
    	else{
    		Field newField = board.getFieldByNumber((currentFieldNumber + steps)%40);
    	
	    	if (newField.getOccupied() != null) {
	    		if(myPiece(newField.getOccupied())){
	    			return false;
	    		}
	    		newField.getOccupied().setField(null);
	    		pieces[piece].setField(newField);
	    	}
	    	newField.setOccupied(this.pieces[piece]);
	    	p.setField(newField);
	    	if(currentField != null){
	    		currentField.setOccupied(null);
	    	}
	    	return true;
    	}
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
    		if((pieces[i].getField() == piece.getField()) && (pieces[i].equals(piece) == false)){
    			myPiece = true;
    		}
    	}
    	return myPiece;
    }
    
    public boolean hasActivePiece(){ 	//three times rolling bc no movable option left
    	boolean free = false;
    	for (int i = 0 ; i < pieces.length; i++){
    		if(pieces[i].getField() != null ){ 	//missing: pieces in Home and unmovable 
    			free = true;
    		}
    	}
    	return free;
    }
    
    public void printPieces(){
    	for( int i = 0; i < pieces.length; i++){
    		System.out.println(pieces[i].getField());
//    		System.out.println(pieces[i]);
    	}
    }
    
}
