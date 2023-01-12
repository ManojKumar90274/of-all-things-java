/* Write a Java program that will ask for your birthday and print it */

package Week1;
import java.util.Scanner;

public class activity1_1 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("When is your birthday:  ");
        String x = sc.nextLine();
        System.out.println (x);

    }
}
