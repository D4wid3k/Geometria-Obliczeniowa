package com.company;

import com.company.geoModels.Line;
import com.company.geoModels.Point;

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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Wybierz liczbe z przedzialu od 1 do 6.");
        }
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
