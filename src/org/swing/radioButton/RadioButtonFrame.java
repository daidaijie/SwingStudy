package org.swing.radioButton;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class RadioButtonFrame extends JFrame{

    public RadioButtonFrame(){

        //切换观感
        String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
//         String plaf = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Radio button test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new RadioButtonPanel());
        pack();

    }
}
