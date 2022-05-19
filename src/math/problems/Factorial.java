package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int givenNumber = 5;
        int factorial = 1;
        for (int i = 1; i <= givenNumber; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of " + givenNumber + " is =" + factorial);
        System.out.println("Factorial of the given number is: " + findfactorial(5));
    }


    static int findfactorial ( int n){
        if(n==0)
            return 1;
        else
            return(n * findfactorial(n-1));
    }
}
