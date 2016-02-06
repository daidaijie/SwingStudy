package org.swing.comboBox;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class ComboTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ComboBoxFrame();
            }
        });
    }
}
