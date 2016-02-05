package org.swing.text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class TextComponentPanel extends JPanel {

    private static final int TEXTAREA_ROW = 8;
    private static final int TEXTAREA_COLNUMS = 20;

    public TextComponentPanel() {

        setLayout(new BorderLayout());

        final JTextField textField = new JTextField();
        final JPasswordField passwordField = new JPasswordField();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(new JLabel("User name: ", SwingConstants.RIGHT));
        northPanel.add(textField);

        northPanel.add(new JLabel("Password:", SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel, BorderLayout.NORTH);

        final JTextArea textArea = new JTextArea(TEXTAREA_ROW, TEXTAREA_COLNUMS);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        //add button to append text into the text area

        JPanel southPanel = new JPanel();

        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("User name: " + textField.getText() + "Password: " +
                        new String(passwordField.getPassword()) + "\n");
            }
        });
        add(southPanel, BorderLayout.SOUTH);

    }

}
