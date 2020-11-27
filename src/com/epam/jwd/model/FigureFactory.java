package com.epam.jwd.model;

public class FigureFactory {
    public static Figure createFigure(Point... points){
        Figure figure = null;
        switch (points.length){
            case 2:
                figure = new Line(points);
                break;
            case 3:
                figure = new Triangle(points);
                break;
            case 4:
                figure = new Square(points);
                break;
            case 5:
            case 6:
                figure = new MultiAngleFigure(points);
                break;
            default:
                System.out.println("inappropriate amount of points");
                break;
        }
        return figure;
    }
}
