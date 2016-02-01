package com.net.font;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class FontComponent extends JComponent {

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        String message = "Hello World!";
        System.out.println("message = " + message);
        
        //使用36号加粗字体Serif
        Font f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);


        //得到字体属性的描述对象
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        //设置x和y
        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //获取上波度和基线
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        //绘制字符串
        g2.drawString(message, (int) x, (int) baseY);

        //绘制基线
        g2.setPaint(Color.LIGHT_GRAY);
        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        //绘制闭合矩形
        Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
