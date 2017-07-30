package cn.bdqn.menu;

import java.util.Scanner;

public class ScannerHas {

	/**
	 *      next()系列：只能获取用户输入的值！
	 *  hasNext（）系列：
	 *    01.获取用户输入值！
	 *    02.判断值的类型！
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入一个数字：");
		boolean result = input.hasNextInt();
		if (result) { // 等同于 result==true
			System.out.println("您输入正确！");
		} else {
			System.out.println("不正确");
		}

	}

}
