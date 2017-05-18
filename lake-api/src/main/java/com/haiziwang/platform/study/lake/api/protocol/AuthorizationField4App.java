//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.haiziwang.commodity.DeleteAreaInfoReq.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

import com.paipai.lang.GenericWrapper;

/**
 *权限操作字段4App  
 *
 *@date 2015-11-02 02:52:37
 *
 *@since version:0
*/
public class AuthorizationField4App  implements ICanSerializeObjectExt4Encoding
{
	/**
	 *  版本号   
	 *
	 * 版本 >= 0
	 */
	 private long version = 0;

	/**
	 * 版本 >= 0
	 */
	 private short version_u;

	/**
	 * 操作类型 
	 *
	 * 版本 >= 0
	 */
	 private long operationType;

	/**
	 * 版本 >= 0
	 */
	 private short operationType_u;

	/**
	 * 操作者类型 
	 *
	 * 版本 >= 0
	 */
	 private long operatorType;

	/**
	 * 版本 >= 0
	 */
	 private short operatorType_u;

	/**
	 * 操作者Id 
	 *
	 * 版本 >= 0
	 */
	 private String operatorId = new String();

	/**
	 * 版本 >= 0
	 */
	 private short operatorId_u;

	/**
	 * 操作者权限类型 
	 *
	 * 版本 >= 0
	 */
	 private long operatorAuthType;

	/**
	 * 版本 >= 0
	 */
	 private short operatorAuthType_u;

	/**
	 * 操作者权限Id 
	 *
	 * 版本 >= 0
	 */
	 private long operatorAuthId;

	/**
	 * 版本 >= 0
	 */
	 private short operatorAuthId_u;

	/**
	 * 操作原因 
	 *
	 * 版本 >= 0
	 */
	 private String operationReason = new String();

	/**
	 * 版本 >= 0
	 */
	 private short operationReason_u;

	/**
	 * 保留字段
	 *
	 * 版本 >= 0
	 */
	 private String reserve = new String();

	/**
	 * 版本 >= 0
	 */
	 private short reserve_u;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushUByte(version_u);
		bs.pushUInt(operationType);
		bs.pushUByte(operationType_u);
		bs.pushUInt(operatorType);
		bs.pushUByte(operatorType_u);
		bs.pushString(operatorId);
		bs.pushUByte(operatorId_u);
		bs.pushUInt(operatorAuthType);
		bs.pushUByte(operatorAuthType_u);
		bs.pushLong(operatorAuthId);
		bs.pushUByte(operatorAuthId_u);
		bs.pushString(operationReason);
		bs.pushUByte(operationReason_u);
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
		version_u = bs.popUByte();
		operationType = bs.popUInt();
		operationType_u = bs.popUByte();
		operatorType = bs.popUInt();
		operatorType_u = bs.popUByte();
		operatorId = bs.popString();
		operatorId_u = bs.popUByte();
		operatorAuthType = bs.popUInt();
		operatorAuthType_u = bs.popUByte();
		operatorAuthId = bs.popLong();
		operatorAuthId_u = bs.popUByte();
		operationReason = bs.popString();
		operationReason_u = bs.popUByte();
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
	 * 获取操作类型 
	 * 
	 * 此字段的版本 >= 0
	 * @return operationType value 类型为:long
	 * 
	 */
	public long getOperationType()
	{
		return operationType;
	}


