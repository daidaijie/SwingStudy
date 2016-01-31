package com.net.sizedFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class SizedFrame extends JFrame {

    public SizedFrame() throws IOException {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        int screentWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(screentWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        Image img = ImageIO.read(this.getClass().getResource("daijie.png"));
        setIconImage(img);

        setTitle("SizedFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
