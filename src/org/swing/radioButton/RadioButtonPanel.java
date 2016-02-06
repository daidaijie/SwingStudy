package org.swing.radioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by daidaijie on 2016/2/6.
 */

/**
 * A panel with a sample text label and radio buttons for selecting font size
 */
public class RadioButtonPanel extends JPanel {

    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;

    private static final int DEFAULT_SIZE = 36;

    public RadioButtonPanel() {

        setLayout(new BorderLayout());

        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small",8);
        addRadioButton("Medium",12);
        addRadioButton("Large",18);
        addRadioButton("Extra large",36);

        add(buttonPanel,BorderLayout.SOUTH);


    }

    /**
     * Adds a radio button that sets the font size of the sample text.
     * @param name the string to appear on the button
     * @param size size the font size that this button sets
     */
    public void addRadioButton(String name, final int size) {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name,selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Serif",Font.PLAIN,size));
            }
        };

        button.addActionListener(listener);
    }


}
