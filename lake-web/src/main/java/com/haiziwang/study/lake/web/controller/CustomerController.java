package com.haiziwang.study.lake.web.controller;

import javax.servlet.http.HttpServletRequest;

import com.haiziwang.platform.study.lake.api.dbo.Customer;
import com.haiziwang.study.firstapp.svc.api.ICustomerService;

import net.jplugin.core.ctx.api.RuleServiceFactory;
import net.jplugin.ext.webasic.api.AbstractExController;
/**
 * 本例演示一个通过Controller到JSP的用法，具体jsp页面未实现
 * @author Administrator
 *
 */
public class CustomerController extends AbstractExController{
	public void show(){
		HttpServletRequest request = getReq();
		
		String custId = (String) request.getAttribute("custId");
		//或者  String custId = (String) request.getParameter("custId");
		
		Customer cust = RuleServiceFactory.getRuleService(ICustomerService.class).getCustomer(Long.parseLong(custId));
		setAttr("cust", cust);
		
		renderJsp("/page/cust-detail.jsp");
	}
	
}
