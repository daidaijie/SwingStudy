package com.net.draw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class DrawFrame extends JFrame{

    public DrawFrame() throws HeadlessException {

        setTitle("DrawTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        DrawComponent drawComponent = new DrawComponent();
        drawComponent.setBackground(SystemColor.window);

        add(drawComponent);
        pack();
    }
}
