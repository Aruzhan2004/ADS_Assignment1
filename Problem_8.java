public class Problem_8 {
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        } else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) {
                return isAllDigits(s.substring(1));
            } else {
                return false;
            }
        }
    }
}
