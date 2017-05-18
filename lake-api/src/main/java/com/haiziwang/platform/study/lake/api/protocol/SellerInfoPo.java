//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.oms.seller.BatchGetSellerInfoResp.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

/**
 * 商家po 
 *
 *@date 2015-12-01 10:53:29
 *
 *@since version:0
*/
public class SellerInfoPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 *  版本号 
	 *
	 * 版本 >= 0
	 */
	 private long version;

	/**
	 * 版本 >= 0
	 */
	 private short version_u;

	/**
	 *  商家ID 
	 *
	 * 版本 >= 0
	 */
	 private long partnerId;

	/**
	 * 版本 >= 0
	 */
	 private short partnerId_u;

	/**
	 * 商家名称
	 *
	 * 版本 >= 0
	 */
	 private String partnerName = new String();

	/**
	 * 版本 >= 0
	 */
	 private short partnerName_u;

	/**
	 *  商家类型
	 *
	 * 版本 >= 0
	 */
	 private long partnerType;

	/**
	 * 版本 >= 0
	 */
	 private short partnerType_u;

	/**
	 * 商家地址 
	 *
	 * 版本 >= 0
	 */
	 private String address = new String();

	/**
	 * 版本 >= 0
	 */
	 private short address_u;

	/**
	 * 联系人 
	 *
	 * 版本 >= 0
	 */
	 private String contact = new String();

	/**
	 * 版本 >= 0
	 */
	 private short contact_u;

	/**
	 *  是否有效
	 *
	 * 版本 >= 0
	 */
	 private long status;

	/**
	 * 版本 >= 0
	 */
	 private short status_u;

	/**
	 * 创建人
	 *
	 * 版本 >= 0
	 */
	 private String createby = new String();

	/**
	 * 版本 >= 0
	 */
	 private short createby_u;

	/**
	 * 创建时间 
	 *
	 * 版本 >= 0
	 */
	 private int createtime;

	/**
	 * 版本 >= 0
	 */
	 private short createtime_u;

	/**
	 * 修改人
	 *
	 * 版本 >= 0
	 */
	 private String modifyby = new String();

	/**
	 * 版本 >= 0
	 */
	 private short modifyby_u;

	/**
	 * 修改时间 
	 *
	 * 版本 >= 0
	 */
	 private int modifytime;

	/**
	 * 版本 >= 0
	 */
	 private short modifytime_u;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushUByte(version_u);
		bs.pushLong(partnerId);
		bs.pushUByte(partnerId_u);
		bs.pushString(partnerName);
		bs.pushUByte(partnerName_u);
		bs.pushUInt(partnerType);
		bs.pushUByte(partnerType_u);
		bs.pushString(address);
		bs.pushUByte(address_u);
		bs.pushString(contact);
		bs.pushUByte(contact_u);
		bs.pushUInt(status);
		bs.pushUByte(status_u);
		bs.pushString(createby);
		bs.pushUByte(createby_u);
		bs.pushInt(createtime);
		bs.pushUByte(createtime_u);
		bs.pushString(modifyby);
		bs.pushUByte(modifyby_u);
		bs.pushInt(modifytime);
		bs.pushUByte(modifytime_u);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		long size = bs.popUInt();
		int startPosPop = bs.getReadLength();
		if (size == 0)
				return 0;
		version = bs.popUInt();
		version_u = bs.popUByte();
		partnerId = bs.popLong();
		partnerId_u = bs.popUByte();
		partnerName = bs.popString();
		partnerName_u = bs.popUByte();
		partnerType = bs.popUInt();
		partnerType_u = bs.popUByte();
		address = bs.popString();
		address_u = bs.popUByte();
		contact = bs.popString();
		contact_u = bs.popUByte();
		status = bs.popUInt();
		status_u = bs.popUByte();
		createby = bs.popString();
		createby_u = bs.popUByte();
		createtime = bs.popInt();
		createtime_u = bs.popUByte();
		modifyby = bs.popString();
		modifyby_u = bs.popUByte();
		modifytime = bs.popInt();
		modifytime_u = bs.popUByte();

		/**********************为了支持多个版本的客户端************************/
		int needPopBytes = (int)size - (bs.getReadLength() - startPosPop);
		for(int i = 0;i< needPopBytes; i++)
				bs.popByte();
		/**********************为了支持多个版本的客户端************************/

		return bs.getReadLength();
	} 


	/**
	 * 获取 版本号 
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
	 * 设置 版本号 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setVersion(long value)
	{
		this.version = value;
		this.version_u = 1;
	}

	public boolean issetVersion()
	{
		return this.version_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return version_u value 类型为:short
	 * 
	 */
	public short getVersion_u()
	{
		return version_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setVersion_u(short value)
	{
		this.version_u = value;
	}


	/**
	 * 获取 商家ID 
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerId value 类型为:long
	 * 
	 */
	public long getPartnerId()
	{
		return partnerId;
	}


	/**
	 * 设置 商家ID 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setPartnerId(long value)
	{
		this.partnerId = value;
		this.partnerId_u = 1;
	}

	public boolean issetPartnerId()
	{
		return this.partnerId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerId_u value 类型为:short
	 * 
	 */
	public short getPartnerId_u()
	{
		return partnerId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setPartnerId_u(short value)
	{
		this.partnerId_u = value;
	}


	/**
	 * 获取商家名称
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerName value 类型为:String
	 * 
	 */
	public String getPartnerName()
	{
		return partnerName;
	}


	/**
	 * 设置商家名称
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setPartnerName(String value)
	{
		this.partnerName = value;
		this.partnerName_u = 1;
	}

	public boolean issetPartnerName()
	{
		return this.partnerName_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerName_u value 类型为:short
	 * 
	 */
	public short getPartnerName_u()
	{
		return partnerName_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setPartnerName_u(short value)
	{
		this.partnerName_u = value;
	}


	/**
	 * 获取 商家类型
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerType value 类型为:long
	 * 
	 */
	public long getPartnerType()
	{
		return partnerType;
	}


	/**
	 * 设置 商家类型
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setPartnerType(long value)
	{
		this.partnerType = value;
		this.partnerType_u = 1;
	}

	public boolean issetPartnerType()
	{
		return this.partnerType_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return partnerType_u value 类型为:short
	 * 
	 */
	public short getPartnerType_u()
	{
		return partnerType_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setPartnerType_u(short value)
	{
		this.partnerType_u = value;
	}


	/**
	 * 获取商家地址 
	 * 
	 * 此字段的版本 >= 0
	 * @return address value 类型为:String
	 * 
	 */
	public String getAddress()
	{
		return address;
	}


	/**
	 * 设置商家地址 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setAddress(String value)
	{
		this.address = value;
		this.address_u = 1;
	}

	public boolean issetAddress()
	{
		return this.address_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return address_u value 类型为:short
	 * 
	 */
	public short getAddress_u()
	{
		return address_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAddress_u(short value)
	{
		this.address_u = value;
	}


	/**
	 * 获取联系人 
	 * 
	 * 此字段的版本 >= 0
	 * @return contact value 类型为:String
	 * 
	 */
	public String getContact()
	{
		return contact;
	}


	/**
	 * 设置联系人 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setContact(String value)
	{
		this.contact = value;
		this.contact_u = 1;
	}

	public boolean issetContact()
	{
		return this.contact_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return contact_u value 类型为:short
	 * 
	 */
	public short getContact_u()
	{
		return contact_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setContact_u(short value)
	{
		this.contact_u = value;
	}


	/**
	 * 获取 是否有效
	 * 
	 * 此字段的版本 >= 0
	 * @return status value 类型为:long
	 * 
	 */
	public long getStatus()
	{
		return status;
	}


	/**
	 * 设置 是否有效
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setStatus(long value)
	{
		this.status = value;
		this.status_u = 1;
	}

	public boolean issetStatus()
	{
		return this.status_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return status_u value 类型为:short
	 * 
	 */
	public short getStatus_u()
	{
		return status_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setStatus_u(short value)
	{
		this.status_u = value;
	}


	/**
	 * 获取创建人
	 * 
	 * 此字段的版本 >= 0
	 * @return createby value 类型为:String
	 * 
	 */
	public String getCreateby()
	{
		return createby;
	}


	/**
	 * 设置创建人
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setCreateby(String value)
	{
		this.createby = value;
		this.createby_u = 1;
	}

	public boolean issetCreateby()
	{
		return this.createby_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return createby_u value 类型为:short
	 * 
	 */
	public short getCreateby_u()
	{
		return createby_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setCreateby_u(short value)
	{
		this.createby_u = value;
	}


	/**
	 * 获取创建时间 
	 * 
	 * 此字段的版本 >= 0
	 * @return createtime value 类型为:int
	 * 
	 */
	public int getCreatetime()
	{
		return createtime;
	}


	/**
	 * 设置创建时间 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:int
	 * 
	 */
	public void setCreatetime(int value)
	{
		this.createtime = value;
		this.createtime_u = 1;
	}

	public boolean issetCreatetime()
	{
		return this.createtime_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return createtime_u value 类型为:short
	 * 
	 */
	public short getCreatetime_u()
	{
		return createtime_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setCreatetime_u(short value)
	{
		this.createtime_u = value;
	}


	/**
	 * 获取修改人
	 * 
	 * 此字段的版本 >= 0
	 * @return modifyby value 类型为:String
	 * 
	 */
	public String getModifyby()
	{
		return modifyby;
	}


	/**
	 * 设置修改人
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setModifyby(String value)
	{
		this.modifyby = value;
		this.modifyby_u = 1;
	}

	public boolean issetModifyby()
	{
		return this.modifyby_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return modifyby_u value 类型为:short
	 * 
	 */
	public short getModifyby_u()
	{
		return modifyby_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setModifyby_u(short value)
	{
		this.modifyby_u = value;
	}


	/**
	 * 获取修改时间 
	 * 
	 * 此字段的版本 >= 0
	 * @return modifytime value 类型为:int
	 * 
	 */
	public int getModifytime()
	{
		return modifytime;
	}


	/**
	 * 设置修改时间 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:int
	 * 
	 */
	public void setModifytime(int value)
	{
		this.modifytime = value;
		this.modifytime_u = 1;
	}

	public boolean issetModifytime()
	{
		return this.modifytime_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return modifytime_u value 类型为:short
	 * 
	 */
	public short getModifytime_u()
	{
		return modifytime_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setModifytime_u(short value)
	{
		this.modifytime_u = value;
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
				length = 4;  //size_of(SellerInfoPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 17;  //计算字段partnerId的长度 size_of(uint64_t)
				length += 1;  //计算字段partnerId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(partnerName, null);  //计算字段partnerName的长度 size_of(String)
				length += 1;  //计算字段partnerName_u的长度 size_of(uint8_t)
				length += 4;  //计算字段partnerType的长度 size_of(uint32_t)
				length += 1;  //计算字段partnerType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(address, null);  //计算字段address的长度 size_of(String)
				length += 1;  //计算字段address_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(contact, null);  //计算字段contact的长度 size_of(String)
				length += 1;  //计算字段contact_u的长度 size_of(uint8_t)
				length += 4;  //计算字段status的长度 size_of(uint32_t)
				length += 1;  //计算字段status_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(createby, null);  //计算字段createby的长度 size_of(String)
				length += 1;  //计算字段createby_u的长度 size_of(uint8_t)
				length += 4;  //计算字段createtime的长度 size_of(int)
				length += 1;  //计算字段createtime_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(modifyby, null);  //计算字段modifyby的长度 size_of(String)
				length += 1;  //计算字段modifyby_u的长度 size_of(uint8_t)
				length += 4;  //计算字段modifytime的长度 size_of(int)
				length += 1;  //计算字段modifytime_u的长度 size_of(uint8_t)
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
				length = 4;  //size_of(SellerInfoPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 17;  //计算字段partnerId的长度 size_of(uint64_t)
				length += 1;  //计算字段partnerId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(partnerName, encoding);  //计算字段partnerName的长度 size_of(String)
				length += 1;  //计算字段partnerName_u的长度 size_of(uint8_t)
				length += 4;  //计算字段partnerType的长度 size_of(uint32_t)
				length += 1;  //计算字段partnerType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(address, encoding);  //计算字段address的长度 size_of(String)
				length += 1;  //计算字段address_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(contact, encoding);  //计算字段contact的长度 size_of(String)
				length += 1;  //计算字段contact_u的长度 size_of(uint8_t)
				length += 4;  //计算字段status的长度 size_of(uint32_t)
				length += 1;  //计算字段status_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(createby, encoding);  //计算字段createby的长度 size_of(String)
				length += 1;  //计算字段createby_u的长度 size_of(uint8_t)
				length += 4;  //计算字段createtime的长度 size_of(int)
				length += 1;  //计算字段createtime_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(modifyby, encoding);  //计算字段modifyby的长度 size_of(String)
				length += 1;  //计算字段modifyby_u的长度 size_of(uint8_t)
				length += 4;  //计算字段modifytime的长度 size_of(int)
				length += 1;  //计算字段modifytime_u的长度 size_of(uint8_t)
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


	@Override
	public String toString() {
		return "SellerInfoPo{" +
				"version=" + version +
				", version_u=" + version_u +
				", partnerId=" + partnerId +
				", partnerId_u=" + partnerId_u +
				", partnerName='" + partnerName + '\'' +
				", partnerName_u=" + partnerName_u +
				", partnerType=" + partnerType +
				", partnerType_u=" + partnerType_u +
				", address='" + address + '\'' +
				", address_u=" + address_u +
				", contact='" + contact + '\'' +
				", contact_u=" + contact_u +
				", status=" + status +
				", status_u=" + status_u +
				", createby='" + createby + '\'' +
				", createby_u=" + createby_u +
				", createtime=" + createtime +
				", createtime_u=" + createtime_u +
				", modifyby='" + modifyby + '\'' +
				", modifyby_u=" + modifyby_u +
				", modifytime=" + modifytime +
				", modifytime_u=" + modifytime_u +
				'}';
	}
}
