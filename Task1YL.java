import java.util.ArrayList;
import java.util.*;

class Task1YL{
    public static void main(String[] args){
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Scanner in = new Scanner(System.in);

        int centerX, centerY, radiusX, radiusY, radius;
        double side1, side2, side3;

        // adding an ellipse to the list
        System.out.println("Creating a Ellipse object");
        System.out.println("Please enter centerX for an Ellipse: ");
        centerX = in.nextInt();
        System.out.println("Please enter centerY for an Ellipse: ");
        centerY = in.nextInt();
        System.out.println("Please enter radiusX for an Ellipse: ");
        radiusX = in.nextInt();
        System.out.println("Please enter radiusY for an Ellipse: ");
        radiusY = in.nextInt();

        Ellipse e = new Ellipse(centerX, centerY, radiusX, radiusY);
        shapeList.add(e);

        // adding a circle to the list
        System.out.println("Creating a circle object");
        System.out.println("Please enter centerX for a Circle: ");
        centerX = in.nextInt();
        System.out.println("Please enter centerY for a Circle: ");
        centerY = in.nextInt();
        System.out.println("Please radius of a Circle:");
        radius = in.nextInt();

        Circle c = new Circle(centerX, centerY, radius);
        shapeList.add(c);

        // adding a triangle to the list
        System.out.println("Creating a triangle object");
        System.out.println("Please enter side1 for a Triangle: ");
        side1 = in.nextDouble();
        System.out.println("Please enter side2 for a Triangle: ");
        side2 = in.nextDouble();
        System.out.println("Please enter side3 for a Triangle:");
        side3 = in.nextDouble();

        Triangle t = new Triangle(side1, side2, side3);
        shapeList.add(t);
        // print out all the objects in the list
        for(int i = 0; i < shapeList.size(); ++i){
            System.out.println(shapeList.get(i));
        }
    }

}