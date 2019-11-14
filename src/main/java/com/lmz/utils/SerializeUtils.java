package com.lmz.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
  * @author lmz
  * @date 2019年11月8日 下午4:27:53
  * 序列化和反序列化工具
  */
public class SerializeUtils {
	public static String serialize(Object object) throws IOException {
		//接受序列化后的对象
		ByteArrayOutputStream byteArrayOutputStream = new  ByteArrayOutputStream();
		//序列化流
		ObjectOutputStream stream = new ObjectOutputStream(byteArrayOutputStream);
		stream.writeObject(object);
		String string = byteArrayOutputStream.toString("ISO-8859-1");
		stream.close();
		byteArrayOutputStream.close();
		return string;
	}
	public static Object serializeToObject(String str) throws IOException, ClassNotFoundException {
		ObjectInputStream stream = new ObjectInputStream(new ByteArrayInputStream(str.getBytes("ISO-8859-1")));
		Object object = stream.readObject();
		stream.close();
		return object;
		
	}
}
