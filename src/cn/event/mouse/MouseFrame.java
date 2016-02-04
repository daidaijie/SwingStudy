package cn.event.mouse;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/3.
 */
public class MouseFrame extends JFrame {

    public MouseFrame() {
        setTitle("鼠标点击");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        add(new MouseComponent());
        pack();
    }

}
