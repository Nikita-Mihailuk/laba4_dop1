import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение  вида x +-/* a = b:");
        String input = in.nextLine();

        char operator = ' ';
        double a = 0;
        double b = 0;
        boolean temp;

        for (int i = 0; i < input.length(); i++) {
            char n = input.charAt(i);
            if (n == '+' || n == '-' || n == '/' || n == '*') {
                operator = n;
            }
            else if (Character.isDigit(n)) {
                if (temp) {
                    a = Character.getNumericValue(n);
                    temp = false;
                }
                else {
                    b = Character.getNumericValue(n);
                }
            }
        }
        if (operator == '+') System.out.println("x = " + (b - a));
        else if (operator == '-') System.out.println("x = " + (b + a));
        else if (operator == '/') System.out.println("x = " + (b * a));
        else if (operator == '*') System.out.println("x = " + (b / a));
        else System.out.println("Неправильно введённое уравнение");

    }
}
