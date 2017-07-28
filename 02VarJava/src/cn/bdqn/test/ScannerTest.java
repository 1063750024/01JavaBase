package cn.bdqn.test;

import java.util.Scanner;

/**
 * 之前 是 我们一直   让 console台  输出内容！
 * 我们想在 console台  输入内容！
 * 
 * 
 * 
 *   我们把java.lang包下面的所有类，当成自己的东西！
 *   我们使用自己的东西，不需要申请！
 *   
 *    java.lang包之外的东西，我们想使用，就必须 申请！
 *    怎么申请？使用关键字 import！
 *    
 * 
 * 01. 导入我们需要使用的类  import java.util.Scanner;
 * 02. 创建Scanner对象
 * 03. 使用对象的一系列方法进行操作
 * 
 *  
 * 2017-7-25下午3:48:33
 */
public class ScannerTest {

	public static void main(String[] args) {
		// 创建了 输入 对象
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的姓名："); // 输出
		// 获取用户在console台上的输入 并且把值赋给name
		String name = input.next();
		System.out.println("请输入您的年龄：");
		int age = input.nextInt();

		System.out.println("您的姓名是：" + name);
		System.out.println("您的年龄是：" + age);

		// 判断用户的输入是否可以转换成int类型
		System.out.println("请您输入一个数字：");
		boolean flag = input.hasNextInt();
		String result = flag ? "您输入的是数字！" : "您输入的不是数字！";
		System.out.println(result);
	}
}
