package com.bdtravel.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 转换日期类型的数据
 * S : 页面传递过来的类型
 * T ： 转换后的类型
 */
public class DateConveter implements Converter<String, Date>{

	public Date convert(String source) {
		try {
			if(null != source){
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				return df.parse(source);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
