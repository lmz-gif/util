package com.lmz.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
  * @author lmz
  * @date 2019年10月14日 下午6:25:10
  * 
  */

public class CharUtils {
	/**
	  * 字母在字符串出现次数
	  * 
	  */
	public static Integer countLetter(String str,Character ch) {
		str = str.replace("\r\n", "");
		str = str.replace(" ", "");
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>(); 
		
		for (char c : charArray) {
			if (hashMap.get(c)!=null) {
				hashMap.replace(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
//		Set<Character> keySet = hashMap.keySet();
//		for (Character character : keySet) {
//			System.out.println(character+"="+hashMap.get(character));
//		}
		return hashMap.get(ch);
	}
	/**
	 * 单词在字符串出现次数
	 * 
	 */
	public static Integer countWord(String str,String find) {
		str = str.toLowerCase();
		str = str.replace("\r\n", " ");
		String[] split = str.split("\\W");
		HashMap<String, Integer> hashMap = new HashMap<>(); 
		for (String string : split) {
			if (string.length()>=1) {
				if (hashMap.get(string)!=null) {
					hashMap.replace(string, hashMap.get(string)+1);
				}else {
					hashMap.put(string, 1);
				}	
			}
		}
		
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(hashMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            //升序排序
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()))*-1;
            }
            
        });
        for (Entry<String, Integer> entry : list) {
			System.out.println(entry);
		}
		/*Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}*/
//		Set<String> keySet = hashMap.keySet();
//		for (String s : keySet) {
//			if (hashMap.get(s)>3) {
//				System.out.println(s+"="+hashMap.get(s));
//			}
//		}
		return hashMap.get(find);
	}
}
