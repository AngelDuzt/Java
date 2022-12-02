package MireaJava.SecondMetod.Pract14.Ex9;

public class ChastDict {
    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyz";
        buildDictionary(text);
    }

    private static void buildDictionary(String text) {
        text = text.toLowerCase();

        int[] english = new int['z' - 'a' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                english[ch - 'a']++;
            }
        }
        for (int i = 0; i < english.length; i++) {
            System.out.println((char) (i + 'a') + " = " + english[i]);
        }
    }
}
