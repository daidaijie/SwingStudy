package org.swing.radioButton;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class RadioButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButtonFrame();
            }
        });
    }
}
