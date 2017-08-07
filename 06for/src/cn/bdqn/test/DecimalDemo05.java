package cn.bdqn.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalDemo05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入一个数字：");
		double num = input.nextDouble(); // 2.333333
		// 想把用户输入的数字 保留两位有效数字
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(num);
		System.out.println("保留两位有效数字：" + result);

		// 把String转换成 数值类型
		num = Double.parseDouble(result);

		System.out.println(num + 5);

	}
}
