import java.util.Scanner;

public class LoanAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Loan Amount for Scenario A: ");
		double principal2=sc.nextDouble();
		
		System.out.println("Enter Annual Interest rate for Scenario A: ");
		double rate2=sc.nextDouble();
		
		System.out.println("Enter Number of Years for Scenario A: ");
		int years2=sc.nextInt();
	
		Loan myLoan=new Loan(principal2,rate2,years2);
		Loan loan2=new Loan(principal2,rate2,years2+10);
	
		double pay;
		pay= myLoan.calcPayment();
		
		
		double tot=0; 
		tot=myLoan.calcTotal();
		
		
		System.out.printf("Scenario A - Monthly Payment:  $%6.2f Total Loan Payment: $%6.2f", pay,tot );
		
		pay=loan2.calcPayment();
		tot=loan2.calcTotal();
		System.out.println(" ");
		System.out.printf("Scenario B - Monthly Payment:  $%6.2f Total Loan Payment: $%6.2f", pay,tot );
	}
	
	
	}
