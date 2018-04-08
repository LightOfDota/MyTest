package com.by.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maTest {

	public static void main(String[] args) {
		maTest.readTxt("F://临时/a.txt");
//		Date date = new Date(-1);
//		System.out.println(date);
		
//		float aa = new BigDecimal((float)1/3).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();  
//		System.out.println(new BigDecimal(1-aa).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue());
		
//		List<Map<String, Object>> list_new = new ArrayList<Map<String, Object>>();
//		Map<String, Object> map1=new HashMap<String, Object>();
//		map1.put("ks", "01");
//		map1.put("js", "10");
//		list_new.add(map1);
//		Map<String, Object> map2=new HashMap<String, Object>();
//		map2.put("ks", "01");
//		map2.put("js", "10");
//		list_new.add(map2);
//
//		for (Map<String, Object> map : list_new) {
//		    map.put("js","11");
//		}
//		
//		for(Map<String, Object> a : list_new) {
//			System.out.println(a.get("js"));
//		}
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
				StringBuffer sbf = new StringBuffer(line +" as ");
				for (int i = 0; i < strs.length; i++) {
					sbf.append((i==0?strs[i]:strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1)));
				}
//				sbf.append("\":");
				System.out.println(sbf.toString()+",");
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
