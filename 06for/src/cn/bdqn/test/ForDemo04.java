package cn.bdqn.test;

import java.util.Scanner;

public class ForDemo04 {

	public static void main(String[] args) {
		/**
		 *  需求：
		 *    01.让用户循环输入5名学员的年龄
		 *    02.求出年龄大于25岁的百分比
		 *    03.保留两位有效数字
		 */
		Scanner input = new Scanner(System.in);
		int num = 0; // 记录年龄大于25岁的人数
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个学员的年龄：");
			int age = input.nextInt();
			if (age >= 25) {
				num++;
			}
		}
		System.out.println("25岁的百分比是：" + (num / 5.0 * 100) + "%");

	}

}
