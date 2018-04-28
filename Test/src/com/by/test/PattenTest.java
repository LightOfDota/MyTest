package com.by.test;

public class PattenTest {

	public static void main(String[] args) {
		String patten = "^(?![a-zA-Z]+$)(?![A-Z0-9]+$)(?![A-Z\\W_]+$)(?![a-z0-9]+$)(?![a-z\\W_]+$)(?![0-9\\W_]+$)[a-zA-Z0-9\\W_]{0,}$";

		String password1 = "fukang";      // false
		String password2 = "Fukanggggg";  // false
		String password3 = "fukang123";   // false
		String password4 = "Fukang123";   // true
		String password5 = "##Fuk%%";     // false
		String password6 = "###fukang%%"; // false
		String password7 = "66FFFFFFFFFFf";// false
		String password8 = "a";

		System.out.println(password1.matches(patten));
		System.out.println(password2.matches(patten));
		System.out.println(password3.matches(patten));
		System.out.println(password4.matches(patten));
		System.out.println(password5.matches(patten));
		System.out.println(password6.matches(patten));
		System.out.println(password7.matches(patten));
		System.out.println(password8.matches(patten));
		
		System.out.println("--------------------------");
		String p = "^(?=[a-zA-Z]+$){0,}$";
		String p1 = "^(?=[A-Z0-9]+$){0,}$";
		String p2 = "^(?=[A-Z\\\\W_]+$){0,}$";
		String p3 = "^(?=[a-z0-9]+$){0,}$";
		String p4 = "^(?=[a-z\\\\W_]+$){0,}$";
		String p5 = "^(?=[0-9\\\\W_]+$){0,}$";
		String p6 = "^(?![a-zA-Z]+$)[a-zA-Z0-9\\\\W_]{0,}$";
		System.out.println(password8.matches(p));
		System.out.println(password8.matches(p1));
		System.out.println(password8.matches(p2));
		System.out.println(password8.matches(p3));
		System.out.println(password8.matches(p4));
		System.out.println(password8.matches(p5));
		System.out.println(password8.matches(p6));
	}
}
