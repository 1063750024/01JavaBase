package cn.bdqn.whileAndDo;

public class WhileTest {
	/**
	 * 
	 *    我们有 两级菜单
	 *   
	 *    一级菜单
	 *       01.登录
	 *       02.退出
	 *       
	 *     二级菜单    点击登录之后出现的页面
	 *       01.增加
	 *       02.删除
	 *       03.返回 
	 *   
	 *       问题：
	 *       01.当我们点击 返回  应该回到一级菜单
	 *       02.一级菜单的内容要原样输入
	 *       03.我们能确定用户点击 返回的次数吗？
	 *       04.我们难道要书写多次   一级菜单的内容？？？
	 *     
	 *       05.一级菜单的内容 放在我们的循环体中 即可！
	 */
	public static void main(String[] args) {
		System.out.println("好好学习 天天向上1");
		System.out.println("好好学习 天天向上2");
		System.out.println("好好学习 天天向上3");
		System.out.println("好好学习 天天向上4");
		System.out.println("好好学习 天天向上5");
		System.out.println("**********************************");

		/**  语法：
		 *  while(循环条件){
		 *       循环体(循环操作)
		 *  }
		 *  
		 *  先判断，再执行！
		 *  当满足 循环条件  进入 循环体操作！
		 *  
		 *  需求：  
		 *  打印100遍！而且每一遍都加上第几遍！！
		 *  
		 */

		int num = 1; // 定义一个变量 记录我们的打印次数
		while (num <= 100) {
			System.out.println("好好学习 天天向上" + num);
			// 必须让num+1 迭代变量
			num++;
		}
		System.out.println(num);

	}
}
