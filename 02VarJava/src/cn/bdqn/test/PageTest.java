package cn.bdqn.test;

public class PageTest {

	/**
	 * 
	 *   总数据                页大小                 总页数
	 *   counts      pageSize       pageCount
	 *     100          10            10
	 *     100          99             2
	 *   
	 *     500          25                           ？
	 *     
	 *     思路？
	 *     
	 *     总数据量 与 页大小 进行取余操作！
	 *     01.没有余数     总数据量/页大小
	 *     02.有余数        总数据量/页大小+1
	 *     
	 */
	public static void main(String[] args) {

		// 定义 总数据量
		int counts = 100;
		// 定义 页大小
		int pageSize = 10;
		// 获取总页数
		int pageCount = (counts % pageSize == 0) ? (counts / pageSize)
				: (counts / pageSize + 1);
		System.out.println("总页数是：" + pageCount);
	}

}
