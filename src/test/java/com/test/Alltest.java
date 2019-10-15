package com.test;




import java.io.IOException;

import org.junit.Test;

import com.lmz.utils.CharUtils;
import com.lmz.utils.FileUtils;


/**
  * @author lmz
  * @date 2019年10月11日 下午3:08:29
  * 
  */

public class Alltest {
	
	@Test
	public void aa() throws IOException{
		String str = FileUtils.readFileByLine("C:\\Users\\Administrator\\Desktop\\aa.txt");
		
		CharUtils.countWord(str, "a");
		
		
	}
	
}
