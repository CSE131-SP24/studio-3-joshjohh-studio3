
import java.util.Scanner;
public class Sieve {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	int n;
	
		System.out.println("Input an integer that is greater than 1");
		n = scan.nextInt();
		if (n < 2) {
			System.out.println("That is not a valid number.");
		}
		else {
		
		boolean [] numbers = new boolean[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = true;
			System.out.println("True.");
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (numbers[i-2] = true) {
			for (int j = (int) Math.pow(i, 2); j < n; j = j+i) {
				System.out.print(j);
			
				}
			}
				
			}
			
		}
		
		}
		
		
		
		// TODO Auto-generated method stub

	}

