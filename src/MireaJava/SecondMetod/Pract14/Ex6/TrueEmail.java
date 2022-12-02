package MireaJava.SecondMetod.Pract14.Ex6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrueEmail {
    public static void main(String[] args) {
        System.out.println(checkEmail("st.ivan6901@gmail.com"));
        System.out.println(checkEmail("~Stoka@gmail.com"));
    }


    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+").matcher(s);
        return m.find() && m.group().equals(s);
    }
}
