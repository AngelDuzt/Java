package MireaJava.SecondMetod.Pract16.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGame extends JFrame implements ActionListener {

    private final JPanel panel = new JPanel(new BorderLayout());
    private final JPanel panelButtons = new JPanel(new FlowLayout());
    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JTextField fieldBox = new JTextField(10);
    private final JButton button1 = new JButton("Try");
    private final JButton button2 = new JButton("Quit");
    private final JLabel comment = new JLabel("Guess it");
    private final int randomNumber;
    private int performs = 1;

    public GuessGame() {
        super("Guess Game");
        randomNumber = new Random().nextInt(20) + 1;
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(buildWindow());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private JComponent buildWindow() {
        panelButtons.add(button1);
        panelButtons.add(button2);
        panelBottom.add(panelButtons, BorderLayout.NORTH);
        panelBottom.add(comment, BorderLayout.SOUTH);
        panel.add(new JLabel("Guess a number from 1 to 20"), BorderLayout.NORTH);
        panel.add(fieldBox, BorderLayout.CENTER);
        panel.add(panelBottom, BorderLayout.SOUTH);
        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(button1)) {
            comment.setText(" ");
            compareResult();
            performs++;
        } else if (obj.equals(button2)) {
            System.exit(0);
        }
    }

    private void compareResult() {
        int userInput;
        userInput = Integer.parseInt(fieldBox.getText().trim());

        if (performs >= 3) {
            JOptionPane.showMessageDialog(null, "Game Over!!!",
                    "Random Number: " + randomNumber, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            return;
        }

        if (userInput == randomNumber) {
            JOptionPane.showMessageDialog(null, "CONGRATULATIONS! You got it!!",
                    "Random Number: " + randomNumber, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            return;
        }
        if (userInput > randomNumber) {
            comment.setText("Lower");
        }
        else {
            comment.setText("Higher");
        }
    }

    public static void main(String[] args) {
       // SwingUtilities.invokeLater(() -> {
            GuessGame guessGame = new GuessGame();
            guessGame.setSize(300, 150);
            guessGame.setVisible(true);
      //  });
    }
}
