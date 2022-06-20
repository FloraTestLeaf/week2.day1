package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="testleaf";
		String text2="TestLeaf";
		System.out.println(text1);
		
		//to convert to uppercase
		String low=text1.toLowerCase();
		System.out.println(low);
		
		//to convert to upper case
		String up=text1.toUpperCase();
		System.out.println(up);
		
		//string comparison
		boolean comp=text1.equals(text2);
		System.out.println(comp);
		
		//contains
		String t1 = "Testleaf is in Chennai";
		String t2 = "Chennai";
		boolean contains = t1.contains(t2);//it is of case sensitivity
		System.out.println(contains);
		
		//starts with
		boolean startsWith = t1.startsWith("Tes");
		System.out.println("starts" + startsWith);
		
		//ends with
		boolean endsWith = t2.endsWith("hennai");
		System.out.println(endsWith);
		
		//concatination
		String concat = text1.concat(" Always ahead");
		System.out.println(concat);
		
		
		String text = text1 + " Always Ahead";
		System.out.println(text);
		
		int length = text1.length();
		System.out.println(length);
		
		//for loop
		for (int i = 0; i < text1.length(); i++) {
			char charAt = text1.charAt(i);
			System.out.println(charAt);
		}
		
		
		//using char array in for loop
		char[] array = text1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//split
		String[] split = t1.split("l");
			for (int i = 0; i < split.length; i++) {
				System.out.println("split  "+split[i]);
		}
		
		String substring = text1.substring(4);
		System.out.println(substring);
		String substring2 = text1.substring(2, 6);
		System.out.println(substring2);
		
		String replace = text1.replace("le", "GMT");
		System.out.println(replace);
		
		
		
	}

}
