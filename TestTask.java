import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (например: 1 + 5): ");
        String equation = scanner.nextLine();
        scanner.close();
        String[] equationmassive = equation.split(" ");
        if (equationmassive.length != 3) {
            throw new Exception("Неправильный формат ввода.");
        }
        int number1, number2;
        number1 = Integer.parseInt(equationmassive[0]);
        number2 = Integer.parseInt(equationmassive[2]);
        if (number1 < 1 || number1 > 10 || number2 < 1 || number2 > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }
        String action = equationmassive[1];
        int result = 0;
        switch (action) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
            default:
                throw new Exception("Неизвестный оператор (используйте: +,-,*,/)");
        }
        System.out.println("Ответ: " +result);
    }
}
