package com.turing.mybatis.dao;

import com.turing.mybatis.entity.Emp;

public interface EmpMapper{
	/**
	  * 接口
	 * @return
	 */
   Emp getEmpById(int id);
	
}
