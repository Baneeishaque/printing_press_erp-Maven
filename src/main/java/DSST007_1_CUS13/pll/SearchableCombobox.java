package DSST007_1_CUS13.pll;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.text.JTextComponent;

public class SearchableCombobox implements KeyListener {

    String item;
    JComboBox comboBox;

    public SearchableCombobox(JComboBox cb) {
        comboBox = cb;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {

        if (ke.getKeyCode() != KeyEvent.VK_ENTER) {
            comboBox.showPopup();

            String typedStr = ((JTextComponent) comboBox.getEditor().getEditorComponent()).getText();
            String testString = typedStr;

            for (int i = 0; i < comboBox.getItemCount(); i++) {
                
                if (comboBox.getItemAt(i).toString().toLowerCase().contains(testString.toLowerCase()) == true) {
                
                    comboBox.setSelectedIndex(i);
                    ((JTextComponent) comboBox.getEditor().getEditorComponent()).setText(typedStr);
                    item = comboBox.getItemAt(i).toString();
                }
            }
        }

        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

            ((JTextComponent) comboBox.getEditor().getEditorComponent()).setText(item);
        }
    }
}