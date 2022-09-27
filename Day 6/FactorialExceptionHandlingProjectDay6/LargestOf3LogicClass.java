package LargestOf3ExceptionHandlingProjectDay6;

public class LargestOf3LogicClass {

	private int n1, n2, n3, largest;		//Input / output 

	public LargestOf3LogicClass(int in1, int in2, int in3) {
		this.n1 = in1;
		this.n2 = in2;
		this.n3 = in3;
		
		try {
			setLargest(n1, n2, n3);		
			System.out.println("The largest out of "+n1+", "+n2+", "+n3+ " is = "+findLargest());
			System.out.println();
			Main.Run();
		} catch (LargestOf3NegativeException e) {
			System.out.println(e.getErrorCode());
			System.out.println();
			Main.Run();
		}
	}

	public int findLargest() {
		if(n1 >= n2 && n1 >= n3)
			return n1;
		else if(n2 >= n1 && n2 >= n3)
			return n2;
		else
			return n3;
	}
	
	public Boolean checkDecimal() {
		if(n1%n2 != 0) 
			return true;
		else if(n2%n3 !=0)
			return true;			
		return false;
	}
	
	public void setLargest(int a, int b, int c) throws LargestOf3NegativeException {
		if(a < 0 || b < 0 || c < 0) {
			throw new LargestOf3NegativeException("Positive numbers only.");
		}
	}
}
