package MBAPRO;

import java.util.Scanner;

public class stringcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		
		int count =1;
		for (int i =1;i< s.length()-1;i++) {
		
		if ((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
			count++;
		}
		}
		System.out.println("number of words in string" +count);
	}
}
