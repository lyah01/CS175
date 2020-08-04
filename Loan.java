public class Loan {

	private double principal;
	private double rate;
	private int years;
	
	
	public Loan(double principal3, double rate3, int years3) {
		// TODO Auto-generated constructor stub
		principal=principal3;
		rate=rate3;
		years=years3;
	}
	
	static final int numbPayments=12;

		public double calcPayment() {
			double monthlyPayment=0;
			monthlyPayment= principal *(rate/numbPayments*(Math.pow(1+rate/numbPayments, numbPayments * years)))/(Math.pow(1+rate/numbPayments,numbPayments * years)-1);
			return monthlyPayment;
			
		}
		public double calcTotal() {
			
			double totAmountPaid= calcPayment() * numbPayments * years;
			return totAmountPaid;
		}
		
	}


