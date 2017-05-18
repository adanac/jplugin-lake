package com.haiziwang.study.firstapp.mapper;

import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Emp;

public interface ISecondAppMapper {

	public List<Emp> queryEmp();

	public void addEmp(Emp emp);
	
	public void insertTwoEmp(Emp emp1,Emp emp2);
}
