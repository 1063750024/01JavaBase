package cn.bdqn.test;

public class TypeConversion {
	/**
	 * 类型转换
	 * 01.自动类型转换
	 *         =右边的类型 小于=左边的类型！
	 * 02.强制类型转换   会造成 数据精度的丢失
	 *     =右边的类型 大于=左边的类型！
	 */
	public static void main(String[] args) {

		/**
		 * double num = 80;
		 *  自动类型转换
		 *  80是 int类型                   8寸的蛋糕
		 *  num是 double类型           12寸的盒子
		 *  
		 *  int 小于  double
		 *  
		 *  
		 *  float num =80.0;
		 *  80.0是 double类型          8寸的蛋糕
		 *  num是 float类型              6寸的盒子
		 *  float 小于  double
		 *  
		 */
		// float num = (float) 80.0;
		// float num = 80.0f;
		// float num = 80.0F;

		// int num = (int) (5 + 1.5);
		// System.out.println(num); 数据精度的丢失

		int num = 5;
		num += 5.5; // 不等同于 num=num+5.0; += 默认在底层执行了强制类型转换
		System.out.println(num);

	}
}
