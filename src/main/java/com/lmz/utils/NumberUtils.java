package com.lmz.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

/**
  * @author lmz
  * @date 2019年11月21日 下午7:10:17
  * 
  */

public class NumberUtils {

	//返回min-max之间的随机整数（包含min和max值）
	public static int random(int min, int max) {
		// 实例化随机数工具类
		Random r = new Random();
		int i = r.nextInt(max - min + 1) + min;
		return i;
	}

	// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数
	public static int[] subRandom(int min, int max, int subs) {
		// 存放随机数字.用来过滤重复数据
		HashSet<Integer> set = new HashSet<Integer>();

		// 声明目标数组.用来存放随机数
		int[] dest = new int[subs];
		
		//向set集合中添加随机数据,
		while (set.size() != subs) {
			int x = random(min, max);
			set.add(x);
		}
		//遍历set集合,存入目标数组
		int y = 0;
		for (int value : set) {
			dest[y] = value;
			y++;
		}

		return dest;
	}


	// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		String str="123456789qwrtyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length() -1));
	}
	// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {
		String str="";
		for(int i =0;i<length; i++) {
			str+=randomCharacter();
		}
		
		return str;
	}
	
	
	//随机13开头的电话号
	public static String random13Phone() {
		long i = (long)(Math.ceil((Math.random()*(999999999-100000000.0) + 1)+100000000));
		String phone = i+"";
		return "13"+i;
	
	}
}
