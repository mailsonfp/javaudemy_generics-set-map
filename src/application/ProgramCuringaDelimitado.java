package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class ProgramCuringaDelimitado {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(5);
		ls.add(1);
		ls.add(10);
		
		System.out.println(ls);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
