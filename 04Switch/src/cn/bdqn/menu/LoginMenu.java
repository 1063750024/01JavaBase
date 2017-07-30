package cn.bdqn.menu;

import java.util.Scanner;

/**
 * 登录小例子
 */
public class LoginMenu {

	public static void main(String[] args) {
		System.out.println("============一级菜单============");
		System.out.println("1:登录系统");
		System.out.println("2:退出系统");
		System.out.println("请输入您的选择:::::");
		/**
		 *  获取用户的输入
		 *  01.用户输入数字  进入正常操作
		 *  02.输入非数字   退出系统
		 */
		Scanner input = new Scanner(System.in);
		// 如果用户输入的是一个整数 则进入 if结构！
		if (input.hasNextInt()) {
			int choose = input.nextInt();
			// 根据用户不同的选择进入不同的case块
			switch (choose) {
			case 1: // 登录系统
				System.out.println("============二级菜单============");
				System.out.println("1:客户信息管理");
				System.out.println("2:购物结算");
				System.out.println("3:真情回馈");
				System.out.println("4:注销");
				System.out.println("请输入您的选择:::::");
				int answer = input.nextInt();
				switch (answer) {
				case 1:
					System.out.println("购物管理系统====》客户信息管理");
					System.out.println("1:显示所有客户信息");
					System.out.println("2:添加所有客户信息");
					System.out.println("3:修改所有客户信息");
					System.out.println("4:查询客户信息");
					break;
				case 2:
					System.out.println("2:购物结算");
					break;
				case 3:
					System.out.println("购物管理系统====》真情回馈");
					System.out.println("1:幸运大放送");
					System.out.println("2:幸运抽奖");
					System.out.println("3:生日问候");
					break;
				case 4:
					System.out.println("4:注销");
					break;
				default:
					break;
				}
				break;
			case 2: // 退出系统
				System.out.println("欢迎下次光临！");
				break;
			default:
				System.out.println("不知道什么情况");
				break;
			}
		} else {
			System.out.println("请您输入正确的数字！ 程序已经结束！");
		}

	}

}
