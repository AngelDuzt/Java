package MireaJava.SecondMetod.Pract7Ex1;

import java.util.Stack;

public class Alkash {

    protected Stack<Integer> firstPlayer, secondPlayer;

    Alkash(String firstPlayer, String secondPlayer){
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for(int i = 0; i < 5; i ++){
            this.firstPlayer.add(Integer.parseInt(firstPlayer.substring(i, i+1)));
            this.secondPlayer.add(Integer.parseInt(secondPlayer.substring(i, i+1)));
        }
    }

    public void pushBack(Stack<Integer> stack, Integer temp){
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty())
            newStack.push(stack.pop());
        stack.push(temp);
        while (!newStack.isEmpty())
            stack.push(newStack.pop());
    }

    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }else{
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
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
