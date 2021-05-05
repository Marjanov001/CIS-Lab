import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {

    public static void main (String []args){

        char[] arr = {'a', 'b', 'c', 'd', 'e'};
    // 0 1 2 3 4
     for(int i = 0; i<5; i++){
         System.out.println("i: " + i);
         System.out.println(arr[i]);

     }
     //foreach loop
        for(char ch : arr){
            System.out.println(ch);
        }
     //wile loop
     int charInt = 75;
        {https://github.com/GannonCIS/blackjack-Marjanov001
            System.out.println((char) charInt);
            charInt++;
        }
        int charInt = 0;
        while((char)charInt !='g' ) {
            System.out.println("int: " + charInt);
            charInt++;
        }
        System.out.println("char: " + (char)charInt);
        int index = 0;
        while(index<100){
            System.out.println(index++);
        }
        System.out.println("index: " + index);
    }
}
