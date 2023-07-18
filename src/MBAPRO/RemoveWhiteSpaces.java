package MBAPRO;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input String to be cleaned form white spaces...!");
		String inputString=sc.nextLine();
		String StringwithoutSpace=inputString.replaceAll("\\s+", " ");
		System.out.println("input String;"+inputString);
		System.out.println("input string with out spaces;"+StringwithoutSpace);
		
		sc.close();
	}
}
