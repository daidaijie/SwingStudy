package org.swing.text;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class TextComponentFrame extends JFrame {

    public TextComponentFrame() {

        //切换观感
        //String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        String plaf = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Text Component");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new TextComponentPanel());
        pack();
    }
}
