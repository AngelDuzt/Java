package MireaJava.SecondMetod.Pract7Ex4;

import java.util.LinkedList;

public class Alkash {
    LinkedList<Integer> firstPlayer, secondPlayer;

    public Alkash(String fp, String sp) {
        this.firstPlayer = new LinkedList<>();
        this.secondPlayer = new LinkedList<>();
        for(int i = 0; i < 5; i ++){
            this.firstPlayer.add(Integer.parseInt(fp.substring(i, i+1)));
            this.secondPlayer.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }


    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());

            }else{
                secondPlayer.add(firstPlayer.remove());
                secondPlayer.add(secondPlayer.remove());
            }
            count++;
        }
        String res = "";
        if(firstPlayer.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Alkash("13579", "24680").play());
    }
}
