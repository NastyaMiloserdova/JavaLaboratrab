import java.util.Scanner;

public class palindrom {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String words[] = s.split(" ");
		for (String word: words){
			System.out.println(isPalindrom(word));
		}
	}

	public static String reverseString(String s){
		String answer_s = "";
		for (int i = 0; i < s.length(); i++){
			answer_s += s.charAt(s.length()-1-i);
		}
		return answer_s;
	}

	public static boolean isPalindrom (String s){
		String s_reverse = reverseString(s);
		return s.equals(s_reverse);
	}

}