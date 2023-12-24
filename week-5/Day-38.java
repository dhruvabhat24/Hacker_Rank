import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numOfTests = scan.nextInt();
        
        for(int test = 0; test < numOfTests; test++){
            int[] array = new int[scan.nextInt()];
            
            for(int i = 0; i < array.length; i++){
                array[i] = scan.nextInt();
            }
            
            int result = 0;
            
            if(array.length == 0)
                result = 0;
            else if(array.length == 1)
                result = array[0];
            else if(array.length%2 == 0)
                result = 0;
            else{
                for(int i = 0; i < array.length; i+=2)
                    result^= array[i];
            }
            System.out.println(result);

        }
    }    
}
