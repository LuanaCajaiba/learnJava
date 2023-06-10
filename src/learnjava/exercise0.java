package learnjava;

import java.util.Scanner;
public class exercise0 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your age\n" +
                "first year\n" +
                "second the month\n" +
                "third the day : ");
        int year = data.nextInt();
        int month = data.nextInt();
        int day = data.nextInt();

        int result = (day + month*30 + year*365);
        System.out.println("Your age is: " + result);
    }
}







