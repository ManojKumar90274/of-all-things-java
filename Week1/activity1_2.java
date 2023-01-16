/*  Write a Java program that will ask for your age and print it.
 * 
 */
import java.util.Scanner;
public class activity1_2 {
    public static void main (String [] args){
        Scanner y = new Scanner (System.in);
        System.out.print ("How old are you?");
        int x = y.nextInt ();

        System.out.print (x);
    }
}
