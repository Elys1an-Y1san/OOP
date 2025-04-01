public class WordTools {


    public static boolean isWord(String string){
        if (string == null || string.isEmpty()) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isLower(String string) {
        if (!isWord(string)) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLowerCase(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isUpper(String string, char letter) {
        if (!isWord(string)) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isUpperCase(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}