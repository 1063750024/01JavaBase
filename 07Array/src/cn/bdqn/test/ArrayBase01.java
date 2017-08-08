package cn.bdqn.test;

import java.util.Scanner;

public class ArrayBase01 {

	public static void main(String args[]) {
		/**
		 * 需求：
		 * 想创建一个能保存5名学员成绩的数组！
		 * 
		 * 分析：
		 * 01.学员成绩都是double类型
		 * 02.5学员是一个集合
		 * 
		 * 相同数据类型的一组数据的集合=======》数组
		 */

		// double[] scores = new double[5]; 在声明数组的同时，在内存中开辟了5个连续的空间！
		// System.out.println(scores[5]); 数组下标越界

		String[] scores;// 声明数组
		scores = new String[5]; // 开辟空间

		/**
		scores[0] = "小黑1";
		scores[1] = "小黑2";
		scores[2] = "小黑3";
		scores[3] = "小黑4";
		scores[4] = "小黑5";
		 *  使用循环给5名学生的姓名赋值
		 *  
		 *  scores.length:获取数组的长度
		 *  
		 *  数组的下标最大值=数组的长度-1
		 */
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请您输入下标是" + i + "的姓名");
			scores[i] = input.next();
		}

		// 遍历==》把集合中的每个元素打印出来

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// 创建数组的方式
		int nums[] = { 1, 2, 3, 6, 5, 4 };
		System.out.println(nums[5]);

		double[] scores2 = new double[] { 120, 150, 98 };

	}
}
