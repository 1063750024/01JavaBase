package cn.bdqn.test;

import java.util.Scanner;

/**
 * 
 *  八种基本数据类型的 默认值
 * 
 * 失去一日甚易,欲得回已无途！
 *  
 * @author 小葱拌豆腐
 * 2017-7-27上午8:35:59
 */
public class DefaultTest {
	/**
	 * 01.我们不能把变量声明在main（）内
	 * 02.方法体内的变量是局部变量，必须有初始值！
	 * 03.我们定义在 类中（方法体外）
	 * 04.因为main()static修饰的，所以方法体内只能调用类中 static修饰的变量或者方法
	 * 05.全局变量有默认值
	 */

	static byte byteName;
	static short shortName;
	static int intName;
	static long longName;
	static float floatName;
	static double doubleName;
	static char charName = '\u0000';
	static boolean booleanName;
	static String StringName; // 所有引用数据类型的默认值都是null
	static Scanner input;

	public static void main(String[] args) {
		System.out.println("===============整型===============");
		System.out.println("byte类型的默认值是：" + byteName);
		System.out.println("short类型的默认值是：" + shortName);
		System.out.println("int类型的默认值是：" + intName);
		System.out.println("long类型的默认值是：" + longName);

		System.out.println("===============浮点型===============");
		System.out.println("float类型的默认值是：" + floatName);
		System.out.println("double类型的默认值是：" + doubleName);

		System.out.println("===============字符===============");
		System.out.println("char类型的默认值是：" + charName);

		System.out.println("===============布尔值===============");
		System.out.println("boolean类型的默认值是：" + booleanName);

		System.out.println("===============字符串===============");
		System.out.println("String类型的默认值是：" + StringName);
		System.out.println("scanner类型的默认值是：" + input);
	}

}
