
public class Car {
	
//	Attributes of Car
	String brand;
	String model;
	int year;
	static double rentalPrice;
	boolean isRunning;
	
//Constructor
	Car(String modelName,String BrandName,int Yearmanifactured, double rent){
		this.model = modelName;
		this.brand = BrandName;
		this.year = Yearmanifactured;
		this.rentalPrice = rent;
		
		isRunning = true;
		
	}
	
//Method
	static double RentalCalculation(int days) {
		double total = rentalPrice*days;
		
		if(days >= 7) {
			total = total * 0.7;
		}
		
		return total;
	}
	
//Output
	void displayRentalInfo() {
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
		System.out.println("Rent Price: " + rentalPrice);
		System.out.println("Car Active: " + isRunning);
		System.out.println("=========Total==========");
	}
	
}
