package cn.bdqn.test;

import java.util.Scanner;

import org.junit.Test;

public class DoubleArray08 {

	/**
	 * 二维数组：实质还是一维数组！
	 * 只不过数组中的每一个元素，又是一个数组而已！
	 */
	@Test
	public void test01() {
		// 在声明二维数组的时候 必须指定外围数组的长度
		int[][] nums = new int[2][2]; // int[][] nums = { {x,x}, {x,x} };
		// 给nums数组中的第一个数组的第一个元素赋值
		nums[0][0] = 5;
		nums[0][1] = 51;
		nums[1][0] = 6;
		nums[1][1] = 62;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
		}

	}

	@Test
	public void test02() {
		int[][] nums = { { 1 }, { 2, 5 }, { 7, 9 } };
		/**
		 * 上面定义的二维数组   有几个元素
		 * 01.输出二维数组的长度
		 *二维数组中每一个元素的长度？？我们怎么获取呢？
		 * 02.循环二维数组 之后 nums[i]代表每一个元素，所以就.length
		 * 我想获取每个值！！！
		 */
		// System.out.println(nums.length); 2维数组的长度
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(nums[i].length); 数组中元素的长度
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
		}
	}

	/**
	 * 需求：
	 *   有三个班级 各3名学员！
	 *  01. 使用二维数组表示
	 *  02. 循环获取每个班级每名学员的成绩
	 *  03. 分别获取每个班级的平均分
	 */
	@Test
	public void test03() {
		// 创建数组
		int[][] students = new int[3][3];
		Scanner input = new Scanner(System.in);
		int[] sum = new int[3];// 保存每个班级的总分数
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个班级学员的成绩：");
			for (int j = 0; j < students[i].length; j++) {
				System.out.println("第" + (j + 1) + "学员的成绩：");
				students[i][j] = input.nextInt(); // 获取每个学员的成绩
				sum[i] += students[i][j]; // 每个班级的总分数
			}
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println("第" + (i + 1) + "个班级的平均成绩是：" + (sum[i] / 3.0));
		}

	}

}
