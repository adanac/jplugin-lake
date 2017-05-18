package com.haiziwang.platform.study.lake.api;

import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Customer;

public interface ICustomerServiceExport {

	public List<Customer> queryAllCustomer();
}
