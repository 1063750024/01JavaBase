package cn.bdqn.test;

public class TempDemo06 {

	public static void main(String[] args) {
		int 红牛 = 5;
		int 绿茶 = 15;

		// 创建一个空瓶子

		int 空瓶子 = 红牛; // 红牛的瓶子空了
		红牛 = 绿茶; // 绿茶的瓶子空了
		绿茶 = 空瓶子;
		System.out.println(红牛);
		System.out.println(绿茶);

	}

}
