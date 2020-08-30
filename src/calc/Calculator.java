package calc;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation;
        int result;
        System.out.println("Ответ: " + result);
    }

    public static int getInt() {
        System.out.print("Введите первое целое число: ");
        int num;
        if (scanner.hasNext()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое цисло!");
            num = getInt();
        }
        return num;
    }


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