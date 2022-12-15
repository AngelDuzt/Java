package MireaJava.SecondMetod.Pract16.Ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class PassW extends JFrame implements KeyListener {

    public PassW(String title) throws HeadlessException {
        super(title);
    }

    private final JTextField serviceField = new JTextField(30);
    private final JTextField userName = new JTextField(30);
    private final JTextField passwordField = new JTextField(30);
    private final String password = "mypassword";

    public void createPanelUI(Container container) {

        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        passwordField.addKeyListener(this);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 10, 5, 10);

        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;

        JLabel serviceLabel = new JLabel("Service:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(serviceLabel, constraints);

        JLabel usernameLabel = new JLabel("User Name:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(usernameLabel, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        container.add(passwordLabel, constraints);

        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 0;
        container.add(serviceField, constraints);

        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 1;
        container.add(userName, constraints);

        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 2;
        container.add(passwordField, constraints);

    }

    public static void main(String[] args) {
        PassW obj = new PassW("");
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.createPanelUI(obj.getContentPane());

        obj.pack();
        obj.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Objects.equals(passwordField.getText(), password)) {
                JOptionPane.showMessageDialog(null, "Right password", "Window", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password", "Window", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Objects.equals(passwordField.getText(), password)) {
                JOptionPane.showMessageDialog(null, "Right password", "Window", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password", "Window", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Objects.equals(passwordField.getText(), password)) {
                JOptionPane.showMessageDialog(null, "Right password", "Window", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password", "Window", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

