package cn.bdqn.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo04 {

	/**
	 * 插入 算法
	 * 前提:我们数组中的数据 必须是 有序的！
	 */
	public static void main(String[] args) {
		// 先定义一个int类型的数组
		int[] nums = new int[6];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 9;
		nums[4] = 10;
		/**
		 *  我们想把 一个数字 插入到数组中 并且保证 数组的顺序
		 *  
		 *  分析：
		 *  01.首先那我们输入的这个数字  循环和数组中的每一个元素进行比较大小
		 *  02.发现我们输入的这个数字 小于 某个元素的时候    （数组是升序  使用 小于    降序使用大于）
		 *    那么这个元素的下标  应该是我们输入的这个数字的下标
		 */
		Scanner input = new Scanner(System.in);
		int index = nums.length - 1; // 存储插入数字的下标
		System.out.println("请您输入一个数字：");
		int num = input.nextInt();
		for (int i = 0; i < nums.length; i++) {
			if (num < nums[i]) { // 找到插入数字的下标
				index = i;
				break; // 找到下标 必须退出
			}
		}
		System.out.println("您插入数字的下标是：" + index);
		/**
		 * 分析 ：
		 * 01.从哪里开始后移？？
		 *    从我们插入数字的下标位置开始往后移？？？
		 *    难道是5往后移？？
		 *    应该是10先往后移！！！  从后往前依次后移   并且赋值
		 * 02.把插入的数字放进数组的指定位置
		 */
		for (int i = nums.length - 1; i > index; i--) {
			nums[i] = nums[i - 1];
		}
		nums[index] = num; // 赋值
		System.out.println(Arrays.toString(nums)); // 把数组转换成Stirng
	}
}
