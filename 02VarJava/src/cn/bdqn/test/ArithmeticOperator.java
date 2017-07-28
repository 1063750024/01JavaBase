package cn.bdqn.test;

public class ArithmeticOperator {

	public static void main(String[] args) {
		double java = 80; // 80.0
		double music = 2; // 2.0
		System.out.println(java + music);
		System.out.println(java - music);
		System.out.println(java * music);
		System.out.println(java / music);
		System.out.println(java % music); // 取余

		/**
		 *  一元运算符  ：  ++   --             一个变量做操作
		 *  二元运算符  ：  +   -  *  /  %      两个变量做操作
		 *  三元运算符  ：    ? :                三个变量做操作
		 *  
		 *    表达式1?表达式2:表达式3
		 *    
		 *    表达式1:必须是个boolean值
		 *    表达式2：如果表达式1的值为true，执行的内容
		 *    表达式3：如果表达式1的值为false，执行的内容
		 *  
		 *  alt + ↓ 移动代码
		 */

		int num = 0; // 计数
		System.out.println("++num:" + (++num));// 先自身加1，之后参与程序运行
		System.out.println("num++:" + (num++)); // 先参与程序运行，之后自身加1
		System.out.println("num:" + num);

		System.out.println("***********三元运算符***************");

		System.out.println("(2 > 5)吗？" + (2 > 5));

		String result = (20 > 5) ? "真" : "假";
		System.out.println(result);

	}

}
