package com.company;

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
}
