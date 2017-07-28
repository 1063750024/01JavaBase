package cn.bdqn.choose;

public class BitTest {

	/**
	 * 我们之前用的是 逻辑运算符！
	 * 
	 *  位运算符 ：针对于2进制数字进行运算！
	 *  
	 *  01. & 与运算符
	 *      两个数字进行操作，位置的数字都为1，结果为1，否则为0！
	 *  02. | 或运算符
	 *      两个数字进行操作，位置的数字有一个是1，结果为1，否则为0！
	 *  03.~ 非运算符
	 *       两个数字进行操作，位置的数字是1，结果为0 。数字是0，结果为1！
	 *       数字  取相反值  -1
	 *  04. ^ 异或运算符
	 *      两个数字进行操作，位置的数字相同，结果为0 。否则为1！
	 *      
	 *  05. >>
	 *  06. <<
	 *   源码  补码  反码
	 */
	public static void main(String[] args) {
		// 十进制 转换成 二进制
		System.out.println("10对应的2进制：" + Integer.toBinaryString(10));
		// 二进制 转换成十进制
		System.out.println(Integer.valueOf("1010", 2));
		System.out.println("============= & 与运算符=============");
		int num1 = 10;
		int num2 = 11;
		/**
		 * 分析：
		 *  num1对应的值是10！    
		 *  01.把10转换成2进制的数字   ===》1010    
		 *  num2对应的值是11！ 
		 *  02.把11转换成2进制的数字   ===》1011
		 */
		System.out.println("num1和num2与运算的结果是：" + (num1 & num2));

		System.out.println("============= | 或运算符=============");

		System.out.println("num1和num2或运算的结果是：" + (num1 | num2));

		System.out.println("============= ~ 非运算符=============");
		System.out.println("num1非运算的结果是：" + (~num1));

		System.out.println("=============  ^ 异或运算符=============");
		System.out.println("num1和num2异或运算的结果是：" + (num1 ^ num2));
	}
}
