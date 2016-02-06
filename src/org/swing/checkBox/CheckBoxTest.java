package org.swing.checkBox;

import javax.swing.*;
import java.awt.*;

/**
 * Created by daidaijie on 2016/2/5.
 */
public class CheckBoxTest {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxFrame();
            }
        });
    }
}
