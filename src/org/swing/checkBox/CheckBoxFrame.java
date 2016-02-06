package org.swing.checkBox;

import org.swing.calculator.CalculatorFrame;
import org.swing.calculator.CalculatorPanel;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class CheckBoxFrame extends JFrame {
    public CheckBoxFrame() {

        //切换观感
        String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        //
        // String plaf = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("CheckBoxTest");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new CheckBoxPanel());
        pack();

    }
}
