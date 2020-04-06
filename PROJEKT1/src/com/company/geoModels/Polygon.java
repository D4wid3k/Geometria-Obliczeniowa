package com.company.geoModels;

import java.util.ArrayList;
import java.util.Random;

public class Polygon {
    Point[] points;
    Polygon(){

    }
    public Polygon(Point[] points){
        this.points = points;
    }
    public static void polygonSurfaceArea(Polygon P){
        double sum = 0.0;
        for(int i = 0; i < P.points.length-1; i++) {
            sum += P.points[i].x * P.points[i + 1].y - P.points[i + 1].x * P.points[i].y;
        }
        sum += P.points[P.points.length - 1].x * P.points[0].y - P.points[0].x * P.points[P.points.length - 1].y;
        sum *= 0.5;
        System.out.println("Pole powierzchni danego wielokata to "+sum);
    }
    public static void isInP(){
        System.out.println();
        System.out.println("Zadanie 3");
        Random gen = new Random();
        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<Integer>();
        int quant = gen.nextInt(5);
        Point pRan = new Point(gen.nextInt(300),gen.nextInt(300));

        for(int i = 0; i < quant; i++){
            xList.add(gen.nextInt(300));
            yList.add(gen.nextInt(300));
        }

        for(int i = 0, j = quant-1; i < quant; j = i++){
            if((((yList.get(i)>pRan.y) != yList.get(j)>pRan.y)) && (pRan.x < (xList.get(j)-xList.get(i))*(pRan.y-yList.get(i)) / (yList.get(j)-yList.get(i)) + xList.get(i))) {
                System.out.println("Punkt lezy w wielokacie.");
                return;
            }
        }
        System.out.println("Punkt nie lezy w wielokacie");
    }
}
