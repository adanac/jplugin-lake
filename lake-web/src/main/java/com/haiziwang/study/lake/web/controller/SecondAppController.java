package com.haiziwang.study.lake.web.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.haiziwang.platform.study.lake.api.dbo.Emp;
import com.haiziwang.study.firstapp.apo.ResponseVo;
import com.haiziwang.study.firstapp.constant.Cons;
import com.haiziwang.study.firstapp.svc.api.ICustomerService;
import com.haiziwang.study.firstapp.svc.api.ISecondAppService;

import net.jplugin.core.ctx.api.RuleServiceFactory;
import net.jplugin.ext.webasic.api.AbstractExController;

public class SecondAppController extends AbstractExController {
	
	public void show() {

		List<Emp> firstEmpList  = RuleServiceFactory.getRuleService(ICustomerService.class).queryEmp();
		List<Emp> secondEmpList = RuleServiceFactory.getRuleService(ISecondAppService.class).queryEmp();

		Map<String, Object> result = new LinkedHashMap<String, Object>();
		if (firstEmpList != null && firstEmpList.size() > 0) {
			result.put("emp1", firstEmpList.get(0));
		}
		if (secondEmpList != null && secondEmpList.size() > 0) {
			result.put("emp2", secondEmpList.get(0));
		}
		
		String jsonString = JSON.toJSONString(result);
		renderJson(jsonString);

	}

	public void insertTwoEmp() {
		
		ResponseVo responseVo = new ResponseVo();
		Emp e1 = new Emp("59638", "123456", "18362882982", "这是第一个数据源", "张三", 0, null);
		Emp e2 = new Emp("27489", "123456", "18362882986", "这是第二个数据源", "李四", 0, null);
		
		try {
			RuleServiceFactory.getRuleService(ISecondAppService.class).insertTwoEmp(e1, e2);
			responseVo.setSuccess(true);
			responseVo.setErrorCode(Cons.Code.OPERATE_SUCCESS);
			responseVo.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setSuccess(false);
			responseVo.setErrorCode(Cons.Code.INSERT_ERROR);
			responseVo.setMsg("数据库插入失败");
		}
		
		renderJson(JSON.toJSONString(responseVo));
	}

}
