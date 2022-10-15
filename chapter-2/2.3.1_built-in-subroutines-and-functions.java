/** Sample program that performs some mathematical tasks and reports the time that it takes for the program to run.
 * 
 * This program performs some mathematical computations and displays the results. It also displays the value of the constant Math.PI. It then reports the number of seconds that the computer spent on this task
 */

class computation {
    public static void main (String[]args){
        
        // declaring variables, starting, running, & ending time of programs, all in nanoseconds
        long start, end, run;
        double difference; // time difference

        start = System.nanoTime();

        // the mathematical computation, right triangle
        double chypothenuse, badjacent, aopposite; 
        badjacent = 42.0;
        aopposite = 17.0;
        chypothenuse = Math.sqrt(badjacent*badjacent+aopposite*aopposite);

        System.out.print ("\n\nA triangle right triangle with a side of 42 and 17 has hypothenuse ");
        System.out.println(chypothenuse);

        System.out.println("\n\nMathematically, sin (x) * sin (x) + " + "cos (x) * cos (x) - 1 should be 0.");
        System.out.println ("Let's check this for x = 100");
        System.out.print ("sin (100) * sin (100) + cos (100) * cos (100) - 1 is: ");
        System.out.println(Math.sin(100)*Math.sin(100)+Math.cos(100)*Math.cos(100)-1);
        System.out.println("(There can be round-off errors when"+"computing with real numbers!)");
        
        System.out.print("\nHere is a random number:  ");
        System.out.println(Math.random());

        System.out.print("\nHere is a random number:  ");
        System.out.println(Math.random());

        System.out.print("\nThe value of Math.PI is");
        System.out.println(Math.PI);

        end = System.nanoTime();
        run = end-start;
        difference =  run/ 1000000000.0;

        System.out.print("\nRun time in nanoseconds was:  ");
        System.out.println(run);
        System.out.print("This is probably not perfectly accurate");
        System.out.print("\nRun time in seconds was:  ");
        System.out.println(difference + "\n\n");
    }
}