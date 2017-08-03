package cn.bdqn.whileAndDo;

public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 需求：
		 * 求100以内的偶数和
		 * 
		 * 分析：
		 * 01.设置一个初始保存总和  sum
		 * 02.确定条件？？   100以内的数字
		 * 03.判断 是不是偶数，是偶数相加
		 * 
		 */

		int sum = 0;
		int num = 0; // 开始的数字
		while (num <= 100) {
			if (num % 2 == 0) {// 是偶数
				sum = sum + num;
			}
			num++;
		}
		System.out.println("100以内的偶数和==》" + sum);
	}

}
