import java.util.Scanner;

public class tree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //get the integer for factoring
        long userInt = -1;
        do {
            System.out.print("\nPlease give a positive integer: ");
            String userAnswer = in.nextLine().trim();
            userInt = Long.parseLong(userAnswer);
        } while (userInt <= 0);

        System.out.println("\nFactors of " + userInt + ":");

        if (userInt == 1){
            System.out.print(userInt);
        }

        //loop through factors
        for (long i = 2; i*i <= userInt; i++) {

            //use mod to check if wholly divisible w/o remainder
            while (userInt % i == 0){
                userInt = userInt / i;
                System.out.print(i);
                if (userInt != 1){
                    System.out.print(" * ");
                }
            }
        }
        if (userInt != 1){
            System.out.print(userInt);
        }
        System.out.println("\n");
    }
    
}
