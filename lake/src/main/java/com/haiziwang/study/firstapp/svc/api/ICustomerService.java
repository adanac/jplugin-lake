package com.haiziwang.study.firstapp.svc.api;

import java.util.HashMap;
import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Customer;
import com.haiziwang.platform.study.lake.api.dbo.Emp;

import net.jplugin.core.ctx.api.Rule;
import net.jplugin.core.ctx.api.Rule.TxType;
import net.jplugin.core.das.api.PageCond;
import net.jplugin.core.das.api.PageQueryResult;

public interface ICustomerService {
	@Rule
	List<Customer> queryAllCustomer();

	@Rule(methodType = TxType.REQUIRED)
	boolean removeCustomer(Long custId);

	@Rule(methodType = TxType.REQUIRED)
	void changeStatus(Long custId, String status);

	@Rule(methodType = TxType.REQUIRED)
	void updateCustomer(Customer cust);

	@Rule
	Customer getCustomer(long custId);

	@Rule
	PageQueryResult<Customer> queryCustomer(HashMap<String, String> query, PageCond pageCond);

	@Rule(methodType = TxType.REQUIRED)
	long addCustomer(Customer cust);
    @Rule
	List<Emp> queryEmp();
    
    @Rule(methodType = TxType.REQUIRED)
	void addEmp(Emp emp);

}
