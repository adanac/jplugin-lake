package com.haiziwang.study.firstapp.export;
import java.util.HashMap;
import java.util.List;

import com.haiziwang.platform.study.lake.api.dbo.Customer;
import com.haiziwang.study.firstapp.Main;
import com.haiziwang.study.firstapp.svc.api.ICustomerService;

import net.jplugin.common.kits.AssertKit;
import net.jplugin.core.ctx.api.RuleServiceFactory;
import net.jplugin.core.das.api.PageCond;
import net.jplugin.core.das.api.PageQueryResult;
import net.jplugin.ext.webasic.api.JPluginApi;
import net.jplugin.ext.webasic.api.JPluginApi.CT;
import net.jplugin.ext.webasic.api.Para;
/**
 * <pre>
 * 本类负责CustomerService的导出，命名规范为XXXXXExport。
 * 所有方法都作为一个中转，调用内部RuleService层面的方法。
 * 这里的@Para标记是必须的，用于标记Rest方法传递时的参数名称。
 * 这里的@Rule一般放到RuleService层面去标记，特殊情况（比如在这里调用了两个内部Service）也可以放在这里来标记。
 * </pre>
 * @author Administrator
 *
 */
public class CustomerServiceExport {

	ICustomerService svc;
	
	public long addCustomer(@Para(name="cust") Customer cust){
		return service().addCustomer(cust);
	}

	public PageQueryResult<Customer> queryCustomer(@Para(name="query") HashMap<String,String> query,@Para(name="pageCond") PageCond pageCond){
		return service().queryCustomer(query, pageCond);
	}
	
	public Customer getCustomer(@Para(name="custId") long custId){
		return service().getCustomer(custId);
	}
	
	public void updateCustomer(@Para(name="cust") Customer cust){
		AssertKit.assertNotNull(cust.getCustId(), "id must not null");
		service().updateCustomer(cust);
	}
	
	public void changeStatus(@Para(name="custId") Long custId,@Para(name="status") String status){
		AssertKit.assertNotNull(custId, "id must not null");
		AssertKit.assertNotNull(status, "status must not null");
		
		service().changeStatus(custId, status);
	}
	
	public boolean removeCustomer(@Para(name="custId") Long custId){
		AssertKit.assertNotNull(custId, "id must not null");
		return service().removeCustomer(custId);
	}
	
	/**
	 *  功能说明：应用的API验证时，需要添加 @JPluginApi(callerType = CT.APP)注解，添加了此注解的服务，在应用启动时，该服务会自动上报至应用API授权系统中，
	 **       登录test.site.haiziwang.com中的“应用API授权”菜单，可对上报的所有服务进行进一步的API授权操作
	 *  name: 服务操作的别名（可选项，也可以不设置）
	 */
	@JPluginApi(callerType = CT.APP, name = "")
	public List<Customer> queryAllCustomer(@Para(name="zhongwen") String zhongwen){
		return service().queryAllCustomer();
	}
	
	@JPluginApi(callerType = CT.APP, name = "查询所有客户信息")
	public List<Customer> queryAllCustomerToken(){
		try {
			Main.CppDemoYache();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return service().queryAllCustomer();
	}
	
	private ICustomerService service(){
		if (svc == null){ 
			synchronized (this) {
				svc = RuleServiceFactory.getRuleService(ICustomerService.class);	
			}
		}
		return svc;
	}
}
