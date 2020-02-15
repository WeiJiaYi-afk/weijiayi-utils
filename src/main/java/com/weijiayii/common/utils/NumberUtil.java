package com.weijiayii.common.utils;

public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber 
	 * @Description: 判断是否是数字（正负数，小数，整数）
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg ="^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
