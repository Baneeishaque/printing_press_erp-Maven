package ndk.to_java_utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author praveen
 */
public class SearchableCombobox implements KeyListener{
    
    String item;
    JComboBox comboBox;
    int keyReleaseCount = 0;
        
    public SearchableCombobox(JComboBox cb)
    {
        comboBox = cb;
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {    
      
    }

    @Override
    public void keyPressed(KeyEvent ke) 
    {
        if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            {
                ((JTextField)comboBox.getEditor().getEditorComponent()).setText(item);
                comboBox.hidePopup();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) 
    {
        if(ke.getKeyCode() == KeyEvent.VK_DOWN && keyReleaseCount == 0)
        {
            keyReleaseCount++;
            comboBox.setSelectedIndex(0);
            ((JTextField)comboBox.getEditor().getEditorComponent()).setText(comboBox.getSelectedItem().toString());   
        }

        if(ke.getKeyCode() != KeyEvent.VK_ENTER)
        {
            comboBox.showPopup();
            String typedStr = ((JTextField)comboBox.getEditor().getEditorComponent()).getText();
            String testString = typedStr;

            for(int i = 0 ; i < comboBox.getItemCount() ; i++)
            {
                if(comboBox.getItemAt(i).toString().toLowerCase().contains(testString.toLowerCase()) == true)
                {
                    comboBox.setSelectedIndex(i);
                    ((JTextField)comboBox.getEditor().getEditorComponent()).setText(typedStr);   
                    item = comboBox.getItemAt(i).toString();
                }
            }
        }
    }
    
}
