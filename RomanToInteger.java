import java.util.HashMap;

public class RomanToInteger {

    // 13. RomanToInteger
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0, currentValue, prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "IIX";

        int result = romanToInt(s);

        System.out.println(result);
    }

}
