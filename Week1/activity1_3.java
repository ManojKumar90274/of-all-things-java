/*  Write a Java program that will ask for your address and print it.
 * 
 */

import java.util.Scanner;
public class activity1_3 {
    public static void main (String []args){
        Scanner y = new Scanner (System.in);
        System.out.print ("What is your address?");
        String x = y.nextLine();
        System.out.println (x);
    }
    
}
