package cn.bdqn.test;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		/**
		 * 需求：
		 * 
		 *  第一名，奖励苹果一个！
		 *  第二名，奖励粘画一个！
		 *  第三名，奖励铅笔一个！
		 *  其他没有奖励！
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入您的考试名次：");
		int num = input.nextInt();
		if (num == 1) {
			System.out.println("第一名，奖励苹果一个！");
		} else if (num == 2) {
			System.out.println("第二名，奖励粘画一个！");
		} else if (num == 3) {
			System.out.println("第三名，奖励铅笔一个！");
		} else {
			System.out.println("没有奖励！");
		}

		/**
		 * 多重if 虽然能 解决我们上述问题！
		 * 但是在实际使用中，我们不推荐使用！
		 * 
		 * 为什么？
		 * 01.if适用于  范围区间的判断！
		 * 02.等值判断使用switch来做
		 * 
		 * 什么是switch选择结构
		 * 
		 * 表达式:byte,short,int,char,Enum(枚举)  JDK1.7+ String
		 *  switch(表达式){
		 *    case  常量1：
		 *          代码块1；
		 *           break； 
		 *    case  常量2：
		 *          代码块2；
		 *           break； 
		 *    case  常量3：
		 *          代码块3；
		 *           break； 
		 *    default：                    （如果没有找到对应的常量值，默认执行的代码块）
		 *          默认的代码块；
		 *           break； 
		 *  }
		 *  
		 *  特点：
		 *    01. 每个case中的代码块，尽量以break结尾！
		 *      因为没有break代码会继续执行，知道遇到第一个break为止，跳出switch结构！
		 *    02. default代码块可以放置在任何位置，不会出现错误！ 通常放在最后！也可以省略！
		 *    
		 *    
		 *    switch和多重if的区别
		 *    
		 *    相同点
		 *  01.都是用来处理多分支条件的结构
		 *  02.都可以来做等值判断
		 *  
		 *    不同点
		 *  01.switch只能做等值判断
		 *  02.多重if也可以做 区间判断
		 *    
		 */

	}
}
