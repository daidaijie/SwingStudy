package org.swing.border;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class BorderFrame extends JFrame{

    public BorderFrame() {

        //切换观感
        String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
//        String plaf = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("BorderTest");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new BorderPanel());
        pack();

    }
}
