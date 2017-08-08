package cn.bdqn.test;

import java.util.Scanner;

public class ArrayDemo03 {

	/**
	 * 
	 * 需求：
	 *   有一组数据{10,5,6,80,100}
	 *   01.循环输出数组中的每一个元素
	 *   02.求数组中所有元素的和
	 *   03.猜字游戏，让用户输入一个数字，然后进行循环比较
	 */
	public static void main(String[] args) {
		// 创建一个数组 保存这组数据
		int nums[] = { 10, 5, 6, 80, 100 };
		// 定义一个变量保存总数
		int sum = 0;
		System.out.println("*****遍历数组******");
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println(nums[i]);
		}
		System.out.println("总和为：" + sum);

		System.out.println("请您输入一个数字：");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		boolean flag = false; // 默认没有找到
		// 循环比较 于数组中的每一个元素进行比对
		for (int i = 0; i < nums.length; i++) {
			if (choose == nums[i]) {
				flag = true;
				break; // 找到之后直接退出循环
			}
		}
		if (flag) {
			System.out.println("恭喜您中奖！");
		} else {
			System.out.println("很遗憾......");
		}

	}

}
