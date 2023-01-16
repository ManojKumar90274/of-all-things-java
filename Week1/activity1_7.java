/*  Write a Java program that will ask for your favorite movie and print it
 * 
 */

import java.util.Scanner;
public class activity1_7 {
    public static void main (String []args){
        Scanner y = new Scanner (System.in);
        System.out.print("What is your favorite movie?:  ");
        String x = y.nextLine();
        System.out.println (x);
    }
    
}
