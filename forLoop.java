package loop;

import java.util.Scanner;
public class forLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Tree Height: ");
		int height = scan.nextInt();
		
		for (int rep = 1; rep <= 3; rep++) {
			for(int i = 0; i <= height; i++) {
				for(int k = height; k > i; k--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2*i+1; j ++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		for(int i = 1; i <= height/2; i++) {
			for(int j = 0; j <= height/2+1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= height/2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

