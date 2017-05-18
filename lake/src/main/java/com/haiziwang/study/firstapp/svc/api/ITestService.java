package com.haiziwang.study.firstapp.svc.api;

import net.jplugin.core.ctx.api.Rule;

public interface ITestService {
	@Rule
	public String queryTest();
}
