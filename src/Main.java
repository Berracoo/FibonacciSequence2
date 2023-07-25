import java.util.Scanner;

public class Main {
    public static int  f(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return f(number -1) + f(number -2);
    }
    public static void main(String[] args) {
        // n means the times that we are going to run the sequence
      int n;
      Scanner input = new Scanner(System.in);
        System.out.print("How many times would you like to run your fibonacci sequence ?");
        n = input.nextInt();
        // to avoid getting negative number from the user
        while (n <= 0) {
            System.out.println("Please be sure the number is bigger than 0 !" + "\n" +
                    "Enter the new number :");
            n = input.nextInt();

        }


        System.out.print("Fibonacci sequence result for the desired times is : " + f(n));
    }
}
