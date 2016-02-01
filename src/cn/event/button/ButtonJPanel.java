package cn.event.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ButtonJPanel extends JPanel {

    public ButtonJPanel() {
        //切换观感
        String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton redButton = new JButton("RED");
        JButton blueButton = new JButton("Blue");
        JButton greenButton = new JButton("Green");

        add(redButton);
        add(blueButton);
        add(greenButton);

        redButton.addActionListener(new ColorAction(Color.RED));
        greenButton.addActionListener(new ColorAction(Color.GREEN));
        blueButton.addActionListener(new ColorAction(Color.BLUE));

    }

    private class ColorAction implements ActionListener {

        private Color bgColor;

        public ColorAction(Color c) {
            bgColor = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ButtonJPanel.this.setBackground(bgColor);
        }
    }

}
