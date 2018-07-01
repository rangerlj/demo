package com.whcs.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @ClassName: MybatisUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author lj
 * @date 2018年3月21日 下午2:39:44
 * 
 * 
 */
public class MybatisUtil {
	private static SqlSessionFactory sf;
	static {
		try {
			// 加载主配置文件
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			String config = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(config);
			sf = builder.build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 创建链接
	 */
	public static SqlSession getSession() {
		return sf.openSession();
	}
}
