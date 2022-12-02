package MireaJava.SecondMetod.Pract4Ex1;

import javax.swing.*;

public class MilanMadrid extends JFrame {

    protected int MilanScore = 0;
    protected int RealMadridScore = 0;
    protected JButton buttonMilan = new JButton("AC Milan");
    protected JButton buttonMadrid = new JButton("Real Madrid");

    protected JLabel result = new JLabel("Result: " + MilanScore + " X " + RealMadridScore);

    protected JLabel LastScorer = new JLabel("Last Scorer: ");

    protected JLabel Winner = new JLabel("Winner: DRAW");

    public MilanMadrid(){
        setLayout(null);  //GridLayout
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttonMilan.setBounds(100,350,150,50);
        buttonMadrid.setBounds(450, 350, 150,50);
        result.setBounds(100, 100, 200, 50);
        LastScorer.setBounds(100, 150, 200, 50);
        Winner.setBounds(100, 200, 200, 50);
        add(buttonMadrid);
        add(buttonMilan);
        add(result);
        add(LastScorer);
        add(Winner);
        setSize(700,500);

        buttonMilan.addActionListener(e -> {MilanScore++; MatchGoal("AC Milan");});

        buttonMadrid.addActionListener(e -> {RealMadridScore++; MatchGoal("Real Madrid");});
    }

    public void MatchGoal(String GoalClub){
        result.setText("Result: " + MilanScore + " X " + RealMadridScore);
        LastScorer.setText("Last Scorer: " + GoalClub);
        if(MilanScore == RealMadridScore){
            Winner.setText("Winner: DRAW");
        } else if (MilanScore > RealMadridScore) {
            Winner.setText("Winner: AC Milan");
        }
        else {
            Winner.setText("Winner: Real Madrid");
        }
    }


    public static void main(String[] args) {
        new MilanMadrid().setVisible(true);
    }
}
