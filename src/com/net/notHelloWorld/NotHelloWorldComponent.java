package com.net.notHelloWorld;

import javax.swing.*;
import java.awt.*;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class NotHelloWorldComponent extends JComponent {

    private static final int MESSAGE_X = 75;
    private static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Not a Hello, World Program", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
