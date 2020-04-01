package com.company;

import java.util.Random;

public class Line {
    Point head;
    Point tail;
    Line(){

    }
    public Line(Point head, Point tail){
        this.head = head;
        this.tail = tail;
    }
    public static double[] rownanieProstej(Line l, double tab[]){
        double a = ((l.head.y)-(l.tail.y)) / ((l.head.x) - (l.tail.x));
        double b = l.head.y - (a * l.head.x);
        System.out.println("y = "+a+"x + "+b);
        tab[0] = a;
        tab[1] = b;
        return tab;
    }
    public static void translacja(Line l, int a, int b){
        l.head.x += a;
        l.head.y += b;
        l.tail.x += a;
        l.tail.y += b;
    }
    /*public static void obrot(Point l, double rad){
        l.x = l.x * Math.cos(rad) - l.y * Math.sin(rad);
        l.y = l.y * Math.cos(rad) - l.x * Math.sin(rad);
        System.out.println(l.x + " " + l.y);
    }*/
    public static void whichSide(Line l, Point p3){
        double a = ((l.head.y) - (l.tail.y)) / ((l.head.x) - (l.tail.x));
        double b = l.head.y - (a * l.head.x);

        double wyn = a * p3.x + (-1) * p3.y + b;

        if (wyn < 0)
            System.out.println("Punkt lezy po lewej od prostej.");
        else if (wyn == 0)
            System.out.println("Punkt lezy na prostej.");
        else
            System.out.println("Punkt lezy po prawej od prostej.");
    }
    public static void crossingPointCramer(Line l1, Line l2) {
        double w, wx, wy, x, y;
        double A1 = ((l1.head.y) - (l1.tail.y)) / ((l1.head.x) - (l1.tail.x));
        double b1 = l1.head.y - (A1 * l1.head.x);
        double A2 = ((l2.head.y) - (l2.tail.y)) / ((l2.head.x) - (l2.tail.x));
        double b2 = l2.head.y - (A2 * l2.head.x);
        double B1;
        double C1 = 0;
        double B2;
        double C2 = 0;
        C1 = b1;
        C2 = b2;
        B1 = -1;
        B2 = -1;
        w = A1 * B2 - B1 * A2;
        wx = (-C1) * B2 - B1 * (-C2);
        wy = A1 * (-C2) - (-C1) * A2;
        x = wx / w;
        y = wy / w;

        System.out.println("Wspolrzedne punktu przeciecia to ("+x+","+y+").");
    }
    public static void circleLine(){
        System.out.println();
        System.out.println("Zadanie 4");

        Random gen = new Random();
        Point p1 = new Point(gen.nextInt(300),gen.nextInt(300));
        Point p2 = new Point(gen.nextInt(300),gen.nextInt(300));

        Point cenK = new Point(150,150);
        double r = 50;
        double a = p1.x*p1.x + p1.y*p1.y + p2.x*p2.x + p2.y*p2.y - 2*(p1.x*p2.x + p1.y*p2.y);
        double b = 2*(cenK.x*(p2.x-p1.x)+cenK.y*(p2.y-p1.y)+p1.x*p2.x+p1.y*p2.y-(p2.x*p2.x)-(p2.y*p2.y));
        double c = -(r*r) + p2.x*p2.x + p2.y*p2.y + cenK.x*cenK.x + cenK.y*cenK.y - 2*(cenK.x*p2.x + cenK.y*p2.y);

        double delta = b*b - 4*a*c;
        if(delta>0){
            double x1 = (-b - Math.sqrt(delta))/2*a;
            double x2 = (-b + Math.sqrt(delta))/2*a;

            double y1 = a*x1 + b;
            double y2 = a*x2 + b;

            System.out.println("Punkty przeciecia to: ("+x1+","+y1+") ("+x2+","+y2+")");
        }else if(delta == 0){
            double x = -b /2*a;
            double y = a*x + b;

            System.out.println("Punkty przeciecia to: ("+x+","+y+")");
        }else{
            System.out.println("Nie ma punktow przeciecia.");
        }
    }
}
