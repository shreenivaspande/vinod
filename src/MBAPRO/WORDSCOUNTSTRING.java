package MBAPRO;

public class WORDSCOUNTSTRING {

	public static void main(String[] args) {
		
		String s="java is java again java again";
		
		char c='a';
		
		int count = s.length() -s.replace("a", "").length();
		
		System.out.println("number of occurance of 'a' in "+s+"=" +count);
	}
}
