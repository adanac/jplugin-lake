 
 
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.UserAccount4CsAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.netframework.kernal.NetMessage;
import com.paipai.util.io.ByteStream;

/**
 *
 *
 *@date 2016-07-12 11:45:31
 *
 *@since version:1
*/
public class  GetUserInfoByUidReq extends NetMessage
{
	/**
	 * 机器码，请取cookie里面的visitkey，无法获得visitkey的可以填随机字符串，必填
	 *
	 * 版本 >= 0
	 */
	 private String machineKey = new String();

	/**
	 * 调用来源, 请填调用方自己的源文件名称，必填
	 *
	 * 版本 >= 0
	 */
	 private String source = new String();

	/**
	 * 场景id：1，只获取用户信息；2，获取用户信息和宝宝信息。必填
	 *
	 * 版本 >= 0
	 */
	 private long sceneId;

	/**
	 * 用户id，必填
	 *
	 * 版本 >= 0
	 */
	 private long uid;

	/**
	 * 输入保留字
	 *
	 * 版本 >= 0
	 */
	 private String inReserve = new String();


	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushString(machineKey);
		bs.pushString(source);
		bs.pushUInt(sceneId);
		bs.pushLong(uid);
		bs.pushString(inReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		machineKey = bs.popString();
		source = bs.popString();
		sceneId = bs.popUInt();
		uid = bs.popLong();
		inReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x40131801L;
	}


	/**
	 * 获取机器码，请取cookie里面的visitkey，无法获得visitkey的可以填随机字符串，必填
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
	 * 设置机器码，请取cookie里面的visitkey，无法获得visitkey的可以填随机字符串，必填
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
	 * 获取调用来源, 请填调用方自己的源文件名称，必填
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
	 * 设置调用来源, 请填调用方自己的源文件名称，必填
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
	 * 获取场景id：1，只获取用户信息；2，获取用户信息和宝宝信息。必填
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
	 * 设置场景id：1，只获取用户信息；2，获取用户信息和宝宝信息。必填
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
	 * 获取用户id，必填
	 * 
	 * 此字段的版本 >= 0
	 * @return uid value 类型为:long
	 * 
	 */
	public long getUid()
	{
		return uid;
	}


	/**
	 * 设置用户id，必填
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setUid(long value)
	{
		this.uid = value;
	}


	/**
	 * 获取输入保留字
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
	 * 设置输入保留字
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
				length = 0;  //size_of(GetUserInfoByUidReq)
				length += ByteStream.getObjectSize(machineKey, null);  //计算字段machineKey的长度 size_of(String)
				length += ByteStream.getObjectSize(source, null);  //计算字段source的长度 size_of(String)
				length += 4;  //计算字段sceneId的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
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
				length = 0;  //size_of(GetUserInfoByUidReq)
				length += ByteStream.getObjectSize(machineKey, encoding);  //计算字段machineKey的长度 size_of(String)
				length += ByteStream.getObjectSize(source, encoding);  //计算字段source的长度 size_of(String)
				length += 4;  //计算字段sceneId的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
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
