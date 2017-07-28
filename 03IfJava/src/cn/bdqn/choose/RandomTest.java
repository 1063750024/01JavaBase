package cn.bdqn.choose;

import java.util.Random;

public class RandomTest {

	/**
	
	 * 需求：
	 *     得到一个随机数字！   让系统随机生成0 - 10 但是不包含 10
	 *     
	 * 随机数   Random 
	 * nextDouble()     
	 *        
	 * 算术类      Math
	 * Math.random()   让系统随机生成  0.0--1.0 但是不包含 1.0
	 *  
	 */
	public static void main(String[] args) {

		// 实例化了一个 随机数 对象
		Random r = new Random();
		double num = r.nextDouble(); // 0.0 - 1.0 但是不包含 1.0
		System.out.println("Random产生的随机数是：" + num);

		num = Math.random();
		System.out.println("Math产生的随机数是：" + num);
		System.out.println("得到一个随机数字！   让系统随机生成0 - 10 但是不包含 10");

		int result = (int) (Math.random() * 10);
		System.out.println(result);

	}

}
