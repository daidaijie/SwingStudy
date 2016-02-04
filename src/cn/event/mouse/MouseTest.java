package cn.event.mouse;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/3.
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseFrame();
            }
        });
    }
}
