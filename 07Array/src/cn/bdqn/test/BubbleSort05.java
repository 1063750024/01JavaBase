package cn.bdqn.test;

public class BubbleSort05 {

	/**
	 * 冒泡排序：
	 *  两两相比小靠前！
	 *  等量转换！
	 */
	public static void main(String[] args) {
		// 声明一个数组
		int[] nums = { 10, 5, 7, 20, 50 };

		/**
		 *  外层循环控制比较几轮                   数组长度-1
		 *  内层循环控制一轮比较多少次！     数组长度-1-i
		 *  外层循环执行一次！  内层循环执行一轮！
		 *  
		 *  
		 *  如果说外层循环的变量是i=0
		 *  内层循环的变量是j=0 并且j<5!
		 *  
		 *  
		 *  那么： i=0的时候   j会从0到4 
		 *        i=1的时候   j也会从0到4    以此类推
		 *        直到i不满足条件的时候  双重循环才结束！
		 */

		for (int i = 0; i < nums.length - 1; i++) { // 外层循环 控制轮数
			System.out.println("外层循环====》第" + (i + 1) + "轮");
			for (int j = 0; j < nums.length - 1 - i; j++) { // 内层循环
				// 两两相比小靠前！
				if (nums[j] > nums[j + 1]) { // 等量转化
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		for (int i : nums) {
			System.out.println(i);
		}
	}

}
