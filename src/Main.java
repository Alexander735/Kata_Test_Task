import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добрый день!\n" +
                "В этом калькуляторе можно складывать, вычитать, делить и умножать числа от 0 до 10\n" +
                "Можно использовать арабские либо римские числа (оба числа одного вида)\n" +
                "Калькулятор поддерживает только выражения, соответствующие шаблону: \n" +
                "[число][пробел][знак +-*/][пробел][число]\n" +
                "Пример: 8 + 5 или VIII + V\n" +
                "Для остановки работы калькулятора введите любое несоответствующее шаблону выражение или слово");

        do {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();

            InputCheck correctInputString = new InputCheck();
            correctInputString.checkInput(inputString);

            if (correctInputString.getIsInputCorrect()) {

                String operator = inputString.split(" ")[1];

                InputToNumbers dictionary = new InputToNumbers(inputString);

                Calculator calculator = new Calculator();
                calculator.calculate(dictionary.getNum1(), dictionary.getNum2(), operator);

                if (dictionary.getIsRomeNum()) {
                    ArabicToRome arabicToRome = new ArabicToRome(calculator.getAnswer());
                    System.out.println("Ваш ответ: " + arabicToRome.getResultInRomeNum());
                    System.out.println("________");

                } else {
                    System.out.println("Ваш ответ: " + calculator.getAnswer());
                    System.out.println("________");
                }
            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Исключение: выражение не соответствует шаблону");
                    break;
                }
            }

        } while (true);
        System.out.println("Окончание работы калькулятора...");
    }
}
