package PracticeSet4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Circle Area & Circumference Computing System.");
			System.out.println();
			System.out.print("Enter Circle Radius: ");
			String radius = reader.readLine().trim();
			double Radius = Double.parseDouble(radius);
			
			Circle circle = new Circle(Radius);
			
			System.out.println();
			System.out.println("Circle radius is: " + Radius);
			System.out.println();
			System.out.println("The Area of the circle is " + circle.getAreaa());
			System.out.println();
			System.out.println("The Circumference of the circle is " + circle.getCircumference());
			
		}catch(NumberFormatException e) {
			System.out.println("An I/O error occured.");
		}catch(IOException e) {
			System.out.println("Invalid I/O please run the program again");
		}

	}

}
