package cn.bdqn.test;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		/**
		 * 需求：
		 *  第一名，奖励苹果一个！
		 *  第二名，奖励粘画一个！
		 *  第三名，奖励铅笔一个！
		 *  其他没有奖励！
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入您的考试名次：");
		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("第一名，奖励苹果一个！");
			break;
		case 2:
			System.out.println("第二名，奖励粘画一个！");
			break;
		case 3:
			System.out.println("第三名，奖励铅笔一个！");
			break;
		default:
			System.out.println("没有奖励！");
			break;
		}

		/**
		 * break：
		 *   01.代表跳出当前方法体！ 距离break最近的一个｛｝
		 *   02.break之后不允许写代码！因为其后的代码不会得到执行！
		 * 
		 */

	}

}
