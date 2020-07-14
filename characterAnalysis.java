import java.util.Scanner;

public class characterAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner (System.in);
		
		String ans;
		do {
		System.out.println("Please enter a string of characters: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int length=str.length();
		System.out.println("Length of the string you entered: "+length);
		
		int vowels=0,consonants=0,other=0;
		for (int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
			vowels++;
		}
		else if (ch>=97 && ch<=122||ch>=65 && ch<=90)
		
		{
			consonants++;
		}
		else 
			other++;
	
		}
		
	
		System.out.println("Number of vowels in the string you entered: "+vowels);
		System.out.println("Number of consonants in the string you entered: "+consonants);
		System.out.println("Number of other characters in the string you entered: " +other);
		
		System.out.println("Do you want to enter another string? (Yes or No): ");
		ans=sc.nextLine();
		}
	
		while (ans.equalsIgnoreCase("Yes"));
		
			
		}
			
			
		}
			
		
		
		
			
			
		

		
		
	
		
		
		
	
		
			
		
		

	
		
	

	
