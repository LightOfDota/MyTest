package com.by.test;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Scanner;

public class TuoFeng2XiHua {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		while(true) {
			System.out.println("输入驼峰或下划");
			String in = scanner.nextLine();
			int indexOf = in.indexOf("_");
			System.out.println(indexOf == -1 ? "驼峰转下划" : "下划转驼峰");
			String out = ((indexOf == -1) ? TuoFeng2XiHua.t2x(in) : TuoFeng2XiHua.x2t(in));
			TuoFeng2XiHua.copy(out);
			System.out.println("已经复制到粘贴板"+out);
		}
	}
	
	public static String t2x(String s) {
		if (null == s)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				if(i != 0)
					sb.append("_" + Character.toLowerCase(s.charAt(i)));
				else
					sb.append(Character.toLowerCase(s.charAt(i)));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static String x2t(String s) {
		if (null == s)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String str = s.charAt(i)+"";
			if(str.equals("_")) {
				sb.append(Character.toUpperCase(s.charAt(i+1)));
				i++;
			}else {
				sb.append(s.charAt(i));
			}
//			if (Character.isUpperCase(s.charAt(i))) {
//				if(i == 0)
//					sb.append("_" + Character.toLowerCase(s.charAt(i)));
//				else
//					sb.append(Character.toLowerCase(s.charAt(i)));
//			} else {
//				sb.append(s.charAt(i));
//			}
		}
		return sb.toString();
	}
	
	public static void copy(String writeMe) {
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();  
        Transferable tText = new StringSelection(writeMe);  
        clip.setContents(tText, null); 
	}
}
