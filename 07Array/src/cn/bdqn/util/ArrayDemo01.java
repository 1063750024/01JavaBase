package cn.bdqn.util;

public class ArrayDemo01 {

	public static void main(String[] args) {
		/**
		 * 求数组的最大值 和 最小值
		 */

		// 定义一个数组 参赛的选手
		int[] nums = { 50, 20, 100, 30, 400, 800 };
		// 默认第一个元素先上台 擂主
		int max = nums[0];
		// 循环比较 打擂
		for (int i = 0; i < nums.length; i++) {
			// 如果发现 元素比 我们的max值大，那就让这个元素成为max
			if (nums[i] > max) {
				max = nums[i];
				System.out.println("历届的擂主：" + max);
			}
		}
		System.out.println("抱得美人归的擂主==》" + max);

	}

}
