package PracticeSet1;

public class Person {
	
	public static String Name;
	public static int Age;
	public static int Year;
	
	Person(String name, int age, int year) {
		this.Name = name;
		this.Age = age;
		this.Year = year;
	}
	
	public static void DisplayOutPut() {
		System.out.println("User Name is: " + Name);
		System.out.println("User Age is:  " + Age);
		System.out.println("User Year is: " + Year);
	}
	
}
