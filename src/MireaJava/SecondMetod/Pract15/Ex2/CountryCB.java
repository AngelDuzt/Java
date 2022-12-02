package MireaJava.SecondMetod.Pract15.Ex2;

import javax.swing.*;

public class CountryCB extends JComboBox {
    private DefaultComboBoxModel model;

    public CountryCB() {
        model = new DefaultComboBoxModel();
        setModel(model);
        setRenderer(new Render());
        setEditor(new Editor());
    }

    /**
     * Add an array items to this combo box.
     * Each item is an array of two String elements:
     * - first element is country name.
     * - second element is path of an image file for country flag.
     * @param items
     */
    public void addItems(String[][] items) {
        for (String[] anItem : items) {
            model.addElement(anItem);
        }
    }
}
