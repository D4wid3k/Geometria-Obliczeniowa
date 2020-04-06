package com.company.geoModels;

import java.util.ArrayList;
import java.util.Random;

public class Triangle {
    Point p1, p2, p3;
    Triangle(){

    }
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public static double triangleSurfaceArea(Triangle T){
        double tSA = 0.5 * Math.abs((T.p2.x - T.p1.x) * (T.p3.y - T.p1.y) - (T.p3.x - T.p1.x) * (T.p2.y - T.p1.y));
        //System.out.println("Pole powierzchni podanego trojkata to "+tSA);
        return tSA;
    }
    public static void pointInT(){
        Random gen = new Random();
        Point pT1 = new Point(gen.nextInt(300),gen.nextInt(300));
        Point pT2 = new Point(gen.nextInt(300),gen.nextInt(300));
        Point pT3 = new Point(gen.nextInt(300),gen.nextInt(300));
        Triangle T = new Triangle(pT1,pT2,pT3);
        Point pRan = new Point(gen.nextInt(300),gen.nextInt(300));

        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println("Wygenerowany trojkat:");
        System.out.println("p1 = ("+pT1.x+","+pT1.y+")");
        System.out.println("p2 = ("+pT2.x+","+pT2.y+")");
        System.out.println("p3 = ("+pT3.x+","+pT3.y+")");
        System.out.println();
        System.out.println("Wygenerowany punkt:");
        System.out.println("pRan = ("+pRan.x+","+pRan.y+")");

        Triangle T1 = new Triangle(pRan,pT2,pT3);
        Triangle T2 = new Triangle(pRan,pT1,pT2);
        Triangle T3 = new Triangle(pRan,pT1,pT3);

        double tsMain = Triangle.triangleSurfaceArea(T);
        double ts1 = Triangle.triangleSurfaceArea(T1);
        double ts2 = Triangle.triangleSurfaceArea(T2);
        double ts3 = Triangle.triangleSurfaceArea(T3);

        System.out.println();

        if (tsMain == ts1+ts2+ts3)
            System.out.println("Wygenerowany punkt pRan lezy w trojkacie.");
        else
            System.out.println("Wygenerowany punkt pRan nie lezy w trojkacie.");

    }
}
