package com.haiziwang.study.firstapp.svc.api;

import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Emp;

import net.jplugin.core.ctx.api.Rule;
import net.jplugin.core.ctx.api.Rule.TxType;

public interface ISecondAppService {
	@Rule
	public List<Emp> queryEmp();
    
	@Rule(methodType = TxType.REQUIRED)
	public void addEmp(Emp emp);
	
	@Rule(methodType = TxType.REQUIRED)
	public void insertTwoEmp(Emp emp1,Emp emp2);
}
