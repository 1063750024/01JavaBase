package cn.bdqn.test;

public class DoubleForDemo07 {

	/**
	 * 双重循环
	 * 	int i = 0;
		int j = 0;
		for (; i < 5; i++) {
			System.out.println("外层循环==》" + i);
			for (; j < 5; j++) {
				System.out.println(j);
			}
		}
		
		
		int num = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("i===>" + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("j==>" + j);
				for (int k = 0; k < 3; k++) {
					System.out.println("k=>" + k);
					num++;
				}
			}
		}

		System.out.println(num);

	 */
	public static void main(String[] args) {
		// 这是电话号码中的数字
		int[] phoneNums = { 5, 1, 3, 7, 9, 8, 0, 4 };
		// 保存每个号码对应的下标
		int[] nums = { 1, 0, 3, 0, 2, 6, 7, 4, 4, 4, 5 };
		String phone = "";
		// 求 手机号？
		for (int i = 0; i < nums.length; i++) {
			phone += phoneNums[nums[i]];
		}
		System.out.println(phone);

	}
}
