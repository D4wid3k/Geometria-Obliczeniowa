import javax.swing.*;
import java.awt.*;

import com.company.*;
import com.company.Point;
import com.company.Polygon;

public class MainWind {
    private JPanel mainPanel;

    MainWind(){

    }

    public static void main(String[] args){
        /*JFrame mainFrame = new JFrame("GUI");
        mainFrame.setContentPane(new MainWind().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setPreferredSize(new Dimension(300, 300));


        Point p1 = new Point(50, 50);
        Point p2 = new Point(250, 250);

        Drawing draw = new Drawing(p1,p2);

        mainFrame.pack();
        mainFrame.setVisible(true);*/
        Drawing d = new Drawing();
        d.setVisible(true);
        Triangle.pointInT();
        Polygon.isInP();
        Line.circleLine();
    }
}
