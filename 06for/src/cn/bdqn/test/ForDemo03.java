package cn.bdqn.test;

public class ForDemo03 {

	public static void main(String[] args) {
		/**
		 * 需求：
		 *  100以内的整数和
		 */
		int sum = 0; // 保存总和
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) { // 偶数
				sum += i;
			}
		}
		System.out.println("偶数之和：" + sum);
	}

}
