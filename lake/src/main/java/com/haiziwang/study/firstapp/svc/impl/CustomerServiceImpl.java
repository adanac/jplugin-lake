package com.haiziwang.study.firstapp.svc.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.haiziwang.platform.study.lake.api.dbo.Customer;
import com.haiziwang.platform.study.lake.api.dbo.Emp;
import com.haiziwang.study.firstapp.mapper.ICustomerMapper;
import com.haiziwang.study.firstapp.svc.api.ICustomerService;

import net.jplugin.common.kits.AssertKit;
import net.jplugin.core.das.api.PageCond;
import net.jplugin.core.das.api.PageQueryResult;
import net.jplugin.core.das.mybatis.impl.IMybatisService;
import net.jplugin.core.service.api.ServiceFactory;
import net.jplugin.ext.webasic.api.JPluginApi;
import net.jplugin.ext.webasic.api.JPluginApi.CT;
import net.jplugin.ext.webasic.api.JPluginApi.RL;

/**
 * @author Administrator
 *
 */
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public long addCustomer(Customer cust) {
		ICustomerMapper mapper = dbService().getMapper(ICustomerMapper.class);
		mapper.insert(cust);
		mapper.updateStatus(cust.getCustId(), Customer.STATUS_NORMAL);
		return cust.getCustId();
	}

	@Override
	public PageQueryResult<Customer> queryCustomer(HashMap<String, String> query, PageCond pageCond) {
		List<Customer> list = dbService().getMapper(ICustomerMapper.class).queryWithPage(query, pageCond);
		PageQueryResult<Customer> result = new PageQueryResult<>(pageCond, list);
		return result;
	}

	@Override
	public Customer getCustomer(long custId) {
		return dbService().getMapper(ICustomerMapper.class).find(custId);
	}

	@Override
	public void updateCustomer(Customer cust) {
		AssertKit.assertNotNull(cust.getCustId(), "id must not null");
		dbService().getMapper(ICustomerMapper.class).update(cust);
	}

	@Override
	public void changeStatus(Long custId, String status) {
		dbService().getMapper(ICustomerMapper.class).updateStatus(custId, status);
	}

	@Override
	public boolean removeCustomer(Long custId) {
		return dbService().getMapper(ICustomerMapper.class).remove(custId) > 0;
	}

	@Override
	public List<Customer> queryAllCustomer() {
		Logger.info("查询所有客户信息...");
		return dbService().getMapper(ICustomerMapper.class).queryAllCustomer();
	}

	private IMybatisService dbService() {
		return ServiceFactory.getService(IMybatisService.class);
	}
	
	@Override
	public List<Emp> queryEmp() {
		return dbService().getMapper(ICustomerMapper.class).queryEmp();
	}

	@Override
	public void addEmp(Emp emp) {
		ICustomerMapper mapper = dbService().getMapper(ICustomerMapper.class);
		mapper.addEmp(emp);
	}
	private static final Log Logger = LogFactory.getLog(CustomerServiceImpl.class);
}
