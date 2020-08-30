package calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        char operation;
        System.out.println("Ответ: " + operation);

        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();

        System.out.print("Введите действие из предложенных(+, -, * или /): ");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("Выбрали не то действие!");
        }

        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();

        switch () {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}