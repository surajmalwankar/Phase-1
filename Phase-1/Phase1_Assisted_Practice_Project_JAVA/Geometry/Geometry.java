package geometry;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Triangle;

import java.util.ArrayList;

public class Geometry {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();

        try {
            shapes.add(new Circle(10.0));
            shapes.add(new Rectangle(8.0, 6.0));
            shapes.add(new Triangle(5.0, 8.0));

            for (Shape shape : shapes) {
                shape.displayArea();
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }

	}

}
