package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Drawing extends JFrame {

    Random gen = new Random();
    Point p1 = new Point(0, 250);
    Point p2 = new Point(250, 0);
    Point p3 = new Point(gen.nextInt()*300, gen.nextInt()*300);
    Line l1 = new Line(p1,p2);

    public Drawing(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("GUI");
        Line.whichSide(l1,p3);
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
        g2.setColor(Color.RED);
        g2.drawLine(20,20, 20,280);
        g2.drawLine(280,280, 20,280);
        g2.drawOval(gen.nextInt(300),gen.nextInt(300),4,4);
    }

    @Override
    public void repaint(){
        super.repaint();
    }

}
