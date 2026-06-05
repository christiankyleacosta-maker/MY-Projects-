package PracticeSet2;

public class Dog {
	
	public static String name;
	public static String breed;
	
	Dog(String Name, String Breed){
		this.name = Name;
		this.breed = Breed;
	}
	
	public static void Output() {
		System.out.println("");
		System.out.println("==============================");
		System.out.println("Dog Name: " + name);
		System.out.println("==============================");
		System.out.println("Dog Breed: " + breed);
		System.out.println("");
	}
}
