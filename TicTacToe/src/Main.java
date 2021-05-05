import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("hello world");
        Scanner scan = new Scanner(System.in);
        TTTBoard myBoard = new TTTBoard();
        int turnCount = 0;

        while(myBoard.has3InARow()){
            System.out.println(myBoard.getCurrentPlayer() + "'s turn/n" +
                    "Please select a row: ");
            //take in a int for row
            int row = scan.nextInt();
            System.out.println("Please select a Column: ");
            //take in an int for column
            int col = scan.nextInt();
            while (!myBoard.placeMarker(row,col)){
                System.out.println("You can't move there!!!");
            }
            turnCount++;
            if(turnCount >= 9){
                break;
            }
        }
        turnCount++;
        if(turnCount >= 9 && !myBoard.has3InARow()) {
            System.out.println("It's a tie!!!");
        }else{
            System.out.println(myBoard.getCurrentPlayer() + "wins!!!");
        }

    }
}
