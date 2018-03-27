package com.by.test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import dto.ProfessionalWisdomDTO;

public class DtoToMap {

	public static void main(String[] args) {
		DtoToMap.getEle(ProfessionalWisdomDTO.class,0);
	}

	@SuppressWarnings("unchecked")
	public static void getEle(Class<ProfessionalWisdomDTO> clazz,int layers) {
		Field[] fields = clazz.getDeclaredFields();
		if(layers==0)
			System.out.println("<resultMap id=\"BaseResult\" type=\"com.zwyl."+clazz.getName()+"\">");
		layers++;
		for (Field field : fields) {
			if (field.getType().getName().equals("java.util.List")) {
				Type fc = field.getGenericType();
				ParameterizedType pt = (ParameterizedType) fc;
				Class<ProfessionalWisdomDTO> genericClazz = (Class<ProfessionalWisdomDTO>) pt.getActualTypeArguments()[0]; // 【4】 得到泛型里的class类型对象。
				echoTab(layers);
				System.out.println("<collection property=\"option\" ofType=\"com.zwyl."+genericClazz.getName()+"\">");
				getEle(genericClazz,layers);
				echoTab(layers);
				System.out.println("</collection>");
			} else {
				String fi = field.getName();
				if (fi.equals("serialVersionUID"))
					continue;
				echoTab(layers);
				System.out.println("<result column=\"" + stringChange(fi) + "\" property=\"" + fi + "\" />");
			}
		}
		layers--;
		if(layers==0)
			System.out.println("</resultMap>");
	}
	
	public static void echoTab(int layers) {
		for(int i=0;i<layers;i++) {
			System.out.print("	");
		}
	}

	/**
	 * 
	 * @param 传入一个字符串
	 * @return 返回大写转换为_的字符串
	 */
	private static String stringChange(String s) {
		if (null == s)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				sb.append("_" + Character.toLowerCase(s.charAt(i)));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
