package cn.bdqn.whileAndDo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date05 {

	/**
	 * 2017-08-03   日期格式的字符串
	 * 
	 * Thu Aug 03 15:57:18 CST 2017  日期
	 * 
	 *  实现日期和字符串之间的相互转换
	 *  01.format()  把日期转换成字符串
	 *  02.parse()   把字符串转换成日期
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// 创建了一个日期对象 new Date() 代表当前系统时间
		Date date = new Date();
		System.out.println("当前时间是：" + date);
		System.out.println("********************");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(date); // 把日期转换成字符串
		System.out.println(time);
		System.out.println("********************");
		date = sdf.parse(time);// 把字符串转换成日期
		System.out.println(date);

	}

}
