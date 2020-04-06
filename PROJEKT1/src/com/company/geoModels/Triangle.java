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
    public static void pointInT(Point pRan, Triangle T){
        Triangle T1 = new Triangle(pRan,T.p2,T.p3);
        Triangle T2 = new Triangle(pRan,T.p1,T.p2);
        Triangle T3 = new Triangle(pRan,T.p1,T.p3);

        double tsMain = Triangle.triangleSurfaceArea(T);
        double ts1 = Triangle.triangleSurfaceArea(T1);
        double ts2 = Triangle.triangleSurfaceArea(T2);
        double ts3 = Triangle.triangleSurfaceArea(T3);

        System.out.println();

        if (tsMain == ts1+ts2+ts3)
            System.out.println("Punkt lezy w trojkacie.");
        else
            System.out.println("Punkt nie lezy w trojkacie.");

    }
}
