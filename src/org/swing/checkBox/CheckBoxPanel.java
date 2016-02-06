package org.swing.checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class CheckBoxPanel extends JPanel {

    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;

    public CheckBoxPanel() {

        setLayout(new BorderLayout());

        label = new JLabel("The quick brown fox jumps over the lazy dog");
        label.setFont(new Font("Serif", 0, 13));
        add(label, BorderLayout.CENTER);

        bold = new JCheckBox("Bold");
        italic = new JCheckBox("Italic");

        JPanel southPanel = new JPanel();

        ActionListener actionHandler = new ActionHandler();
        bold.addActionListener(actionHandler);
        italic.addActionListener(actionHandler);

        southPanel.add(bold);
        southPanel.add(italic);
        add(southPanel,BorderLayout.SOUTH);


    }

    private class ActionHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int mode = 0;
            if (bold.isSelected()) mode += Font.BOLD;
            if (italic.isSelected()) mode += Font.ITALIC;
            label.setFont(new Font("Serif", mode, 13));
        }
    }


}
