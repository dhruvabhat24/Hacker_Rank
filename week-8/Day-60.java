import java.io.*;
import java.util.*;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<Integer> s1 = new Stack<Integer>();
    private static Stack<Integer> s2 = new Stack<Integer>();
    private static void enqueue(int value){
            s1.push(value);
        }
        
    private static void dequeue(){
            if (s2.isEmpty() == true){
                while (s1.isEmpty() == false){
                    int toS2 = s1.pop();
                    s2.push(toS2);
                }
            }
            int returnValue = s2.pop();
        }
        
    private static void peak(){
            if (s2.isEmpty() == true){
                while (s1.isEmpty() == false){
                    int toS2 = s1.pop();
                    s2.push(toS2);
                }
            }
            System.out.println(s2.peek());
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            int type = scanner.nextInt();
            if (type == 1){
                enqueue(scanner.nextInt());
            }
            else if (type == 2){
                dequeue();
            }
            else if (type == 3){
                peak();
            }
        }       
    }
}
