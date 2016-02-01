package com.net.image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ImageJFrame extends JFrame{

    public ImageJFrame() throws HeadlessException {

        setTitle("ImageTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(new ImageComponent());
        pack();

    }
}
