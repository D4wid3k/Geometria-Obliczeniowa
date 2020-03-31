package com.company;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {

    Point p1, p2;

    public Drawing(){

    }

    public Drawing(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(p1.x,p1.y,p2.x,p2.y);
    }

    @Override
    public void repaint(){
        super.repaint();
    }

}
