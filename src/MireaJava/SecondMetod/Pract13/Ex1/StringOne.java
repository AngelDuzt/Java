package MireaJava.SecondMetod.Pract13.Ex1;

public class StringOne {

    public void Taken(String x){
        System.out.println("Take it");
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        StringOne obj = new StringOne();
        obj.Taken(str);
        System.out.println(str.charAt(str.length()-1));
        if(str.endsWith("!!!")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(str.startsWith("!!!")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(str.contains("Java")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7, 11));
    }
}
