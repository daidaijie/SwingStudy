package com.net.notHelloWorld;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class NotHelloWorldFrame extends JFrame {

    public NotHelloWorldFrame() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");

        add(new NotHelloWorldComponent());
        pack();

    }

}
