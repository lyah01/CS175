import java.util.Scanner;
public class credit_validation
{

   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       
       String ans;
       do {
    	
    	   
      // char cardInput;
    	   
    	
       System.out.println("Enter the Credit Card # you would like to verify: ");
       String cardInput = sc.nextLine();
       
       int i2;
       for (i2 = 0; i2 < cardInput.length(); i2++) { 
           char inp = cardInput.charAt(i2); 
           if ((inp < 48 || inp > 57 ) 
               && (inp != 45 && inp != 32 )) {
        	   System.out.println("Invalid input.Try again: ");
        	   cardInput = sc.nextLine();
           }
       }
      
       String creditCardNumber=cardInput;
      
    	
      //Try all 3:"4012-8888-8888-1881";"4123-5678-9012-3450"; "4125 5679 9112 3450"

      
    	
      
 /**This code is removing spaces and dashes from the credit card
    so that the Steps 1 and 2 are working with only digits
    Replace the '?' in this code so that .substring methods remove dashes or spaces from creditCardNumber
 */
      int i = 0;
      while (i < creditCardNumber.length())
      {
         char ch = creditCardNumber.charAt(i);
          if (ch == ' ' || ch == '-')
         {
            String before = creditCardNumber.substring(0, i);
            String after = creditCardNumber.substring(i + 1);
            creditCardNumber = before + after;
         }
          else
          {
        	 i++;
      }
       
      }
       
      System.out.println("Converted # " + creditCardNumber);
    	
      
      
/** Check to see if the number is valid.
    Integer.parseInt() may be helpful in STEP 1 and Step 2 below

    Step 1 - form the sum of all the digits Integer.parseInt() may be helpful
    Put your Step 1 code here */
   
    
   
      int sum=0;
      char ch= ' ';
      for (int i1=0;i1< creditCardNumber.length(); i1++)

      {
    	 ch=creditCardNumber.charAt(i1);
    	 sum=sum+Integer.parseInt(String.valueOf(ch));
    	
    
      }
      /** Step 2 - add to the sum every 2nd digit, starting with the
      second digit from the right. If the digit is > 4, then
      add one to sum. The result should be evenly divisible by 10.
      
      For example, consider the number 4012 8888 8888 1881. 
      The sum of all digits in Step 1 is 89. 
      The sum of the digits in STEP 2 is 46. 
      The number of the digits from STEP 2 that are greater than 4 is 5.
      89 + 46 + 5 = 140
      140 is evenly divisible by 10 so 4012 8888 8888 1881 is a valid CC number.
      Put your Step 2 code here */
      
      
     for (int i1=creditCardNumber.length()-2;i1>=0;i1=i1-2) {
    	 ch=creditCardNumber.charAt(i1);
    	 sum=sum+Integer.parseInt(String.valueOf(ch));
    	if (Integer.parseInt(String.valueOf(ch))>4) {
    		sum=sum+1;
    	}
     
    	  }
    	  if (sum % 10==0) {
    		  System.out.println("Credit card # " +cardInput+ " is valid");  
    	  }
    	  else {
    		  System.out.println("Credit card # " +cardInput+ " is not valid");
    		  
    	  }
    	  
    	  System.out.println("Would you like to verify another credit card number? (Yes or No)");
    	  ans=sc.nextLine();
	   
      {
    	 
      }
      
   }
       while (ans.equalsIgnoreCase("Yes"));
       
   }
}

 /**Try your program for all 3 credit card numbers shown above
   
   Console input/output expected:

   Enter the Credit Card # you would like to verify: 4012-888-888-1881
   Converted # 4012888888881881
   Credit card # 4012-8888-8888-1881 is valid.
   
   Enter the Credit Card # you would like to verify: 4123-5678-9012-3450
   Converted # 4123567890123450
   Credit card # 4123-5678-9012-3450 is valid. 

   Enter the Credit Card # you would like to verify: 4125-5679-9112-3450
   Converted # 4125567991123450
   Credit card # 4125 5679 9112 3450 is not valid.*/
 
       
       


       


	

	
	

