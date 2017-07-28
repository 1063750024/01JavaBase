package cn.bdqn.test;

public class RelationOperator {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 50;

		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		/**
		 * == :
		 * 01. 数值类型 使用的时候   比较的是 值
		 * 02. 引用数据类型   比较的是在内存中的地址
		 * 
		 */
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
	}
}
