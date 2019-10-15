package com.lmz.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
  * @author lmz
  * @date 2019年10月11日 下午1:33:12
  * 
  */

public class LmzUtil {
	//	非空判断
	public static boolean isEmpty(String str) {
		return !(str==null||str.trim().length()==0);
	}
	
	//	手机号验证
	public static boolean cellphoneNumber(String number) {
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}
	
	//	邮箱验证
	public static boolean isEmail(String email) {
		String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	//	全字母验证
	public static boolean isEnglish(String str) {
		return str.matches("[A-z]+");
	}
	
	
	/**
	 * 初始化时间
	 */
	public static Date getInitData(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
		Date date = sdf.parse(str);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
		String format = sdf1.format(date);
		Date date1 = sdf1.parse(format);
		return date1;
	}
	
	
	
}
