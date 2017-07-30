package cn.bdqn.test;

import java.util.Scanner;

public class PlaySwitch3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("请您输入您的姓名：");
		String haha = input.next();
		switch (haha) {
		default:
			System.out.println("没有奖励！");
		case "":
			System.out.println("第一名，奖励苹果一个！");
			break;
		case "李四":
			System.out.println("第二名，奖励粘画一个！");
			break;
		case "王五":
			System.out.println("第三名，奖励铅笔一个！");
			break;

		}

	}
}
