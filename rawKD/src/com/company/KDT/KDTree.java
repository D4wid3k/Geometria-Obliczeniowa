package com.company.KDT;
import java.security.cert.PolicyNode;
import java.util.ArrayList;

public class KDTree {
    public static KDNode root = new KDNode();

    public static void createKDT(ArrayList<Point2D> pointList){
        int i = 1;
        for(Point2D point : pointList){
            root = insertKDT(point, root, i);
        }
    }
    public static Point2D findTheNearest(Point2D dest){
        int i = 1;
        KDNode res = findTheNearestNeighbor(dest, root, null, i);
        return res.point;
    }
    private static KDNode insertKDT(Point2D p, KDNode node, int i){
        if(node == null){
            node = new KDNode();
            node.point = p;
        }else if(i==0){
            if(p.x < node.point.x){
                node.left = insertKDT(p, node.left, (i + 1) % 2);
            } else{
                node.right = insertKDT(p, node.right, (i + 1) % 2);
            }
        } else {
            if(p.y < node.point.y){
                node.left = insertKDT(p, node.left, (i + 1) % 2);
            }else {
                node.right = insertKDT(p, node.right, (i + 1) % 2);
            }
        }
        return node;
    }
    private static KDNode findTheNearestNeighbor(Point2D dest, KDNode root, KDNode best, int i){
        KDNode goodSide = new KDNode();
        KDNode badSide = new KDNode();
        if(root == null){
            return best;
        }
        if(best == null || root.distance(dest) < best.distance(dest)){
            best = root;
        }
        if(i == 0){
            if(dest.x < root.point.x){
                goodSide = root.left;
                badSide = root.right;
            }else{
                goodSide = root.right;
                badSide = root.left;
            }
        }
        else{
            if(dest.y < root.point.y){
                goodSide = root.left;
                badSide = root.right;
            } else{
                goodSide = root.right;
                badSide = root.left;
            }
        }
        best = findTheNearestNeighbor(dest, goodSide, best, (i+1)%2);
        if(isWorth(dest,badSide,best,i)){
            best = findTheNearestNeighbor(dest, goodSide, best, (i+1)%2);
        }
        return best;
    }
    private static boolean isWorth(Point2D dest, KDNode node, KDNode best, int i){
        if(node != null){
            if (i == 0){
                if (Math.abs(node.point.x - dest.x)<best.distance(dest)){
                    return true;
                }else{
                    return false;
                }
            }else{
                if (Math.abs(node.point.y - dest.y) < best.distance(dest)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        else return false;
    }
    public KDTree(){
        root = null;
    }
}