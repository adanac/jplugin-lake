package com.haiziwang.study.firstapp;

import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

import com.haiziwang.platform.esf.client.cpp.api.CppClientProxyFactory;
import com.haiziwang.platform.study.lake.api.protocol.AreaInfoPo;
import com.haiziwang.platform.study.lake.api.protocol.GetSellerInfoReq;
import com.haiziwang.platform.study.lake.api.protocol.GetSellerInfoResp;
import com.haiziwang.platform.study.lake.api.protocol.GetUidByEuidReq;
import com.haiziwang.platform.study.lake.api.protocol.GetUidByEuidResp;
import com.haiziwang.platform.study.lake.api.protocol.GetUidByMobileReq;
import com.haiziwang.platform.study.lake.api.protocol.GetUidByMobileResp;
import com.haiziwang.platform.study.lake.api.protocol.ModifyAreaInfoReq;
import com.haiziwang.platform.study.lake.api.protocol.ModifyAreaInfoResp;
import com.paipai.component.c2cplatform.WebStubCntl;

import net.jplugin.core.kernel.api.PluginEnvirement;

public class Main {
	static AtomicInteger ai = new AtomicInteger(1);

	public static void main(String[] args) throws Exception {
		PluginEnvirement.getInstance().startup();
		// CppDemo();
		// CppDemoYache();

	}

	public static void CppDemo() throws Exception {
		WebStubCntl cppStub = null;
		try {
			GetSellerInfoReq req = new GetSellerInfoReq();
			req.setMachineKey("192.168.24.87");// 填写本机IP
			req.setSource("firstapp");// 填写数据来源
			req.setSceneId(1);
			GetSellerInfoResp resp = new GetSellerInfoResp();
			// 调用C++服务,ESF自动负载均衡，
			cppStub = CppClientProxyFactory.createCppWebStubCntl();
			cppStub.setTimeout_ms(5000);
			for (int i = 0; i < 1; i++) {
				System.out.println("================================调用C++的DEMO 开始================================");
				System.out.println(cppStub.toString());
				cppStub.invoke(req, resp, 1024 * 1024);
				System.out.println(resp.getVecsellerInfoPo().toString());
				System.out.println("================================调用C++的DEMO 结束================================");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	// 压测代码
	public static void CppDemoYache() throws Exception {
		try {
			for (int i = 0; i < 1; i++) {
				// new ThreadGetSellerInfoReq().start();
				// new ThreadGetUidByMobileReq().start();
				// new ThreadModifyAreaInfoReq().start();
				// new ThreadModifyAreaInfoReq().start();
				new ThreadGetUidByEuidReq().start();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}

class ThreadModifyAreaInfoReq extends Thread {
	public void run() {
		WebStubCntl stub = CppClientProxyFactory.createCppWebStubCntl();
		stub.setTimeout_ms(5000);
		for (int i = 0; i < 100; i++) {
			try {
				ModifyAreaInfoReq req = new ModifyAreaInfoReq();
				req.setSkuId(41);

				AreaInfoPo areaInfo = new AreaInfoPo();
				areaInfo.setAreaPromotDesc("618畅销");
				areaInfo.setAreaPromotDescEffectiveTime(System.currentTimeMillis());
				areaInfo.setAreaPromotDescExpireTime(System.currentTimeMillis() / 1000 + 1000);
				req.setAreaInfo(new Vector<AreaInfoPo>(Arrays.asList(areaInfo)));

				ModifyAreaInfoResp resp = new ModifyAreaInfoResp();
				stub.invoke(req, resp, 1024 * 1024);
				System.out.println(this.getName() + " :" + i + " :" + resp.getResult());
			} catch (Exception e) {
				System.out.println("线程号：" + this.getName() + " :" + i);
			}

		}
	}
}

class ThreadGetUidByMobileReq extends Thread {
	public void run() {
		WebStubCntl stub = CppClientProxyFactory.createCppWebStubCntl();
		stub.setTimeout_ms(5000);
		for (int i = 0; i < 100; i++) {
			try {
				GetUidByMobileReq req = new GetUidByMobileReq();
				req.setMachineKey("192.168.38.112");// 填写本机IP
				req.setSource("POP-SERVER");// 填写数据来源
				req.setSceneId(1);
				req.setMobile("13811110000");
				GetUidByMobileResp resp = new GetUidByMobileResp();
				stub.invoke(req, resp, 1024 * 1024);
				System.out.println(this.getName() + " :" + i + " :" + resp.getResult());
			} catch (Exception e) {
				System.out.println("线程号：" + this.getName() + " :" + i);
			}

		}
	}
}

class ThreadGetSellerInfoReq extends Thread {
	public void run() {
		WebStubCntl stub = CppClientProxyFactory.createCppWebStubCntl();
		stub.setTimeout_ms(5000);
		for (int i = 0; i < 100; i++) {
			try {
				GetSellerInfoReq req = new GetSellerInfoReq();
				req.setMachineKey("127.0.0.1");// 填写本机IP
				req.setSource("firstapp");// 填写数据来源
				req.setSceneId(1);
				GetSellerInfoResp resp = new GetSellerInfoResp();
				stub.invoke(req, resp, 1024 * 1024);
				System.out.println(this.getName() + " :" + i + " :" + resp.getResult());
			} catch (Exception e) {
				System.out.println("线程号：" + this.getName() + " :" + i);
			}

		}
	}
}

class ThreadGetUidByEuidReq extends Thread {
	public void run() {
		WebStubCntl stub = CppClientProxyFactory.createCppWebStubCntl();
		stub.setTimeout_ms(5000);
		for (int i = 0; i < 1; i++) {
			try {
				GetUidByEuidReq req = new GetUidByEuidReq();
				req.setMachineKey("findUidByCode");
				req.setSource("CenterServiceImpl.java");
				req.setSceneId(0);
				req.setEuidSource(6);
				req.setEuid("19012462");
				GetUidByEuidResp resp = new GetUidByEuidResp();
				// 调用C++服务,ESF自动负载均衡
				stub.invoke(req, resp, 1024 * 1024);
				System.out.println("--------------------" + this.getName() + " :" + i + " :" + resp.getResult());
			} catch (Exception e) {
				System.out.println("线程号：" + this.getName() + " :" + i);
			}

		}
	}
}
