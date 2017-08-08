package cn.bdqn.util;

import java.util.Arrays;

public class ArraysDemo02 {

	/**
	 * Arrays是操作数组的工具类！
	 * int: 集合中每一个元素的数据类型
	 * num：只是一个变量名，保存每一个需要输出的元素
	 * nums:需要遍历的集合
	 * for(int  num:nums){
	 * }
	 */
	public static void main(String[] args) {
		int[] nums = { 50, 20, 100, 30, 400, 800 };
		System.out.println("排序之前");
		for (int num : nums) {
			System.out.println(num);
		}
		// 01.实现数组的排序
		Arrays.sort(nums);
		// 使用for加强 实现遍历
		System.out.println("排序之后");
		for (int num : nums) {
			System.out.println(num);
		}
		// 02.把数组转换成一个字符串
		String result = Arrays.toString(nums);
		System.out.println(result);
		// 03.将数组中的所有元素都改变成一个值
		Arrays.fill(nums, 521);
		System.out.println("看看所有的元素是否被改变");
		for (int num : nums) {
			System.out.println(num);
		}
		System.out.println("新数组");
		// 04.将数组复制成一个新数组
		nums = Arrays.copyOf(nums, 10);
		for (int num : nums) {
			System.out.println(num);
		}
		// 05.查询某个元素 在 数组中的位置 前提 必须 先排序
		int[] nums2 = { 50, 20, 100, 30, 400, 800 };
		Arrays.sort(nums2);
		int index = Arrays.binarySearch(nums2, 400);
		System.out.println("400出现的位置是：" + index);

		// 将一个Stirng类型的字符串转换成 char类型的数组
		String a = "50,20,100,30,400,800";
		char[] words = a.toCharArray();
		for (char c : words) {
			System.out.print(c);
		}
	}
}
