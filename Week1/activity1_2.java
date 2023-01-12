/*  Write a Java program that will ask for your age and print it.
 * 
 */
package Week1;
import java.util.Scanner;

public class activity1_2 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("How old are you?  ");
        int x = sc.nextInt();

        System.out.print (x);

    }
}
