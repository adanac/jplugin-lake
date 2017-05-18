package com.haiziwang.study.firstapp.svc.impl;

import com.haiziwang.study.firstapp.svc.api.ITestService;

public class ITestServiceImpl implements ITestService {
	
	@Override
	public String queryTest() {
		return "2016...";
	}
}
