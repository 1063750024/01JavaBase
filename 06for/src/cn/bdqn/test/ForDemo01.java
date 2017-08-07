package cn.bdqn.test;

import java.util.Scanner;

public class ForDemo01 {

	public static void main(String[] args) {
		/**
		 * 需求：
		 * 循环输入5名同学的考试成绩！
		 */
		Scanner input = new Scanner(System.in);
		// 定义一个String类型的变量 保存每个学生的成绩
		String result = "";
		for (int num = 1; num <= 5; num++) {
			System.out.println("请输入第" + num + "名同学的成绩：");
			double score = input.nextDouble();
			result += "第" + num + "名同学的成绩：" + score + "\n";
		}
		System.out.println("********************学生成绩列表********************");
		System.out.println(result);

	}

}
