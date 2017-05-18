//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.UserInfo4CsPo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

/**
 *供CS使用客户属性Po
 *
 *@date 2016-07-12 11:45:31
 *
 *@since version:0
*/
public class UserProperty4CsPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 * 版本号
	 *
	 * 版本 >= 0
	 */
	 private long version = 20160623;

	/**
	 * 是否为收费会员
	 *
	 * 版本 >= 0
	 */
	 private boolean isPaidMember;

	/**
	 * isPaidMember_u uflag field
	 */
	 private short isPaidMember_u = 0;

	/**
	 * 是否为荣誉会员
	 *
	 * 版本 >= 0
	 */
	 private boolean isHonorableMember;

	/**
	 * isHonorableMember_u uflag field
	 */
	 private short isHonorableMember_u = 0;

	/**
	 * 是否有备孕计划
	 *
	 * 版本 >= 0
	 */
	 private boolean isPreparePregnant;

	/**
	 * isPreparePregnant_u uflag field
	 */
	 private short isPreparePregnant_u = 0;

	/**
	 * 是否购买过商户通
	 *
	 * 版本 >= 0
	 */
	 private boolean isSHTMember;

	/**
	 * isSHTMember_u uflag field
	 */
	 private short isSHTMember_u = 0;

	/**
	 * 是否订阅促销短信
	 *
	 * 版本 >= 0
	 */
	 private boolean isSubscribePromotionalMessage;

	/**
	 * isSubscribePromotionalMessage_u uflag field
	 */
	 private short isSubscribePromotionalMessage_u = 0;

	/**
	 * 是否订阅促销电话
	 *
	 * 版本 >= 0
	 */
	 private boolean isSubscribePromotionalPhone;

	/**
	 * isSubscribePromotionalPhone_u uflag field
	 */
	 private short isSubscribePromotionalPhone_u = 0;

	/**
	 * 是否订阅促销微信
	 *
	 * 版本 >= 0
	 */
	 private boolean isSubscribePromotionalWechat;

	/**
	 * isSubscribePromotionalWechat_u uflag field
	 */
	 private short isSubscribePromotionalWechat_u = 0;

	/**
	 * 是否接受回访短信
	 *
	 * 版本 >= 0
	 */
	 private boolean isAcceptVisitMessage;

	/**
	 * isAcceptVisitMessage_u uflag field
	 */
	 private short isAcceptVisitMessage_u = 0;

	/**
	 * 是否接受回访电话
	 *
	 * 版本 >= 0
	 */
	 private boolean isAcceptVisitPhone;

	/**
	 * isAcceptVisitPhone_u uflag field
	 */
	 private short isAcceptVisitPhone_u = 0;

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
	 * 是否为荣誉顾问
	 *
	 * 版本 >= 0
	 */
	 private boolean isHonorableCounselor;

	/**
	 * isHonorableCounselor_u uflag field
	 */
	 private short isHonorableCounselor_u = 0;

	/**
	 * 是否发放荣誉会员赠品
	 *
	 * 版本 >= 20160321
	 */
	 private boolean isGetHonorableGift;

	/**
	 * isGetHonorableGift_u uflag field
	 */
	 private short isGetHonorableGift_u = 0;

	/**
	 * 是否为内部管理会员
	 *
	 * 版本 >= 20160321
	 */
	 private boolean isInternalMember;

	/**
	 * isInternalMember_u uflag field
	 */
	 private short isInternalMember_u = 0;

	/**
	 * 是否领取新客礼包
	 *
	 * 版本 >= 20160623
	 */
	 private boolean isGetNewCustomerPackage;

	/**
	 * isGetNewCustomerPackage_u uflag field
	 */
	 private short isGetNewCustomerPackage_u = 0;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushBoolean(isPaidMember);
		bs.pushUByte(isPaidMember_u);
		bs.pushBoolean(isHonorableMember);
		bs.pushUByte(isHonorableMember_u);
		bs.pushBoolean(isPreparePregnant);
		bs.pushUByte(isPreparePregnant_u);
		bs.pushBoolean(isSHTMember);
		bs.pushUByte(isSHTMember_u);
		bs.pushBoolean(isSubscribePromotionalMessage);
		bs.pushUByte(isSubscribePromotionalMessage_u);
		bs.pushBoolean(isSubscribePromotionalPhone);
		bs.pushUByte(isSubscribePromotionalPhone_u);
		bs.pushBoolean(isSubscribePromotionalWechat);
		bs.pushUByte(isSubscribePromotionalWechat_u);
		bs.pushBoolean(isAcceptVisitMessage);
		bs.pushUByte(isAcceptVisitMessage_u);
		bs.pushBoolean(isAcceptVisitPhone);
		bs.pushUByte(isAcceptVisitPhone_u);
		bs.pushString(reserve);
		bs.pushUByte(reserve_u);
		bs.pushBoolean(isHonorableCounselor);
		bs.pushUByte(isHonorableCounselor_u);
		if(  this.version >= 20160321 ){
				bs.pushBoolean(isGetHonorableGift);
				bs.pushUByte(isGetHonorableGift_u);
		}
		if(  this.version >= 20160321 ){
				bs.pushBoolean(isInternalMember);
				bs.pushUByte(isInternalMember_u);
		}
		if(  this.version >= 20160623 ){
				bs.pushBoolean(isGetNewCustomerPackage);
				bs.pushUByte(isGetNewCustomerPackage_u);
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
		isPaidMember = bs.popBoolean();
		isPaidMember_u = bs.popUByte();
		isHonorableMember = bs.popBoolean();
		isHonorableMember_u = bs.popUByte();
		isPreparePregnant = bs.popBoolean();
		isPreparePregnant_u = bs.popUByte();
		isSHTMember = bs.popBoolean();
		isSHTMember_u = bs.popUByte();
		isSubscribePromotionalMessage = bs.popBoolean();
		isSubscribePromotionalMessage_u = bs.popUByte();
		isSubscribePromotionalPhone = bs.popBoolean();
		isSubscribePromotionalPhone_u = bs.popUByte();
		isSubscribePromotionalWechat = bs.popBoolean();
		isSubscribePromotionalWechat_u = bs.popUByte();
		isAcceptVisitMessage = bs.popBoolean();
		isAcceptVisitMessage_u = bs.popUByte();
		isAcceptVisitPhone = bs.popBoolean();
		isAcceptVisitPhone_u = bs.popUByte();
		reserve = bs.popString();
		reserve_u = bs.popUByte();
		isHonorableCounselor = bs.popBoolean();
		isHonorableCounselor_u = bs.popUByte();
		if(  this.version >= 20160321 ){
				isGetHonorableGift = bs.popBoolean();
				isGetHonorableGift_u = bs.popUByte();
		}
		if(  this.version >= 20160321 ){
				isInternalMember = bs.popBoolean();
				isInternalMember_u = bs.popUByte();
		}
		if(  this.version >= 20160623 ){
				isGetNewCustomerPackage = bs.popBoolean();
				isGetNewCustomerPackage_u = bs.popUByte();
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
	 * 获取是否为收费会员
	 * 
	 * 此字段的版本 >= 0
	 * @return isPaidMember value 类型为:boolean
	 * 
	 */
	public boolean getIsPaidMember()
	{
		return isPaidMember;
	}


	/**
	 * 设置是否为收费会员
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsPaidMember(boolean value)
	{
		this.isPaidMember = value;
		this.isPaidMember_u = 1;
	}

	public boolean issetIsPaidMember()
	{
		return this.isPaidMember_u != 0;
	}
	/**
	 * 获取是否为荣誉会员
	 * 
	 * 此字段的版本 >= 0
	 * @return isHonorableMember value 类型为:boolean
	 * 
	 */
	public boolean getIsHonorableMember()
	{
		return isHonorableMember;
	}


	/**
	 * 设置是否为荣誉会员
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsHonorableMember(boolean value)
	{
		this.isHonorableMember = value;
		this.isHonorableMember_u = 1;
	}

	public boolean issetIsHonorableMember()
	{
		return this.isHonorableMember_u != 0;
	}
	/**
	 * 获取是否有备孕计划
	 * 
	 * 此字段的版本 >= 0
	 * @return isPreparePregnant value 类型为:boolean
	 * 
	 */
	public boolean getIsPreparePregnant()
	{
		return isPreparePregnant;
	}


	/**
	 * 设置是否有备孕计划
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsPreparePregnant(boolean value)
	{
		this.isPreparePregnant = value;
		this.isPreparePregnant_u = 1;
	}

	public boolean issetIsPreparePregnant()
	{
		return this.isPreparePregnant_u != 0;
	}
	/**
	 * 获取是否购买过商户通
	 * 
	 * 此字段的版本 >= 0
	 * @return isSHTMember value 类型为:boolean
	 * 
	 */
	public boolean getIsSHTMember()
	{
		return isSHTMember;
	}


	/**
	 * 设置是否购买过商户通
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsSHTMember(boolean value)
	{
		this.isSHTMember = value;
		this.isSHTMember_u = 1;
	}

	public boolean issetIsSHTMember()
	{
		return this.isSHTMember_u != 0;
	}
	/**
	 * 获取是否订阅促销短信
	 * 
	 * 此字段的版本 >= 0
	 * @return isSubscribePromotionalMessage value 类型为:boolean
	 * 
	 */
	public boolean getIsSubscribePromotionalMessage()
	{
		return isSubscribePromotionalMessage;
	}


	/**
	 * 设置是否订阅促销短信
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsSubscribePromotionalMessage(boolean value)
	{
		this.isSubscribePromotionalMessage = value;
		this.isSubscribePromotionalMessage_u = 1;
	}

	public boolean issetIsSubscribePromotionalMessage()
	{
		return this.isSubscribePromotionalMessage_u != 0;
	}
	/**
	 * 获取是否订阅促销电话
	 * 
	 * 此字段的版本 >= 0
	 * @return isSubscribePromotionalPhone value 类型为:boolean
	 * 
	 */
	public boolean getIsSubscribePromotionalPhone()
	{
		return isSubscribePromotionalPhone;
	}


	/**
	 * 设置是否订阅促销电话
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsSubscribePromotionalPhone(boolean value)
	{
		this.isSubscribePromotionalPhone = value;
		this.isSubscribePromotionalPhone_u = 1;
	}

	public boolean issetIsSubscribePromotionalPhone()
	{
		return this.isSubscribePromotionalPhone_u != 0;
	}
	/**
	 * 获取是否订阅促销微信
	 * 
	 * 此字段的版本 >= 0
	 * @return isSubscribePromotionalWechat value 类型为:boolean
	 * 
	 */
	public boolean getIsSubscribePromotionalWechat()
	{
		return isSubscribePromotionalWechat;
	}


	/**
	 * 设置是否订阅促销微信
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsSubscribePromotionalWechat(boolean value)
	{
		this.isSubscribePromotionalWechat = value;
		this.isSubscribePromotionalWechat_u = 1;
	}

	public boolean issetIsSubscribePromotionalWechat()
	{
		return this.isSubscribePromotionalWechat_u != 0;
	}
	/**
	 * 获取是否接受回访短信
	 * 
	 * 此字段的版本 >= 0
	 * @return isAcceptVisitMessage value 类型为:boolean
	 * 
	 */
	public boolean getIsAcceptVisitMessage()
	{
		return isAcceptVisitMessage;
	}


	/**
	 * 设置是否接受回访短信
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsAcceptVisitMessage(boolean value)
	{
		this.isAcceptVisitMessage = value;
		this.isAcceptVisitMessage_u = 1;
	}

	public boolean issetIsAcceptVisitMessage()
	{
		return this.isAcceptVisitMessage_u != 0;
	}
	/**
	 * 获取是否接受回访电话
	 * 
	 * 此字段的版本 >= 0
	 * @return isAcceptVisitPhone value 类型为:boolean
	 * 
	 */
	public boolean getIsAcceptVisitPhone()
	{
		return isAcceptVisitPhone;
	}


	/**
	 * 设置是否接受回访电话
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsAcceptVisitPhone(boolean value)
	{
		this.isAcceptVisitPhone = value;
		this.isAcceptVisitPhone_u = 1;
	}

	public boolean issetIsAcceptVisitPhone()
	{
		return this.isAcceptVisitPhone_u != 0;
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
	 * 获取是否为荣誉顾问
	 * 
	 * 此字段的版本 >= 0
	 * @return isHonorableCounselor value 类型为:boolean
	 * 
	 */
	public boolean getIsHonorableCounselor()
	{
		return isHonorableCounselor;
	}


	/**
	 * 设置是否为荣誉顾问
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsHonorableCounselor(boolean value)
	{
		this.isHonorableCounselor = value;
		this.isHonorableCounselor_u = 1;
	}

	public boolean issetIsHonorableCounselor()
	{
		return this.isHonorableCounselor_u != 0;
	}
	/**
	 * 获取是否发放荣誉会员赠品
	 * 
	 * 此字段的版本 >= 20160321
	 * @return isGetHonorableGift value 类型为:boolean
	 * 
	 */
	public boolean getIsGetHonorableGift()
	{
		return isGetHonorableGift;
	}


	/**
	 * 设置是否发放荣誉会员赠品
	 * 
	 * 此字段的版本 >= 20160321
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsGetHonorableGift(boolean value)
	{
		this.isGetHonorableGift = value;
		this.isGetHonorableGift_u = 1;
	}

	public boolean issetIsGetHonorableGift()
	{
		return this.isGetHonorableGift_u != 0;
	}
	/**
	 * 获取是否为内部管理会员
	 * 
	 * 此字段的版本 >= 20160321
	 * @return isInternalMember value 类型为:boolean
	 * 
	 */
	public boolean getIsInternalMember()
	{
		return isInternalMember;
	}


	/**
	 * 设置是否为内部管理会员
	 * 
	 * 此字段的版本 >= 20160321
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsInternalMember(boolean value)
	{
		this.isInternalMember = value;
		this.isInternalMember_u = 1;
	}

	public boolean issetIsInternalMember()
	{
		return this.isInternalMember_u != 0;
	}
	/**
	 * 获取是否领取新客礼包
	 * 
	 * 此字段的版本 >= 20160623
	 * @return isGetNewCustomerPackage value 类型为:boolean
	 * 
	 */
	public boolean getIsGetNewCustomerPackage()
	{
		return isGetNewCustomerPackage;
	}


	/**
	 * 设置是否领取新客礼包
	 * 
	 * 此字段的版本 >= 20160623
	 * @param  value 类型为:boolean
	 * 
	 */
	public void setIsGetNewCustomerPackage(boolean value)
	{
		this.isGetNewCustomerPackage = value;
		this.isGetNewCustomerPackage_u = 1;
	}

	public boolean issetIsGetNewCustomerPackage()
	{
		return this.isGetNewCustomerPackage_u != 0;
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
				length = 4;  //size_of(UserProperty4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段isPaidMember的长度 size_of(boolean)
				length += 1;  //计算字段isPaidMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isHonorableMember的长度 size_of(boolean)
				length += 1;  //计算字段isHonorableMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isPreparePregnant的长度 size_of(boolean)
				length += 1;  //计算字段isPreparePregnant_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSHTMember的长度 size_of(boolean)
				length += 1;  //计算字段isSHTMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalMessage的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalMessage_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalPhone的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalPhone_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalWechat的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalWechat_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isAcceptVisitMessage的长度 size_of(boolean)
				length += 1;  //计算字段isAcceptVisitMessage_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isAcceptVisitPhone的长度 size_of(boolean)
				length += 1;  //计算字段isAcceptVisitPhone_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isHonorableCounselor的长度 size_of(boolean)
				length += 1;  //计算字段isHonorableCounselor_u的长度 size_of(uint32_t)
				if(  this.version >= 20160321 ){
						length += 1;  //计算字段isGetHonorableGift的长度 size_of(boolean)
						length += 1;  //计算字段isGetHonorableGift_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160321 ){
						length += 1;  //计算字段isInternalMember的长度 size_of(boolean)
						length += 1;  //计算字段isInternalMember_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160623 ){
						length += 1;  //计算字段isGetNewCustomerPackage的长度 size_of(boolean)
						length += 1;  //计算字段isGetNewCustomerPackage_u的长度 size_of(uint32_t)
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
				length = 4;  //size_of(UserProperty4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 1;  //计算字段isPaidMember的长度 size_of(boolean)
				length += 1;  //计算字段isPaidMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isHonorableMember的长度 size_of(boolean)
				length += 1;  //计算字段isHonorableMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isPreparePregnant的长度 size_of(boolean)
				length += 1;  //计算字段isPreparePregnant_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSHTMember的长度 size_of(boolean)
				length += 1;  //计算字段isSHTMember_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalMessage的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalMessage_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalPhone的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalPhone_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isSubscribePromotionalWechat的长度 size_of(boolean)
				length += 1;  //计算字段isSubscribePromotionalWechat_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isAcceptVisitMessage的长度 size_of(boolean)
				length += 1;  //计算字段isAcceptVisitMessage_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isAcceptVisitPhone的长度 size_of(boolean)
				length += 1;  //计算字段isAcceptVisitPhone_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				length += 1;  //计算字段isHonorableCounselor的长度 size_of(boolean)
				length += 1;  //计算字段isHonorableCounselor_u的长度 size_of(uint32_t)
				if(  this.version >= 20160321 ){
						length += 1;  //计算字段isGetHonorableGift的长度 size_of(boolean)
						length += 1;  //计算字段isGetHonorableGift_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160321 ){
						length += 1;  //计算字段isInternalMember的长度 size_of(boolean)
						length += 1;  //计算字段isInternalMember_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160623 ){
						length += 1;  //计算字段isGetNewCustomerPackage的长度 size_of(boolean)
						length += 1;  //计算字段isGetNewCustomerPackage_u的长度 size_of(uint32_t)
				}
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


/**
 ********************以下信息是每个版本的字段********************
 *
 *****以下是版本20160321所包含的字段*******
 *	long version;///<版本号
 *	boolean isPaidMember;///<是否为收费会员
 *	short isPaidMember_u;///<是否为收费会员
 *	boolean isHonorableMember;///<是否为荣誉会员
 *	short isHonorableMember_u;///<是否为荣誉会员
 *	boolean isPreparePregnant;///<是否有备孕计划
 *	short isPreparePregnant_u;///<是否有备孕计划
 *	boolean isSHTMember;///<是否购买过商户通
 *	short isSHTMember_u;///<是否购买过商户通
 *	boolean isSubscribePromotionalMessage;///<是否订阅促销短信
 *	short isSubscribePromotionalMessage_u;///<是否订阅促销短信
 *	boolean isSubscribePromotionalPhone;///<是否订阅促销电话
 *	short isSubscribePromotionalPhone_u;///<是否订阅促销电话
 *	boolean isSubscribePromotionalWechat;///<是否订阅促销微信
 *	short isSubscribePromotionalWechat_u;///<是否订阅促销微信
 *	boolean isAcceptVisitMessage;///<是否接受回访短信
 *	short isAcceptVisitMessage_u;///<是否接受回访短信
 *	boolean isAcceptVisitPhone;///<是否接受回访电话
 *	short isAcceptVisitPhone_u;///<是否接受回访电话
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	boolean isHonorableCounselor;///<是否为荣誉顾问
 *	short isHonorableCounselor_u;///<是否为荣誉顾问
 *	boolean isGetHonorableGift;///<是否发放荣誉会员赠品
 *	short isGetHonorableGift_u;///<是否发放荣誉会员赠品
 *	boolean isInternalMember;///<是否为内部管理会员
 *	short isInternalMember_u;///<是否为内部管理会员
 *****以上是版本20160321所包含的字段*******
 *
 *****以下是版本20160623所包含的字段*******
 *	long version;///<版本号
 *	boolean isPaidMember;///<是否为收费会员
 *	short isPaidMember_u;///<是否为收费会员
 *	boolean isHonorableMember;///<是否为荣誉会员
 *	short isHonorableMember_u;///<是否为荣誉会员
 *	boolean isPreparePregnant;///<是否有备孕计划
 *	short isPreparePregnant_u;///<是否有备孕计划
 *	boolean isSHTMember;///<是否购买过商户通
 *	short isSHTMember_u;///<是否购买过商户通
 *	boolean isSubscribePromotionalMessage;///<是否订阅促销短信
 *	short isSubscribePromotionalMessage_u;///<是否订阅促销短信
 *	boolean isSubscribePromotionalPhone;///<是否订阅促销电话
 *	short isSubscribePromotionalPhone_u;///<是否订阅促销电话
 *	boolean isSubscribePromotionalWechat;///<是否订阅促销微信
 *	short isSubscribePromotionalWechat_u;///<是否订阅促销微信
 *	boolean isAcceptVisitMessage;///<是否接受回访短信
 *	short isAcceptVisitMessage_u;///<是否接受回访短信
 *	boolean isAcceptVisitPhone;///<是否接受回访电话
 *	short isAcceptVisitPhone_u;///<是否接受回访电话
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	boolean isHonorableCounselor;///<是否为荣誉顾问
 *	short isHonorableCounselor_u;///<是否为荣誉顾问
 *	boolean isGetHonorableGift;///<是否发放荣誉会员赠品
 *	short isGetHonorableGift_u;///<是否发放荣誉会员赠品
 *	boolean isInternalMember;///<是否为内部管理会员
 *	short isInternalMember_u;///<是否为内部管理会员
 *	boolean isGetNewCustomerPackage;///<是否领取新客礼包
 *	short isGetNewCustomerPackage_u;///<是否领取新客礼包
 *****以上是版本20160623所包含的字段*******
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
