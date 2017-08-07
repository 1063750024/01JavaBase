package cn.bdqn.test;

public class BreakDemo06 {

	public static void main(String[] args) {

		/**
		 * 
		 * 需求
		 * 01.学生跑圈   圈数为6
		 * 02.第三圈      需要补充能量  之后 继续跑
		 * 03.第五圈      放弃
		 */

		for (int i = 1; i <= 6; i++) {
			System.out.println("第" + i + "圈已经开始了");
			if (i == 3) {
				System.out.println("补充能量！直接进入下一圈！");
				continue;
			}
			if (i == 5) { // 累了 退出！
				System.out.println("累了 退出！");
				break;
			}
			System.out.println(i + "圈结束了");
		}

	}
}
