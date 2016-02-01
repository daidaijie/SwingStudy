package cn.event.action;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ActionTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrame();
            }
        });
    }
}
