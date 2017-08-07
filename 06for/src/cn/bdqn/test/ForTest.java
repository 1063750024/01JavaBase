package cn.bdqn.test;

public class ForTest {
	public static void main(String[] args) {
		/**
		 * 需求：
		 *  打印出100次好好学习！
		 *  int num = 1;
			while (num <= 100) {
				System.out.println("好好学习" + num);
				num++;
			}
			
			把我们之前的
			01. 初始化变量
			02. 循环条件
			03. 迭代变量
			合并在一行进行书写！
		 */
		for (int num = 1; num <= 100; num++) {
			System.out.println("好好学习" + num);
		}

	}
}
