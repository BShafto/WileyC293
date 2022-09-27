package LargestOf3ExceptionHandlingProjectDay6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Run();	
	}
	
	public static void Run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		
		try {
			int input1 = s.nextInt();
			int input2 = s.nextInt();
			int input3= s.nextInt();
			
			new LargestOf3LogicClass(input1, input2, input3);
			
		} catch(InputMismatchException e) {
			System.out.println("Only integer input please.");
			System.out.println();
			Main.Run();			
		}
		
		
		
	}

}
