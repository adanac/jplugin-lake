//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.AddBabyReq.java

package com.haiziwang.platform.study.lake.api.protocol;


import java.util.BitSet;

import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

/**
 *供CS端使用的宝宝信息
 *
 *@date 2016-07-12 11:45:31
 *
 *@since version:0
*/
public class BabyInfo4CsPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 * 版本号
	 *
	 * 版本 >= 0
	 */
	 private long version = 0;

	/**
	 * bid, 宝宝id
	 *
	 * 版本 >= 0
	 */
	 private long bid;

	/**
	 * bid_u uflag field
	 */
	 private short bid_u = 0;

	/**
	 * uid, 用户id
	 *
	 * 版本 >= 0
	 */
	 private long uid;

	/**
	 * uid_u uflag field
	 */
	 private short uid_u = 0;

	/**
	 * 昵称
	 *
	 * 版本 >= 0
	 */
	 private String nickname = new String();

	/**
	 * nickname_u uflag field
	 */
	 private short nickname_u = 0;

	/**
	 * 真实姓名
	 *
	 * 版本 >= 0
	 */
	 private String truename = new String();

	/**
	 * truename_u uflag field
	 */
	 private short truename_u = 0;

	/**
	 * 性别：0-未知，1-女，2-男。参见E_USER_SEX
	 *
	 * 版本 >= 0
	 */
	 private short sex;

	/**
	 * sex_u uflag field
	 */
	 private short sex_u = 0;

	/**
	 * 生日/预产期
	 *
	 * 版本 >= 0
	 */
	 private long birthday;

	/**
	 * birthday_u uflag field
	 */
	 private short birthday_u = 0;

	/**
	 * 宝宝属性位BitSet，具体意义参见user_comm_define.h中的E_USER_PROPERTY
	 *
	 * 版本 >= 0
	 */
	 private BitSet bitProperty = new BitSet();

	/**
	 * bitProperty_u uflag field
	 */
	 private short bitProperty_u = 0;

	/**
	 * 添加时间
	 *
	 * 版本 >= 0
	 */
	 private long addTime;

	/**
	 * addTime_u uflag field
	 */
	 private short addTime_u = 0;

	/**
	 * 最后修改时间
	 *
	 * 版本 >= 0
	 */
	 private long lastUpdateTime;

	/**
	 * lastUpdateTime_u uflag field
	 */
	 private short lastUpdateTime_u = 0;

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



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushLong(bid);
		bs.pushUByte(bid_u);
		bs.pushLong(uid);
		bs.pushUByte(uid_u);
		bs.pushString(nickname);
		bs.pushUByte(nickname_u);
		bs.pushString(truename);
		bs.pushUByte(truename_u);
		bs.pushUByte(sex);
		bs.pushUByte(sex_u);
		bs.pushLong(birthday);
		bs.pushUByte(birthday_u);
		bs.pushBitSet(bitProperty);
		bs.pushUByte(bitProperty_u);
		bs.pushUInt(addTime);
		bs.pushUByte(addTime_u);
		bs.pushUInt(lastUpdateTime);
		bs.pushUByte(lastUpdateTime_u);
		bs.pushString(reserve);
		bs.pushUByte(reserve_u);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		long size = bs.popUInt();
		int startPosPop = bs.getReadLength();
		if (size == 0)
				return 0;
		version = bs.popUInt();
		bid = bs.popLong();
		bid_u = bs.popUByte();
		uid = bs.popLong();
		uid_u = bs.popUByte();
		nickname = bs.popString();
		nickname_u = bs.popUByte();
		truename = bs.popString();
		truename_u = bs.popUByte();
		sex = bs.popUByte();
		sex_u = bs.popUByte();
		birthday = bs.popLong();
		birthday_u = bs.popUByte();
		bitProperty = bs.popBitSet();
		bitProperty_u = bs.popUByte();
		addTime = bs.popUInt();
		addTime_u = bs.popUByte();
		lastUpdateTime = bs.popUInt();
		lastUpdateTime_u = bs.popUByte();
		reserve = bs.popString();
		reserve_u = bs.popUByte();

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
	 * 获取bid, 宝宝id
	 * 
	 * 此字段的版本 >= 0
	 * @return bid value 类型为:long
	 * 
	 */
	public long getBid()
	{
		return bid;
	}


	/**
	 * 设置bid, 宝宝id
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setBid(long value)
	{
		this.bid = value;
		this.bid_u = 1;
	}

	public boolean issetBid()
	{
		return this.bid_u != 0;
	}
	/**
	 * 获取uid, 用户id
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
	 * 设置uid, 用户id
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setUid(long value)
	{
		this.uid = value;
		this.uid_u = 1;
	}

	public boolean issetUid()
	{
		return this.uid_u != 0;
	}
	/**
	 * 获取昵称
	 * 
	 * 此字段的版本 >= 0
	 * @return nickname value 类型为:String
	 * 
	 */
	public String getNickname()
	{
		return nickname;
	}


	/**
	 * 设置昵称
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setNickname(String value)
	{
		this.nickname = value;
		this.nickname_u = 1;
	}

	public boolean issetNickname()
	{
		return this.nickname_u != 0;
	}
	/**
	 * 获取真实姓名
	 * 
	 * 此字段的版本 >= 0
	 * @return truename value 类型为:String
	 * 
	 */
	public String getTruename()
	{
		return truename;
	}


	/**
	 * 设置真实姓名
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setTruename(String value)
	{
		this.truename = value;
		this.truename_u = 1;
	}

	public boolean issetTruename()
	{
		return this.truename_u != 0;
	}
	/**
	 * 获取性别：0-未知，1-女，2-男。参见E_USER_SEX
	 * 
	 * 此字段的版本 >= 0
	 * @return sex value 类型为:short
	 * 
	 */
	public short getSex()
	{
		return sex;
	}


	/**
	 * 设置性别：0-未知，1-女，2-男。参见E_USER_SEX
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setSex(short value)
	{
		this.sex = value;
		this.sex_u = 1;
	}

	public boolean issetSex()
	{
		return this.sex_u != 0;
	}
	/**
	 * 获取生日/预产期
	 * 
	 * 此字段的版本 >= 0
	 * @return birthday value 类型为:long
	 * 
	 */
	public long getBirthday()
	{
		return birthday;
	}


	/**
	 * 设置生日/预产期
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setBirthday(long value)
	{
		this.birthday = value;
		this.birthday_u = 1;
	}

	public boolean issetBirthday()
	{
		return this.birthday_u != 0;
	}
	/**
	 * 获取宝宝属性位BitSet，具体意义参见user_comm_define.h中的E_USER_PROPERTY
	 * 
	 * 此字段的版本 >= 0
	 * @return bitProperty value 类型为:BitSet
	 * 
	 */
	public BitSet getBitProperty()
	{
		return bitProperty;
	}


	/**
	 * 设置宝宝属性位BitSet，具体意义参见user_comm_define.h中的E_USER_PROPERTY
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:BitSet
	 * 
	 */
	public void setBitProperty(BitSet value)
	{
		if (value != null) {
				this.bitProperty = value;
				this.bitProperty_u = 1;
		}
	}

	public boolean issetBitProperty()
	{
		return this.bitProperty_u != 0;
	}
	/**
	 * 获取添加时间
	 * 
	 * 此字段的版本 >= 0
	 * @return addTime value 类型为:long
	 * 
	 */
	public long getAddTime()
	{
		return addTime;
	}


	/**
	 * 设置添加时间
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAddTime(long value)
	{
		this.addTime = value;
		this.addTime_u = 1;
	}

	public boolean issetAddTime()
	{
		return this.addTime_u != 0;
	}
	/**
	 * 获取最后修改时间
	 * 
	 * 此字段的版本 >= 0
	 * @return lastUpdateTime value 类型为:long
	 * 
	 */
	public long getLastUpdateTime()
	{
		return lastUpdateTime;
	}


	/**
	 * 设置最后修改时间
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setLastUpdateTime(long value)
	{
		this.lastUpdateTime = value;
		this.lastUpdateTime_u = 1;
	}

	public boolean issetLastUpdateTime()
	{
		return this.lastUpdateTime_u != 0;
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
				length = 4;  //size_of(BabyInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 17;  //计算字段bid的长度 size_of(uint64_t)
				length += 1;  //计算字段bid_u的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += 1;  //计算字段uid_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(nickname, null);  //计算字段nickname的长度 size_of(String)
				length += 1;  //计算字段nickname_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(truename, null);  //计算字段truename的长度 size_of(String)
				length += 1;  //计算字段truename_u的长度 size_of(uint32_t)
				length += 1;  //计算字段sex的长度 size_of(uint8_t)
				length += 1;  //计算字段sex_u的长度 size_of(uint32_t)
				length += 17;  //计算字段birthday的长度 size_of(uint64_t)
				length += 1;  //计算字段birthday_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(bitProperty, null);  //计算字段bitProperty的长度 size_of(BitSet)
				length += 1;  //计算字段bitProperty_u的长度 size_of(uint32_t)
				length += 4;  //计算字段addTime的长度 size_of(uint32_t)
				length += 1;  //计算字段addTime_u的长度 size_of(uint32_t)
				length += 4;  //计算字段lastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段lastUpdateTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
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
				length = 4;  //size_of(BabyInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 17;  //计算字段bid的长度 size_of(uint64_t)
				length += 1;  //计算字段bid_u的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += 1;  //计算字段uid_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(nickname, encoding);  //计算字段nickname的长度 size_of(String)
				length += 1;  //计算字段nickname_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(truename, encoding);  //计算字段truename的长度 size_of(String)
				length += 1;  //计算字段truename_u的长度 size_of(uint32_t)
				length += 1;  //计算字段sex的长度 size_of(uint8_t)
				length += 1;  //计算字段sex_u的长度 size_of(uint32_t)
				length += 17;  //计算字段birthday的长度 size_of(uint64_t)
				length += 1;  //计算字段birthday_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(bitProperty, encoding);  //计算字段bitProperty的长度 size_of(BitSet)
				length += 1;  //计算字段bitProperty_u的长度 size_of(uint32_t)
				length += 4;  //计算字段addTime的长度 size_of(uint32_t)
				length += 1;  //计算字段addTime_u的长度 size_of(uint32_t)
				length += 4;  //计算字段lastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段lastUpdateTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


/**
 ********************以下信息是每个版本的字段********************
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
