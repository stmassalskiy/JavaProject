import java.io.IOException;
import java.util.Scanner;
// Реализация консольного калькулятора через класс Scanner
public class Calc {
    public static void main(String[] args) throws IOException {
        double result;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Просто калькулятор");
        System.out.println();
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите операцию: ");
        operation = (char) System.in.read();

        switch(operation){
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;

        }

    }
}
