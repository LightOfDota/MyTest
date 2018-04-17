package com.by.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Fanshe<F, C extends F> {

	public void Test(F father, C child) {

		Class<? extends Object> fClass = father.getClass();
		Field[] fields = fClass.getDeclaredFields();
		for (Field f : fields) {
			try {
				Method m = fClass.getMethod("get" + upperHeadChar(f.getName()));// 方法getDeleteDate
				Object obj = m.invoke(father);// 取出属性值
				f.set(this, obj);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	/**
	 * 首字母大写，in:deleteDate，out:DeleteDate
	 */
	private static String upperHeadChar(String in) {
		String head = in.substring(0, 1);
		String out = head.toUpperCase() + in.substring(1, in.length());
		return out;
	}
}
