 
 
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
public class  GetUserInfoByUidResp extends NetMessage
{
	/**
	 * 客户基本信息po
	 *
	 * 版本 >= 0
	 */
	 private UserInfo4CsPo userInfoPo = new UserInfo4CsPo();

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
		bs.pushObject(userInfoPo);
		bs.pushString(errMsg);
		bs.pushString(outReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{

		result = bs.popUInt();
		userInfoPo = (UserInfo4CsPo) bs.popObject(UserInfo4CsPo.class);
		errMsg = bs.popString();
		outReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x40138801L;
	}


	/**
	 * 获取客户基本信息po
	 * 
	 * 此字段的版本 >= 0
	 * @return userInfoPo value 类型为:UserInfo4CsPo
	 * 
	 */
	public UserInfo4CsPo getUserInfoPo()
	{
		return userInfoPo;
	}


	/**
	 * 设置客户基本信息po
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:UserInfo4CsPo
	 * 
	 */
	public void setUserInfoPo(UserInfo4CsPo value)
	{
		if (value != null) {
				this.userInfoPo = value;
		}else{
				this.userInfoPo = new UserInfo4CsPo();
		}
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
				length = 4;  //size_of(GetUserInfoByUidResp)
				length += ByteStream.getObjectSize(userInfoPo, null);  //计算字段userInfoPo的长度 size_of(UserInfo4CsPo)
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
				length = 0;  //size_of(GetUserInfoByUidResp)
				length += ByteStream.getObjectSize(userInfoPo, encoding);  //计算字段userInfoPo的长度 size_of(UserInfo4CsPo)
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
