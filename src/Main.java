import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long inputNumber;

        try {
            System.out.print("Input number: ");
            inputNumber = in.nextLong();
            System.out.print("Number " + inputNumber + " is ");
            if(PolindromUtils.checkOnPolindrom(inputNumber)){
                System.out.println("polindrom");
            }
            else {
                System.out.println("not polindrom");
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input data");
        }

    }
}
