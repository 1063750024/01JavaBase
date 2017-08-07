package cn.bdqn.test;

import java.util.Scanner;

public class LoginDemo08 {

	/**
	 * 需求：
	 * 01.验证用户名和密码是否正确
	 * 02.用户最多输入错误的次数是3次
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入您的用户名：");
			String userName = input.next();
			System.out.println("请输入您的密码：");
			String password = input.next();
			// 验证用户名和密码是否正确
			if (userName.equals("admin") && password.equals("admin")) {
				System.out.println("恭喜您 登录成功！");
				break;
			} else {
				if (i == 2) { // 最后一次
					System.out.println("您已经输入错误 3次！！！");
					break;
				}
				System.out.println("输入错误！您还有" + (2 - i) + "次机会");
			}

		}

	}
}
