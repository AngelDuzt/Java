package MireaJava.SecondMetod.Pract15.Ex2;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.*;

public class Editor extends BasicComboBoxEditor {
    private final JPanel panel = new JPanel();
    private final JLabel labelItem = new JLabel();
    private String selectedValue;

    public Editor() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 5, 2, 2);

        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setForeground(Color.WHITE);

        panel.add(labelItem, constraints);
        panel.setBackground(Color.BLUE);
    }

    public Component getEditorComponent() {
        return this.panel;
    }

    public Object getItem() {
        return this.selectedValue;
    }

    public void setItem(Object item) {
        if (item == null) {
            return;
        }
        String[] countryItem = (String[]) item;
        selectedValue = countryItem[0];
        labelItem.setText(selectedValue);
        labelItem.setIcon(new ImageIcon(countryItem[1]));
    }
}
