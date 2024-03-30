import java.util.Scanner;

public class fizz {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt(); 
        if (number % 5 == 0){
        if(number % 3 == 0)
        System.out.println("FizzBuzz");
        else System.out.println("Fizz");
        }
        else if (number % 3 == 0 )
        System.out.print("Buzz");
       else   System.out.println( "The number is not a FizzBuzz" + "\n Number : " + number );
    }
}