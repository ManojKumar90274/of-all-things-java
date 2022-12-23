/* Create a program deterimine the grade based on score obtained by student. 
 * Score is read by keyboard. Grade is calculated as per conditions:
 *      SCORE               GRADE
 *      90-100               A
 *      80-89                B
 *      70-79                C
 *      50-69                D
 *      0-49                 F
 */

package Week3;
import java.util.Scanner;

public class activity1_3 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int x, y=0;

        while (y<2){
            System.out.println ("Enter your numeric test score");
            x=sc.nextInt();

            if (x>=90){
                System.out.println ("A");
            }
            else if (x >= 80){
                System.out.println ("B");
            }
            else if (x>=70){
                System.out.println ("C");
            }
            else if (x>=50){
                System.out.println ("D");
            }
            else if (x>=0){
                System.out.println ("E");
            }
        
        y++;
        }
    }
}
