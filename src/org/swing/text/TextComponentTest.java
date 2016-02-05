package org.swing.text;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class TextComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextComponentFrame();
            }
        });
    }
}
