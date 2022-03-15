package com.company;


import java.applet.Applet;
import java.awt.*;

public class HelloAgain extends Applet {
    Font font = new Font("TimesRoman", Font.BOLD,  35);

    public void paint(Graphics graphics){
        graphics.setFont(font);
        graphics.setColor(Color.blue);
        graphics.drawString("HElloeAgain!!!...",4,30);
    }


}
