package cn.bdqn.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderMenu {

	/**
	 * 小豆腐  订餐系统
	 */
	public static void main(String[] args) {
		/**
		 * 订餐人，选择菜品，份数，送餐地址，送餐时间，订单状态，总金额，点赞（评价）
		 * 
		 * 初始化上述信息
		 * 01.创建对应的数组
		 * 02.数组初始化
		 * 03.显示菜单（让用户看到菜单）
		 * 04.根据用户不同的选择，进入不同的功能模块
		 */
		String[] names = new String[5]; // 订餐人
		String[] dishMsgs = { "小葱拌豆腐", "臭豆腐", "皮蛋豆腐", "麻婆豆腐", "豆腐脑" };// 菜品
		double[] prices = { 15, 5.8, 50, 32, 6.6 }; // 菜品对应的单价
		int[] numbers = new int[5]; // 份数
		String[] addresses = new String[5]; // 送餐地址
		Date[] dates = new Date[5]; // 送餐时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String[] times = new String[5]; // 送餐时间 用户看到的应该 2017-08-13
		int[] states = new int[5]; // 订单状态 0:已经预定 1：已经完成
		double[] sumPrices = new double[5]; // 总金额
		int[] praiseNums = new int[5]; // 点赞（评价） 数量

		// 初始化 数组

		names[0] = "小豆腐";
		dishMsgs[0] = "小葱拌豆腐";
		numbers[0] = 10;
		addresses[0] = "宇宙中心";
		dates[0] = new Date(); // 当前系统时间
		times[0] = sdf.format(dates[0]);// 用户看到的应该 2017-08-13
		states[0] = 0; // 已经预定
		sumPrices[0] = 150;
		praiseNums[0] = 9999;

		names[1] = "大豆腐";
		dishMsgs[1] = "皮蛋豆腐";
		numbers[1] = 5;
		addresses[1] = "宇宙中心";
		dates[1] = new Date(); // 当前系统时间
		times[1] = sdf.format(dates[1]);// 用户看到的应该 2017-08-13
		states[1] = 0; // 已经预定
		sumPrices[1] = 250;
		praiseNums[1] = 666;

		System.out.println("===========小豆腐点餐系统===========");
		Scanner input = new Scanner(System.in);
		int num = -1;
		// 定义一个标记 用来标识 用户是否退出系统
		boolean isExit = false;

		do {
			// 显示菜单
			System.out.println("当前系统时间是：" + sdf.format(new Date()));
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐带");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("=============================================");
			System.out.println("请您输入：");
			int choose = input.nextInt();
			switch (choose) {
			case 1: // 我要订餐
				System.out.println("============我要订餐============");
				// 定义一个标记 看看餐带 满了没有 满了就不能购物了
				boolean flag = false;
				for (int i = 0; i < names.length; i++) { // 遍历 订餐人的数组
					if (names[i] == null) { // 证明可以订餐
						flag = true;// 可以购买
						// 遍历所有的菜品 +单价+点赞数量
						System.out.println("序号\t\t\t菜品\t\t\t单价\t\t\t点赞数");
						for (int j = 0; j < dishMsgs.length; j++) {
							System.out.println((j + 1) + "\t\t\t" + dishMsgs[j]
									+ "\t\t\t" + prices[j] + "\t\t\t"
									+ praiseNums[j]);
						}
						System.out.println("请您输入姓名：");
						String name = input.next();
						System.out.println("请选择菜品的编号：");
						int chooseDishName = input.nextInt();
						System.out.println("请输入购买菜品的份数：");
						int number = input.nextInt();
						System.out.println("请输入送餐的地址：");
						String address = input.next();
						System.out.println("请输入送餐的时间：（时:分:秒）");
						String time = input.next();
						/**
						 * 01.求总金额
						 * 02.是否有送餐费    大于50免送餐费 否则+10元
						 */
						double sumPrice = prices[chooseDishName - 1] * number; // 总金额
						double price = (sumPrice > 50) ? 0 : 10;// 是否有送餐费
						System.out.println("您购买的菜品如下：");
						System.out.println(dishMsgs[chooseDishName - 1]
								+ number + "份");
						System.out.println("餐费：" + sumPrice);
						System.out.println("送餐费：" + price);
						System.out.println("总金额：" + (price + sumPrice));

						// 向数组中 (餐带)保存 用户输入的数据
						names[i] = name;
						addresses[i] = address;
						times[i] = time;
						sumPrices[i] = (price + sumPrice);
						states[i] = 0;
						dishMsgs[i] = dishMsgs[chooseDishName - 1];
						numbers[i] = number;
						break;
					}
				}
				if (!flag) { // 餐带满了
					System.out.println("餐带已满，请稍后购物........");
				}
				break;
			case 2: // 查看餐带

				System.out.println("============查看餐带============");
				System.out
						.println("序号\t\t\t订餐人\t\t\t菜品(份数)\t\t\t状态\t\t\t总金额\t\t\t送餐时间\t\t\t送餐地址\t\t\t点赞数");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) { // 有人订餐 显示
						String state = (states[i] == 0) ? "已经预定" : "已经完成";
						System.out.println((i + 1) + "\t\t\t" + names[i]
								+ "\t\t\t" + dishMsgs[i] + (numbers[i])
								+ "\t\t\t" + state + "\t\t\t" + sumPrices[i]
								+ "\t\t\t" + times[i] + "\t\t\t" + addresses[i]
								+ "\t\t\t" + praiseNums[i]);
					}
				}
				break;
			case 3: // 签收订单
				System.out.println("============查看餐带============");
				/**
				 * 需要考虑的情况
				 * 01.状态已经完成！不需要签收
				 * 02.状态已经预定！需要签收
				 * 03.没有此订单！不能签收
				 */
				System.out.println("请输入要签收的订单编号:");
				int orderNum = input.nextInt();
				// 定义标记 记录 用户的错误
				int sign = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 0
							&& (orderNum - 1) == i) { // 有订单而且是已经预定！需要签收
						states[i] = 1;
						sign = 1;
						break;
					} else if (names[i] != null && states[i] == 1) {// 有订单而且是
						sign = 2; // 已经完成！不可以签收
					}
				}
				if (sign == 1) {
					System.out.println("订单已经签收完毕！");
				} else if (sign == 2) {
					System.out.println("订单不需要重复签收！");
				} else {
					System.out.println("没有此订单！请您确认");
				}
				break;
			case 4: // 删除订单
				System.out.println("============ 删除订单============");
				/**
				 * 01.没有订单
				 * 02.有订单，但是没有完成
				 * 03.有订单，是已经完成 可以删除
				 */
				System.out.println("请输入要删除的订单编号:");
				int delNum = input.nextInt();
				int delFlag = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[delNum - 1] == 1) {// 有订单，是已经完成
						for (int j = delNum - 1; j < names.length - 1; j++) { // 删除之后的位置
																				// 前移
							names[j] = names[j + 1];
							dishMsgs[j] = dishMsgs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumPrices[j] = sumPrices[j + 1];
							numbers[j] = numbers[j + 1];
							praiseNums[j] = praiseNums[j + 1];
						}
						delFlag = 1; // 已经删除
					} else if (names[i] != null && states[delNum - 1] == 0) { // 订单没有签收不能删除
						delFlag = 2; // 不能删除
					}
				}

				if (delFlag == 1) {
					System.out.println("订单已经删除完毕！");
				} else if (delFlag == 2) {
					System.out.println("订单还没签收！不能删除");
				} else {
					System.out.println("没有此订单！请您确认");
				}
				break;
			case 5: // 我要点赞
				System.out.println("============ 我要点赞============");
				System.out.println("编号\t\t\t菜名");
				for (int i = 0; i < dishMsgs.length; i++) {
					System.out.println((i + 1) + "\t\t\t" + dishMsgs[i]);
				}

				System.out.println("请您输入点赞的菜品编号：");
				int chooseNum = input.nextInt();
				praiseNums[chooseNum - 1]++;
				System.out.println("点赞成功！");
				break;
			case 6: // 退出系统
				isExit = true;
				break;
			}
			// 出了我们的switch之后再次让用户进入主菜单
			if (!isExit) {
				System.out.println("输入0返回主菜单");
				num = input.nextInt();
			}
		} while (num == 0);

	}
}
