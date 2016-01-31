package com.net.draw;

import java.awt.*;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawFrame();
            }
        });
    }
}
