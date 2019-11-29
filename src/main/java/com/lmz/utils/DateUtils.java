package com.lmz.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	/**
	 * 计算年龄
	 * 
	 * @param birthday
	 * @return
	 */
	public static int calAge(Date birthday) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(birthday);
		// 获取出生的年月日
		int birthYear = cal.get(Calendar.YEAR);
		int birthMonth = cal.get(Calendar.MONTH);
		int birthDate = cal.get(Calendar.DAY_OF_MONTH);

		// 获取今天的年月日
		cal.setTime(new Date());
		int currentYear = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONTH);
		int currentDate = cal.get(Calendar.DAY_OF_MONTH);

		int age = currentYear - birthYear;
		if (currentMonth < birthMonth)
			age--;
		else if (currentMonth == birthMonth) {
			if (currentDate < birthDate)
				age--;
		}
		return age;
	}

	/**
	 * 判断是否为当天
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isToday(Date date) {
		SimpleDateFormat smt = new SimpleDateFormat("yyyyMMdd");

		String dateStr = smt.format(date);
		String todayStr = smt.format(new Date());
		return dateStr.equals(todayStr);

	}

	/**
	 * 判断是否为今年
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isThisYear(Date date) {
		SimpleDateFormat smt = new SimpleDateFormat("yyyy");

		String dateStr = smt.format(date);
		String todayStr = smt.format(new Date());
		return dateStr.equals(todayStr);
	}

	/**
	 * 
	 * 给定时间对象，初始化到该月初的1日0时0分0秒0毫秒 例如 给定 2017-08-23 13:24:16 返回 2017-08-01 00:00:00
	 * 
	 * @return
	 */
	public static Date getMonthStart(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 设置0秒
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM, Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	/**
	 * 求月末
	 * 
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 设置0秒
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM, Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	}

	//给定时间 随机日期(字符串参数)
		public static Date randomDate(String stratDate,String endDate) {
			SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
			long date = 0L;
			try {
				Date d1 = st.parse(stratDate);
				Date d2 = st.parse(endDate);
				date = (long) (Math.random() * (d2.getTime() - d1.getTime() + 1) +d1.getTime());
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return new Date(date);
			
		}
	
	// 给定时间 随机日期(日期参数)
	public static Date randomDate(Date stratDate, Date endDate) {
		SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = st.format(stratDate);
		String s2 = st.format(endDate);
		return randomDate(s1, s2);
	}

}
