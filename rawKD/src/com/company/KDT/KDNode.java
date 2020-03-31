package com.company.KDT;

public class KDNode {
    Point2D point;
    KDNode left;
    KDNode right;

    public double distance(Point2D dest){
        return Math.sqrt((dest.x-this.point.x)*(dest.x-this.point.x) + (dest.y-this.point.y)*(dest.y-this.point.y));
    }

    KDNode(){

    }
}
