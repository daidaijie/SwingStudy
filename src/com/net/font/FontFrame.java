package com.net.font;

import com.net.draw.DrawComponent;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class FontFrame extends JFrame{

    public FontFrame() {

        setTitle("FontTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        add(new JButton("030"));
        add(new FontComponent());
//        add(new DrawComponent());
        pack();


    }
}
