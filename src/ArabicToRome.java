import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class ArabicToRome {
    private String resultInRomeNum = "";

    public ArabicToRome(int inputNum) {

        int numRomeC;
        int numRomeL;
        int numRomeX;

        if (inputNum >= 1) {
            numRomeC = inputNum / 100;
            inputNum = inputNum % 100;
            for (int i = 0; i < numRomeC; i++) {
                resultInRomeNum += "C";
            }

            numRomeL = inputNum / 50;
            inputNum = inputNum % 50;
            for (int i = 0; i < numRomeL; i++) {
                resultInRomeNum += "L";
            }

            numRomeX = inputNum / 10;
            inputNum = inputNum % 10;
            for (int i = 0; i < numRomeX; i++) {
                resultInRomeNum += "X";
            }

            Map<Integer,String> arabicToRomeDict = new HashMap<>();

            arabicToRomeDict.put(1, "I");
            arabicToRomeDict.put(2, "II");
            arabicToRomeDict.put(3, "III");
            arabicToRomeDict.put(4, "IV");
            arabicToRomeDict.put(5, "V");
            arabicToRomeDict.put(6, "VI");
            arabicToRomeDict.put(7, "VII");
            arabicToRomeDict.put(8, "VIII");
            arabicToRomeDict.put(9, "IX");

            String divisionRemainder = arabicToRomeDict.get(inputNum);
            if (divisionRemainder != null) {
                resultInRomeNum += divisionRemainder;
            }

        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Исключение: ответ в римских числах не может быть меньше единицы");
                resultInRomeNum = "нет ответа";
            }
        }
    }

    public String getResultInRomeNum() {
        return resultInRomeNum;
    }
}