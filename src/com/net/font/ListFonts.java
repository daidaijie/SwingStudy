package com.net.font;

import java.awt.*;

/**
 * Created by daidaijie on 2016/2/1.
 */
public class ListFonts {
    public static void main(String[] args) {
        listFonts();
    }

    public static void listFonts(){
        String[] fontsName = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String fontName:fontsName){
            System.out.println(fontName);
        }
    }
}
