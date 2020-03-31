package com.company;

import com.company.KDT.KDTree;
import com.company.KDT.Point2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.KDT.KDTree.createKDT;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        ArrayList<Point2D> list = new ArrayList<Point2D>();

        Point2D point1 = new Point2D(45, 45);
        Point2D point2 = new Point2D(1, 3);
        /*Point2D point3 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point4 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point5 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point6 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point7 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point8 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point9 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
        Point2D point10 = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);*/
        list.add(point1);
        list.add(point2);
        /*list.add(point3);
        list.add(point4);
        list.add(point5);
        list.add(point6);
        list.add(point7);
        list.add(point8);
        list.add(point9);
        list.add(point10);*/

        /*for(int i = 0; i < 10; i++){
            Point2D point = new Point2D(generator.nextDouble()*100, generator.nextDouble()*100);
            list.add(point);
        }*/

        Point2D pointch = new Point2D(50, 50);
        Point2D pointn;
        KDTree.createKDT(list);
        //pointn = KDTree.findTheNearest(pointch);

        System.out.println(point2.x+" "+point2.y);





    }
}
