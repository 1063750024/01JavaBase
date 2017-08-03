package cn.bdqn.whileAndDo;

import java.util.Scanner;

/**
 *  先执行一次，再判断！
 *  
 *  do{
 *    循环体
 *  }while(循环条件);
 * 
 * 加需求：
 *  01.记录每次用户购买的商品金额！  之后进行 结账！
 *  02.增加购买商品的数量
 *  03.增加消费清单
 */
public class Shopping04 {

	public static void main(String[] args) {
		System.out.println("欢迎光临   *********小豆腐*********    超市");
		Scanner input = new Scanner(System.in);
		String answer = "";
		// 设置一个记录总金额的变量
		double money = 0;
		// 设置一个变量 保存 消费清单
		String bill = "";
		do {
			System.out.println("1:帽子 \t 2:网球拍 \t 3：网球鞋");
			System.out.println("请输入您购买的商品编号：");
			int choose = input.nextInt();
			System.out.println("请输入您购买的商品的数量：");
			int count = input.nextInt();
			switch (choose) {
			case 1:
				bill += "您购买了" + count + "个帽子：需要支付金额为：￥" + (20 * count) + "\n";
				money += (20 * count);
				break;
			case 2:
				bill += "您购买了" + count + "个网球拍：需要支付金额为：￥" + (30 * count) + "\n";
				money += (30 * count);
				break;
			case 3:
				bill += "您购买了" + count + "个网球鞋：需要支付金额为：￥" + (50 * count) + "\n";
				money += (50 * count);
				break;
			}
			System.out.println("是否继续购物？（y/n）");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("您的消费账单如下：" + bill);
		System.out.println("您的实际消费金额为：" + money);
		System.out.println("欢迎下次光临！");

	}
}
