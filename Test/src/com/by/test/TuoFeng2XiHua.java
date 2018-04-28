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
			System.out.println("输入驼峰");
			String tuofeng = scanner.nextLine();
			System.out.println("输出下划");
			String t2x = TuoFeng2XiHua.t2x(tuofeng);
			TuoFeng2XiHua.copy(t2x);
			System.out.println("已经复制到粘贴板"+t2x);
		}
	}
	
	public static String t2x(String s) {
		if (null == s)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i>0 && Character.isUpperCase(s.charAt(i))) {
				sb.append("_" + Character.toLowerCase(s.charAt(i)));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void copy(String writeMe) {
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();  
        Transferable tText = new StringSelection(writeMe);  
        clip.setContents(tText, null); 
	}
}
