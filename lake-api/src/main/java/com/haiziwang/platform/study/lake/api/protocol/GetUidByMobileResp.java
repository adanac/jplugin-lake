 
 
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.UserAccount4CsAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.lang.GenericWrapper;
import com.paipai.netframework.kernal.NetMessage;

/**
 *
 *
 *@date 2016-02-29 09:13:08
 *
 *@since version:1
*/
public class  GetUidByMobileResp extends NetMessage
{
	/**
	 * 用户id
	 *
	 * 版本 >= 0
	 */
	 private long uid;

	/**
	 * 错误提示信息
	 *
	 * 版本 >= 0
	 */
	 private String errMsg = new String();

	/**
	 * 输出保留字
	 *
	 * 版本 >= 0
	 */
	 private String outReserve = new String();


	public int serialize(ByteStream bs) throws Exception
	{

		bs.pushUInt(result);
		bs.pushLong(uid);
		bs.pushString(errMsg);
		bs.pushString(outReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{

		result = bs.popUInt();
		uid = bs.popLong();
		errMsg = bs.popString();
		outReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x40138802L;
	}


	/**
	 * 获取用户id
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
	 * 设置用户id
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
	 * 获取错误提示信息
	 * 
	 * 此字段的版本 >= 0
	 * @return errMsg value 类型为:String
	 * 
	 */
	public String getErrMsg()
	{
		return errMsg;
	}


	/**
	 * 设置错误提示信息
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setErrMsg(String value)
	{
		this.errMsg = value;
	}


	/**
	 * 获取输出保留字
	 * 
	 * 此字段的版本 >= 0
	 * @return outReserve value 类型为:String
	 * 
	 */
	public String getOutReserve()
	{
		return outReserve;
	}


	/**
	 * 设置输出保留字
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setOutReserve(String value)
	{
		this.outReserve = value;
	}


	protected int getClassSize()
	{
		return  getSize() - 4;
	}

	
	public int getSize()
	{
		int length = 4;
		try{
				length = 4;  //size_of(GetUidByMobileResp)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += ByteStream.getObjectSize(errMsg, null);  //计算字段errMsg的长度 size_of(String)
				length += ByteStream.getObjectSize(outReserve, null);  //计算字段outReserve的长度 size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
	public int getSize(String encoding)
	{
		int length = 0;
		try{
				length = 0;  //size_of(GetUidByMobileResp)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += ByteStream.getObjectSize(errMsg, encoding);  //计算字段errMsg的长度 size_of(String)
				length += ByteStream.getObjectSize(outReserve, encoding);  //计算字段outReserve的长度 size_of(String)
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