	/**
	 * 设置操作类型 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setOperationType(long value)
	{
		this.operationType = value;
		this.operationType_u = 1;
	}

	public boolean issetOperationType()
	{
		return this.operationType_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operationType_u value 类型为:short
	 * 
	 */
	public short getOperationType_u()
	{
		return operationType_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperationType_u(short value)
	{
		this.operationType_u = value;
	}


	/**
	 * 获取操作者类型 
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorType value 类型为:long
	 * 
	 */
	public long getOperatorType()
	{
		return operatorType;
	}


	/**
	 * 设置操作者类型 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setOperatorType(long value)
	{
		this.operatorType = value;
		this.operatorType_u = 1;
	}

	public boolean issetOperatorType()
	{
		return this.operatorType_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorType_u value 类型为:short
	 * 
	 */
	public short getOperatorType_u()
	{
		return operatorType_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperatorType_u(short value)
	{
		this.operatorType_u = value;
	}


	/**
	 * 获取操作者Id 
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorId value 类型为:String
	 * 
	 */
	public String getOperatorId()
	{
		return operatorId;
	}


	/**
	 * 设置操作者Id 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setOperatorId(String value)
	{
		this.operatorId = value;
		this.operatorId_u = 1;
	}

	public boolean issetOperatorId()
	{
		return this.operatorId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorId_u value 类型为:short
	 * 
	 */
	public short getOperatorId_u()
	{
		return operatorId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperatorId_u(short value)
	{
		this.operatorId_u = value;
	}


	/**
	 * 获取操作者权限类型 
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorAuthType value 类型为:long
	 * 
	 */
	public long getOperatorAuthType()
	{
		return operatorAuthType;
	}


	/**
	 * 设置操作者权限类型 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setOperatorAuthType(long value)
	{
		this.operatorAuthType = value;
		this.operatorAuthType_u = 1;
	}

	public boolean issetOperatorAuthType()
	{
		return this.operatorAuthType_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorAuthType_u value 类型为:short
	 * 
	 */
	public short getOperatorAuthType_u()
	{
		return operatorAuthType_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperatorAuthType_u(short value)
	{
		this.operatorAuthType_u = value;
	}


	/**
	 * 获取操作者权限Id 
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorAuthId value 类型为:long
	 * 
	 */
	public long getOperatorAuthId()
	{
		return operatorAuthId;
	}


	/**
	 * 设置操作者权限Id 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setOperatorAuthId(long value)
	{
		this.operatorAuthId = value;
		this.operatorAuthId_u = 1;
	}

	public boolean issetOperatorAuthId()
	{
		return this.operatorAuthId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operatorAuthId_u value 类型为:short
	 * 
	 */
	public short getOperatorAuthId_u()
	{
		return operatorAuthId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperatorAuthId_u(short value)
	{
		this.operatorAuthId_u = value;
	}


	/**
	 * 获取操作原因 
	 * 
	 * 此字段的版本 >= 0
	 * @return operationReason value 类型为:String
	 * 
	 */
	public String getOperationReason()
	{
		return operationReason;
	}


	/**
	 * 设置操作原因 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setOperationReason(String value)
	{
		this.operationReason = value;
		this.operationReason_u = 1;
	}

	public boolean issetOperationReason()
	{
		return this.operationReason_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return operationReason_u value 类型为:short
	 * 
	 */
	public short getOperationReason_u()
	{
		return operationReason_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setOperationReason_u(short value)
	{
		this.operationReason_u = value;
	}


	/**
	 * 获取保留字段
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
	 * 设置保留字段
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
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return reserve_u value 类型为:short
	 * 
	 */
	public short getReserve_u()
	{
		return reserve_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setReserve_u(short value)
	{
		this.reserve_u = value;
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
				length = 4;  //size_of(AuthorizationField4App)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operationType的长度 size_of(uint32_t)
				length += 1;  //计算字段operationType_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operatorType的长度 size_of(uint32_t)
				length += 1;  //计算字段operatorType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(operatorId, null);  //计算字段operatorId的长度 size_of(String)
				length += 1;  //计算字段operatorId_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operatorAuthType的长度 size_of(uint32_t)
				length += 1;  //计算字段operatorAuthType_u的长度 size_of(uint8_t)
				length += 17;  //计算字段operatorAuthId的长度 size_of(uint64_t)
				length += 1;  //计算字段operatorAuthId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(operationReason, null);  //计算字段operationReason的长度 size_of(String)
				length += 1;  //计算字段operationReason_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint8_t)
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
				length = 4;  //size_of(AuthorizationField4App)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operationType的长度 size_of(uint32_t)
				length += 1;  //计算字段operationType_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operatorType的长度 size_of(uint32_t)
				length += 1;  //计算字段operatorType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(operatorId, encoding);  //计算字段operatorId的长度 size_of(String)
				length += 1;  //计算字段operatorId_u的长度 size_of(uint8_t)
				length += 4;  //计算字段operatorAuthType的长度 size_of(uint32_t)
				length += 1;  //计算字段operatorAuthType_u的长度 size_of(uint8_t)
				length += 17;  //计算字段operatorAuthId的长度 size_of(uint64_t)
				length += 1;  //计算字段operatorAuthId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(operationReason, encoding);  //计算字段operationReason的长度 size_of(String)
				length += 1;  //计算字段operationReason_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint8_t)
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
