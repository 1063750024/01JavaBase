package cn.bdqn.choose;

import java.util.Scanner;

public class DoubleIf {

	/**
	 * 需求：
	 * 学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛，
	 * 根据性别分别进入男子组和女子组
	 * 
	 *分析：
	 *01.判断是否能够进入决赛
	 *02.在确定进入决赛的情况下，判断是进入男子组，还是进入女子组
	 *
	 *
	 *  String类中有equals的方法！
	 *   作用是  判断两个字符串的内容是否一致！
	 *    一致返回true！
	 *    否则返回false！
	 *
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		double score = input.nextDouble();
		// 01. 先判断 成绩
		if (score < 10) {
			System.out.println("恭喜您！进入决赛！");
			System.out.println("请输入您的性别！（男/女）");
			String sex = input.next();
			// 02. 根据性别 进入不同的组别
			if (sex.equals("男")) {
				System.out.println("进入了男子组");
			} else if (sex.equals("女")) {
				System.out.println("进入了女子组");
			} else {
				System.out.println("没有此性别！");
			}
		} else {
			System.out.println("很遗憾！无缘决赛！");
		}

	}
}
