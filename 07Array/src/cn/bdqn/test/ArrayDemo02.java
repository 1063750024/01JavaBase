package cn.bdqn.test;

import java.util.Scanner;

public class ArrayDemo02 {

	/**
	 * 需求：
	 * 01.创建一个能保存5名学生成绩的数组
	 * 02.循环给数组赋值
	 * 03.获取5名学生的平均分
	 */
	public static void main(String[] args) {
		// 创建double类型的数组
		double[] scores = new double[5];
		// 创建一个变量保存总分数
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "名学员的成绩：");
			scores[i] = input.nextDouble();
			sum += scores[i]; // 计算总成绩
		}
		System.out.println("平均分为" + (sum / scores.length));

	}
}
