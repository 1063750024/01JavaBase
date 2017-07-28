package cn.bdqn.choose;

import java.util.Scanner;

public class LogicalTest {

	/**
	 * 逻辑运算符  
	 * 01. &&   短路与   并且的关系
	 *         表达式1 && 表达式2
	 *      001.如果  表达式1为false，则不执行  表达式2
	 *      002.表达式1，表达式2都为true，整体返回true ！ 否则false！
	 * 
	 * 02. ||   短路或   或者的关系
	 *         表达式1 || 表达式2
	 *      001.如果  表达式1为true，则不执行  表达式2
	 *      002.表达式1，表达式2有一个表达式为true，整体返回true ！ 
	 *      003.两个表达式都为false!整体返回false！
	 * 03.  ！     非           取反
	 */
	public static void main(String[] args) {
		/**
		 * 需求：
		 * 张浩的Java成绩大于98分，而且音乐成绩大于80分，老师会奖励他；
		 * 或者Java成绩等于100分，音乐成绩大于70分，老师也会奖励他
		 * 
		 * 分析 ：
		 *  01.什么条件才能获得奖励？  下面的两种情况都可以获取奖励
		 *       001.Java成绩>98    && 音乐成绩> 80分
		 *       002.Java成绩==100  && 音乐成绩> 70分
		 *  02.怎么把这两种情况 合并？？
		 *     001  和 002 什么关系？？
		 *     或者===》  ||      
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入java成绩");
		double javaScore = input.nextDouble();
		System.out.println("请输入music成绩");
		double musicScore = input.nextDouble();
		// 开始逻辑判断
		if ((javaScore > 98 && musicScore > 80)
				|| (javaScore == 100 && musicScore > 70)) {
			System.out.println("恭喜您！长城一日游！");
		} else {
			System.out.println("回家继续写java代码！");
		}

	}

}
