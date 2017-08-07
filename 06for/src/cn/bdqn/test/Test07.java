package cn.bdqn.test;

import java.util.Scanner;

public class Test07 {

	/**
	 * 需求：
	 * 01.循环录入5名学生的考试成绩
	 * 02.如果录入的分数 是  负数 ，则 停止录入
	 * 03.如果输入都是正确的那么计算平均分
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;// 记录总分数
		boolean flag = true; // 记录是否计算平均分
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "名同学的成绩：");
			double score = input.nextDouble();
			if (score < 0) {// 停止录入
				flag = false;
				System.out.println("您的输入不合法！");
				break;
			}
			sum += score;
		}
		if (flag) {
			System.out.println("平均分为：" + (sum / 5));
		} else {
			System.out.println("您的输入有误！无法计算");
		}

	}
}
