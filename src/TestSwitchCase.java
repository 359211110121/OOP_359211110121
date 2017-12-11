package ooplab3;

import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.print("Your entered 1 .");
                break;
            case 2:
                System.out.print("Your entered 2 .");
                break;
            case 3:
                System.out.print("Your entered 3 .");
                break;
            default:
                System.out.print("Please enter number 1-3.");
        }//switch
    }
}