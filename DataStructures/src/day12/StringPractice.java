package day12;
/*
 * Implementations:

11, and 12
equals() method
ignoreCase()
concat()
toCharArray()
indexOf()
charAt()
toLowerCase() toUpperCase()
trim()
subString()
replace() replaceAll()
split()
11. How to perform these conversions? primative into String,  Any wrapper class type into String?
12. Convert String into any Wrapper class object type.

 */
public class StringPractice {

	public static void main(String[] args) {
		
		int a = 55;  //Primative into String
		String s1 =  Integer.toString(a);
		System.out.println(s1);
		
		//Any Wrapper Class into String
		Boolean b = false;
		String s2 = b.toString();
		System.out.println(s2);
		
		//Convert String into Wrapper class object
		String s3 = "true";
		Boolean b3 = Boolean.valueOf(s3);
		System.out.println(b3.toString());
		
		//equals() method
		String s4 = "55";
		System.out.println("Example 4 : " + s4.equals(s1)); //They are the same
		
		//compareToIgnoreCase();
		String s5a = "HELLO";
		String s5b = "hello";
		System.out.println("Example 5 : " + s5a.compareToIgnoreCase(s5b)); //should output 0
		
		//concat
		String s6 = new String(s5b);
		s6 = s6.concat(" world.");    //concat returns a new String since Strings are immutable
		System.out.println("Example 6 : " + s6);  //hello world.
		
		//toCharArray
		char[] s7 = s6.toCharArray();
		System.out.println("Example 7 : ");
		for(char c7 : s7) {
			System.out.print(c7);
		}
		System.out.print("\n");
		
		//indexOf
		int s8 = s6.indexOf('o');
		System.out.println("Example 8 : " + s8); //4
		
		//charAt
		char c9 = s6.charAt(6);
		System.out.println("Example 9 : " + c9); //w
		
		//split
		String[] s10 = s6.split(" ");
		String s10a = s10[1];
		String s10b = s10[0];
		System.out.println("Example 10 : " + s10a + " " + s10b);
		
		//replaceAll
		String s11 = s6.replaceAll("l", "w");
		System.out.println("Example 11 : " + s11);
		
		//trim
		String s12 = "         Boo!     ";
		System.out.println("Example 12 : " + s12.trim());
		
		//substring
		String s13 = s6.substring(6, 11);
		System.out.println("Example 13 : " + s13);
		
		
	}

}
