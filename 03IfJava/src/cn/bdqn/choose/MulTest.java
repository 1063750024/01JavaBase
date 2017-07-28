package cn.bdqn.choose;

import java.util.Scanner;

public class MulTest {

	/**
	 *
	 *需求：
	对学员的结业考试成绩评测
	成绩>=80 ：良好 
	成绩>=60 ：中等
	成绩<60   ：差
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的考试成绩：");
		double score = input.nextDouble();
		/**
		 * 使用if
		 *  问题？？
		 *  我们输入的值  多次进去了  if结构
		if (score >= 80) {
			System.out.println("良好");
		}

		if (score >= 60) {
			System.out.println("中等");
		}

		if (score < 60) {
			System.out.println("差");
		}
		 */

		/**
		 *  使用多重if
		 *    注意点：
		 *  01.只要我们的条件满足，则执行一个代码块！ 后续代码块哪怕是满足，也不执行！
		 *  02. 我们一般书写的时候 是  范围或者区间的判断！
		 *  但是 范围或者区间  一般都是从大到小！
		 *  
		 */

		if (score >= 80) {
			System.out.println("中等");
		} else if (score >= 60) {
			System.out.println("良好");
		} else if (score < 60) {
			System.out.println("差");
		}

		System.out.println("程序结束");

	}

}
