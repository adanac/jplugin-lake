//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.haiziwang.commodity.CommodityAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

import com.paipai.lang.GenericWrapper;
import java.util.BitSet;

/**
 *区域信息
 *
 *@date 2016-06-01 09:59:51
 *
 *@since version:0
*/
public class AreaInfoPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 * 版本号, version需要小写
	 *
	 * 版本 >= 0
	 */
	 private long version = 3;

	/**
	 * 版本 >= 0
	 */
	 private short version_u;

	/**
	 * SKUID
	 *
	 * 版本 >= 0
	 */
	 private long skuId;

	/**
	 * 版本 >= 0
	 */
	 private short skuId_u;

	/**
	 * 区域ID
	 *
	 * 版本 >= 0
	 */
	 private long areaId;

	/**
	 * 版本 >= 0
	 */
	 private short areaId_u;

	/**
	 * 合作伙伴子账户编码
	 *
	 * 版本 >= 0
	 */
	 private long coSubAccountId;

	/**
	 * 版本 >= 0
	 */
	 private short coSubAccountId_u;

	/**
	 * 合作伙伴区域编码，最长64字节
	 *
	 * 版本 >= 0
	 */
	 private String coSkuAreaCode = new String();

	/**
	 * 版本 >= 0
	 */
	 private short coSkuAreaCode_u;

	/**
	 * 合作伙伴条形码，最长32字节
	 *
	 * 版本 >= 0
	 */
	 private String coBarCode = new String();

	/**
	 * 版本 >= 0
	 */
	 private short coBarCode_u;

	/**
	 * 商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
	 *
	 * 版本 >= 0
	 */
	 private long promotionType = 0;

	/**
	 * 版本 >= 0
	 */
	 private short promotionType_u;

	/**
	 * 商品描述，最长128字节
	 *
	 * 版本 >= 0
	 */
	 private String areaPromotDesc = new String();

	/**
	 * 版本 >= 0
	 */
	 private short areaPromotDesc_u;

	/**
	 * 区域价格，单位分
	 *
	 * 版本 >= 0
	 */
	 private long areaPrice;

	/**
	 * 版本 >= 0
	 */
	 private short areaPrice_u;

	/**
	 * 区域上一次修改的价格，单位分
	 *
	 * 版本 >= 0
	 */
	 private long areaPrePrice;

	/**
	 * 版本 >= 0
	 */
	 private short areaPrePrice_u;

	/**
	 * 区域成本价格
	 *
	 * 版本 >= 0
	 */
	 private long areaCostPrice;

	/**
	 * 版本 >= 0
	 */
	 private short areaCostPrice_u;

	/**
	 * 区域业务成本价格
	 *
	 * 版本 >= 0
	 */
	 private long areaBussiessPrice;

	/**
	 * 版本 >= 0
	 */
	 private short areaBussiessPrice_u;

	/**
	 * 区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
	 *
	 * 版本 >= 0
	 */
	 private BitSet areaProperty = new BitSet();

	/**
	 * 版本 >= 0
	 */
	 private short areaProperty_u;

	/**
	 * 区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
	 *
	 * 版本 >= 0
	 */
	 private BitSet areaNegationProperty = new BitSet();

	/**
	 * 版本 >= 0
	 */
	 private short areaNegationProperty_u;

	/**
	 * 区域状态 
	 *
	 * 版本 >= 0
	 */
	 private short areaState = 0;

	/**
	 * 版本 >= 0
	 */
	 private short areaState_u;

	/**
	 * 起购数量
	 *
	 * 版本 >= 0
	 */
	 private long areaMinBuyCount;

	/**
	 * 起购数量  flag
	 *
	 * 版本 >= 0
	 */
	 private short areaMinBuyCount_u;

	/**
	 * 限购数量
	 *
	 * 版本 >= 0
	 */
	 private long areaMaxBuyCount;

	/**
	 * 限购数量  flag
	 *
	 * 版本 >= 0
	 */
	 private short areaMaxBuyCount_u;

	/**
	 * 购买倍数
	 *
	 * 版本 >= 0
	 */
	 private long areaBuyMultiple;

	/**
	 * 购买倍数  flag
	 *
	 * 版本 >= 0
	 */
	 private short areaBuyMultiple_u;

	/**
	 * 仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
	 *
	 * 版本 >= 0
	 */
	 private long areaStoreLogisticType;

	/**
	 * 仓储物流类型  flag
	 *
	 * 版本 >= 0
	 */
	 private short areaStoreLogisticType_u;

	/**
	 * 数据写入时间
	 *
	 * 版本 >= 0
	 */
	 private long areaAddTime;

	/**
	 * 版本 >= 0
	 */
	 private short areaAddTime_u;

	/**
	 * 数据上次修改时间
	 *
	 * 版本 >= 0
	 */
	 private long areaLastUpdateTime;

	/**
	 * 版本 >= 0
	 */
	 private short areaLastUpdateTime_u;

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

	/**
	 * 商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
	 *
	 * 版本 >= 1
	 */
	 private long areaFirstPublishTime;

	/**
	 * 商品在分站的首次发布时间 标志位
	 *
	 * 版本 >= 1
	 */
	 private short areaFirstPublishTime_u;

	/**
	 * 商品描述语的生效时间
	 *
	 * 版本 >= 2
	 */
	 private long areaPromotDescEffectiveTime;

	/**
	 * 商品描述语的生效时间 标志位
	 *
	 * 版本 >= 2
	 */
	 private short areaPromotDescEffectiveTime_u;

	/**
	 * 商品描述语的失效时间
	 *
	 * 版本 >= 2
	 */
	 private long areaPromotDescExpireTime;

	/**
	 * 商品描述语的失效时间 标志位
	 *
	 * 版本 >= 2
	 */
	 private short areaPromotDescExpireTime_u;

	/**
	 * 商品采购人员ID 最长64位
	 *
	 * 版本 >= 3
	 */
	 private String areaBuyer = new String();

	/**
	 * 商品采购人员ID  标志位
	 *
	 * 版本 >= 3
	 */
	 private short areaBuyer_u;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushUByte(version_u);
		bs.pushLong(skuId);
		bs.pushUByte(skuId_u);
		bs.pushUInt(areaId);
		bs.pushUByte(areaId_u);
		bs.pushLong(coSubAccountId);
		bs.pushUByte(coSubAccountId_u);
		bs.pushString(coSkuAreaCode);
		bs.pushUByte(coSkuAreaCode_u);
		bs.pushString(coBarCode);
		bs.pushUByte(coBarCode_u);
		bs.pushUInt(promotionType);
		bs.pushUByte(promotionType_u);
		bs.pushString(areaPromotDesc);
		bs.pushUByte(areaPromotDesc_u);
		bs.pushUInt(areaPrice);
		bs.pushUByte(areaPrice_u);
		bs.pushUInt(areaPrePrice);
		bs.pushUByte(areaPrePrice_u);
		bs.pushUInt(areaCostPrice);
		bs.pushUByte(areaCostPrice_u);
		bs.pushUInt(areaBussiessPrice);
		bs.pushUByte(areaBussiessPrice_u);
		bs.pushBitSet(areaProperty);
		bs.pushUByte(areaProperty_u);
		bs.pushBitSet(areaNegationProperty);
		bs.pushUByte(areaNegationProperty_u);
		bs.pushUByte(areaState);
		bs.pushUByte(areaState_u);
		bs.pushUInt(areaMinBuyCount);
		bs.pushUByte(areaMinBuyCount_u);
		bs.pushUInt(areaMaxBuyCount);
		bs.pushUByte(areaMaxBuyCount_u);
		bs.pushUInt(areaBuyMultiple);
		bs.pushUByte(areaBuyMultiple_u);
		bs.pushUInt(areaStoreLogisticType);
		bs.pushUByte(areaStoreLogisticType_u);
		bs.pushUInt(areaAddTime);
		bs.pushUByte(areaAddTime_u);
		bs.pushUInt(areaLastUpdateTime);
		bs.pushUByte(areaLastUpdateTime_u);
		bs.pushString(reserve);
		bs.pushUByte(reserve_u);
		if(  this.version >= 1 ){
				bs.pushUInt(areaFirstPublishTime);
		}
		if(  this.version >= 1 ){
				bs.pushUByte(areaFirstPublishTime_u);
		}
		if(  this.version >= 2 ){
				bs.pushUInt(areaPromotDescEffectiveTime);
		}
		if(  this.version >= 2 ){
				bs.pushUByte(areaPromotDescEffectiveTime_u);
		}
		if(  this.version >= 2 ){
				bs.pushUInt(areaPromotDescExpireTime);
		}
		if(  this.version >= 2 ){
				bs.pushUByte(areaPromotDescExpireTime_u);
		}
		if(  this.version >= 3 ){
				bs.pushString(areaBuyer);
		}
		if(  this.version >= 3 ){
				bs.pushUByte(areaBuyer_u);
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
		version_u = bs.popUByte();
		skuId = bs.popLong();
		skuId_u = bs.popUByte();
		areaId = bs.popUInt();
		areaId_u = bs.popUByte();
		coSubAccountId = bs.popLong();
		coSubAccountId_u = bs.popUByte();
		coSkuAreaCode = bs.popString();
		coSkuAreaCode_u = bs.popUByte();
		coBarCode = bs.popString();
		coBarCode_u = bs.popUByte();
		promotionType = bs.popUInt();
		promotionType_u = bs.popUByte();
		areaPromotDesc = bs.popString();
		areaPromotDesc_u = bs.popUByte();
		areaPrice = bs.popUInt();
		areaPrice_u = bs.popUByte();
		areaPrePrice = bs.popUInt();
		areaPrePrice_u = bs.popUByte();
		areaCostPrice = bs.popUInt();
		areaCostPrice_u = bs.popUByte();
		areaBussiessPrice = bs.popUInt();
		areaBussiessPrice_u = bs.popUByte();
		areaProperty = bs.popBitSet();
		areaProperty_u = bs.popUByte();
		areaNegationProperty = bs.popBitSet();
		areaNegationProperty_u = bs.popUByte();
		areaState = bs.popUByte();
		areaState_u = bs.popUByte();
		areaMinBuyCount = bs.popUInt();
		areaMinBuyCount_u = bs.popUByte();
		areaMaxBuyCount = bs.popUInt();
		areaMaxBuyCount_u = bs.popUByte();
		areaBuyMultiple = bs.popUInt();
		areaBuyMultiple_u = bs.popUByte();
		areaStoreLogisticType = bs.popUInt();
		areaStoreLogisticType_u = bs.popUByte();
		areaAddTime = bs.popUInt();
		areaAddTime_u = bs.popUByte();
		areaLastUpdateTime = bs.popUInt();
		areaLastUpdateTime_u = bs.popUByte();
		reserve = bs.popString();
		reserve_u = bs.popUByte();
		if(  this.version >= 1 ){
				areaFirstPublishTime = bs.popUInt();
		}
		if(  this.version >= 1 ){
				areaFirstPublishTime_u = bs.popUByte();
		}
		if(  this.version >= 2 ){
				areaPromotDescEffectiveTime = bs.popUInt();
		}
		if(  this.version >= 2 ){
				areaPromotDescEffectiveTime_u = bs.popUByte();
		}
		if(  this.version >= 2 ){
				areaPromotDescExpireTime = bs.popUInt();
		}
		if(  this.version >= 2 ){
				areaPromotDescExpireTime_u = bs.popUByte();
		}
		if(  this.version >= 3 ){
				areaBuyer = bs.popString();
		}
		if(  this.version >= 3 ){
				areaBuyer_u = bs.popUByte();
		}

		/**********************为了支持多个版本的客户端************************/
		int needPopBytes = (int)size - (bs.getReadLength() - startPosPop);
		for(int i = 0;i< needPopBytes; i++)
				bs.popByte();
		/**********************为了支持多个版本的客户端************************/

		return bs.getReadLength();
	} 


	/**
	 * 获取版本号, version需要小写
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
	 * 设置版本号, version需要小写
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
	 * 获取SKUID
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
	 * 设置SKUID
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setSkuId(long value)
	{
		this.skuId = value;
		this.skuId_u = 1;
	}

	public boolean issetSkuId()
	{
		return this.skuId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return skuId_u value 类型为:short
	 * 
	 */
	public short getSkuId_u()
	{
		return skuId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setSkuId_u(short value)
	{
		this.skuId_u = value;
	}


	/**
	 * 获取区域ID
	 * 
	 * 此字段的版本 >= 0
	 * @return areaId value 类型为:long
	 * 
	 */
	public long getAreaId()
	{
		return areaId;
	}


	/**
	 * 设置区域ID
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaId(long value)
	{
		this.areaId = value;
		this.areaId_u = 1;
	}

	public boolean issetAreaId()
	{
		return this.areaId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaId_u value 类型为:short
	 * 
	 */
	public short getAreaId_u()
	{
		return areaId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaId_u(short value)
	{
		this.areaId_u = value;
	}


	/**
	 * 获取合作伙伴子账户编码
	 * 
	 * 此字段的版本 >= 0
	 * @return coSubAccountId value 类型为:long
	 * 
	 */
	public long getCoSubAccountId()
	{
		return coSubAccountId;
	}


	/**
	 * 设置合作伙伴子账户编码
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setCoSubAccountId(long value)
	{
		this.coSubAccountId = value;
		this.coSubAccountId_u = 1;
	}

	public boolean issetCoSubAccountId()
	{
		return this.coSubAccountId_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return coSubAccountId_u value 类型为:short
	 * 
	 */
	public short getCoSubAccountId_u()
	{
		return coSubAccountId_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setCoSubAccountId_u(short value)
	{
		this.coSubAccountId_u = value;
	}


	/**
	 * 获取合作伙伴区域编码，最长64字节
	 * 
	 * 此字段的版本 >= 0
	 * @return coSkuAreaCode value 类型为:String
	 * 
	 */
	public String getCoSkuAreaCode()
	{
		return coSkuAreaCode;
	}


	/**
	 * 设置合作伙伴区域编码，最长64字节
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setCoSkuAreaCode(String value)
	{
		this.coSkuAreaCode = value;
		this.coSkuAreaCode_u = 1;
	}

	public boolean issetCoSkuAreaCode()
	{
		return this.coSkuAreaCode_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return coSkuAreaCode_u value 类型为:short
	 * 
	 */
	public short getCoSkuAreaCode_u()
	{
		return coSkuAreaCode_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setCoSkuAreaCode_u(short value)
	{
		this.coSkuAreaCode_u = value;
	}


	/**
	 * 获取合作伙伴条形码，最长32字节
	 * 
	 * 此字段的版本 >= 0
	 * @return coBarCode value 类型为:String
	 * 
	 */
	public String getCoBarCode()
	{
		return coBarCode;
	}


	/**
	 * 设置合作伙伴条形码，最长32字节
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setCoBarCode(String value)
	{
		this.coBarCode = value;
		this.coBarCode_u = 1;
	}

	public boolean issetCoBarCode()
	{
		return this.coBarCode_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return coBarCode_u value 类型为:short
	 * 
	 */
	public short getCoBarCode_u()
	{
		return coBarCode_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setCoBarCode_u(short value)
	{
		this.coBarCode_u = value;
	}


	/**
	 * 获取商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
	 * 
	 * 此字段的版本 >= 0
	 * @return promotionType value 类型为:long
	 * 
	 */
	public long getPromotionType()
	{
		return promotionType;
	}


	/**
	 * 设置商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setPromotionType(long value)
	{
		this.promotionType = value;
		this.promotionType_u = 1;
	}

	public boolean issetPromotionType()
	{
		return this.promotionType_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return promotionType_u value 类型为:short
	 * 
	 */
	public short getPromotionType_u()
	{
		return promotionType_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setPromotionType_u(short value)
	{
		this.promotionType_u = value;
	}


	/**
	 * 获取商品描述，最长128字节
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPromotDesc value 类型为:String
	 * 
	 */
	public String getAreaPromotDesc()
	{
		return areaPromotDesc;
	}


	/**
	 * 设置商品描述，最长128字节
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setAreaPromotDesc(String value)
	{
		this.areaPromotDesc = value;
		this.areaPromotDesc_u = 1;
	}

	public boolean issetAreaPromotDesc()
	{
		return this.areaPromotDesc_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPromotDesc_u value 类型为:short
	 * 
	 */
	public short getAreaPromotDesc_u()
	{
		return areaPromotDesc_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaPromotDesc_u(short value)
	{
		this.areaPromotDesc_u = value;
	}


	/**
	 * 获取区域价格，单位分
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPrice value 类型为:long
	 * 
	 */
	public long getAreaPrice()
	{
		return areaPrice;
	}


	/**
	 * 设置区域价格，单位分
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaPrice(long value)
	{
		this.areaPrice = value;
		this.areaPrice_u = 1;
	}

	public boolean issetAreaPrice()
	{
		return this.areaPrice_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPrice_u value 类型为:short
	 * 
	 */
	public short getAreaPrice_u()
	{
		return areaPrice_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaPrice_u(short value)
	{
		this.areaPrice_u = value;
	}


	/**
	 * 获取区域上一次修改的价格，单位分
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPrePrice value 类型为:long
	 * 
	 */
	public long getAreaPrePrice()
	{
		return areaPrePrice;
	}


	/**
	 * 设置区域上一次修改的价格，单位分
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaPrePrice(long value)
	{
		this.areaPrePrice = value;
		this.areaPrePrice_u = 1;
	}

	public boolean issetAreaPrePrice()
	{
		return this.areaPrePrice_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaPrePrice_u value 类型为:short
	 * 
	 */
	public short getAreaPrePrice_u()
	{
		return areaPrePrice_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaPrePrice_u(short value)
	{
		this.areaPrePrice_u = value;
	}


	/**
	 * 获取区域成本价格
	 * 
	 * 此字段的版本 >= 0
	 * @return areaCostPrice value 类型为:long
	 * 
	 */
	public long getAreaCostPrice()
	{
		return areaCostPrice;
	}


	/**
	 * 设置区域成本价格
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaCostPrice(long value)
	{
		this.areaCostPrice = value;
		this.areaCostPrice_u = 1;
	}

	public boolean issetAreaCostPrice()
	{
		return this.areaCostPrice_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaCostPrice_u value 类型为:short
	 * 
	 */
	public short getAreaCostPrice_u()
	{
		return areaCostPrice_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaCostPrice_u(short value)
	{
		this.areaCostPrice_u = value;
	}


	/**
	 * 获取区域业务成本价格
	 * 
	 * 此字段的版本 >= 0
	 * @return areaBussiessPrice value 类型为:long
	 * 
	 */
	public long getAreaBussiessPrice()
	{
		return areaBussiessPrice;
	}


	/**
	 * 设置区域业务成本价格
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaBussiessPrice(long value)
	{
		this.areaBussiessPrice = value;
		this.areaBussiessPrice_u = 1;
	}

	public boolean issetAreaBussiessPrice()
	{
		return this.areaBussiessPrice_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaBussiessPrice_u value 类型为:short
	 * 
	 */
	public short getAreaBussiessPrice_u()
	{
		return areaBussiessPrice_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaBussiessPrice_u(short value)
	{
		this.areaBussiessPrice_u = value;
	}


	/**
	 * 获取区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
	 * 
	 * 此字段的版本 >= 0
	 * @return areaProperty value 类型为:BitSet
	 * 
	 */
	public BitSet getAreaProperty()
	{
		return areaProperty;
	}


	/**
	 * 设置区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:BitSet
	 * 
	 */
	public void setAreaProperty(BitSet value)
	{
		if (value != null) {
				this.areaProperty = value;
				this.areaProperty_u = 1;
		}
	}

	public boolean issetAreaProperty()
	{
		return this.areaProperty_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaProperty_u value 类型为:short
	 * 
	 */
	public short getAreaProperty_u()
	{
		return areaProperty_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaProperty_u(short value)
	{
		this.areaProperty_u = value;
	}


	/**
	 * 获取区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
	 * 
	 * 此字段的版本 >= 0
	 * @return areaNegationProperty value 类型为:BitSet
	 * 
	 */
	public BitSet getAreaNegationProperty()
	{
		return areaNegationProperty;
	}


	/**
	 * 设置区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:BitSet
	 * 
	 */
	public void setAreaNegationProperty(BitSet value)
	{
		if (value != null) {
				this.areaNegationProperty = value;
				this.areaNegationProperty_u = 1;
		}
	}

	public boolean issetAreaNegationProperty()
	{
		return this.areaNegationProperty_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaNegationProperty_u value 类型为:short
	 * 
	 */
	public short getAreaNegationProperty_u()
	{
		return areaNegationProperty_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaNegationProperty_u(short value)
	{
		this.areaNegationProperty_u = value;
	}


	/**
	 * 获取区域状态 
	 * 
	 * 此字段的版本 >= 0
	 * @return areaState value 类型为:short
	 * 
	 */
	public short getAreaState()
	{
		return areaState;
	}


	/**
	 * 设置区域状态 
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaState(short value)
	{
		this.areaState = value;
		this.areaState_u = 1;
	}

	public boolean issetAreaState()
	{
		return this.areaState_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaState_u value 类型为:short
	 * 
	 */
	public short getAreaState_u()
	{
		return areaState_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaState_u(short value)
	{
		this.areaState_u = value;
	}


	/**
	 * 获取起购数量
	 * 
	 * 此字段的版本 >= 0
	 * @return areaMinBuyCount value 类型为:long
	 * 
	 */
	public long getAreaMinBuyCount()
	{
		return areaMinBuyCount;
	}


	/**
	 * 设置起购数量
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaMinBuyCount(long value)
	{
		this.areaMinBuyCount = value;
		this.areaMinBuyCount_u = 1;
	}

	public boolean issetAreaMinBuyCount()
	{
		return this.areaMinBuyCount_u != 0;
	}
	/**
	 * 获取起购数量  flag
	 * 
	 * 此字段的版本 >= 0
	 * @return areaMinBuyCount_u value 类型为:short
	 * 
	 */
	public short getAreaMinBuyCount_u()
	{
		return areaMinBuyCount_u;
	}


	/**
	 * 设置起购数量  flag
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaMinBuyCount_u(short value)
	{
		this.areaMinBuyCount_u = value;
	}


	/**
	 * 获取限购数量
	 * 
	 * 此字段的版本 >= 0
	 * @return areaMaxBuyCount value 类型为:long
	 * 
	 */
	public long getAreaMaxBuyCount()
	{
		return areaMaxBuyCount;
	}


	/**
	 * 设置限购数量
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaMaxBuyCount(long value)
	{
		this.areaMaxBuyCount = value;
		this.areaMaxBuyCount_u = 1;
	}

	public boolean issetAreaMaxBuyCount()
	{
		return this.areaMaxBuyCount_u != 0;
	}
	/**
	 * 获取限购数量  flag
	 * 
	 * 此字段的版本 >= 0
	 * @return areaMaxBuyCount_u value 类型为:short
	 * 
	 */
	public short getAreaMaxBuyCount_u()
	{
		return areaMaxBuyCount_u;
	}


	/**
	 * 设置限购数量  flag
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaMaxBuyCount_u(short value)
	{
		this.areaMaxBuyCount_u = value;
	}


	/**
	 * 获取购买倍数
	 * 
	 * 此字段的版本 >= 0
	 * @return areaBuyMultiple value 类型为:long
	 * 
	 */
	public long getAreaBuyMultiple()
	{
		return areaBuyMultiple;
	}


	/**
	 * 设置购买倍数
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaBuyMultiple(long value)
	{
		this.areaBuyMultiple = value;
		this.areaBuyMultiple_u = 1;
	}

	public boolean issetAreaBuyMultiple()
	{
		return this.areaBuyMultiple_u != 0;
	}
	/**
	 * 获取购买倍数  flag
	 * 
	 * 此字段的版本 >= 0
	 * @return areaBuyMultiple_u value 类型为:short
	 * 
	 */
	public short getAreaBuyMultiple_u()
	{
		return areaBuyMultiple_u;
	}


	/**
	 * 设置购买倍数  flag
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaBuyMultiple_u(short value)
	{
		this.areaBuyMultiple_u = value;
	}


	/**
	 * 获取仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
	 * 
	 * 此字段的版本 >= 0
	 * @return areaStoreLogisticType value 类型为:long
	 * 
	 */
	public long getAreaStoreLogisticType()
	{
		return areaStoreLogisticType;
	}


	/**
	 * 设置仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaStoreLogisticType(long value)
	{
		this.areaStoreLogisticType = value;
		this.areaStoreLogisticType_u = 1;
	}

	public boolean issetAreaStoreLogisticType()
	{
		return this.areaStoreLogisticType_u != 0;
	}
	/**
	 * 获取仓储物流类型  flag
	 * 
	 * 此字段的版本 >= 0
	 * @return areaStoreLogisticType_u value 类型为:short
	 * 
	 */
	public short getAreaStoreLogisticType_u()
	{
		return areaStoreLogisticType_u;
	}


	/**
	 * 设置仓储物流类型  flag
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaStoreLogisticType_u(short value)
	{
		this.areaStoreLogisticType_u = value;
	}


	/**
	 * 获取数据写入时间
	 * 
	 * 此字段的版本 >= 0
	 * @return areaAddTime value 类型为:long
	 * 
	 */
	public long getAreaAddTime()
	{
		return areaAddTime;
	}


	/**
	 * 设置数据写入时间
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaAddTime(long value)
	{
		this.areaAddTime = value;
		this.areaAddTime_u = 1;
	}

	public boolean issetAreaAddTime()
	{
		return this.areaAddTime_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaAddTime_u value 类型为:short
	 * 
	 */
	public short getAreaAddTime_u()
	{
		return areaAddTime_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaAddTime_u(short value)
	{
		this.areaAddTime_u = value;
	}


	/**
	 * 获取数据上次修改时间
	 * 
	 * 此字段的版本 >= 0
	 * @return areaLastUpdateTime value 类型为:long
	 * 
	 */
	public long getAreaLastUpdateTime()
	{
		return areaLastUpdateTime;
	}


	/**
	 * 设置数据上次修改时间
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaLastUpdateTime(long value)
	{
		this.areaLastUpdateTime = value;
		this.areaLastUpdateTime_u = 1;
	}

	public boolean issetAreaLastUpdateTime()
	{
		return this.areaLastUpdateTime_u != 0;
	}
	/**
	 * 获取
	 * 
	 * 此字段的版本 >= 0
	 * @return areaLastUpdateTime_u value 类型为:short
	 * 
	 */
	public short getAreaLastUpdateTime_u()
	{
		return areaLastUpdateTime_u;
	}


	/**
	 * 设置
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaLastUpdateTime_u(short value)
	{
		this.areaLastUpdateTime_u = value;
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
	 * 获取商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
	 * 
	 * 此字段的版本 >= 1
	 * @return areaFirstPublishTime value 类型为:long
	 * 
	 */
	public long getAreaFirstPublishTime()
	{
		return areaFirstPublishTime;
	}


	/**
	 * 设置商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
	 * 
	 * 此字段的版本 >= 1
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaFirstPublishTime(long value)
	{
		this.areaFirstPublishTime = value;
		this.areaFirstPublishTime_u = 1;
	}

	public boolean issetAreaFirstPublishTime()
	{
		return this.areaFirstPublishTime_u != 0;
	}
	/**
	 * 获取商品在分站的首次发布时间 标志位
	 * 
	 * 此字段的版本 >= 1
	 * @return areaFirstPublishTime_u value 类型为:short
	 * 
	 */
	public short getAreaFirstPublishTime_u()
	{
		return areaFirstPublishTime_u;
	}


	/**
	 * 设置商品在分站的首次发布时间 标志位
	 * 
	 * 此字段的版本 >= 1
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaFirstPublishTime_u(short value)
	{
		this.areaFirstPublishTime_u = value;
	}


	/**
	 * 获取商品描述语的生效时间
	 * 
	 * 此字段的版本 >= 2
	 * @return areaPromotDescEffectiveTime value 类型为:long
	 * 
	 */
	public long getAreaPromotDescEffectiveTime()
	{
		return areaPromotDescEffectiveTime;
	}


	/**
	 * 设置商品描述语的生效时间
	 * 
	 * 此字段的版本 >= 2
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaPromotDescEffectiveTime(long value)
	{
		this.areaPromotDescEffectiveTime = value;
		this.areaPromotDescEffectiveTime_u = 1;
	}

	public boolean issetAreaPromotDescEffectiveTime()
	{
		return this.areaPromotDescEffectiveTime_u != 0;
	}
	/**
	 * 获取商品描述语的生效时间 标志位
	 * 
	 * 此字段的版本 >= 2
	 * @return areaPromotDescEffectiveTime_u value 类型为:short
	 * 
	 */
	public short getAreaPromotDescEffectiveTime_u()
	{
		return areaPromotDescEffectiveTime_u;
	}


	/**
	 * 设置商品描述语的生效时间 标志位
	 * 
	 * 此字段的版本 >= 2
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaPromotDescEffectiveTime_u(short value)
	{
		this.areaPromotDescEffectiveTime_u = value;
	}


	/**
	 * 获取商品描述语的失效时间
	 * 
	 * 此字段的版本 >= 2
	 * @return areaPromotDescExpireTime value 类型为:long
	 * 
	 */
	public long getAreaPromotDescExpireTime()
	{
		return areaPromotDescExpireTime;
	}


	/**
	 * 设置商品描述语的失效时间
	 * 
	 * 此字段的版本 >= 2
	 * @param  value 类型为:long
	 * 
	 */
	public void setAreaPromotDescExpireTime(long value)
	{
		this.areaPromotDescExpireTime = value;
		this.areaPromotDescExpireTime_u = 1;
	}

	public boolean issetAreaPromotDescExpireTime()
	{
		return this.areaPromotDescExpireTime_u != 0;
	}
	/**
	 * 获取商品描述语的失效时间 标志位
	 * 
	 * 此字段的版本 >= 2
	 * @return areaPromotDescExpireTime_u value 类型为:short
	 * 
	 */
	public short getAreaPromotDescExpireTime_u()
	{
		return areaPromotDescExpireTime_u;
	}


	/**
	 * 设置商品描述语的失效时间 标志位
	 * 
	 * 此字段的版本 >= 2
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaPromotDescExpireTime_u(short value)
	{
		this.areaPromotDescExpireTime_u = value;
	}


	/**
	 * 获取商品采购人员ID 最长64位
	 * 
	 * 此字段的版本 >= 3
	 * @return areaBuyer value 类型为:String
	 * 
	 */
	public String getAreaBuyer()
	{
		return areaBuyer;
	}


	/**
	 * 设置商品采购人员ID 最长64位
	 * 
	 * 此字段的版本 >= 3
	 * @param  value 类型为:String
	 * 
	 */
	public void setAreaBuyer(String value)
	{
		this.areaBuyer = value;
		this.areaBuyer_u = 1;
	}

	public boolean issetAreaBuyer()
	{
		return this.areaBuyer_u != 0;
	}
	/**
	 * 获取商品采购人员ID  标志位
	 * 
	 * 此字段的版本 >= 3
	 * @return areaBuyer_u value 类型为:short
	 * 
	 */
	public short getAreaBuyer_u()
	{
		return areaBuyer_u;
	}


	/**
	 * 设置商品采购人员ID  标志位
	 * 
	 * 此字段的版本 >= 3
	 * @param  value 类型为:short
	 * 
	 */
	public void setAreaBuyer_u(short value)
	{
		this.areaBuyer_u = value;
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
				length = 4;  //size_of(AreaInfoPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 17;  //计算字段skuId的长度 size_of(uint64_t)
				length += 1;  //计算字段skuId_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaId的长度 size_of(uint32_t)
				length += 1;  //计算字段areaId_u的长度 size_of(uint8_t)
				length += 17;  //计算字段coSubAccountId的长度 size_of(uint64_t)
				length += 1;  //计算字段coSubAccountId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(coSkuAreaCode, null);  //计算字段coSkuAreaCode的长度 size_of(String)
				length += 1;  //计算字段coSkuAreaCode_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(coBarCode, null);  //计算字段coBarCode的长度 size_of(String)
				length += 1;  //计算字段coBarCode_u的长度 size_of(uint8_t)
				length += 4;  //计算字段promotionType的长度 size_of(uint32_t)
				length += 1;  //计算字段promotionType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaPromotDesc, null);  //计算字段areaPromotDesc的长度 size_of(String)
				length += 1;  //计算字段areaPromotDesc_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaPrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaPrePrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaPrePrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaCostPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaCostPrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaBussiessPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaBussiessPrice_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaProperty, null);  //计算字段areaProperty的长度 size_of(BitSet)
				length += 1;  //计算字段areaProperty_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaNegationProperty, null);  //计算字段areaNegationProperty的长度 size_of(BitSet)
				length += 1;  //计算字段areaNegationProperty_u的长度 size_of(uint8_t)
				length += 1;  //计算字段areaState的长度 size_of(uint8_t)
				length += 1;  //计算字段areaState_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaMinBuyCount的长度 size_of(uint32_t)
				length += 1;  //计算字段areaMinBuyCount_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaMaxBuyCount的长度 size_of(uint32_t)
				length += 1;  //计算字段areaMaxBuyCount_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaBuyMultiple的长度 size_of(uint32_t)
				length += 1;  //计算字段areaBuyMultiple_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaStoreLogisticType的长度 size_of(uint32_t)
				length += 1;  //计算字段areaStoreLogisticType_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaAddTime的长度 size_of(uint32_t)
				length += 1;  //计算字段areaAddTime_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaLastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段areaLastUpdateTime_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint8_t)
				if(  this.version >= 1 ){
						length += 4;  //计算字段areaFirstPublishTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 1 ){
						length += 1;  //计算字段areaFirstPublishTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 2 ){
						length += 4;  //计算字段areaPromotDescEffectiveTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 2 ){
						length += 1;  //计算字段areaPromotDescEffectiveTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 2 ){
						length += 4;  //计算字段areaPromotDescExpireTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 2 ){
						length += 1;  //计算字段areaPromotDescExpireTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 3 ){
						length += ByteStream.getObjectSize(areaBuyer, null);  //计算字段areaBuyer的长度 size_of(String)
				}
				if(  this.version >= 3 ){
						length += 1;  //计算字段areaBuyer_u的长度 size_of(uint8_t)
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
				length = 4;  //size_of(AreaInfoPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段version_u的长度 size_of(uint8_t)
				length += 17;  //计算字段skuId的长度 size_of(uint64_t)
				length += 1;  //计算字段skuId_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaId的长度 size_of(uint32_t)
				length += 1;  //计算字段areaId_u的长度 size_of(uint8_t)
				length += 17;  //计算字段coSubAccountId的长度 size_of(uint64_t)
				length += 1;  //计算字段coSubAccountId_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(coSkuAreaCode, encoding);  //计算字段coSkuAreaCode的长度 size_of(String)
				length += 1;  //计算字段coSkuAreaCode_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(coBarCode, encoding);  //计算字段coBarCode的长度 size_of(String)
				length += 1;  //计算字段coBarCode_u的长度 size_of(uint8_t)
				length += 4;  //计算字段promotionType的长度 size_of(uint32_t)
				length += 1;  //计算字段promotionType_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaPromotDesc, encoding);  //计算字段areaPromotDesc的长度 size_of(String)
				length += 1;  //计算字段areaPromotDesc_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaPrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaPrePrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaPrePrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaCostPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaCostPrice_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaBussiessPrice的长度 size_of(uint32_t)
				length += 1;  //计算字段areaBussiessPrice_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaProperty, encoding);  //计算字段areaProperty的长度 size_of(BitSet)
				length += 1;  //计算字段areaProperty_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(areaNegationProperty, encoding);  //计算字段areaNegationProperty的长度 size_of(BitSet)
				length += 1;  //计算字段areaNegationProperty_u的长度 size_of(uint8_t)
				length += 1;  //计算字段areaState的长度 size_of(uint8_t)
				length += 1;  //计算字段areaState_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaMinBuyCount的长度 size_of(uint32_t)
				length += 1;  //计算字段areaMinBuyCount_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaMaxBuyCount的长度 size_of(uint32_t)
				length += 1;  //计算字段areaMaxBuyCount_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaBuyMultiple的长度 size_of(uint32_t)
				length += 1;  //计算字段areaBuyMultiple_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaStoreLogisticType的长度 size_of(uint32_t)
				length += 1;  //计算字段areaStoreLogisticType_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaAddTime的长度 size_of(uint32_t)
				length += 1;  //计算字段areaAddTime_u的长度 size_of(uint8_t)
				length += 4;  //计算字段areaLastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段areaLastUpdateTime_u的长度 size_of(uint8_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint8_t)
				if(  this.version >= 1 ){
						length += 4;  //计算字段areaFirstPublishTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 1 ){
						length += 1;  //计算字段areaFirstPublishTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 2 ){
						length += 4;  //计算字段areaPromotDescEffectiveTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 2 ){
						length += 1;  //计算字段areaPromotDescEffectiveTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 2 ){
						length += 4;  //计算字段areaPromotDescExpireTime的长度 size_of(uint32_t)
				}
				if(  this.version >= 2 ){
						length += 1;  //计算字段areaPromotDescExpireTime_u的长度 size_of(uint8_t)
				}
				if(  this.version >= 3 ){
						length += ByteStream.getObjectSize(areaBuyer, encoding);  //计算字段areaBuyer的长度 size_of(String)
				}
				if(  this.version >= 3 ){
						length += 1;  //计算字段areaBuyer_u的长度 size_of(uint8_t)
				}
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


/**
 ********************以下信息是每个版本的字段********************
 *
 *****以下是版本1所包含的字段*******
 *	long version;///<版本号, version需要小写
 *	short version_u;
 *	long skuId;///<SKUID
 *	short skuId_u;
 *	long areaId;///<区域ID
 *	short areaId_u;
 *	long coSubAccountId;///<合作伙伴子账户编码
 *	short coSubAccountId_u;
 *	String coSkuAreaCode;///<合作伙伴区域编码，最长64字节
 *	short coSkuAreaCode_u;
 *	String coBarCode;///<合作伙伴条形码，最长32字节
 *	short coBarCode_u;
 *	long promotionType;///<商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
 *	short promotionType_u;
 *	String areaPromotDesc;///<商品描述，最长128字节
 *	short areaPromotDesc_u;
 *	long areaPrice;///<区域价格，单位分
 *	short areaPrice_u;
 *	long areaPrePrice;///<区域上一次修改的价格，单位分
 *	short areaPrePrice_u;
 *	long areaCostPrice;///<区域成本价格
 *	short areaCostPrice_u;
 *	long areaBussiessPrice;///<区域业务成本价格
 *	short areaBussiessPrice_u;
 *	BitSet areaProperty;///<区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
 *	short areaProperty_u;
 *	BitSet areaNegationProperty;///<区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
 *	short areaNegationProperty_u;
 *	short areaState;///<区域状态 
 *	short areaState_u;
 *	long areaMinBuyCount;///<起购数量
 *	short areaMinBuyCount_u;///<起购数量  flag
 *	long areaMaxBuyCount;///<限购数量
 *	short areaMaxBuyCount_u;///<限购数量  flag
 *	long areaBuyMultiple;///<购买倍数
 *	short areaBuyMultiple_u;///<购买倍数  flag
 *	long areaStoreLogisticType;///<仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
 *	short areaStoreLogisticType_u;///<仓储物流类型  flag
 *	long areaAddTime;///<数据写入时间
 *	short areaAddTime_u;
 *	long areaLastUpdateTime;///<数据上次修改时间
 *	short areaLastUpdateTime_u;
 *	String reserve;///<保留字段
 *	short reserve_u;
 *	long areaFirstPublishTime;///<商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
 *	short areaFirstPublishTime_u;///<商品在分站的首次发布时间 标志位
 *****以上是版本1所包含的字段*******
 *
 *****以下是版本2所包含的字段*******
 *	long version;///<版本号, version需要小写
 *	short version_u;
 *	long skuId;///<SKUID
 *	short skuId_u;
 *	long areaId;///<区域ID
 *	short areaId_u;
 *	long coSubAccountId;///<合作伙伴子账户编码
 *	short coSubAccountId_u;
 *	String coSkuAreaCode;///<合作伙伴区域编码，最长64字节
 *	short coSkuAreaCode_u;
 *	String coBarCode;///<合作伙伴条形码，最长32字节
 *	short coBarCode_u;
 *	long promotionType;///<商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
 *	short promotionType_u;
 *	String areaPromotDesc;///<商品描述，最长128字节
 *	short areaPromotDesc_u;
 *	long areaPrice;///<区域价格，单位分
 *	short areaPrice_u;
 *	long areaPrePrice;///<区域上一次修改的价格，单位分
 *	short areaPrePrice_u;
 *	long areaCostPrice;///<区域成本价格
 *	short areaCostPrice_u;
 *	long areaBussiessPrice;///<区域业务成本价格
 *	short areaBussiessPrice_u;
 *	BitSet areaProperty;///<区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
 *	short areaProperty_u;
 *	BitSet areaNegationProperty;///<区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
 *	short areaNegationProperty_u;
 *	short areaState;///<区域状态 
 *	short areaState_u;
 *	long areaMinBuyCount;///<起购数量
 *	short areaMinBuyCount_u;///<起购数量  flag
 *	long areaMaxBuyCount;///<限购数量
 *	short areaMaxBuyCount_u;///<限购数量  flag
 *	long areaBuyMultiple;///<购买倍数
 *	short areaBuyMultiple_u;///<购买倍数  flag
 *	long areaStoreLogisticType;///<仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
 *	short areaStoreLogisticType_u;///<仓储物流类型  flag
 *	long areaAddTime;///<数据写入时间
 *	short areaAddTime_u;
 *	long areaLastUpdateTime;///<数据上次修改时间
 *	short areaLastUpdateTime_u;
 *	String reserve;///<保留字段
 *	short reserve_u;
 *	long areaFirstPublishTime;///<商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
 *	short areaFirstPublishTime_u;///<商品在分站的首次发布时间 标志位
 *	long areaPromotDescEffectiveTime;///<商品描述语的生效时间
 *	short areaPromotDescEffectiveTime_u;///<商品描述语的生效时间 标志位
 *	long areaPromotDescExpireTime;///<商品描述语的失效时间
 *	short areaPromotDescExpireTime_u;///<商品描述语的失效时间 标志位
 *****以上是版本2所包含的字段*******
 *
 *****以下是版本3所包含的字段*******
 *	long version;///<版本号, version需要小写
 *	short version_u;
 *	long skuId;///<SKUID
 *	short skuId_u;
 *	long areaId;///<区域ID
 *	short areaId_u;
 *	long coSubAccountId;///<合作伙伴子账户编码
 *	short coSubAccountId_u;
 *	String coSkuAreaCode;///<合作伙伴区域编码，最长64字节
 *	short coSkuAreaCode_u;
 *	String coBarCode;///<合作伙伴条形码，最长32字节
 *	short coBarCode_u;
 *	long promotionType;///<商品类型  0:普通/1:新品/2:特卖/3:进口/4:限时/5:人气/6:独家/7:首发
 *	short promotionType_u;
 *	String areaPromotDesc;///<商品描述，最长128字节
 *	short areaPromotDesc_u;
 *	long areaPrice;///<区域价格，单位分
 *	short areaPrice_u;
 *	long areaPrePrice;///<区域上一次修改的价格，单位分
 *	short areaPrePrice_u;
 *	long areaCostPrice;///<区域成本价格
 *	short areaCostPrice_u;
 *	long areaBussiessPrice;///<区域业务成本价格
 *	short areaBussiessPrice_u;
 *	BitSet areaProperty;///<区域属性 正标记位,全部位数初始化为零，勾上哪位就把相应的位置为1
 *	short areaProperty_u;
 *	BitSet areaNegationProperty;///<区域属性 反标记位,全部位数初始化为零，取消哪位就把相应的位置为1
 *	short areaNegationProperty_u;
 *	short areaState;///<区域状态 
 *	short areaState_u;
 *	long areaMinBuyCount;///<起购数量
 *	short areaMinBuyCount_u;///<起购数量  flag
 *	long areaMaxBuyCount;///<限购数量
 *	short areaMaxBuyCount_u;///<限购数量  flag
 *	long areaBuyMultiple;///<购买倍数
 *	short areaBuyMultiple_u;///<购买倍数  flag
 *	long areaStoreLogisticType;///<仓储物流类型 0:入仓入配,1:入仓不入配,2:入配不入仓,3:不入仓不入配
 *	short areaStoreLogisticType_u;///<仓储物流类型  flag
 *	long areaAddTime;///<数据写入时间
 *	short areaAddTime_u;
 *	long areaLastUpdateTime;///<数据上次修改时间
 *	short areaLastUpdateTime_u;
 *	String reserve;///<保留字段
 *	short reserve_u;
 *	long areaFirstPublishTime;///<商品在分站的首次发布时间，该字段后台自己维护，对外面只读不写
 *	short areaFirstPublishTime_u;///<商品在分站的首次发布时间 标志位
 *	long areaPromotDescEffectiveTime;///<商品描述语的生效时间
 *	short areaPromotDescEffectiveTime_u;///<商品描述语的生效时间 标志位
 *	long areaPromotDescExpireTime;///<商品描述语的失效时间
 *	short areaPromotDescExpireTime_u;///<商品描述语的失效时间 标志位
 *	String areaBuyer;///<商品采购人员ID 最长64位
 *	short areaBuyer_u;///<商品采购人员ID  标志位
 *****以上是版本3所包含的字段*******
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
