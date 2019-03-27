package app;

import controller.PointController;
import data.Point;

public class PointApplication {

    private static final int ADD_X = 0;
    private static final int ADD_Y = 1;
    private static final int MINUS_X = 2;
    private static final int MINUS_Y = 3;

    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        PointController pc = new PointController();
        System.out.println("Punkt przed zmianą: (" +p1.getX()+","+p1.getY()+")");

        int option = ADD_X;

        switch(option){
            case ADD_X:
                pc.addX(p1);
                break;
            case ADD_Y:
                pc.addY(p1);
                break;
            case MINUS_X:
                pc.minusX(p1);
                break;
            case MINUS_Y:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Punkt po zmianie: ("+p1.getX()+","+p1.getY()+")");
    }
}
