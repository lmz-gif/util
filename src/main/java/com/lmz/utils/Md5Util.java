package com.lmz.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author lmz
 * @date 2019年10月16日 下午6:25:54
 * 
 */

public class Md5Util {

	/**
	 * 数据加密
	 * 
	 */
	public static String dataEncryption(String data, String password) {
		// 加密
		String md5Hex = DigestUtils.md5Hex(data + password);
		
		return md5Hex;
	}
}
