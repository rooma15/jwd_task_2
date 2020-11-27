package com.epam.jwd.app;

import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureFactory;
import com.epam.jwd.model.Point;


public class Main {
    public static void main(String[] args) {

        Point[] points = new Point[6];
        points[0] = new Point(1, 3);
        points[1] = new Point(3, 1);
        points[2] = new Point(3, 3);
        points[3] = new Point(1, 1);
        points[4] = new Point(4, 3);
        points[5] = new Point(8, 3);
        final Figure fiveAngle = FigureFactory.createFigure(
                points[0],
                points[1],
                points[2],
                points[3],
                points[4]
        );
        final Figure sixAngle = FigureFactory.createFigure(points);
        System.out.println(fiveAngle);
        System.out.println(sixAngle);
    }
}