package MireaJava.SecondMetod.Pract15.Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class App extends JFrame {
    public App() {
        super("Demo program for custom combobox");
        setLayout(new FlowLayout());

        CountryCB customCombobox = new CountryCB();
        customCombobox.setPreferredSize(new Dimension(120, 60));
        customCombobox.setEditable(true);
        String[][] countryList = {{"Россия", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\us.png"}, {"Китай", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\in.png"}, {"США", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\vn.png"}, {"Франция", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\de.png"}};
        customCombobox.addItems(countryList);
        JTextArea infoArea = new JTextArea();
        customCombobox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedItem = ((String[]) e.getItem())[0];
                switch (selectedItem) {
                    case "Россия":
                        infoArea.setText("Столица Москва");
                        break;
                    case "Китай":
                        infoArea.setText("Столица Пекин");
                        break;
                    case "США":
                        infoArea.setText("Столица Вашингтон");
                        break;
                    case "Франция":
                        infoArea.setText("Столица Париж");
                        break;
                    }
            }
        });
        setSize(300, 200);
        add(customCombobox);
        add(infoArea);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }

}
