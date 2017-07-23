import java.util.Scanner;

/**
 * Created by onur on 23.07.2017.
 */
public class Gcd {
    public static void main(String[] args) {
        System.out.printf("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int gcd = 1;

        if ((number1 > number2 && number1 % number2 == 0) || (number2 > number1 && number2 % number1 == 0) || number1 == number2) {
            System.out.println("Greatest common divisor: " + (number1 > number2 ? number2 : number1));
        } else{
            for (int i = 1; i <= (number1 > number2 ? number2 : number1) / 2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("Greatest common divisor: " + gcd);
        }
    }
}
