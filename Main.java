import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Hello in FizzBuzz game." + "\n" +
                "This program check numbers that divide by 3,5,15 beetwen Your first and second number." + "\n" +
                "Numbers must be integer." + "\n" + "\n"  );



        System.out.println("Enter the first number" + "\n" + "> ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number" + "\n" + "> ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("the first number is greater than the second - error");
        }

        for (int i = firstNumber; i <= secondNumber; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }

        }
    }
}