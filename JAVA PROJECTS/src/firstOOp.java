import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class firstOOp {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter Car Brand: ");
			String name = reader.readLine().trim();
			System.out.println("====================================================");
			System.out.print("Enter Car Model: ");
			String model = reader.readLine().trim();
			System.out.println("====================================================");
			System.out.print("Enter Car Year: ");
			String py = reader.readLine().trim();
			int year = Integer.parseInt(py);
			System.out.println("====================================================");
			System.out.print("Enter Car Rent Prize: ");
			String pr = reader.readLine().trim();
			double rent = Double.parseDouble(pr);
			System.out.println("====================================================");
			System.out.println("How many days have you rented the vehicle?");
			System.out.print("Enter: ");
			String phrent = reader.readLine().trim();
			int days = Integer.parseInt(phrent); 

			Car car1 = new Car(name,model,year,rent);
			
			car1.displayRentalInfo();
			double total = Car.RentalCalculation(days);
			
			System.out.printf("Total: $%.2f%n", total);
			
		} catch (NumberFormatException e){
			System.out.println("Invalid Input");
		}  catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }

	}

}
