package cn.bdqn.test;

public class VarTest {

	public static void main(String[] args) {

		// 01.先声明 再赋值
		int money;
		money = 10000;
		money = 20000;
		System.out.println("money===>" + money);

		// 02.声明变量的同时赋值
		int myMoney = 10000;
		System.out.println("myMoney===>" + myMoney);

		System.out.println("1" + 3 + 3); // 133
		System.out.println(3 + "1" + 3); // 313
		System.out.println(3 + 3 + "1"); // 61

		String name; // 声明了一个保存姓名的变量
		// System.out.println(name); 编译错误 因为没有初始化变量
	}
}
