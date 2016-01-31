package com.net.sizedFrame;

import java.awt.*;
import java.io.IOException;

/**
 * Created by daidaijie on 2016/1/31.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SizedFrame frame = new SizedFrame();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
