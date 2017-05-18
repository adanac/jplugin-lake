package com.haiziwang.study.lake.web;

import com.haiziwang.study.lake.web.controller.CustomerController;
import com.haiziwang.study.lake.web.controller.SecondAppController;

import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.ext.webasic.ExtensionWebHelper;

public class Plugin extends AbstractPlugin{
	public Plugin(){
		//发布一个到JSP的控制器，JSP页面未实现，仅作服务端代码写法示例
		ExtensionWebHelper.addWebExControllerExtension(this, "/jsptest", CustomerController.class);
		ExtensionWebHelper.addWebExControllerExtension(this, "/second", SecondAppController.class);
	}

	@Override
	public void init() {
		
		
	}

	@Override
	public int getPrivority() {
		return 0;
	}
	
}