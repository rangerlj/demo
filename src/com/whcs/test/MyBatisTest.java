package com.whcs.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.whcs.dao.DeptDao;
import com.whcs.entity.User;
import com.whcs.util.MybatisUtil;

/**
 * @ClassName: MyBatisTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author lj
 * @date 2018年3月21日 下午2:50:31
 * 
 * 
 */
public class MyBatisTest extends MyTestTwo {

	/**
	 * 测试MybatisUtil是否可用 能否成功获取SqlSession对象
	 */
	@Test
	public void testSession() {
		System.out.println(MybatisUtil.getSession());
	}

	@Test
	public void testOne() {
		String str = "sfdasdd";
		String str1 = str.replaceAll("a", "2");
		String str2 = str.replace('s', '3');

		boolean bool = str.contains("sdd");
		// System.out.println(split[0]);
		System.out.println(bool);
		Thread t = new Thread() {
			public void run() {
				System.out.println("wet");
				test();

			}
		};
		t.start();
		Runnable r = new Runnable() {

			@Override
			public void run() {

				System.out.println("wer");

			}

		};
		new Thread(r).start();
		System.out.println("two");
	}

	public void test() {
		System.out.println("yiqi");
	}
}
