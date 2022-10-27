import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        // write your code here to print the appropriate message(s)
        // described below
        String str = "";
        if(num <= 0) {
            System.out.println("That's not positive!");
        } else {
            if (num % 2 != 0) {
                if(num % 5 == 0) {
                    str = "Divisible by 5!";
                }
                if(num % 7 == 0){
                    str = "Divisible by 7!";
                }
                if (num % 7 == 0 && num % 5 == 0) {
                    str ="Divisible by 5!\nDivisible by 7!";
                }
                if (num % 7 !=0 && num % 5 !=0) {
                    str = "Not divisible by 5 or 7!";
                }
                System.out.println(str);
            } else {
                if (num > 1000) {
                    System.out.println("Big even number!");
                } else if (num > 100) {
                    System.out.println("Medium even number!");
                } else {
                    System.out.println("Small even number!");
                }
            }
        }
    }
}
