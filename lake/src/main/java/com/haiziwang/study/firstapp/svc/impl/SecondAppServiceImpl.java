package com.haiziwang.study.firstapp.svc.impl;

import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Emp;
import com.haiziwang.study.firstapp.constant.Cons;
import com.haiziwang.study.firstapp.mapper.ICustomerMapper;
import com.haiziwang.study.firstapp.mapper.ISecondAppMapper;
import com.haiziwang.study.firstapp.svc.api.ISecondAppService;

import net.jplugin.core.das.mybatis.api.MyBatisServiceFactory;
import net.jplugin.core.das.mybatis.impl.IMybatisService;
import net.jplugin.core.service.api.ServiceFactory;

public class SecondAppServiceImpl implements ISecondAppService {
	private IMybatisService dbService() {
		return MyBatisServiceFactory.getService(Cons.DB_NAME);

	}

	@Override
	public List<Emp> queryEmp() {
		return dbService().getMapper(ISecondAppMapper.class).queryEmp();
	}

	@Override
	public void addEmp(Emp emp) {
		dbService().getMapper(ISecondAppMapper.class).addEmp(emp);

	}

	@Override
	public void insertTwoEmp(Emp emp1, Emp emp2) {
		ServiceFactory.getService(IMybatisService.class).getMapper(ICustomerMapper.class).addEmp(emp1);
		dbService().getMapper(ISecondAppMapper.class).addEmp(emp2);

	}

}
