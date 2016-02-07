package org.swing.slider;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class SliderFrame extends JFrame{

    public SliderFrame(){

        //切换观感
        String plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
//         String plaf = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Slider Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new SliderPanel());
        pack();
    }
}
