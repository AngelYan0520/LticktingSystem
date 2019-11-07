package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理工具类
 * @param dateFormat 日期格式
 * @param dateStr 日期字符串
 * @return 日期
 * @author windows
 *
 */
public class DateUtil {
	public static Date toDate(String dateFormat,String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param 根据某种日期格式把日期转化成字符串
	 * @param 
	 */
	public static String dateToString(String dateFormat,Date date) {
		return new SimpleDateFormat(dateFormat).format(date);
	}
}
