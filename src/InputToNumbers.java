import java.util.HashMap;
import java.util.Map;

public class InputToNumbers {
    private String input;
    private int num1;
    private int num2;
    private boolean isRomeNum;

    public InputToNumbers (String input) {
        this.input = input;

        String[] inputList = input.split(" ");

        Map<String,Integer> romeToArabicDict = new HashMap<>();
        romeToArabicDict.put("I",1);

        romeToArabicDict.put("II",2);
        romeToArabicDict.put("III",3);
        romeToArabicDict.put("IV",4);
        romeToArabicDict.put("V",5);
        romeToArabicDict.put("VI",6);
        romeToArabicDict.put("VII",7);
        romeToArabicDict.put("VIII",8);
        romeToArabicDict.put("IX",9);
        romeToArabicDict.put("X",10);

        if (romeToArabicDict.get(inputList[0]) != null && romeToArabicDict.get(inputList[2]) != null) {
            num1 = romeToArabicDict.get(inputList[0]);
            num2 = romeToArabicDict.get(inputList[2]);
            isRomeNum = true;
        } else {
            num1 = Integer.parseInt(inputList[0]);
            num2 = Integer.parseInt(inputList[2]);
            isRomeNum = false;
        }

    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }

    public boolean getIsRomeNum() {
        return isRomeNum;
    }
}
