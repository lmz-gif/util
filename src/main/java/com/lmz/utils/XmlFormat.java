package com.lmz.utils;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
  * @author lmz
  * @date 2019年11月14日 上午10:32:14
  * 
  */

public class XmlFormat {
	public static String XmlFormatBean(Object obj) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
		// 指定是否使用换行和缩排对已编组 XML 数据进行格式化的属性名称。
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		
        
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        
		return writer.toString();
	}
	
	
	 /**
     * xml转换成JavaBean
     *
     * @param xml xml格式字符串
     * @param t 待转化的对象
     * @return 转化后的对象
     * @throws Exception JAXBException
     */
    @SuppressWarnings("unchecked")
    public static <T> T convertToJavaBean(String xml, Class<T> t) throws Exception {
        T obj = null;
        JAXBContext context = JAXBContext.newInstance(t);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        obj = (T) unmarshaller.unmarshal(new StringReader(xml));
        return obj;
    }

	
}
