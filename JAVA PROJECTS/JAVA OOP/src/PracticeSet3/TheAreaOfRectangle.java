package PracticeSet3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TheAreaOfRectangle {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("rectangle Area Computation");
			System.out.println("==========================");
			System.out.println("Enter the following needs");
			System.out.print("Enter rectangle length: ");
			String PlaceHolderLength = reader.readLine().trim();
			double heigth = Double.parseDouble(PlaceHolderLength);
			
			System.out.print("Enter rectangle width: ");
			String PlaceHolderWidth = reader.readLine().trim();
			double width = Double.parseDouble(PlaceHolderWidth);
			
			Rectangle TherecTangle = new Rectangle(heigth, width);
			System.out.println("");
			System.out.println("=====================================================");
			System.out.println("The Result of the analysis");
			System.out.printf("Area: %.3f%n", TherecTangle.CalculateArea());
			System.out.printf("Parameter: %.3f%n", TherecTangle.CalculateParameter());
			
		}catch(NumberFormatException e) {
			System.out.println("Invalid NUmber Input please run the program again.");
		}catch(IOException e) {
			System.out.println("An I/O error has occured, please run the program again.");
		}

	}

}
