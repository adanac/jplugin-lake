//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.UserInfo4CsPo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

/**
 *供CS端使用的会员卡信息
 *
 *@date 2016-07-12 11:45:31
 *
 *@since version:0
*/
public class MembercardInfo4CsPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 * 版本号
	 *
	 * 版本 >= 0
	 */
	 private long version = 20160120;

	/**
	 * 会员卡类型
	 *
	 * 版本 >= 0
	 */
	 private short type;

	/**
	 * type_u uflag field
	 */
	 private short type_u = 0;

	/**
	 * 会员卡外卡号
	 *
	 * 版本 >= 0
	 */
	 private String membercardNumPub = new String();

	/**
	 * membercardNumPub_u uflag field
	 */
	 private short membercardNumPub_u = 0;

	/**
	 * 会员卡内卡号
	 *
	 * 版本 >= 0
	 */
	 private String membercardNumSec = new String();

	/**
	 * membercardNumSec_u uflag field
	 */
	 private short membercardNumSec_u = 0;

	/**
	 * 预留字段
	 *
	 * 版本 >= 0
	 */
	 private String reserve = new String();

	/**
	 * reserve_u uflag field
	 */
	 private short reserve_u = 0;

	/**
	 * 会员卡状态,0未开通;1注销;2开通;3作废;4暂停;参考E_MEMBERCARD_STATUS
	 *
	 * 版本 >= 20160120
	 */
	 private short cardStatus;

	/**
	 * cardStatus_u uflag field
	 */
	 private short cardStatus_u = 0;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushUByte(type);
		bs.pushUByte(type_u);
		bs.pushString(membercardNumPub);
		bs.pushUByte(membercardNumPub_u);
		bs.pushString(membercardNumSec);
		bs.pushUByte(membercardNumSec_u);
		bs.pushString(reserve);
		bs.pushUByte(reserve_u);
		if(  this.version >= 20160120 ){
				bs.pushUByte(cardStatus);
				bs.pushUByte(cardStatus_u);
		}
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		long size = bs.popUInt();
		int startPosPop = bs.getReadLength();
		if (size == 0)
				return 0;
		version = bs.popUInt();
		type = bs.popUByte();
		type_u = bs.popUByte();
		membercardNumPub = bs.popString();
		membercardNumPub_u = bs.popUByte();
		membercardNumSec = bs.popString();
		membercardNumSec_u = bs.popUByte();
		reserve = bs.popString();
		reserve_u = bs.popUByte();
		if(  this.version >= 20160120 ){
				cardStatus = bs.popUByte();
				cardStatus_u = bs.popUByte();
		}

		/**********************为了支持多个版本的客户端************************/
		int needPopBytes = (int)size - (bs.getReadLength() - startPosPop);
		for(int i = 0;i< needPopBytes; i++)
				bs.popByte();
		/**********************为了支持多个版本的客户端************************/

		return bs.getReadLength();
	} 


	/**
	 * 获取版本号
	 * 
	 * 此字段的版本 >= 0
	 * @return version value 类型为:long
	 * 
	 */
	public long getVersion()
	{
		return version;
	}


	/**
	 * 设置版本号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setVersion(long value)
	{
		this.version = value;
	}


	/**
	 * 获取会员卡类型
	 * 
	 * 此字段的版本 >= 0
	 * @return type value 类型为:short
	 * 
	 */
	public short getType()
	{
		return type;
	}


	/**
	 * 设置会员卡类型
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setType(short value)
	{
		this.type = value;
		this.type_u = 1;
	}

	public boolean issetType()
	{
		return this.type_u != 0;
	}
	/**
	 * 获取会员卡外卡号
	 * 
	 * 此字段的版本 >= 0
	 * @return membercardNumPub value 类型为:String
	 * 
	 */
	public String getMembercardNumPub()
	{
		return membercardNumPub;
	}


	/**
	 * 设置会员卡外卡号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setMembercardNumPub(String value)
	{
		this.membercardNumPub = value;
		this.membercardNumPub_u = 1;
	}

	public boolean issetMembercardNumPub()
	{
		return this.membercardNumPub_u != 0;
	}
	/**
	 * 获取会员卡内卡号
	 * 
	 * 此字段的版本 >= 0
	 * @return membercardNumSec value 类型为:String
	 * 
	 */
	public String getMembercardNumSec()
	{
		return membercardNumSec;
	}


	/**
	 * 设置会员卡内卡号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setMembercardNumSec(String value)
	{
		this.membercardNumSec = value;
		this.membercardNumSec_u = 1;
	}

	public boolean issetMembercardNumSec()
	{
		return this.membercardNumSec_u != 0;
	}
	/**
	 * 获取预留字段
	 * 
	 * 此字段的版本 >= 0
	 * @return reserve value 类型为:String
	 * 
	 */
	public String getReserve()
	{
		return reserve;
	}


	/**
	 * 设置预留字段
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setReserve(String value)
	{
		this.reserve = value;
		this.reserve_u = 1;
	}

	public boolean issetReserve()
	{
		return this.reserve_u != 0;
	}
	/**
	 * 获取会员卡状态,0未开通;1注销;2开通;3作废;4暂停;参考E_MEMBERCARD_STATUS
	 * 
	 * 此字段的版本 >= 20160120
	 * @return cardStatus value 类型为:short
	 * 
	 */
	public short getCardStatus()
	{
		return cardStatus;
	}


	/**
	 * 设置会员卡状态,0未开通;1注销;2开通;3作废;4暂停;参考E_MEMBERCARD_STATUS
	 * 
	 * 此字段的版本 >= 20160120
	 * @param  value 类型为:short
	 * 
	 */
	public void setCardStatus(short value)
	{
		this.cardStatus = value;
		this.cardStatus_u = 1;
	}

	public boolean issetCardStatus()
	{
		return this.cardStatus_u != 0;
	}
	/**
	 *   计算类长度
	 *   用于告诉解包者，该类只放了这么长的数据
	 *  
 	 */
	protected int getClassSize()
	{
		int length = getSize() - 4;
		try{

		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}

	
	/**
	 *   计算类长度
	 *   这个是该类的实际长度，在序列化时bytestream会调用这个方法
	 *  
 	 */
	public int getSize()
	{
		int length = 4;
		try{
				length = 4;  //size_of(MembercardInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段type的长度 size_of(uint8_t)
				length += 1;  //计算字段type_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(membercardNumPub, null);  //计算字段membercardNumPub的长度 size_of(String)
				length += 1;  //计算字段membercardNumPub_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(membercardNumSec, null);  //计算字段membercardNumSec的长度 size_of(String)
				length += 1;  //计算字段membercardNumSec_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				if(  this.version >= 20160120 ){
						length += 1;  //计算字段cardStatus的长度 size_of(uint8_t)
						length += 1;  //计算字段cardStatus_u的长度 size_of(uint32_t)
				}
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


	/**
	 *   计算类长度
	 *   这个是实现String字符集传入的方法
	 *  
 	 */
	public int getSize(String encoding)
	{
		int length = 4;
		try{
				length = 4;  //size_of(MembercardInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段type的长度 size_of(uint8_t)
				length += 1;  //计算字段type_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(membercardNumPub, encoding);  //计算字段membercardNumPub的长度 size_of(String)
				length += 1;  //计算字段membercardNumPub_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(membercardNumSec, encoding);  //计算字段membercardNumSec的长度 size_of(String)
				length += 1;  //计算字段membercardNumSec_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				if(  this.version >= 20160120 ){
						length += 1;  //计算字段cardStatus的长度 size_of(uint8_t)
						length += 1;  //计算字段cardStatus_u的长度 size_of(uint32_t)
				}
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


/**
 ********************以下信息是每个版本的字段********************
 *
 *****以下是版本20160120所包含的字段*******
 *	long version;///<版本号
 *	short type;///<会员卡类型
 *	short type_u;///<会员卡类型
 *	String membercardNumPub;///<会员卡外卡号
 *	short membercardNumPub_u;///<会员卡外卡号
 *	String membercardNumSec;///<会员卡内卡号
 *	short membercardNumSec_u;///<会员卡内卡号
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	short cardStatus;///<会员卡状态,0未开通;1注销;2开通;3作废;4暂停;参考E_MEMBERCARD_STATUS
 *	short cardStatus_u;///<会员卡状态,0未开通;1注销;2开通;3作废;4暂停;参考E_MEMBERCARD_STATUS
 *****以上是版本20160120所包含的字段*******
 */



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
