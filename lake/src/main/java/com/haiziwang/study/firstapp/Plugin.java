package com.haiziwang.study.firstapp;

import com.haiziwang.platform.esf.client.cpp.api.ExtensionCppClientHelper;
import com.haiziwang.platform.study.lake.api.protocol.GetSellerInfoReq;
import com.haiziwang.platform.study.lake.api.protocol.GetUidByMobileReq;
import com.haiziwang.platform.study.lake.api.protocol.ModifyAreaInfoReq;
import com.haiziwang.study.firstapp.constant.Cons;
import com.haiziwang.study.firstapp.export.CustomerServiceExport;
import com.haiziwang.study.firstapp.mapper.ICustomerMapper;
import com.haiziwang.study.firstapp.mapper.ISecondAppMapper;
import com.haiziwang.study.firstapp.svc.api.ICustomerService;
import com.haiziwang.study.firstapp.svc.api.ISecondAppService;
import com.haiziwang.study.firstapp.svc.impl.CustomerServiceImpl;
import com.haiziwang.study.firstapp.svc.impl.SecondAppServiceImpl;

import net.jplugin.core.ctx.ExtensionCtxHelper;
import net.jplugin.core.das.ExtensionDasHelper;
import net.jplugin.core.das.mybatis.api.ExtensionMybatisDasHelper;
import net.jplugin.core.das.mybatis.api.MysqlPageInterceptor;
import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.ext.webasic.ExtensionWebHelper;

public class Plugin extends AbstractPlugin{
	public Plugin(){
		
		//发布一个服务
		ExtensionWebHelper.addRestMethodExtension(this, "/custmgr", CustomerServiceExport.class);
		
		//注册一个Mybatis的Mapper
		ExtensionMybatisDasHelper.addMappingExtension(this, ICustomerMapper.class);

		//注册一个本地的服务
		ExtensionCtxHelper.addRuleExtension(this, ICustomerService.class,CustomerServiceImpl.class);
		
		//注册Mybatis分页插件
		ExtensionMybatisDasHelper.addInctprorExtension(this,MysqlPageInterceptor.class);//mysql的分页拦截器
		
		//ExtensionMybatisDasHelper.addInctprorExtension(this,Cons.DB_NAME,OraclePageInterceptor.class);//oracle的分页拦截器

		//增加一个C++调用扩展
		ExtensionCppClientHelper.addCppClientExtension(this, GetSellerInfoReq.class);
		
		//增加一个C++调用扩展
		ExtensionCppClientHelper.addCppClientExtension(this, GetUidByMobileReq.class);
		
		//增加一个C++调用扩展
		ExtensionCppClientHelper.addCppClientExtension(this, ModifyAreaInfoReq.class);
		

		//发布一个到JSP的控制器，JSP页面未实现，仅作服务端代码写法示例
		//ExtensionWebHelper.addWebExControllerExtension(this, "/jsptest", CustomerController.class);
		//注册多数据源
        ExtensionDasHelper.addDataSourceExtension(this,Cons.DB_NAME,"seconddatabase");
        //注册一个本地服务
        ExtensionCtxHelper.addRuleExtension(this, ISecondAppService.class,SecondAppServiceImpl.class);
        //注册一个Mybatis的mapper
        ExtensionMybatisDasHelper.addMappingExtension(this, Cons.DB_NAME,ISecondAppMapper.class);
        
	}
	@Override
	public void init() {
		
	}

	@Override
	public int getPrivority() {
		return 0;
	}
	
}
