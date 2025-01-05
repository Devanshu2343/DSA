public class RomanToInteger {
    
    public static int romanToInt(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int current = romanValue(currentChar);
            
            if (i + 1 < s.length()) {
                int next = romanValue(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        
        return result;
    }

    private static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String roman1 = "III";
        String roman2 = "IV";
        String roman3 = "IX";
        String roman4 = "LVIII";
        String roman5 = "MCMXCIV";
        
        System.out.println(roman1 + " -> " + romanToInt(roman1));
        System.out.println(roman2 + " -> " + romanToInt(roman2));
        System.out.println(roman3 + " -> " + romanToInt(roman3));
        System.out.println(roman4 + " -> " + romanToInt(roman4));
        System.out.println(roman5 + " -> " + romanToInt(roman5));
    }
}
