package org.swing.comboBox;

import org.swing.checkBox.CheckBoxPanel;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class ComboBoxFrame extends JFrame{

    public ComboBoxFrame(){
        setTitle("ComboBox Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new ComboBoxPanel());
        pack();
    }
}