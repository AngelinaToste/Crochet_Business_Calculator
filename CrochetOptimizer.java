/* Angelina Toste
   Project Name: Crochet Optimizer
   Started: 11/07/2023
   Goals:
       - determine number of stitches required for a project
       - determine project duration
       - determine sizing of project and how this impacts duration
       - determine materials needed
       - determine cost approximation given particular hourly salary + average material cost. 
             (could also factor in cost per yard/ meter and use materials needed to approximate the cost)

   Additional idea to consider: could use this tool for pattern generation

   to handle different shapes and stitch calculation use class shapes and objects for different shapes that inherit 
   methods like stitch calculation and other methods that may be relevent to a particular shape. 
   - this will be similar to calculating surface area of  shapes given the parameters. 

   * it is important to keep in mind that the values calculated in this project are approximations and not exact/ precise values. 
*/

import java.util.Scanner;


class CrochetOptimizer
{
    // Parametrized Constructor

    // No-Arg Constructor

    public static int stitchPerMinute (int totalStitches, int minutes)
    { // calculates stitches able to complete in a minute given the current speed of the crocheter
      // used to calibrate the optimizer and improve accuracy of calculations 

        int spm;

        if (minutes == 0) // protects against undefined behavior of 0 division
        {
            spm = totalStitches / 1;
        }
        else
        {
            spm = totalStitches / minutes;
        }

        return spm;
     }


    public static int stitchCalc( String shape, int increaseSize)
    { //may consider overloading to add additional parameter for the magic circle size if the shape is a sphere
      // maybe could use chars to denote what type of shape it is instead of strings??
        return 0;
    }
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, \n Welcome to the Crochet Optimizer.\n To improve the accuracy of the optimizer, perform a calibration exercise to calculate your average stitches per minute.");
        System.out.print("Enter the number of stitches you completed: ");
        int totalStitches = keyboard.nextInt();
        System.out.print("Enter how many minutes it took to complete these stiches (to the nearest minute): ");
        int minutes = keyboard.nextInt();
        int stitchesPerMin = stitchPerMinute(totalStitches, minutes);
        System.out.println("On average you completed " + stitchesPerMin + " stitches in one minute.");
        System.out.println("Thank you.");
    }
}

class Sphere
{
    int radius; k// in number of rows of increases

    // Parametrized Constructor
    Sphere(int radius)
    {
         
    }

}

