public class TTTBoard {

    private char [][]/*cuz its 2D*/ moves;
    private char currentPlayer = '';

    public TTTBoard(){
        initBoard();
    }

    private void initBoard(){

    }

    private void switchPlayer(){

    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    private boolean placeMarker(){
        return true; //needs change
    }

    public boolean has3InARow(){
        return false; //needs change
    }

    public void printBoard(){

    }

}
