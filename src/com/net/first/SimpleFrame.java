package com.net.first;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class SimpleFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        //setLocation(200,300);
        setLocationByPlatform(true);

        setVisible(true);
    }

}
