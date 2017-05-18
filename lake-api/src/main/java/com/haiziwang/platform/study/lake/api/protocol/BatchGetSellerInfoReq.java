
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.oms.seller.SellerAo.java

package com.haiziwang.platform.study.lake.api.protocol;

import java.util.Vector;

import com.paipai.lang.uint32_t;
import com.paipai.netframework.kernal.NetMessage;
import com.paipai.util.io.ByteStream;

/**
 * 批量获取商家信息 req
 *
 * @date 2015-12-01 10:53:29
 *
 * @since version:0
 */
public class BatchGetSellerInfoReq extends NetMessage {
	/**
	 * 机器码,必填
	 *
	 * 版本 >= 0
	 */
	private String machineKey = new String();

	/**
	 * 请求来源标识,必填
	 *
	 * 版本 >= 0
	 */
	private String source = new String();

	/**
	 * 场景id,必填
	 *
	 * 版本 >= 0
	 */
	private long sceneId;

	/**
	 * 商家id,必填
	 *
	 * 版本 >= 0
	 */
	private Vector<uint32_t> vecSellerId = new Vector<uint32_t>();

	/**
	 * 选项，暂未用
	 *
	 * 版本 >= 0
	 */
	private long option;

	/**
	 * 保留输入参数,未使用
	 *
	 * 版本 >= 0
	 */
	private String inReserve = new String();

	public int serialize(ByteStream bs) throws Exception {
		bs.pushString(machineKey);
		bs.pushString(source);
		bs.pushUInt(sceneId);
		bs.pushObject(vecSellerId);
		bs.pushLong(option);
		bs.pushString(inReserve);
		return bs.getWrittenLength();
	}

	public int unSerialize(ByteStream bs) throws Exception {
		machineKey = bs.popString();
		source = bs.popString();
		sceneId = bs.popUInt();
		vecSellerId = (Vector<uint32_t>) bs.popVector(uint32_t.class);
		option = bs.popLong();
		inReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId() {
		return 0x200c1802L;
	}

	/**
	 * 获取 机器码,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return machineKey value 类型为:String
	 * 
	 */
	public String getMachineKey() {
		return machineKey;
	}

	/**
	 * 设置 机器码,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:String
	 * 
	 */
	public void setMachineKey(String value) {
		this.machineKey = value;
	}

	/**
	 * 获取 请求来源标识,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return source value 类型为:String
	 * 
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 设置 请求来源标识,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:String
	 * 
	 */
	public void setSource(String value) {
		this.source = value;
	}

	/**
	 * 获取 场景id,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return sceneId value 类型为:long
	 * 
	 */
	public long getSceneId() {
		return sceneId;
	}

	/**
	 * 设置 场景id,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:long
	 * 
	 */
	public void setSceneId(long value) {
		this.sceneId = value;
	}

	/**
	 * 获取 商家id,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return vecSellerId value 类型为:Vector<uint32_t>
	 * 
	 */
	public Vector<uint32_t> getVecSellerId() {
		return vecSellerId;
	}

	/**
	 * 设置 商家id,必填
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:Vector<uint32_t>
	 * 
	 */
	public void setVecSellerId(Vector<uint32_t> value) {
		if (value != null) {
			this.vecSellerId = value;
		} else {
			this.vecSellerId = new Vector<uint32_t>();
		}
	}

	/**
	 * 获取选项，暂未用
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return option value 类型为:long
	 * 
	 */
	public long getOption() {
		return option;
	}

	/**
	 * 设置选项，暂未用
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:long
	 * 
	 */
	public void setOption(long value) {
		this.option = value;
	}

	/**
	 * 获取 保留输入参数,未使用
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @return inReserve value 类型为:String
	 * 
	 */
	public String getInReserve() {
		return inReserve;
	}

	/**
	 * 设置 保留输入参数,未使用
	 * 
	 * 此字段的版本 >= 0
	 * 
	 * @param value
	 *            类型为:String
	 * 
	 */
	public void setInReserve(String value) {
		this.inReserve = value;
	}

	protected int getClassSize() {
		return getSize() - 4;
	}

	public int getSize() {
		int length = 0;
		try {
			length = 0; // size_of(BatchGetSellerInfoReq)
			length += ByteStream.getObjectSize(machineKey, null); // 计算字段machineKey的长度
																	// size_of(String)
			length += ByteStream.getObjectSize(source, null); // 计算字段source的长度
																// size_of(String)
			length += 4; // 计算字段sceneId的长度 size_of(uint32_t)
			length += ByteStream.getObjectSize(vecSellerId, null); // 计算字段vecSellerId的长度
																	// size_of(Vector)
			length += 17; // 计算字段option的长度 size_of(uint64_t)
			length += ByteStream.getObjectSize(inReserve, null); // 计算字段inReserve的长度
																	// size_of(String)
		} catch (Exception e) {
			e.printStackTrace();
		}
		return length;
	}

	public int getSize(String encoding) {
		int length = 0;
		try {
			length = 0; // size_of(BatchGetSellerInfoReq)
			length += ByteStream.getObjectSize(machineKey, encoding); // 计算字段machineKey的长度
																		// size_of(String)
			length += ByteStream.getObjectSize(source, encoding); // 计算字段source的长度
																	// size_of(String)
			length += 4; // 计算字段sceneId的长度 size_of(uint32_t)
			length += ByteStream.getObjectSize(vecSellerId, encoding); // 计算字段vecSellerId的长度
																		// size_of(Vector)
			length += 17; // 计算字段option的长度 size_of(uint64_t)
			length += ByteStream.getObjectSize(inReserve, encoding); // 计算字段inReserve的长度
																		// size_of(String)
		} catch (Exception e) {
			e.printStackTrace();
		}
		return length;
	}

	/**
	 * 下面是生成toString()方法 此方法用于调试时打开* 如果要打开此方法，请加入commons-lang-2.4.jar 并导入 import
	 * org.apache.commons.lang.builder.ToStringBuilder; import
	 * org.apache.commons.lang.builder.ToStringStyle;
	 *
	 */
	// @Override
	// public String toString() {
	// return
	// ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	// }
}
