package cn.event.plaf;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlafFrame();
            }
        });
    }
}
