package com.turing.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.turing.mybatis.dao.EmpMapper;
import com.turing.mybatis.entity.Emp;

public class test2 {
	private static SqlSessionFactory getSqlSessionFactory() throws IOException {
	//设置mybatis主配置文件路径
	String resource = "mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	return sqlSessionFactory;
}
	
	public static void main(String[] args) {
	 try {
		 //打开session
		SqlSession session	= getSqlSessionFactory().openSession();
		//创建EmpMapper对象
		//用到了代理模式
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    //打印
	    Emp emp= mapper.getEmpById(1);
	    System.out.println(emp);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
