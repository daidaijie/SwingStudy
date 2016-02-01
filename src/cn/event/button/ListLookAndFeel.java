package cn.event.button;

import javax.swing.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ListLookAndFeel {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos) {
            String name = info.getName();
            System.out.println(name);
            System.out.println(info.getClassName());
        }
    }
}
