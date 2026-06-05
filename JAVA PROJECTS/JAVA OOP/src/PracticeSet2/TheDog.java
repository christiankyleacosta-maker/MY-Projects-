package PracticeSet2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheDog {
	/* Trying to be efficient using array and exploring some ways to shorten the codes/Syntax */
	public static String[]name = new String [2];
	public static String[]breed = new String [2];
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Basic Dog Data Collector");
			System.out.println("========================");
			System.out.println("Enter the following needs");
			
			for(int i = 0; i<2; i++) {
				System.out.print("Enter Name: ");
				String PlaceHolderName = reader.readLine().trim();
				name[i] = PlaceHolderName;
				
				System.out.println("======================");
				
				System.out.print("Enter Breed: ");
				String PlaceHolderBreed = reader.readLine().trim();
				breed[i] = PlaceHolderBreed;
				
				if(i == 0) {
					Dog dog1 = new Dog(name[i], breed[i]);
					System.out.println("Data of Dog 1:");
					Dog.Output();
				}
				if(i == 1) {
					Dog dog2 = new Dog(name[i], breed[i]);
					System.out.println("Data of Dog 2:");
					Dog.Output();
				}
				
			}
			
			
		}catch(NumberFormatException e) {
			System.out.println("invalid number input please run the program again.");
		}catch(IOException e) {
			System.out.println("An I/O error occured! run the program again.");
		}
		

	}

}
