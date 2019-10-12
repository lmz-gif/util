package com.test;



import java.text.ParseException;

import org.junit.Test;

import com.lmz.utils.LmzUtil;

/**
  * @author lmz
  * @date 2019年10月11日 下午3:08:29
  * 
  */

public class Alltest {
	@Test
	public void aa() throws ParseException {
		System.out.println(LmzUtil.getInitData("1998-09-07,01:20:33"));
		
	}
}
