package cn.bdqn.util;

import java.util.Arrays;

public class StringDemo03 {
	/**
	 * 需求：
	 * 01.以，为分割点，把String转换成一个数组
	 * 02.把String转换成int之后求和
	 */
	public static void main(String[] args) {

		String a = "50,20,100,30,400,800";
		String[] words = a.split(",");
		// 定义一个变量保存 和
		int sum = 0;
		for (int i = 0; i < words.length; i++) {
			sum += Integer.parseInt(words[i]);
		}
		System.out.println(sum);

		System.out.println("*************字符的逆序输出***************");
		char[] chars = { 'z', 'f', 'g', 'c', 'a', 'b', 'j' };
		Arrays.sort(chars);
		for (char c : chars) {
			System.out.println(c);
		}

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);
		}

	}
}
