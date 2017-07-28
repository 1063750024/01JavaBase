package cn.bdqn.choose;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		/**
		 * 需求：
		 * 如果张浩的Java考试成绩大于98分，
		 * 张浩就能获得一个MP4作为奖励
		 * 否则，罚写java代码！
		 * 
		 * 分析：
		 * 01.张浩的成绩有两种可能
		 * 02.  大于98   小于等于98
		 * 03.针对于这种 只有两种清空的 需求 使用if （如果）
		 *     也可以使用三元表达式
		 *     String result = (javaScore > 98) ? "获得一个MP4作为奖励" : "罚写java代码";
		       System.out.println(result);
		        
		        
		    表达式：必须是boolean类型的值！
		         01.如果表达式为true时，执行if｛｝中的代码块！
		         02.否则，执行if｛｝之外的代码块！
		       
		        if(表达式){
		                     代码块
		        }
		        
		    注意点：如果if结构体中的代码块只有一行语句！那么可以省略｛｝   ！ 但是不推荐！
		     
		                表达式：必须是boolean类型的值！
		         01.如果表达式为true时，执行代码块1！
		         02.否则，执行代码块2！
		        if(表达式){
		                     代码块1
		        }else{
		                      代码块2
		        }
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入张浩的成绩：");
		// 获取成绩
		double javaScore = input.nextDouble();
		// 判断
		if (javaScore > 98) {
			System.out.println("获得一个MP4作为奖励");
		} else {
			System.out.println("罚写java代码");
		}
	}
}
