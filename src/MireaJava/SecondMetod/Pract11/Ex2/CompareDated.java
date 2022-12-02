package MireaJava.SecondMetod.Pract11.Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDated{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date da_te = sdf.parse(date);
        Date CurrentDate = new Date();
        if(da_te.after(CurrentDate)){
            System.out.println("After current date");
        }
        else{
            System.out.println("Before current date");
        }
    }
}
