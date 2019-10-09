package javaBasics;

public class StringFunctions {
	
	
	public static void main(String[] args) {
		
	String str1 = "HI";
	String str2 = "Hello how are you";
	//To check two strings equal or not
	System.out.println("Is two strings are equal?: "+str1.equals(str2));
	//To concat two strings
	System.out.println("concatenating strings str1 and str2: "+str1.concat(str2));
	//To change get output in uppercase
	System.out.println("Displaying String in uppercase: "+str2.toUpperCase());
	//to get string output in lowercase
	System.out.println("Displaying String in lowercase: "+str1.toLowerCase());
	//To findout the legth of the string
	System.out.println("Length of the string str2 is: "+str2.length());
	//To get a specific substring from a string.
	System.out.println("Value of substring is: "+str2.substring(2, 5));
	//Convert from String to Integer
	String str = "50";
	int i = Integer.parseInt(str);
	System.out.println("Converted value from String to Intger:"+i);
	
	int j = 60;
	String s = String.valueOf(j);
	System.out.println("Converted value from Integer to String:"+ s);
	
	String splt[] = str2.split(" ");
	System.out.println("1st value:" + splt[0]);
	System.out.println("1st value:" + splt[1]);
	System.out.println("1st value:" + splt[2]);
	System.out.println("1st value:" + splt[3]);
	//System.out.println("1st value:" + splt[4]);
	
	System.out.println(str2.charAt(3));
	
	int k =20;
	
	System.out.println(j+k);
	System.out.println(str1+str2);
	System.out.println(j+k+str1+str2);
	System.out.println(str1+str2+j+k);
	
	}
	
	

}
