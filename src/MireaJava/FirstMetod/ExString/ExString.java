package MireaJava.FirstMetod.ExString;

public class ExString {
    public static void main(String[] args) {
        String[] mass = new String[10];
    }

    public static void Obratka(String[] array){
        for(int i = 0; i < array.length / 2; i++){
            String c = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = c;
        }
    }
}
