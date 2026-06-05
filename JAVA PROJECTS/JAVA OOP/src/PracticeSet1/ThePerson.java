package PracticeSet1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ThePerson {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		try {
			
			System.out.println("Basic Data Collector");
			System.out.println("=====================");
			System.out.println("Enter the following data");
			System.out.print("Name: ");
			String Name = reader.readLine().trim();
			
			System.out.print("Age: ");
			String age = reader.readLine().trim();
			int Age = Integer.parseInt(age);
			
			System.out.print("Year of birth: ");
			String BirthDay = reader.readLine().trim();
			int birthDay = Integer.parseInt(BirthDay);
			
			Person data = new Person(Name, Age, birthDay);
			System.out.println("=====================");
			Person.DisplayOutPut();
			
		}catch(NumberFormatException e) {
			
			System.out.println("Invalid number input please run the program again");
			return;
			
		}catch(IOException e) {
			
			System.out.println("An I/O error occured");
			return;
		}
		
	}

}
