package cn.bdqn.shopping;

import java.util.Scanner;

public class ShoppingTest {

	/**
	 * 超市换购
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的消费金额：");
		double money = input.nextDouble();
		System.out.println("是否参加换购活动？（y/n）");
		String answer = input.next();
		if (answer.equalsIgnoreCase("y")) { // 忽略大小写比较内容
			System.out.println("1:满50，加2元换购百事可乐！");
			System.out.println("2:满100，加5元换购面粉！");
			System.out.println("3:满200，加10元换购欧莱雅！");
			System.out.println("请选择您需要换购的商品编号：");
			// 获取用户的输入
			if (input.hasNextInt()) { // 是正确的数字
				int choose = input.nextInt();
				switch (choose) {
				case 1:
					if (money >= 50) {
						System.out.println("消费金额：" + (money + 2));
						System.out.println("成功换购百事可乐");
					} else {
						System.out.println("消费金额不足！不支持换购！实际消费：" + money);
					}
					break;
				case 2:
					if (money >= 100) {
						System.out.println("消费金额：" + (money + 5));
						System.out.println("成功换购面粉");
					} else {
						System.out.println("消费金额不足！不支持换购！实际消费：" + money);
					}
					break;
				case 3:
					if (money >= 200) {
						System.out.println("消费金额：" + (money + 10));
						System.out.println("成功换购欧莱雅");
					} else {
						System.out.println("消费金额不足！不支持换购！实际消费：" + money);
					}
					break;
				default:
					break;
				}
			} else {
				System.out.println("输入不正确！代表不能换购！");
				System.out.println("您的消费金额为：" + money);
			}
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("不参加换购活动！");
			System.out.println("您的消费金额为：" + money);
		} else {
			System.out.println("你是不是有病啊？");
		}
	}

}
