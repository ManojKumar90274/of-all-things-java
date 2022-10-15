/** A simple program using some variables and assignment statements
 * This class implements a simple program that will compute the amount of interest that is earned on $17,000 invested at an interest rate of 0.027 for one year. The interest and the value of the investment after one year are printed to standard output.
 */

class interest {
    public static void main (String[]args){
        // declaring the variables

        double value, rate, interest, total;

        // arithmetic
        value = 17000;
        rate = 0.027;
        interest = value * rate; 
            // computing the interest
        total = interest+value;
            /**  computing the value of investment after one year, with interest
            * can also be:
                * principal = principal + interes;
                * which replaces the old value of principal
            */
        
        // output of the results
        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is $");
        System.out.println(total);

    }
}
