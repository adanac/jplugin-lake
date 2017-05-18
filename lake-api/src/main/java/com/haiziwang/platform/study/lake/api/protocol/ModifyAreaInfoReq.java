 
 
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.haiziwang.commodity.CommodityAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.lang.GenericWrapper;
import com.paipai.netframework.kernal.NetMessage;
import java.util.Vector;

/**
 *修改区域sku信息
 *
 *@date 2016-06-01 09:59:51
 *
 *@since version:0
*/
public class  ModifyAreaInfoReq extends NetMessage
{
	/**
	 * machinekey，必填
	 *
	 * 版本 >= 0
	 */
	 private String machineKey = new String();

	/**
	 * Source，必填
	 *
	 * 版本 >= 0
	 */
	 private String source = new String();

	/**
	 * 场景Id，必填
	 *
	 * 版本 >= 0
	 */
	 private long sceneId;

	/**
	 *  选项,未使用  
	 *
	 * 版本 >= 0
	 */
	 private long option;

	/**
	 * skuid，必填
	 *
	 * 版本 >= 0
	 */
	 private long skuId;

	/**
	 * 区域信息，必填
	 *
	 * 版本 >= 0
	 */
	 private Vector<AreaInfoPo> areaInfo = new Vector<AreaInfoPo>();

	/**
	 * 权限操作字段 
	 *
	 * 版本 >= 0
	 */
	 private AuthorizationField4App authApp = new AuthorizationField4App();

	/**
	 * InReserve
	 *
	 * 版本 >= 0
	 */
	 private String inReserve = new String();


	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushString(machineKey);
		bs.pushString(source);
		bs.pushUInt(sceneId);
		bs.pushUInt(option);
		bs.pushLong(skuId);
		bs.pushObject(areaInfo);
		bs.pushObject(authApp);
		bs.pushString(inReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		machineKey = bs.popString();
		source = bs.popString();
		sceneId = bs.popUInt();
		option = bs.popUInt();
		skuId = bs.popLong();
		areaInfo = (Vector<AreaInfoPo>)bs.popVector(AreaInfoPo.class);
		authApp = (AuthorizationField4App)bs.popObject(AuthorizationField4App.class);
		inReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x20011808L;
	}


	/**
	 * 获取machinekey，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return machineKey value 类型为:String
	 * 
	 */
	public String getMachineKey()
	{
		return machineKey;
	}


	/**
	 * 设置machinekey，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setMachineKey(String value)
	{
		this.machineKey = value;
	}


	/**
	 * 获取Source，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return source value 类型为:String
	 * 
	 */
	public String getSource()
	{
		return source;
	}


	/**
	 * 设置Source，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setSource(String value)
	{
		this.source = value;
	}


	/**
	 * 获取场景Id，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return sceneId value 类型为:long
	 * 
	 */
	public long getSceneId()
	{
		return sceneId;
	}


	/**
	 * 设置场景Id，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setSceneId(long value)
	{
		this.sceneId = value;
	}


	/**
	 * 获取 选项,未使用  
	 * 
	 * 此字段的版本 >= 0
	 * @return option value 类型为:long
	 * 
	 */
	public long getOption()
	{
		return option;
	}


	/**
	 * 设置 选项,未使用  
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setOption(long value)
	{
		this.option = value;
	}


	/**
	 * 获取skuid，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return skuId value 类型为:long
	 * 
	 */
	public long getSkuId()
	{
		return skuId;
	}


	/**
	 * 设置skuid，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setSkuId(long value)
	{
		this.skuId = value;
	}


	/**
	 * 获取区域信息，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return areaInfo value 类型为:Vector<AreaInfoPo>
	 * 
	 */
	public Vector<AreaInfoPo> getAreaInfo()
	{
		return areaInfo;
	}


	/**
	 * 设置区域信息，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:Vector<AreaInfoPo>
	 * 
	 */
	public void setAreaInfo(Vector<AreaInfoPo> value)
	{
		if (value != null) {
				this.areaInfo = value;
		}else{
				this.areaInfo = new Vector<AreaInfoPo>();
		}
	}


	/**
	 * 获取权限操作字段 
	 * 
	 * 此字段的版本 >= 0
	 * @return authApp value 类型为:AuthorizationField4App
	 * 
	 */
	public AuthorizationField4App getAuthApp()
	{
		return authApp;
	}


	/**
	 * 设置权限操作字段 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:AuthorizationField4App
	 * 
	 */
	public void setAuthApp(AuthorizationField4App value)
	{
		if (value != null) {
				this.authApp = value;
		}else{
				this.authApp = new AuthorizationField4App();
		}
	}


	/**
	 * 获取InReserve
	 * 
	 * 此字段的版本 >= 0
	 * @return inReserve value 类型为:String
	 * 
	 */
	public String getInReserve()
	{
		return inReserve;
	}


	/**
	 * 设置InReserve
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setInReserve(String value)
	{
		this.inReserve = value;
	}


	protected int getClassSize()
	{
		return  getSize() - 4;
	}

	
	public int getSize()
	{
		int length = 0;
		try{
				length = 0;  //size_of(ModifyAreaInfoReq)
				length += ByteStream.getObjectSize(machineKey, null);  //计算字段machineKey的长度 size_of(String)
				length += ByteStream.getObjectSize(source, null);  //计算字段source的长度 size_of(String)
				length += 4;  //计算字段sceneId的长度 size_of(uint32_t)
				length += 4;  //计算字段option的长度 size_of(uint32_t)
				length += 17;  //计算字段skuId的长度 size_of(uint64_t)
				length += ByteStream.getObjectSize(areaInfo, null);  //计算字段areaInfo的长度 size_of(Vector)
				length += ByteStream.getObjectSize(authApp, null);  //计算字段authApp的长度 size_of(AuthorizationField4App)
				length += ByteStream.getObjectSize(inReserve, null);  //计算字段inReserve的长度 size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
	public int getSize(String encoding)
	{
		int length = 0;
		try{
				length = 0;  //size_of(ModifyAreaInfoReq)
				length += ByteStream.getObjectSize(machineKey, encoding);  //计算字段machineKey的长度 size_of(String)
				length += ByteStream.getObjectSize(source, encoding);  //计算字段source的长度 size_of(String)
				length += 4;  //计算字段sceneId的长度 size_of(uint32_t)
				length += 4;  //计算字段option的长度 size_of(uint32_t)
				length += 17;  //计算字段skuId的长度 size_of(uint64_t)
				length += ByteStream.getObjectSize(areaInfo, encoding);  //计算字段areaInfo的长度 size_of(Vector)
				length += ByteStream.getObjectSize(authApp, encoding);  //计算字段authApp的长度 size_of(AuthorizationField4App)
				length += ByteStream.getObjectSize(inReserve, encoding);  //计算字段inReserve的长度 size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}

	/**
	 *下面是生成toString()方法
	 此方法用于调试时打开*
	 *如果要打开此方法，请加入commons-lang-2.4.jar
	 *并导入 import org.apache.commons.lang.builder.ToStringBuilder;
	 *      import org.apache.commons.lang.builder.ToStringStyle;
	 *
	 */
	//@Override
	//public String toString() {
	//	return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	//}
}
