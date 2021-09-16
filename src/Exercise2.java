import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");

        double number = input.nextDouble();
        double result = squareRoot(number);
        System.out.println("Square root of " + number + " is " + result);

    }

    public static double squareRoot(double a)
    {
        //Initialize 'x' with the guess
        double x = a/2;

        //Keep track of the previous 'x'
        //Initialized with a value, that let us passed through loop for the fist time
        double prevX = (-1);

        //Iterate as long as difference is too large
        while (Math.abs(prevX - x ) > 0.0001)
        {
            //Keep track on previous 'x'
            prevX = x;

            //Calculate new 'x' on basis of 'x'
            x =(x + a/x) / 2;
        }

        //Return the approximate square root
        return x;
    }
}
