import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for yes and 0 for no");
        int response = input.nextInt();

        if(response == 1){
            System.out.println( "You indicated 'Yes'");
        }else if (response == 0){
            System.out.println("You indicated 'No'");
        }else{
            System.out.println("I do not understand");

        }
        System.out.println("Enter a number to if odd or even");
        int response1 = input.nextInt();
        if(response1%2 == 0){
            else
        }

    }
}
