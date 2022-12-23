/*  Create a program that will check whether a number is positive or negative */
package Week3;
import java.util.Scanner;

public class activity1_1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int x, y=0;

        while (y<3){
            System.out.print ("Enter a number:  ");
            x = sc.nextInt();

            if (x>0){
                System.out.println ("Positive number");
            }
            else if (x<0){
                System.out.println ("Negative number");
            }
            else {
                System.out.println ("The number is zero");
            }

            y++;
        }
    }
}