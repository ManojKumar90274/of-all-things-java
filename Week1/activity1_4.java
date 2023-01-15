/*   Write a Java program that will ask for the name of your
 *   mother and print it.
 * 
 */

 package Week1;
 import java.util.Scanner;
 
 public class activity1_4 {
     public static void main (String []args){
         Scanner sc = new Scanner (System.in);

         System.out.print ("\n\nWhat is the name of your mother?  ");
 
         String x = sc.nextLine ();
         System.out.println (x);
 
     }    
 }
 