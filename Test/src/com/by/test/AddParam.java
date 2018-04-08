package com.by.test;


public class AddParam {

	public static void main(String[] args) {
		String wa = "int offset, int pagesize, String resourceOriginsCode,String isFree, String isOriginal, String[] learningGoalCodes, String customerCoursePacketId";
		
		String[] strs = wa.split(",");
		for (String string : strs) {
			String[] items = string.trim().split(" ");
			string = "@Param(\""+items[1]+"\")"+string;
			System.out.print(string+",");
		}
		
	}
}
