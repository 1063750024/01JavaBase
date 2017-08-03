package cn.bdqn.whileAndDo;

import java.util.Scanner;

public class WhileDemo {
	/**
	 *   每天检查 大家的 作业！
	 *   两种情况：
	 *     01.完成             ==》奖励
	 *     02.未完成          ==》继续写作业     ===》再检查      ==》继续写作业     ===》再检查 
	 * 
	 * 怎么使用while循环解决这个问题？
	 * 
	 * 
	 * 程序调试
	 *  01.设置断点
	 *  02.运行debug    F5 单步进入   F6 单步执行
	 *  03. F6 单步执行  观察变量
	 *  
	 *  如果说找不到一些debug运行时的视图
	 *  
	 *  点击工具菜单中的window ==>show  view 中查询
	 */
	public static void main(String[] args) {
		// 获取用户的输入
		Scanner input = new Scanner(System.in);
		System.out.println("您是否完成了作业（y/n）");
		String answer = input.next();
		while (answer.equalsIgnoreCase("y")) {
			System.out.println("继续写作业  ");
			System.out.println("您是否完成了作业（y/n）");
			answer = input.next();
		}
		System.out.println("恭喜合格！");
	}
}
