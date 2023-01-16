/*  Write a Java program that will ask for your birthday and print it
 * 
 */
import java.util.Scanner;
public class activity1_1 {
    public static void main (String [] args){
        Scanner y = new Scanner (System.in);
        System.out.println ("When is your birthday? ");
        String x = y.nextLine ();
        System.out.println (x);
    }
}
