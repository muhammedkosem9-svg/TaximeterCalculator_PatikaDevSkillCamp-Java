package program;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int startingFee = 10;
	int minAmount = 20;
	double totalAmount;
	double feePerKilometer = 2.20;
	double kilometer;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the distance in kilometers");
	
	 kilometer = in.nextDouble();
	 
	 in.close();
	 
	 totalAmount = startingFee + (kilometer * feePerKilometer);
	 
	 Double finalAmount = totalAmount < minAmount ? minAmount : totalAmount;
	 
	 
	 System.out.println("Total amount:" + finalAmount);
	
	
		

	}

}
