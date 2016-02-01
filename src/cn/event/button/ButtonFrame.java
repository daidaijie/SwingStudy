package cn.event.button;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ButtonFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Button Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(new ButtonJPanel());
    }

}
