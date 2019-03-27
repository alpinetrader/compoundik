/*
1.2.24 Continuously compounded interest. Write a program that calculates and
prints the amount of money you would have after t years if you invested P dollars
at an annual interest rate r (compounded continuously). The desired value is given
by the formula Pe rt.
*/


public class compoundik
{
    public static void main(String[] args)
    {
       int  t   = Integer.parseInt(args[0]);   // years
       double P = Double.parseDouble(args[1]);  // dollars
       double r = Double.parseDouble(args[2]);  // annual interest rate

//just for test


        System.out.println(P*Math.exp(r*t));
        System.out.println("Push test");
    }
}
