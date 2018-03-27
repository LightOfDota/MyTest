package com.by.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class maTest {

	public static void main(String[] args) {
		maTest.readTxt("F://临时/a.txt");
	}

	static void readTxt(String pathname) {
		/* 读入TXT文件 */
//		 = "D:\\twitter\\13_9_6\\dataset\\en\\input.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
		File filename = new File(pathname); // 要读取以上路径的input。txt文件
		InputStreamReader reader;
		try {
			reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
			String line = "";
			line = br.readLine();
			while (line != null) {
				line = br.readLine(); // 一次读入一行数据
				String[] strs = line.split("_");
				StringBuffer sbf = new StringBuffer("\"");
				for (int i = 0; i < strs.length; i++) {
					sbf.append(i==0?strs[i]:strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1));
				}
				sbf.append("\":");
				System.out.println(sbf.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 建立一个输入流对象reader
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
