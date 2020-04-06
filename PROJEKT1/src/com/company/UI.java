package com.company;

import com.company.geoModels.Line;
import com.company.geoModels.Point;
import com.company.geoModels.Triangle;

import java.util.Scanner;

public class UI {
    public static void print(){
        System.out.println("Wybierz operacje: ");
        System.out.println("1. Obliczenie punktu przeciecia dwoch linii.");
        System.out.println("2. Wyznaczenie rownania funkcji przechodzacej przez dwa punkty.");
        System.out.println("3. Okreslenie polozenia punktu wzgledem linii.");
        System.out.println("4. Okreslenie połozenia punktu wzgledem trojkata");
        System.out.println("5. Obliczenie pola trojkata");
        System.out.println("6. Wyjdz");
    }

    public static void choose(){
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();

        switch(opt){
            case 1:
                opt1();
                break;
            case 2:
                opt2();
                break;
            case 3:
                opt3();
                break;
            case 4:
                opt4();
                break;
            case 5:
                opt5();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Wybierz liczbe z przedzialu od 1 do 6.");
        }
    }

    private static void opt5() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna x punktu pierwszego dla trojkata");
        double x1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego dla trojkata");
        double y1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego dla trojkata");
        double x2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego dla trojkata");
        double y2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu trzeciego dla trojkata");
        double x3 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu trzeciego dla trojkata");
        double y3 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Triangle T = new Triangle(p1,p2,p3);

        double wyn = Triangle.triangleSurfaceArea(T);
        System.out.println("Pole powierzchni podanego trojkata to "+wyn);
    }

    private static void opt4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna x punktu pierwszego dla trojkata");
        double x1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego dla trojkata");
        double y1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego dla trojkata");
        double x2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego dla trojkata");
        double y2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu trzeciego dla trojkata");
        double x3 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu trzeciego dla trojkata");
        double y3 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Triangle T = new Triangle(p1,p2,p3);

        System.out.println("Podaj wspolrzedna x punktu sprawdzanego");
        double x4 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu sprawdzanego");
        double y4 = scan.nextDouble();
        Point p4 = new Point(x4,y4);

        Triangle.pointInT(p4,T);
    }

    private static void opt3() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna x punktu pierwszego dla linii");
        double x1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego dla linii");
        double y1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego dla linii");
        double x2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego dla linii");
        double y2 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Line l1 = new Line(p1,p2);

        Line.rownanieProstej(l1);

        System.out.println("Podaj wspolrzedna x punktu do sprawdzenia");
        double x3 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu do sprawdzenia");
        double y3 = scan.nextDouble();
        Point p3 = new Point(x3,y3);

        Line.whichSide(l1, p3);
    }

    private static void opt2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna x punktu pierwszego");
        double x1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego");
        double y1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego");
        double x2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego");
        double y2 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Line l1 = new Line(p1,p2);

        Line.rownanieProstej(l1);
    }

    public static void opt1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna x punktu pierwszego dla linii 1");
        double x1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego dla linii 1");
        double y1 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego dla linii 1");
        double x2 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego dla linii 1");
        double y2 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Line l1 = new Line(p1,p2);

        System.out.println("Podaj wspolrzedna x punktu pierwszego dla linii 2");
        double x3 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu pierwszego dla linii 2");
        double y3 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna x punktu drugiego dla linii 2");
        double x4 = scan.nextDouble();
        System.out.println("Podaj wspolrzedna y punktu drugiego dla linii 2");
        double y4 = scan.nextDouble();
        Point p3 = new Point(x3,y3);
        Point p4 = new Point(x4,y4);
        Line l2 = new Line(p3,p4);

        Line.rownanieProstej(l1);
        Line.rownanieProstej(l2);

        Line.crossingPointCramer(l1,l2);
    }
}
