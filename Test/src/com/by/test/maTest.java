package com.by.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class maTest {

	public static void main(String[] args) {
		maTest.readTxt("F://��ʱ/a.txt");
	}

	static void readTxt(String pathname) {
		/* ����TXT�ļ� */
//		 = "D:\\twitter\\13_9_6\\dataset\\en\\input.txt"; // ����·�������·�������ԣ������Ǿ���·����д���ļ�ʱ��ʾ���·��
		File filename = new File(pathname); // Ҫ��ȡ����·����input��txt�ļ�
		InputStreamReader reader;
		try {
			reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader); // ����һ�����������ļ�����ת�ɼ�����ܶ���������
			String line = "";
			line = br.readLine();
			while (line != null) {
				line = br.readLine(); // һ�ζ���һ������
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
		} // ����һ������������reader
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
