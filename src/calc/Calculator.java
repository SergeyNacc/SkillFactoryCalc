package calc;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = getFloat();
        float num2 = getFloat();
        char operation = getOperation();
        float result;
        System.out.println("Ответ: " + result);
    }

    public static float getFloat() {
        System.out.print("Введите первое число: ");
        float num;
        if (scanner.hasNext()) {
            num = scanner.nextFloat();
        } else {
            System.out.print("Вы ввели не число!");
            num = getFloat();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Введите действие из предложенных(+, -, * или /): ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("Выбрали не то действие!");
            operation = getOperation();
        }
        return operation;
    }





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