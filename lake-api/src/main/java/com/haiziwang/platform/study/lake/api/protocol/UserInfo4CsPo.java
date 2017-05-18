//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.b2b2c.user.GetUserInfoByUidResp.java

package com.haiziwang.platform.study.lake.api.protocol;


import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.paipai.lang.uint32_t;
import com.paipai.util.io.ByteStream;
import com.paipai.util.io.ICanSerializeObjectExt4Encoding;

/**
 *供CS使用的客户基本信息
 *
 *@date 2016-07-12 11:45:31
 *
 *@since version:0
*/
public class UserInfo4CsPo  implements ICanSerializeObjectExt4Encoding
{
	/**
	 * 版本号
	 *
	 * 版本 >= 0
	 */
	 private long version = 20160623;

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
	 * 帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
	 *
	 * 版本 >= 0
	 */
	 private short accountType;

	/**
	 * accountType_u uflag field
	 */
	 private short accountType_u = 0;

	/**
	 * 手机号
	 *
	 * 版本 >= 0
	 */
	 private String mobile = new String();

	/**
	 * mobile_u uflag field
	 */
	 private short mobile_u = 0;

	/**
	 * 电子邮箱
	 *
	 * 版本 >= 0
	 */
	 private String email = new String();

	/**
	 * email_u uflag field
	 */
	 private short email_u = 0;

	/**
	 * 个性化账号
	 *
	 * 版本 >= 0
	 */
	 private String loginAccount = new String();

	/**
	 * loginAccount_u uflag field
	 */
	 private short loginAccount_u = 0;

	/**
	 * 微信OpenID：appid-openid
	 *
	 * 版本 >= 0
	 */
	 private Map<String,String> wechatOpenid = new HashMap<String,String>();

	/**
	 * wechatOpenid_u uflag field
	 */
	 private short wechatOpenid_u = 0;

	/**
	 * 微信unionID
	 *
	 * 版本 >= 0
	 */
	 private String wechatUnionid = new String();

	/**
	 * wechatUnionid_u uflag field
	 */
	 private short wechatUnionid_u = 0;

	/**
	 * 用户类型，参见user_comm_define.h中的E_USER_TYPE
	 *
	 * 版本 >= 0
	 */
	 private short userType;

	/**
	 * userType_u uflag field
	 */
	 private short userType_u = 0;

	/**
	 * 用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
	 *
	 * 版本 >= 0
	 */
	 private BitSet bitProperty = new BitSet();

	/**
	 * bitProperty_u uflag field
	 */
	 private short bitProperty_u = 0;

	/**
	 * 登录密码安全级别
	 *
	 * 版本 >= 0
	 */
	 private short passwordSecureLevel;

	/**
	 * passwordSecureLevel_u uflag field
	 */
	 private short passwordSecureLevel_u = 0;

	/**
	 * 不同来源用户注册时间, key为来源，value为注册时间
	 *
	 * 版本 >= 0
	 */
	 private Map<uint32_t,uint32_t> diffSrcRegTime = new HashMap<uint32_t,uint32_t>();

	/**
	 * diffSrcRegTime_u uflag field
	 */
	 private short diffSrcRegTime_u = 0;

	/**
	 * 用户评级
	 *
	 * 版本 >= 0
	 */
	 private short rating;

	/**
	 * rating_u uflag field
	 */
	 private short rating_u = 0;

	/**
	 * 宝宝列表
	 *
	 * 版本 >= 0
	 */
	 private Vector<BabyInfo4CsPo> babyInfo = new Vector<BabyInfo4CsPo>();

	/**
	 * babyInfo_u uflag field
	 */
	 private short babyInfo_u = 0;

	/**
	 * 与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
	 *
	 * 版本 >= 0
	 */
	 private short relationWithBaby;

	/**
	 * relationWithBaby_u uflag field
	 */
	 private short relationWithBaby_u = 0;

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
	 * 生日
	 *
	 * 版本 >= 0
	 */
	 private long birthday;

	/**
	 * birthday_u uflag field
	 */
	 private short birthday_u = 0;

	/**
	 * QQ号
	 *
	 * 版本 >= 0
	 */
	 private long QQNumber;

	/**
	 * QQNumber_u uflag field
	 */
	 private short QQNumber_u = 0;

	/**
	 * 固定电话
	 *
	 * 版本 >= 0
	 */
	 private String phone = new String();

	/**
	 * phone_u uflag field
	 */
	 private short phone_u = 0;

	/**
	 * 传真
	 *
	 * 版本 >= 0
	 */
	 private String fax = new String();

	/**
	 * fax_u uflag field
	 */
	 private short fax_u = 0;

	/**
	 * 所在地区id
	 *
	 * 版本 >= 0
	 */
	 private String region = new String();

	/**
	 * region_u uflag field
	 */
	 private short region_u = 0;

	/**
	 * 详细住址
	 *
	 * 版本 >= 0
	 */
	 private String address = new String();

	/**
	 * address_u uflag field
	 */
	 private short address_u = 0;

	/**
	 * 小区
	 *
	 * 版本 >= 0
	 */
	 private String community = new String();

	/**
	 * community_u uflag field
	 */
	 private short community_u = 0;

	/**
	 * 邮政编码
	 *
	 * 版本 >= 0
	 */
	 private String postcode = new String();

	/**
	 * postcode_u uflag field
	 */
	 private short postcode_u = 0;

	/**
	 * 身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
	 *
	 * 版本 >= 0
	 */
	 private short identityType;

	/**
	 * identityType_u uflag field
	 */
	 private short identityType_u = 0;

	/**
	 * 身份证件号码
	 *
	 * 版本 >= 0
	 */
	 private String identityNum = new String();

	/**
	 * identityNum_u uflag field
	 */
	 private short identityNum_u = 0;

	/**
	 * 头像
	 *
	 * 版本 >= 0
	 */
	 private String photo = new String();

	/**
	 * photo_u uflag field
	 */
	 private short photo_u = 0;

	/**
	 * 签名
	 *
	 * 版本 >= 0
	 */
	 private String signature = new String();

	/**
	 * signature_u uflag field
	 */
	 private short signature_u = 0;

	/**
	 * 外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
	 *
	 * 版本 >= 0
	 */
	 private Map<uint32_t,String> euid = new HashMap<uint32_t,String>();

	/**
	 * euid_u uflag field
	 */
	 private short euid_u = 0;

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
	 * 推荐人
	 *
	 * 版本 >= 0
	 */
	 private String referrer = new String();

	/**
	 * referrer_u uflag field
	 */
	 private short referrer_u = 0;

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

	/**
	 * 微信账号
	 *
	 * 版本 >= 20151125
	 */
	 private String wechatAccount = new String();

	/**
	 * wechatAccount_u uflag field
	 */
	 private short wechatAccount_u = 0;

	/**
	 * 会员等级(1-银卡，2-金卡，3-铂金卡)
	 *
	 * 版本 >= 20151125
	 */
	 private short memberLevel;

	/**
	 * memberLevel_u uflag field
	 */
	 private short memberLevel_u = 0;

	/**
	 * 会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
	 *
	 * 版本 >= 20151125
	 */
	 private Vector<MembercardInfo4CsPo> membercardList = new Vector<MembercardInfo4CsPo>();

	/**
	 * membercardList_u uflag field
	 */
	 private short membercardList_u = 0;

	/**
	 * 好孕护照列表
	 *
	 * 版本 >= 20151125
	 */
	 private Vector<String> pregnantPassportList = new Vector<String>();

	/**
	 * pregnantPassportList_u uflag field
	 */
	 private short pregnantPassportList_u = 0;

	/**
	 * 招募人(员工工号)
	 *
	 * 版本 >= 20151125
	 */
	 private String recruiter = new String();

	/**
	 * recruiter_u uflag field
	 */
	 private short recruiter_u = 0;

	/**
	 * 顾客关系经营人(原维护人)(员工工号)
	 *
	 * 版本 >= 20151125
	 */
	 private String manager = new String();

	/**
	 * manager_u uflag field
	 */
	 private short manager_u = 0;

	/**
	 * 建档人(员工工号)
	 *
	 * 版本 >= 20151125
	 */
	 private String creator = new String();

	/**
	 * creator_u uflag field
	 */
	 private short creator_u = 0;

	/**
	 * 建档部门(门店编号)
	 *
	 * 版本 >= 20151125
	 */
	 private String creatorDepartment = new String();

	/**
	 * creatorDepartment_u uflag field
	 */
	 private short creatorDepartment_u = 0;

	/**
	 * 注册来源
	 *
	 * 版本 >= 20151125
	 */
	 private short registerSource;

	/**
	 * registerSource_u uflag field
	 */
	 private short registerSource_u = 0;

	/**
	 * 会员来源
	 *
	 * 版本 >= 20151125
	 */
	 private short memberSource;

	/**
	 * memberSource_u uflag field
	 */
	 private short memberSource_u = 0;

	/**
	 * 是否同步给ERP
	 *
	 * 版本 >= 20151125
	 */
	 private short ifSendErp;

	/**
	 * ifSendErp_u uflag field
	 */
	 private short ifSendErp_u = 0;

	/**
	 * 首次同步给ERP时间
	 *
	 * 版本 >= 20151125
	 */
	 private long sendErpTime;

	/**
	 * sendErpTime_u uflag field
	 */
	 private short sendErpTime_u = 0;

	/**
	 * 家庭地址所在省
	 *
	 * 版本 >= 20151125
	 */
	 private String province = new String();

	/**
	 * province_u uflag field
	 */
	 private short province_u = 0;

	/**
	 * 家庭地址所在市
	 *
	 * 版本 >= 20151125
	 */
	 private String city = new String();

	/**
	 * city_u uflag field
	 */
	 private short city_u = 0;

	/**
	 * 家庭地址所在区
	 *
	 * 版本 >= 20151125
	 */
	 private String district = new String();

	/**
	 * district_u uflag field
	 */
	 private short district_u = 0;

	/**
	 * 用户属性，参见E_USER_PROPERTY
	 *
	 * 版本 >= 20160120
	 */
	 private UserProperty4CsPo userPropertyPo = new UserProperty4CsPo();

	/**
	 * userPropertyPo_u uflag field
	 */
	 private short userPropertyPo_u = 0;

	/**
	 * 用户标签列表
	 *
	 * 版本 >= 20160317
	 */
	 private Set<String> userLableList = new HashSet<String>();

	/**
	 * userLableList_u uflag field
	 */
	 private short userLableList_u = 0;

	/**
	 * 用户标签备注
	 *
	 * 版本 >= 20160317
	 */
	 private String userLableRemarks = new String();

	/**
	 * userLableRemarks_u uflag field
	 */
	 private short userLableRemarks_u = 0;

	/**
	 * 手机号状态
	 *
	 * 版本 >= 20160413
	 */
	 private short mobileStatus;

	/**
	 * mobileStatus_u uflag field
	 */
	 private short mobileStatus_u = 0;

	/**
	 * 备孕计划
	 *
	 * 版本 >= 20160623
	 */
	 private short pregnantPlan;

	/**
	 * pregnantPlan_u uflag field
	 */
	 private short pregnantPlan_u = 0;



	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushUInt(getSize(bs.getDecodeCharset()) - 4);
		bs.pushUInt(version);
		bs.pushLong(uid);
		bs.pushUByte(uid_u);
		bs.pushUByte(accountType);
		bs.pushUByte(accountType_u);
		bs.pushString(mobile);
		bs.pushUByte(mobile_u);
		bs.pushString(email);
		bs.pushUByte(email_u);
		bs.pushString(loginAccount);
		bs.pushUByte(loginAccount_u);
		bs.pushObject(wechatOpenid);
		bs.pushUByte(wechatOpenid_u);
		bs.pushString(wechatUnionid);
		bs.pushUByte(wechatUnionid_u);
		bs.pushUByte(userType);
		bs.pushUByte(userType_u);
		bs.pushBitSet(bitProperty);
		bs.pushUByte(bitProperty_u);
		bs.pushUByte(passwordSecureLevel);
		bs.pushUByte(passwordSecureLevel_u);
		bs.pushObject(diffSrcRegTime);
		bs.pushUByte(diffSrcRegTime_u);
		bs.pushUByte(rating);
		bs.pushUByte(rating_u);
		bs.pushObject(babyInfo);
		bs.pushUByte(babyInfo_u);
		bs.pushUByte(relationWithBaby);
		bs.pushUByte(relationWithBaby_u);
		bs.pushString(nickname);
		bs.pushUByte(nickname_u);
		bs.pushString(truename);
		bs.pushUByte(truename_u);
		bs.pushUByte(sex);
		bs.pushUByte(sex_u);
		bs.pushLong(birthday);
		bs.pushUByte(birthday_u);
		bs.pushLong(QQNumber);
		bs.pushUByte(QQNumber_u);
		bs.pushString(phone);
		bs.pushUByte(phone_u);
		bs.pushString(fax);
		bs.pushUByte(fax_u);
		bs.pushString(region);
		bs.pushUByte(region_u);
		bs.pushString(address);
		bs.pushUByte(address_u);
		bs.pushString(community);
		bs.pushUByte(community_u);
		bs.pushString(postcode);
		bs.pushUByte(postcode_u);
		bs.pushUByte(identityType);
		bs.pushUByte(identityType_u);
		bs.pushString(identityNum);
		bs.pushUByte(identityNum_u);
		bs.pushString(photo);
		bs.pushUByte(photo_u);
		bs.pushString(signature);
		bs.pushUByte(signature_u);
		bs.pushObject(euid);
		bs.pushUByte(euid_u);
		bs.pushUInt(addTime);
		bs.pushUByte(addTime_u);
		bs.pushString(referrer);
		bs.pushUByte(referrer_u);
		bs.pushUInt(lastUpdateTime);
		bs.pushUByte(lastUpdateTime_u);
		bs.pushString(reserve);
		bs.pushUByte(reserve_u);
		if(  this.version >= 20151125 ){
				bs.pushString(wechatAccount);
				bs.pushUByte(wechatAccount_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushUByte(memberLevel);
				bs.pushUByte(memberLevel_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushObject(membercardList);
				bs.pushUByte(membercardList_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushObject(pregnantPassportList);
				bs.pushUByte(pregnantPassportList_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(recruiter);
				bs.pushUByte(recruiter_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(manager);
				bs.pushUByte(manager_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(creator);
				bs.pushUByte(creator_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(creatorDepartment);
				bs.pushUByte(creatorDepartment_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushUByte(registerSource);
				bs.pushUByte(registerSource_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushUByte(memberSource);
				bs.pushUByte(memberSource_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushUByte(ifSendErp);
				bs.pushUByte(ifSendErp_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushUInt(sendErpTime);
				bs.pushUByte(sendErpTime_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(province);
				bs.pushUByte(province_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(city);
				bs.pushUByte(city_u);
		}
		if(  this.version >= 20151125 ){
				bs.pushString(district);
				bs.pushUByte(district_u);
		}
		if(  this.version >= 20160120 ){
				bs.pushObject(userPropertyPo);
				bs.pushUByte(userPropertyPo_u);
		}
		if(  this.version >= 20160317 ){
				bs.pushObject(userLableList);
				bs.pushUByte(userLableList_u);
		}
		if(  this.version >= 20160317 ){
				bs.pushString(userLableRemarks);
				bs.pushUByte(userLableRemarks_u);
		}
		if(  this.version >= 20160413 ){
				bs.pushUByte(mobileStatus);
				bs.pushUByte(mobileStatus_u);
		}
		if(  this.version >= 20160623 ){
				bs.pushUByte(pregnantPlan);
				bs.pushUByte(pregnantPlan_u);
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
		uid = bs.popLong();
		uid_u = bs.popUByte();
		accountType = bs.popUByte();
		accountType_u = bs.popUByte();
		mobile = bs.popString();
		mobile_u = bs.popUByte();
		email = bs.popString();
		email_u = bs.popUByte();
		loginAccount = bs.popString();
		loginAccount_u = bs.popUByte();
		wechatOpenid = (Map<String,String>)bs.popMap(String.class,String.class);
		wechatOpenid_u = bs.popUByte();
		wechatUnionid = bs.popString();
		wechatUnionid_u = bs.popUByte();
		userType = bs.popUByte();
		userType_u = bs.popUByte();
		bitProperty = bs.popBitSet();
		bitProperty_u = bs.popUByte();
		passwordSecureLevel = bs.popUByte();
		passwordSecureLevel_u = bs.popUByte();
		diffSrcRegTime = (Map<uint32_t,uint32_t>)bs.popMap(uint32_t.class,uint32_t.class);
		diffSrcRegTime_u = bs.popUByte();
		rating = bs.popUByte();
		rating_u = bs.popUByte();
		babyInfo = (Vector<BabyInfo4CsPo>)bs.popVector(BabyInfo4CsPo.class);
		babyInfo_u = bs.popUByte();
		relationWithBaby = bs.popUByte();
		relationWithBaby_u = bs.popUByte();
		nickname = bs.popString();
		nickname_u = bs.popUByte();
		truename = bs.popString();
		truename_u = bs.popUByte();
		sex = bs.popUByte();
		sex_u = bs.popUByte();
		birthday = bs.popLong();
		birthday_u = bs.popUByte();
		QQNumber = bs.popLong();
		QQNumber_u = bs.popUByte();
		phone = bs.popString();
		phone_u = bs.popUByte();
		fax = bs.popString();
		fax_u = bs.popUByte();
		region = bs.popString();
		region_u = bs.popUByte();
		address = bs.popString();
		address_u = bs.popUByte();
		community = bs.popString();
		community_u = bs.popUByte();
		postcode = bs.popString();
		postcode_u = bs.popUByte();
		identityType = bs.popUByte();
		identityType_u = bs.popUByte();
		identityNum = bs.popString();
		identityNum_u = bs.popUByte();
		photo = bs.popString();
		photo_u = bs.popUByte();
		signature = bs.popString();
		signature_u = bs.popUByte();
		euid = (Map<uint32_t,String>)bs.popMap(uint32_t.class,String.class);
		euid_u = bs.popUByte();
		addTime = bs.popUInt();
		addTime_u = bs.popUByte();
		referrer = bs.popString();
		referrer_u = bs.popUByte();
		lastUpdateTime = bs.popUInt();
		lastUpdateTime_u = bs.popUByte();
		reserve = bs.popString();
		reserve_u = bs.popUByte();
		if(  this.version >= 20151125 ){
				wechatAccount = bs.popString();
				wechatAccount_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				memberLevel = bs.popUByte();
				memberLevel_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				membercardList = (Vector<MembercardInfo4CsPo>)bs.popVector(MembercardInfo4CsPo.class);
				membercardList_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				pregnantPassportList = (Vector<String>)bs.popVector(String.class);
				pregnantPassportList_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				recruiter = bs.popString();
				recruiter_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				manager = bs.popString();
				manager_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				creator = bs.popString();
				creator_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				creatorDepartment = bs.popString();
				creatorDepartment_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				registerSource = bs.popUByte();
				registerSource_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				memberSource = bs.popUByte();
				memberSource_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				ifSendErp = bs.popUByte();
				ifSendErp_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				sendErpTime = bs.popUInt();
				sendErpTime_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				province = bs.popString();
				province_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				city = bs.popString();
				city_u = bs.popUByte();
		}
		if(  this.version >= 20151125 ){
				district = bs.popString();
				district_u = bs.popUByte();
		}
		if(  this.version >= 20160120 ){
				userPropertyPo = (UserProperty4CsPo) bs.popObject(UserProperty4CsPo.class);
				userPropertyPo_u = bs.popUByte();
		}
		if(  this.version >= 20160317 ){
				userLableList = (Set<String>)bs.popSet(HashSet.class,String.class);
				userLableList_u = bs.popUByte();
		}
		if(  this.version >= 20160317 ){
				userLableRemarks = bs.popString();
				userLableRemarks_u = bs.popUByte();
		}
		if(  this.version >= 20160413 ){
				mobileStatus = bs.popUByte();
				mobileStatus_u = bs.popUByte();
		}
		if(  this.version >= 20160623 ){
				pregnantPlan = bs.popUByte();
				pregnantPlan_u = bs.popUByte();
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
	 * 获取帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
	 * 
	 * 此字段的版本 >= 0
	 * @return accountType value 类型为:short
	 * 
	 */
	public short getAccountType()
	{
		return accountType;
	}


	/**
	 * 设置帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setAccountType(short value)
	{
		this.accountType = value;
		this.accountType_u = 1;
	}

	public boolean issetAccountType()
	{
		return this.accountType_u != 0;
	}
	/**
	 * 获取手机号
	 * 
	 * 此字段的版本 >= 0
	 * @return mobile value 类型为:String
	 * 
	 */
	public String getMobile()
	{
		return mobile;
	}


	/**
	 * 设置手机号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setMobile(String value)
	{
		this.mobile = value;
		this.mobile_u = 1;
	}

	public boolean issetMobile()
	{
		return this.mobile_u != 0;
	}
	/**
	 * 获取电子邮箱
	 * 
	 * 此字段的版本 >= 0
	 * @return email value 类型为:String
	 * 
	 */
	public String getEmail()
	{
		return email;
	}


	/**
	 * 设置电子邮箱
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setEmail(String value)
	{
		this.email = value;
		this.email_u = 1;
	}

	public boolean issetEmail()
	{
		return this.email_u != 0;
	}
	/**
	 * 获取个性化账号
	 * 
	 * 此字段的版本 >= 0
	 * @return loginAccount value 类型为:String
	 * 
	 */
	public String getLoginAccount()
	{
		return loginAccount;
	}


	/**
	 * 设置个性化账号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setLoginAccount(String value)
	{
		this.loginAccount = value;
		this.loginAccount_u = 1;
	}

	public boolean issetLoginAccount()
	{
		return this.loginAccount_u != 0;
	}
	/**
	 * 获取微信OpenID：appid-openid
	 * 
	 * 此字段的版本 >= 0
	 * @return wechatOpenid value 类型为:Map<String,String>
	 * 
	 */
	public Map<String,String> getWechatOpenid()
	{
		return wechatOpenid;
	}


	/**
	 * 设置微信OpenID：appid-openid
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:Map<String,String>
	 * 
	 */
	public void setWechatOpenid(Map<String,String> value)
	{
		if (value != null) {
				this.wechatOpenid = value;
				this.wechatOpenid_u = 1;
		}
	}

	public boolean issetWechatOpenid()
	{
		return this.wechatOpenid_u != 0;
	}
	/**
	 * 获取微信unionID
	 * 
	 * 此字段的版本 >= 0
	 * @return wechatUnionid value 类型为:String
	 * 
	 */
	public String getWechatUnionid()
	{
		return wechatUnionid;
	}


	/**
	 * 设置微信unionID
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setWechatUnionid(String value)
	{
		this.wechatUnionid = value;
		this.wechatUnionid_u = 1;
	}

	public boolean issetWechatUnionid()
	{
		return this.wechatUnionid_u != 0;
	}
	/**
	 * 获取用户类型，参见user_comm_define.h中的E_USER_TYPE
	 * 
	 * 此字段的版本 >= 0
	 * @return userType value 类型为:short
	 * 
	 */
	public short getUserType()
	{
		return userType;
	}


	/**
	 * 设置用户类型，参见user_comm_define.h中的E_USER_TYPE
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setUserType(short value)
	{
		this.userType = value;
		this.userType_u = 1;
	}

	public boolean issetUserType()
	{
		return this.userType_u != 0;
	}
	/**
	 * 获取用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
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
	 * 设置用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
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
	 * 获取登录密码安全级别
	 * 
	 * 此字段的版本 >= 0
	 * @return passwordSecureLevel value 类型为:short
	 * 
	 */
	public short getPasswordSecureLevel()
	{
		return passwordSecureLevel;
	}


	/**
	 * 设置登录密码安全级别
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setPasswordSecureLevel(short value)
	{
		this.passwordSecureLevel = value;
		this.passwordSecureLevel_u = 1;
	}

	public boolean issetPasswordSecureLevel()
	{
		return this.passwordSecureLevel_u != 0;
	}
	/**
	 * 获取不同来源用户注册时间, key为来源，value为注册时间
	 * 
	 * 此字段的版本 >= 0
	 * @return diffSrcRegTime value 类型为:Map<uint32_t,uint32_t>
	 * 
	 */
	public Map<uint32_t,uint32_t> getDiffSrcRegTime()
	{
		return diffSrcRegTime;
	}


	/**
	 * 设置不同来源用户注册时间, key为来源，value为注册时间
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:Map<uint32_t,uint32_t>
	 * 
	 */
	public void setDiffSrcRegTime(Map<uint32_t,uint32_t> value)
	{
		if (value != null) {
				this.diffSrcRegTime = value;
				this.diffSrcRegTime_u = 1;
		}
	}

	public boolean issetDiffSrcRegTime()
	{
		return this.diffSrcRegTime_u != 0;
	}
	/**
	 * 获取用户评级
	 * 
	 * 此字段的版本 >= 0
	 * @return rating value 类型为:short
	 * 
	 */
	public short getRating()
	{
		return rating;
	}


	/**
	 * 设置用户评级
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setRating(short value)
	{
		this.rating = value;
		this.rating_u = 1;
	}

	public boolean issetRating()
	{
		return this.rating_u != 0;
	}
	/**
	 * 获取宝宝列表
	 * 
	 * 此字段的版本 >= 0
	 * @return babyInfo value 类型为:Vector<BabyInfo4CsPo>
	 * 
	 */
	public Vector<BabyInfo4CsPo> getBabyInfo()
	{
		return babyInfo;
	}


	/**
	 * 设置宝宝列表
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:Vector<BabyInfo4CsPo>
	 * 
	 */
	public void setBabyInfo(Vector<BabyInfo4CsPo> value)
	{
		if (value != null) {
				this.babyInfo = value;
				this.babyInfo_u = 1;
		}
	}

	public boolean issetBabyInfo()
	{
		return this.babyInfo_u != 0;
	}
	/**
	 * 获取与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
	 * 
	 * 此字段的版本 >= 0
	 * @return relationWithBaby value 类型为:short
	 * 
	 */
	public short getRelationWithBaby()
	{
		return relationWithBaby;
	}


	/**
	 * 设置与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setRelationWithBaby(short value)
	{
		this.relationWithBaby = value;
		this.relationWithBaby_u = 1;
	}

	public boolean issetRelationWithBaby()
	{
		return this.relationWithBaby_u != 0;
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
	 * 获取生日
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
	 * 设置生日
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
	 * 获取QQ号
	 * 
	 * 此字段的版本 >= 0
	 * @return QQNumber value 类型为:long
	 * 
	 */
	public long getQQNumber()
	{
		return QQNumber;
	}


	/**
	 * 设置QQ号
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:long
	 * 
	 */
	public void setQQNumber(long value)
	{
		this.QQNumber = value;
		this.QQNumber_u = 1;
	}

	public boolean issetQQNumber()
	{
		return this.QQNumber_u != 0;
	}
	/**
	 * 获取固定电话
	 * 
	 * 此字段的版本 >= 0
	 * @return phone value 类型为:String
	 * 
	 */
	public String getPhone()
	{
		return phone;
	}


	/**
	 * 设置固定电话
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setPhone(String value)
	{
		this.phone = value;
		this.phone_u = 1;
	}

	public boolean issetPhone()
	{
		return this.phone_u != 0;
	}
	/**
	 * 获取传真
	 * 
	 * 此字段的版本 >= 0
	 * @return fax value 类型为:String
	 * 
	 */
	public String getFax()
	{
		return fax;
	}


	/**
	 * 设置传真
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setFax(String value)
	{
		this.fax = value;
		this.fax_u = 1;
	}

	public boolean issetFax()
	{
		return this.fax_u != 0;
	}
	/**
	 * 获取所在地区id
	 * 
	 * 此字段的版本 >= 0
	 * @return region value 类型为:String
	 * 
	 */
	public String getRegion()
	{
		return region;
	}


	/**
	 * 设置所在地区id
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setRegion(String value)
	{
		this.region = value;
		this.region_u = 1;
	}

	public boolean issetRegion()
	{
		return this.region_u != 0;
	}
	/**
	 * 获取详细住址
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
	 * 设置详细住址
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
	 * 获取小区
	 * 
	 * 此字段的版本 >= 0
	 * @return community value 类型为:String
	 * 
	 */
	public String getCommunity()
	{
		return community;
	}


	/**
	 * 设置小区
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setCommunity(String value)
	{
		this.community = value;
		this.community_u = 1;
	}

	public boolean issetCommunity()
	{
		return this.community_u != 0;
	}
	/**
	 * 获取邮政编码
	 * 
	 * 此字段的版本 >= 0
	 * @return postcode value 类型为:String
	 * 
	 */
	public String getPostcode()
	{
		return postcode;
	}


	/**
	 * 设置邮政编码
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setPostcode(String value)
	{
		this.postcode = value;
		this.postcode_u = 1;
	}

	public boolean issetPostcode()
	{
		return this.postcode_u != 0;
	}
	/**
	 * 获取身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
	 * 
	 * 此字段的版本 >= 0
	 * @return identityType value 类型为:short
	 * 
	 */
	public short getIdentityType()
	{
		return identityType;
	}


	/**
	 * 设置身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:short
	 * 
	 */
	public void setIdentityType(short value)
	{
		this.identityType = value;
		this.identityType_u = 1;
	}

	public boolean issetIdentityType()
	{
		return this.identityType_u != 0;
	}
	/**
	 * 获取身份证件号码
	 * 
	 * 此字段的版本 >= 0
	 * @return identityNum value 类型为:String
	 * 
	 */
	public String getIdentityNum()
	{
		return identityNum;
	}


	/**
	 * 设置身份证件号码
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setIdentityNum(String value)
	{
		this.identityNum = value;
		this.identityNum_u = 1;
	}

	public boolean issetIdentityNum()
	{
		return this.identityNum_u != 0;
	}
	/**
	 * 获取头像
	 * 
	 * 此字段的版本 >= 0
	 * @return photo value 类型为:String
	 * 
	 */
	public String getPhoto()
	{
		return photo;
	}


	/**
	 * 设置头像
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setPhoto(String value)
	{
		this.photo = value;
		this.photo_u = 1;
	}

	public boolean issetPhoto()
	{
		return this.photo_u != 0;
	}
	/**
	 * 获取签名
	 * 
	 * 此字段的版本 >= 0
	 * @return signature value 类型为:String
	 * 
	 */
	public String getSignature()
	{
		return signature;
	}


	/**
	 * 设置签名
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setSignature(String value)
	{
		this.signature = value;
		this.signature_u = 1;
	}

	public boolean issetSignature()
	{
		return this.signature_u != 0;
	}
	/**
	 * 获取外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
	 * 
	 * 此字段的版本 >= 0
	 * @return euid value 类型为:Map<uint32_t,String>
	 * 
	 */
	public Map<uint32_t,String> getEuid()
	{
		return euid;
	}


	/**
	 * 设置外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:Map<uint32_t,String>
	 * 
	 */
	public void setEuid(Map<uint32_t,String> value)
	{
		if (value != null) {
				this.euid = value;
				this.euid_u = 1;
		}
	}

	public boolean issetEuid()
	{
		return this.euid_u != 0;
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
	 * 获取推荐人
	 * 
	 * 此字段的版本 >= 0
	 * @return referrer value 类型为:String
	 * 
	 */
	public String getReferrer()
	{
		return referrer;
	}


	/**
	 * 设置推荐人
	 * 
	 * 此字段的版本 >= 0
	 * @param  value 类型为:String
	 * 
	 */
	public void setReferrer(String value)
	{
		this.referrer = value;
		this.referrer_u = 1;
	}

	public boolean issetReferrer()
	{
		return this.referrer_u != 0;
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
	 * 获取微信账号
	 * 
	 * 此字段的版本 >= 20151125
	 * @return wechatAccount value 类型为:String
	 * 
	 */
	public String getWechatAccount()
	{
		return wechatAccount;
	}


	/**
	 * 设置微信账号
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setWechatAccount(String value)
	{
		this.wechatAccount = value;
		this.wechatAccount_u = 1;
	}

	public boolean issetWechatAccount()
	{
		return this.wechatAccount_u != 0;
	}
	/**
	 * 获取会员等级(1-银卡，2-金卡，3-铂金卡)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return memberLevel value 类型为:short
	 * 
	 */
	public short getMemberLevel()
	{
		return memberLevel;
	}


	/**
	 * 设置会员等级(1-银卡，2-金卡，3-铂金卡)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:short
	 * 
	 */
	public void setMemberLevel(short value)
	{
		this.memberLevel = value;
		this.memberLevel_u = 1;
	}

	public boolean issetMemberLevel()
	{
		return this.memberLevel_u != 0;
	}
	/**
	 * 获取会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return membercardList value 类型为:Vector<MembercardInfo4CsPo>
	 * 
	 */
	public Vector<MembercardInfo4CsPo> getMembercardList()
	{
		return membercardList;
	}


	/**
	 * 设置会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:Vector<MembercardInfo4CsPo>
	 * 
	 */
	public void setMembercardList(Vector<MembercardInfo4CsPo> value)
	{
		if (value != null) {
				this.membercardList = value;
				this.membercardList_u = 1;
		}
	}

	public boolean issetMembercardList()
	{
		return this.membercardList_u != 0;
	}
	/**
	 * 获取好孕护照列表
	 * 
	 * 此字段的版本 >= 20151125
	 * @return pregnantPassportList value 类型为:Vector<String>
	 * 
	 */
	public Vector<String> getPregnantPassportList()
	{
		return pregnantPassportList;
	}


	/**
	 * 设置好孕护照列表
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:Vector<String>
	 * 
	 */
	public void setPregnantPassportList(Vector<String> value)
	{
		if (value != null) {
				this.pregnantPassportList = value;
				this.pregnantPassportList_u = 1;
		}
	}

	public boolean issetPregnantPassportList()
	{
		return this.pregnantPassportList_u != 0;
	}
	/**
	 * 获取招募人(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return recruiter value 类型为:String
	 * 
	 */
	public String getRecruiter()
	{
		return recruiter;
	}


	/**
	 * 设置招募人(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setRecruiter(String value)
	{
		this.recruiter = value;
		this.recruiter_u = 1;
	}

	public boolean issetRecruiter()
	{
		return this.recruiter_u != 0;
	}
	/**
	 * 获取顾客关系经营人(原维护人)(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return manager value 类型为:String
	 * 
	 */
	public String getManager()
	{
		return manager;
	}


	/**
	 * 设置顾客关系经营人(原维护人)(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setManager(String value)
	{
		this.manager = value;
		this.manager_u = 1;
	}

	public boolean issetManager()
	{
		return this.manager_u != 0;
	}
	/**
	 * 获取建档人(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return creator value 类型为:String
	 * 
	 */
	public String getCreator()
	{
		return creator;
	}


	/**
	 * 设置建档人(员工工号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setCreator(String value)
	{
		this.creator = value;
		this.creator_u = 1;
	}

	public boolean issetCreator()
	{
		return this.creator_u != 0;
	}
	/**
	 * 获取建档部门(门店编号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @return creatorDepartment value 类型为:String
	 * 
	 */
	public String getCreatorDepartment()
	{
		return creatorDepartment;
	}


	/**
	 * 设置建档部门(门店编号)
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setCreatorDepartment(String value)
	{
		this.creatorDepartment = value;
		this.creatorDepartment_u = 1;
	}

	public boolean issetCreatorDepartment()
	{
		return this.creatorDepartment_u != 0;
	}
	/**
	 * 获取注册来源
	 * 
	 * 此字段的版本 >= 20151125
	 * @return registerSource value 类型为:short
	 * 
	 */
	public short getRegisterSource()
	{
		return registerSource;
	}


	/**
	 * 设置注册来源
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:short
	 * 
	 */
	public void setRegisterSource(short value)
	{
		this.registerSource = value;
		this.registerSource_u = 1;
	}

	public boolean issetRegisterSource()
	{
		return this.registerSource_u != 0;
	}
	/**
	 * 获取会员来源
	 * 
	 * 此字段的版本 >= 20151125
	 * @return memberSource value 类型为:short
	 * 
	 */
	public short getMemberSource()
	{
		return memberSource;
	}


	/**
	 * 设置会员来源
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:short
	 * 
	 */
	public void setMemberSource(short value)
	{
		this.memberSource = value;
		this.memberSource_u = 1;
	}

	public boolean issetMemberSource()
	{
		return this.memberSource_u != 0;
	}
	/**
	 * 获取是否同步给ERP
	 * 
	 * 此字段的版本 >= 20151125
	 * @return ifSendErp value 类型为:short
	 * 
	 */
	public short getIfSendErp()
	{
		return ifSendErp;
	}


	/**
	 * 设置是否同步给ERP
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:short
	 * 
	 */
	public void setIfSendErp(short value)
	{
		this.ifSendErp = value;
		this.ifSendErp_u = 1;
	}

	public boolean issetIfSendErp()
	{
		return this.ifSendErp_u != 0;
	}
	/**
	 * 获取首次同步给ERP时间
	 * 
	 * 此字段的版本 >= 20151125
	 * @return sendErpTime value 类型为:long
	 * 
	 */
	public long getSendErpTime()
	{
		return sendErpTime;
	}


	/**
	 * 设置首次同步给ERP时间
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:long
	 * 
	 */
	public void setSendErpTime(long value)
	{
		this.sendErpTime = value;
		this.sendErpTime_u = 1;
	}

	public boolean issetSendErpTime()
	{
		return this.sendErpTime_u != 0;
	}
	/**
	 * 获取家庭地址所在省
	 * 
	 * 此字段的版本 >= 20151125
	 * @return province value 类型为:String
	 * 
	 */
	public String getProvince()
	{
		return province;
	}


	/**
	 * 设置家庭地址所在省
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setProvince(String value)
	{
		this.province = value;
		this.province_u = 1;
	}

	public boolean issetProvince()
	{
		return this.province_u != 0;
	}
	/**
	 * 获取家庭地址所在市
	 * 
	 * 此字段的版本 >= 20151125
	 * @return city value 类型为:String
	 * 
	 */
	public String getCity()
	{
		return city;
	}


	/**
	 * 设置家庭地址所在市
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setCity(String value)
	{
		this.city = value;
		this.city_u = 1;
	}

	public boolean issetCity()
	{
		return this.city_u != 0;
	}
	/**
	 * 获取家庭地址所在区
	 * 
	 * 此字段的版本 >= 20151125
	 * @return district value 类型为:String
	 * 
	 */
	public String getDistrict()
	{
		return district;
	}


	/**
	 * 设置家庭地址所在区
	 * 
	 * 此字段的版本 >= 20151125
	 * @param  value 类型为:String
	 * 
	 */
	public void setDistrict(String value)
	{
		this.district = value;
		this.district_u = 1;
	}

	public boolean issetDistrict()
	{
		return this.district_u != 0;
	}
	/**
	 * 获取用户属性，参见E_USER_PROPERTY
	 * 
	 * 此字段的版本 >= 20160120
	 * @return userPropertyPo value 类型为:UserProperty4CsPo
	 * 
	 */
	public UserProperty4CsPo getUserPropertyPo()
	{
		return userPropertyPo;
	}


	/**
	 * 设置用户属性，参见E_USER_PROPERTY
	 * 
	 * 此字段的版本 >= 20160120
	 * @param  value 类型为:UserProperty4CsPo
	 * 
	 */
	public void setUserPropertyPo(UserProperty4CsPo value)
	{
		if (value != null) {
				this.userPropertyPo = value;
				this.userPropertyPo_u = 1;
		}
	}

	public boolean issetUserPropertyPo()
	{
		return this.userPropertyPo_u != 0;
	}
	/**
	 * 获取用户标签列表
	 * 
	 * 此字段的版本 >= 20160317
	 * @return userLableList value 类型为:Set<String>
	 * 
	 */
	public Set<String> getUserLableList()
	{
		return userLableList;
	}


	/**
	 * 设置用户标签列表
	 * 
	 * 此字段的版本 >= 20160317
	 * @param  value 类型为:Set<String>
	 * 
	 */
	public void setUserLableList(Set<String> value)
	{
		if (value != null) {
				this.userLableList = value;
				this.userLableList_u = 1;
		}
	}

	public boolean issetUserLableList()
	{
		return this.userLableList_u != 0;
	}
	/**
	 * 获取用户标签备注
	 * 
	 * 此字段的版本 >= 20160317
	 * @return userLableRemarks value 类型为:String
	 * 
	 */
	public String getUserLableRemarks()
	{
		return userLableRemarks;
	}


	/**
	 * 设置用户标签备注
	 * 
	 * 此字段的版本 >= 20160317
	 * @param  value 类型为:String
	 * 
	 */
	public void setUserLableRemarks(String value)
	{
		this.userLableRemarks = value;
		this.userLableRemarks_u = 1;
	}

	public boolean issetUserLableRemarks()
	{
		return this.userLableRemarks_u != 0;
	}
	/**
	 * 获取手机号状态
	 * 
	 * 此字段的版本 >= 20160413
	 * @return mobileStatus value 类型为:short
	 * 
	 */
	public short getMobileStatus()
	{
		return mobileStatus;
	}


	/**
	 * 设置手机号状态
	 * 
	 * 此字段的版本 >= 20160413
	 * @param  value 类型为:short
	 * 
	 */
	public void setMobileStatus(short value)
	{
		this.mobileStatus = value;
		this.mobileStatus_u = 1;
	}

	public boolean issetMobileStatus()
	{
		return this.mobileStatus_u != 0;
	}
	/**
	 * 获取备孕计划
	 * 
	 * 此字段的版本 >= 20160623
	 * @return pregnantPlan value 类型为:short
	 * 
	 */
	public short getPregnantPlan()
	{
		return pregnantPlan;
	}


	/**
	 * 设置备孕计划
	 * 
	 * 此字段的版本 >= 20160623
	 * @param  value 类型为:short
	 * 
	 */
	public void setPregnantPlan(short value)
	{
		this.pregnantPlan = value;
		this.pregnantPlan_u = 1;
	}

	public boolean issetPregnantPlan()
	{
		return this.pregnantPlan_u != 0;
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
				length = 4;  //size_of(UserInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += 1;  //计算字段uid_u的长度 size_of(uint32_t)
				length += 1;  //计算字段accountType的长度 size_of(uint8_t)
				length += 1;  //计算字段accountType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(mobile, null);  //计算字段mobile的长度 size_of(String)
				length += 1;  //计算字段mobile_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(email, null);  //计算字段email的长度 size_of(String)
				length += 1;  //计算字段email_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(loginAccount, null);  //计算字段loginAccount的长度 size_of(String)
				length += 1;  //计算字段loginAccount_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(wechatOpenid, null);  //计算字段wechatOpenid的长度 size_of(Map)
				length += 1;  //计算字段wechatOpenid_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(wechatUnionid, null);  //计算字段wechatUnionid的长度 size_of(String)
				length += 1;  //计算字段wechatUnionid_u的长度 size_of(uint32_t)
				length += 1;  //计算字段userType的长度 size_of(uint8_t)
				length += 1;  //计算字段userType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(bitProperty, null);  //计算字段bitProperty的长度 size_of(BitSet)
				length += 1;  //计算字段bitProperty_u的长度 size_of(uint32_t)
				length += 1;  //计算字段passwordSecureLevel的长度 size_of(uint8_t)
				length += 1;  //计算字段passwordSecureLevel_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(diffSrcRegTime, null);  //计算字段diffSrcRegTime的长度 size_of(Map)
				length += 1;  //计算字段diffSrcRegTime_u的长度 size_of(uint32_t)
				length += 1;  //计算字段rating的长度 size_of(uint8_t)
				length += 1;  //计算字段rating_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(babyInfo, null);  //计算字段babyInfo的长度 size_of(Vector)
				length += 1;  //计算字段babyInfo_u的长度 size_of(uint32_t)
				length += 1;  //计算字段relationWithBaby的长度 size_of(uint8_t)
				length += 1;  //计算字段relationWithBaby_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(nickname, null);  //计算字段nickname的长度 size_of(String)
				length += 1;  //计算字段nickname_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(truename, null);  //计算字段truename的长度 size_of(String)
				length += 1;  //计算字段truename_u的长度 size_of(uint32_t)
				length += 1;  //计算字段sex的长度 size_of(uint8_t)
				length += 1;  //计算字段sex_u的长度 size_of(uint32_t)
				length += 17;  //计算字段birthday的长度 size_of(uint64_t)
				length += 1;  //计算字段birthday_u的长度 size_of(uint32_t)
				length += 17;  //计算字段QQNumber的长度 size_of(uint64_t)
				length += 1;  //计算字段QQNumber_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(phone, null);  //计算字段phone的长度 size_of(String)
				length += 1;  //计算字段phone_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(fax, null);  //计算字段fax的长度 size_of(String)
				length += 1;  //计算字段fax_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(region, null);  //计算字段region的长度 size_of(String)
				length += 1;  //计算字段region_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(address, null);  //计算字段address的长度 size_of(String)
				length += 1;  //计算字段address_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(community, null);  //计算字段community的长度 size_of(String)
				length += 1;  //计算字段community_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(postcode, null);  //计算字段postcode的长度 size_of(String)
				length += 1;  //计算字段postcode_u的长度 size_of(uint32_t)
				length += 1;  //计算字段identityType的长度 size_of(uint8_t)
				length += 1;  //计算字段identityType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(identityNum, null);  //计算字段identityNum的长度 size_of(String)
				length += 1;  //计算字段identityNum_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(photo, null);  //计算字段photo的长度 size_of(String)
				length += 1;  //计算字段photo_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(signature, null);  //计算字段signature的长度 size_of(String)
				length += 1;  //计算字段signature_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(euid, null);  //计算字段euid的长度 size_of(Map)
				length += 1;  //计算字段euid_u的长度 size_of(uint32_t)
				length += 4;  //计算字段addTime的长度 size_of(uint32_t)
				length += 1;  //计算字段addTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(referrer, null);  //计算字段referrer的长度 size_of(String)
				length += 1;  //计算字段referrer_u的长度 size_of(uint32_t)
				length += 4;  //计算字段lastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段lastUpdateTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, null);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(wechatAccount, null);  //计算字段wechatAccount的长度 size_of(String)
						length += 1;  //计算字段wechatAccount_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段memberLevel的长度 size_of(uint8_t)
						length += 1;  //计算字段memberLevel_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(membercardList, null);  //计算字段membercardList的长度 size_of(Vector)
						length += 1;  //计算字段membercardList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(pregnantPassportList, null);  //计算字段pregnantPassportList的长度 size_of(Vector)
						length += 1;  //计算字段pregnantPassportList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(recruiter, null);  //计算字段recruiter的长度 size_of(String)
						length += 1;  //计算字段recruiter_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(manager, null);  //计算字段manager的长度 size_of(String)
						length += 1;  //计算字段manager_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(creator, null);  //计算字段creator的长度 size_of(String)
						length += 1;  //计算字段creator_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(creatorDepartment, null);  //计算字段creatorDepartment的长度 size_of(String)
						length += 1;  //计算字段creatorDepartment_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段registerSource的长度 size_of(uint8_t)
						length += 1;  //计算字段registerSource_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段memberSource的长度 size_of(uint8_t)
						length += 1;  //计算字段memberSource_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段ifSendErp的长度 size_of(uint8_t)
						length += 1;  //计算字段ifSendErp_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 4;  //计算字段sendErpTime的长度 size_of(uint32_t)
						length += 1;  //计算字段sendErpTime_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(province, null);  //计算字段province的长度 size_of(String)
						length += 1;  //计算字段province_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(city, null);  //计算字段city的长度 size_of(String)
						length += 1;  //计算字段city_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(district, null);  //计算字段district的长度 size_of(String)
						length += 1;  //计算字段district_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160120 ){
						length += ByteStream.getObjectSize(userPropertyPo, null);  //计算字段userPropertyPo的长度 size_of(UserProperty4CsPo)
						length += 1;  //计算字段userPropertyPo_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160317 ){
						length += ByteStream.getObjectSize(userLableList, null);  //计算字段userLableList的长度 size_of(Set)
						length += 1;  //计算字段userLableList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160317 ){
						length += ByteStream.getObjectSize(userLableRemarks, null);  //计算字段userLableRemarks的长度 size_of(String)
						length += 1;  //计算字段userLableRemarks_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160413 ){
						length += 1;  //计算字段mobileStatus的长度 size_of(uint8_t)
						length += 1;  //计算字段mobileStatus_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160623 ){
						length += 1;  //计算字段pregnantPlan的长度 size_of(uint8_t)
						length += 1;  //计算字段pregnantPlan_u的长度 size_of(uint32_t)
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
				length = 4;  //size_of(UserInfo4CsPo)
				length += 4;  //计算字段version的长度 size_of(uint32_t)
				length += 17;  //计算字段uid的长度 size_of(uint64_t)
				length += 1;  //计算字段uid_u的长度 size_of(uint32_t)
				length += 1;  //计算字段accountType的长度 size_of(uint8_t)
				length += 1;  //计算字段accountType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(mobile, encoding);  //计算字段mobile的长度 size_of(String)
				length += 1;  //计算字段mobile_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(email, encoding);  //计算字段email的长度 size_of(String)
				length += 1;  //计算字段email_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(loginAccount, encoding);  //计算字段loginAccount的长度 size_of(String)
				length += 1;  //计算字段loginAccount_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(wechatOpenid, encoding);  //计算字段wechatOpenid的长度 size_of(Map)
				length += 1;  //计算字段wechatOpenid_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(wechatUnionid, encoding);  //计算字段wechatUnionid的长度 size_of(String)
				length += 1;  //计算字段wechatUnionid_u的长度 size_of(uint32_t)
				length += 1;  //计算字段userType的长度 size_of(uint8_t)
				length += 1;  //计算字段userType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(bitProperty, encoding);  //计算字段bitProperty的长度 size_of(BitSet)
				length += 1;  //计算字段bitProperty_u的长度 size_of(uint32_t)
				length += 1;  //计算字段passwordSecureLevel的长度 size_of(uint8_t)
				length += 1;  //计算字段passwordSecureLevel_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(diffSrcRegTime, encoding);  //计算字段diffSrcRegTime的长度 size_of(Map)
				length += 1;  //计算字段diffSrcRegTime_u的长度 size_of(uint32_t)
				length += 1;  //计算字段rating的长度 size_of(uint8_t)
				length += 1;  //计算字段rating_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(babyInfo, encoding);  //计算字段babyInfo的长度 size_of(Vector)
				length += 1;  //计算字段babyInfo_u的长度 size_of(uint32_t)
				length += 1;  //计算字段relationWithBaby的长度 size_of(uint8_t)
				length += 1;  //计算字段relationWithBaby_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(nickname, encoding);  //计算字段nickname的长度 size_of(String)
				length += 1;  //计算字段nickname_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(truename, encoding);  //计算字段truename的长度 size_of(String)
				length += 1;  //计算字段truename_u的长度 size_of(uint32_t)
				length += 1;  //计算字段sex的长度 size_of(uint8_t)
				length += 1;  //计算字段sex_u的长度 size_of(uint32_t)
				length += 17;  //计算字段birthday的长度 size_of(uint64_t)
				length += 1;  //计算字段birthday_u的长度 size_of(uint32_t)
				length += 17;  //计算字段QQNumber的长度 size_of(uint64_t)
				length += 1;  //计算字段QQNumber_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(phone, encoding);  //计算字段phone的长度 size_of(String)
				length += 1;  //计算字段phone_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(fax, encoding);  //计算字段fax的长度 size_of(String)
				length += 1;  //计算字段fax_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(region, encoding);  //计算字段region的长度 size_of(String)
				length += 1;  //计算字段region_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(address, encoding);  //计算字段address的长度 size_of(String)
				length += 1;  //计算字段address_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(community, encoding);  //计算字段community的长度 size_of(String)
				length += 1;  //计算字段community_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(postcode, encoding);  //计算字段postcode的长度 size_of(String)
				length += 1;  //计算字段postcode_u的长度 size_of(uint32_t)
				length += 1;  //计算字段identityType的长度 size_of(uint8_t)
				length += 1;  //计算字段identityType_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(identityNum, encoding);  //计算字段identityNum的长度 size_of(String)
				length += 1;  //计算字段identityNum_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(photo, encoding);  //计算字段photo的长度 size_of(String)
				length += 1;  //计算字段photo_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(signature, encoding);  //计算字段signature的长度 size_of(String)
				length += 1;  //计算字段signature_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(euid, encoding);  //计算字段euid的长度 size_of(Map)
				length += 1;  //计算字段euid_u的长度 size_of(uint32_t)
				length += 4;  //计算字段addTime的长度 size_of(uint32_t)
				length += 1;  //计算字段addTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(referrer, encoding);  //计算字段referrer的长度 size_of(String)
				length += 1;  //计算字段referrer_u的长度 size_of(uint32_t)
				length += 4;  //计算字段lastUpdateTime的长度 size_of(uint32_t)
				length += 1;  //计算字段lastUpdateTime_u的长度 size_of(uint32_t)
				length += ByteStream.getObjectSize(reserve, encoding);  //计算字段reserve的长度 size_of(String)
				length += 1;  //计算字段reserve_u的长度 size_of(uint32_t)
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(wechatAccount, encoding);  //计算字段wechatAccount的长度 size_of(String)
						length += 1;  //计算字段wechatAccount_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段memberLevel的长度 size_of(uint8_t)
						length += 1;  //计算字段memberLevel_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(membercardList, encoding);  //计算字段membercardList的长度 size_of(Vector)
						length += 1;  //计算字段membercardList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(pregnantPassportList, encoding);  //计算字段pregnantPassportList的长度 size_of(Vector)
						length += 1;  //计算字段pregnantPassportList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(recruiter, encoding);  //计算字段recruiter的长度 size_of(String)
						length += 1;  //计算字段recruiter_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(manager, encoding);  //计算字段manager的长度 size_of(String)
						length += 1;  //计算字段manager_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(creator, encoding);  //计算字段creator的长度 size_of(String)
						length += 1;  //计算字段creator_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(creatorDepartment, encoding);  //计算字段creatorDepartment的长度 size_of(String)
						length += 1;  //计算字段creatorDepartment_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段registerSource的长度 size_of(uint8_t)
						length += 1;  //计算字段registerSource_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段memberSource的长度 size_of(uint8_t)
						length += 1;  //计算字段memberSource_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 1;  //计算字段ifSendErp的长度 size_of(uint8_t)
						length += 1;  //计算字段ifSendErp_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += 4;  //计算字段sendErpTime的长度 size_of(uint32_t)
						length += 1;  //计算字段sendErpTime_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(province, encoding);  //计算字段province的长度 size_of(String)
						length += 1;  //计算字段province_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(city, encoding);  //计算字段city的长度 size_of(String)
						length += 1;  //计算字段city_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20151125 ){
						length += ByteStream.getObjectSize(district, encoding);  //计算字段district的长度 size_of(String)
						length += 1;  //计算字段district_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160120 ){
						length += ByteStream.getObjectSize(userPropertyPo, encoding);  //计算字段userPropertyPo的长度 size_of(UserProperty4CsPo)
						length += 1;  //计算字段userPropertyPo_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160317 ){
						length += ByteStream.getObjectSize(userLableList, encoding);  //计算字段userLableList的长度 size_of(Set)
						length += 1;  //计算字段userLableList_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160317 ){
						length += ByteStream.getObjectSize(userLableRemarks, encoding);  //计算字段userLableRemarks的长度 size_of(String)
						length += 1;  //计算字段userLableRemarks_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160413 ){
						length += 1;  //计算字段mobileStatus的长度 size_of(uint8_t)
						length += 1;  //计算字段mobileStatus_u的长度 size_of(uint32_t)
				}
				if(  this.version >= 20160623 ){
						length += 1;  //计算字段pregnantPlan的长度 size_of(uint8_t)
						length += 1;  //计算字段pregnantPlan_u的长度 size_of(uint32_t)
				}
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}


/**
 ********************以下信息是每个版本的字段********************
 *
 *****以下是版本20151125所包含的字段*******
 *	long version;///<版本号
 *	long uid;///<uid, 用户id
 *	short uid_u;///<uid, 用户id
 *	short accountType;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	short accountType_u;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	String mobile;///<手机号
 *	short mobile_u;///<手机号
 *	String email;///<电子邮箱
 *	short email_u;///<电子邮箱
 *	String loginAccount;///<个性化账号
 *	short loginAccount_u;///<个性化账号
 *	Map<String,String> wechatOpenid;///<微信OpenID：appid-openid
 *	short wechatOpenid_u;///<微信OpenID：appid-openid
 *	String wechatUnionid;///<微信unionID
 *	short wechatUnionid_u;///<微信unionID
 *	short userType;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	short userType_u;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	BitSet bitProperty;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short bitProperty_u;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short passwordSecureLevel;///<登录密码安全级别
 *	short passwordSecureLevel_u;///<登录密码安全级别
 *	Map<uint32_t,uint32_t> diffSrcRegTime;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short diffSrcRegTime_u;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short rating;///<用户评级
 *	short rating_u;///<用户评级
 *	Vector<BabyInfo4CsPo> babyInfo;///<宝宝列表
 *	short babyInfo_u;///<宝宝列表
 *	short relationWithBaby;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	short relationWithBaby_u;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	String nickname;///<昵称
 *	short nickname_u;///<昵称
 *	String truename;///<真实姓名
 *	short truename_u;///<真实姓名
 *	short sex;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	short sex_u;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	long birthday;///<生日
 *	short birthday_u;///<生日
 *	long QQNumber;///<QQ号
 *	short QQNumber_u;///<QQ号
 *	String phone;///<固定电话
 *	short phone_u;///<固定电话
 *	String fax;///<传真
 *	short fax_u;///<传真
 *	String region;///<所在地区id
 *	short region_u;///<所在地区id
 *	String address;///<详细住址
 *	short address_u;///<详细住址
 *	String community;///<小区
 *	short community_u;///<小区
 *	String postcode;///<邮政编码
 *	short postcode_u;///<邮政编码
 *	short identityType;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	short identityType_u;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	String identityNum;///<身份证件号码
 *	short identityNum_u;///<身份证件号码
 *	String photo;///<头像
 *	short photo_u;///<头像
 *	String signature;///<签名
 *	short signature_u;///<签名
 *	Map<uint32_t,String> euid;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	short euid_u;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	long addTime;///<添加时间
 *	short addTime_u;///<添加时间
 *	String referrer;///<推荐人
 *	short referrer_u;///<推荐人
 *	long lastUpdateTime;///<最后修改时间
 *	short lastUpdateTime_u;///<最后修改时间
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	String wechatAccount;///<微信账号
 *	short wechatAccount_u;///<微信账号
 *	short memberLevel;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	short memberLevel_u;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	Vector<MembercardInfo4CsPo> membercardList;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	short membercardList_u;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	Vector<String> pregnantPassportList;///<好孕护照列表
 *	short pregnantPassportList_u;///<好孕护照列表
 *	String recruiter;///<招募人(员工工号)
 *	short recruiter_u;///<招募人(员工工号)
 *	String manager;///<顾客关系经营人(原维护人)(员工工号)
 *	short manager_u;///<顾客关系经营人(原维护人)(员工工号)
 *	String creator;///<建档人(员工工号)
 *	short creator_u;///<建档人(员工工号)
 *	String creatorDepartment;///<建档部门(门店编号)
 *	short creatorDepartment_u;///<建档部门(门店编号)
 *	short registerSource;///<注册来源
 *	short registerSource_u;///<注册来源
 *	short memberSource;///<会员来源
 *	short memberSource_u;///<会员来源
 *	short ifSendErp;///<是否同步给ERP
 *	short ifSendErp_u;///<是否同步给ERP
 *	long sendErpTime;///<首次同步给ERP时间
 *	short sendErpTime_u;///<首次同步给ERP时间
 *	String province;///<家庭地址所在省
 *	short province_u;///<家庭地址所在省
 *	String city;///<家庭地址所在市
 *	short city_u;///<家庭地址所在市
 *	String district;///<家庭地址所在区
 *	short district_u;///<家庭地址所在区
 *****以上是版本20151125所包含的字段*******
 *
 *****以下是版本20160120所包含的字段*******
 *	long version;///<版本号
 *	long uid;///<uid, 用户id
 *	short uid_u;///<uid, 用户id
 *	short accountType;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	short accountType_u;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	String mobile;///<手机号
 *	short mobile_u;///<手机号
 *	String email;///<电子邮箱
 *	short email_u;///<电子邮箱
 *	String loginAccount;///<个性化账号
 *	short loginAccount_u;///<个性化账号
 *	Map<String,String> wechatOpenid;///<微信OpenID：appid-openid
 *	short wechatOpenid_u;///<微信OpenID：appid-openid
 *	String wechatUnionid;///<微信unionID
 *	short wechatUnionid_u;///<微信unionID
 *	short userType;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	short userType_u;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	BitSet bitProperty;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short bitProperty_u;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short passwordSecureLevel;///<登录密码安全级别
 *	short passwordSecureLevel_u;///<登录密码安全级别
 *	Map<uint32_t,uint32_t> diffSrcRegTime;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short diffSrcRegTime_u;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short rating;///<用户评级
 *	short rating_u;///<用户评级
 *	Vector<BabyInfo4CsPo> babyInfo;///<宝宝列表
 *	short babyInfo_u;///<宝宝列表
 *	short relationWithBaby;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	short relationWithBaby_u;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	String nickname;///<昵称
 *	short nickname_u;///<昵称
 *	String truename;///<真实姓名
 *	short truename_u;///<真实姓名
 *	short sex;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	short sex_u;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	long birthday;///<生日
 *	short birthday_u;///<生日
 *	long QQNumber;///<QQ号
 *	short QQNumber_u;///<QQ号
 *	String phone;///<固定电话
 *	short phone_u;///<固定电话
 *	String fax;///<传真
 *	short fax_u;///<传真
 *	String region;///<所在地区id
 *	short region_u;///<所在地区id
 *	String address;///<详细住址
 *	short address_u;///<详细住址
 *	String community;///<小区
 *	short community_u;///<小区
 *	String postcode;///<邮政编码
 *	short postcode_u;///<邮政编码
 *	short identityType;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	short identityType_u;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	String identityNum;///<身份证件号码
 *	short identityNum_u;///<身份证件号码
 *	String photo;///<头像
 *	short photo_u;///<头像
 *	String signature;///<签名
 *	short signature_u;///<签名
 *	Map<uint32_t,String> euid;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	short euid_u;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	long addTime;///<添加时间
 *	short addTime_u;///<添加时间
 *	String referrer;///<推荐人
 *	short referrer_u;///<推荐人
 *	long lastUpdateTime;///<最后修改时间
 *	short lastUpdateTime_u;///<最后修改时间
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	String wechatAccount;///<微信账号
 *	short wechatAccount_u;///<微信账号
 *	short memberLevel;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	short memberLevel_u;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	Vector<MembercardInfo4CsPo> membercardList;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	short membercardList_u;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	Vector<String> pregnantPassportList;///<好孕护照列表
 *	short pregnantPassportList_u;///<好孕护照列表
 *	String recruiter;///<招募人(员工工号)
 *	short recruiter_u;///<招募人(员工工号)
 *	String manager;///<顾客关系经营人(原维护人)(员工工号)
 *	short manager_u;///<顾客关系经营人(原维护人)(员工工号)
 *	String creator;///<建档人(员工工号)
 *	short creator_u;///<建档人(员工工号)
 *	String creatorDepartment;///<建档部门(门店编号)
 *	short creatorDepartment_u;///<建档部门(门店编号)
 *	short registerSource;///<注册来源
 *	short registerSource_u;///<注册来源
 *	short memberSource;///<会员来源
 *	short memberSource_u;///<会员来源
 *	short ifSendErp;///<是否同步给ERP
 *	short ifSendErp_u;///<是否同步给ERP
 *	long sendErpTime;///<首次同步给ERP时间
 *	short sendErpTime_u;///<首次同步给ERP时间
 *	String province;///<家庭地址所在省
 *	short province_u;///<家庭地址所在省
 *	String city;///<家庭地址所在市
 *	short city_u;///<家庭地址所在市
 *	String district;///<家庭地址所在区
 *	short district_u;///<家庭地址所在区
 *	UserProperty4CsPo userPropertyPo;///<用户属性，参见E_USER_PROPERTY
 *	short userPropertyPo_u;///<用户属性，参见E_USER_PROPERTY
 *****以上是版本20160120所包含的字段*******
 *
 *****以下是版本20160623所包含的字段*******
 *	long version;///<版本号
 *	long uid;///<uid, 用户id
 *	short uid_u;///<uid, 用户id
 *	short accountType;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	short accountType_u;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	String mobile;///<手机号
 *	short mobile_u;///<手机号
 *	String email;///<电子邮箱
 *	short email_u;///<电子邮箱
 *	String loginAccount;///<个性化账号
 *	short loginAccount_u;///<个性化账号
 *	Map<String,String> wechatOpenid;///<微信OpenID：appid-openid
 *	short wechatOpenid_u;///<微信OpenID：appid-openid
 *	String wechatUnionid;///<微信unionID
 *	short wechatUnionid_u;///<微信unionID
 *	short userType;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	short userType_u;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	BitSet bitProperty;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short bitProperty_u;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short passwordSecureLevel;///<登录密码安全级别
 *	short passwordSecureLevel_u;///<登录密码安全级别
 *	Map<uint32_t,uint32_t> diffSrcRegTime;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short diffSrcRegTime_u;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short rating;///<用户评级
 *	short rating_u;///<用户评级
 *	Vector<BabyInfo4CsPo> babyInfo;///<宝宝列表
 *	short babyInfo_u;///<宝宝列表
 *	short relationWithBaby;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	short relationWithBaby_u;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	String nickname;///<昵称
 *	short nickname_u;///<昵称
 *	String truename;///<真实姓名
 *	short truename_u;///<真实姓名
 *	short sex;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	short sex_u;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	long birthday;///<生日
 *	short birthday_u;///<生日
 *	long QQNumber;///<QQ号
 *	short QQNumber_u;///<QQ号
 *	String phone;///<固定电话
 *	short phone_u;///<固定电话
 *	String fax;///<传真
 *	short fax_u;///<传真
 *	String region;///<所在地区id
 *	short region_u;///<所在地区id
 *	String address;///<详细住址
 *	short address_u;///<详细住址
 *	String community;///<小区
 *	short community_u;///<小区
 *	String postcode;///<邮政编码
 *	short postcode_u;///<邮政编码
 *	short identityType;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	short identityType_u;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	String identityNum;///<身份证件号码
 *	short identityNum_u;///<身份证件号码
 *	String photo;///<头像
 *	short photo_u;///<头像
 *	String signature;///<签名
 *	short signature_u;///<签名
 *	Map<uint32_t,String> euid;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	short euid_u;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	long addTime;///<添加时间
 *	short addTime_u;///<添加时间
 *	String referrer;///<推荐人
 *	short referrer_u;///<推荐人
 *	long lastUpdateTime;///<最后修改时间
 *	short lastUpdateTime_u;///<最后修改时间
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	String wechatAccount;///<微信账号
 *	short wechatAccount_u;///<微信账号
 *	short memberLevel;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	short memberLevel_u;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	Vector<MembercardInfo4CsPo> membercardList;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	short membercardList_u;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	Vector<String> pregnantPassportList;///<好孕护照列表
 *	short pregnantPassportList_u;///<好孕护照列表
 *	String recruiter;///<招募人(员工工号)
 *	short recruiter_u;///<招募人(员工工号)
 *	String manager;///<顾客关系经营人(原维护人)(员工工号)
 *	short manager_u;///<顾客关系经营人(原维护人)(员工工号)
 *	String creator;///<建档人(员工工号)
 *	short creator_u;///<建档人(员工工号)
 *	String creatorDepartment;///<建档部门(门店编号)
 *	short creatorDepartment_u;///<建档部门(门店编号)
 *	short registerSource;///<注册来源
 *	short registerSource_u;///<注册来源
 *	short memberSource;///<会员来源
 *	short memberSource_u;///<会员来源
 *	short ifSendErp;///<是否同步给ERP
 *	short ifSendErp_u;///<是否同步给ERP
 *	long sendErpTime;///<首次同步给ERP时间
 *	short sendErpTime_u;///<首次同步给ERP时间
 *	String province;///<家庭地址所在省
 *	short province_u;///<家庭地址所在省
 *	String city;///<家庭地址所在市
 *	short city_u;///<家庭地址所在市
 *	String district;///<家庭地址所在区
 *	short district_u;///<家庭地址所在区
 *	UserProperty4CsPo userPropertyPo;///<用户属性，参见E_USER_PROPERTY
 *	short userPropertyPo_u;///<用户属性，参见E_USER_PROPERTY
 *	Set<String> userLableList;///<用户标签列表
 *	short userLableList_u;///<用户标签列表
 *	String userLableRemarks;///<用户标签备注
 *	short userLableRemarks_u;///<用户标签备注
 *	short mobileStatus;///<手机号状态
 *	short mobileStatus_u;///<手机号状态
 *	short pregnantPlan;///<备孕计划
 *	short pregnantPlan_u;///<备孕计划
 *****以上是版本20160623所包含的字段*******
 *
 *****以下是版本20160317所包含的字段*******
 *	long version;///<版本号
 *	long uid;///<uid, 用户id
 *	short uid_u;///<uid, 用户id
 *	short accountType;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	short accountType_u;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	String mobile;///<手机号
 *	short mobile_u;///<手机号
 *	String email;///<电子邮箱
 *	short email_u;///<电子邮箱
 *	String loginAccount;///<个性化账号
 *	short loginAccount_u;///<个性化账号
 *	Map<String,String> wechatOpenid;///<微信OpenID：appid-openid
 *	short wechatOpenid_u;///<微信OpenID：appid-openid
 *	String wechatUnionid;///<微信unionID
 *	short wechatUnionid_u;///<微信unionID
 *	short userType;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	short userType_u;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	BitSet bitProperty;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short bitProperty_u;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short passwordSecureLevel;///<登录密码安全级别
 *	short passwordSecureLevel_u;///<登录密码安全级别
 *	Map<uint32_t,uint32_t> diffSrcRegTime;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short diffSrcRegTime_u;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short rating;///<用户评级
 *	short rating_u;///<用户评级
 *	Vector<BabyInfo4CsPo> babyInfo;///<宝宝列表
 *	short babyInfo_u;///<宝宝列表
 *	short relationWithBaby;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	short relationWithBaby_u;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	String nickname;///<昵称
 *	short nickname_u;///<昵称
 *	String truename;///<真实姓名
 *	short truename_u;///<真实姓名
 *	short sex;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	short sex_u;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	long birthday;///<生日
 *	short birthday_u;///<生日
 *	long QQNumber;///<QQ号
 *	short QQNumber_u;///<QQ号
 *	String phone;///<固定电话
 *	short phone_u;///<固定电话
 *	String fax;///<传真
 *	short fax_u;///<传真
 *	String region;///<所在地区id
 *	short region_u;///<所在地区id
 *	String address;///<详细住址
 *	short address_u;///<详细住址
 *	String community;///<小区
 *	short community_u;///<小区
 *	String postcode;///<邮政编码
 *	short postcode_u;///<邮政编码
 *	short identityType;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	short identityType_u;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	String identityNum;///<身份证件号码
 *	short identityNum_u;///<身份证件号码
 *	String photo;///<头像
 *	short photo_u;///<头像
 *	String signature;///<签名
 *	short signature_u;///<签名
 *	Map<uint32_t,String> euid;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	short euid_u;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	long addTime;///<添加时间
 *	short addTime_u;///<添加时间
 *	String referrer;///<推荐人
 *	short referrer_u;///<推荐人
 *	long lastUpdateTime;///<最后修改时间
 *	short lastUpdateTime_u;///<最后修改时间
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	String wechatAccount;///<微信账号
 *	short wechatAccount_u;///<微信账号
 *	short memberLevel;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	short memberLevel_u;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	Vector<MembercardInfo4CsPo> membercardList;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	short membercardList_u;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	Vector<String> pregnantPassportList;///<好孕护照列表
 *	short pregnantPassportList_u;///<好孕护照列表
 *	String recruiter;///<招募人(员工工号)
 *	short recruiter_u;///<招募人(员工工号)
 *	String manager;///<顾客关系经营人(原维护人)(员工工号)
 *	short manager_u;///<顾客关系经营人(原维护人)(员工工号)
 *	String creator;///<建档人(员工工号)
 *	short creator_u;///<建档人(员工工号)
 *	String creatorDepartment;///<建档部门(门店编号)
 *	short creatorDepartment_u;///<建档部门(门店编号)
 *	short registerSource;///<注册来源
 *	short registerSource_u;///<注册来源
 *	short memberSource;///<会员来源
 *	short memberSource_u;///<会员来源
 *	short ifSendErp;///<是否同步给ERP
 *	short ifSendErp_u;///<是否同步给ERP
 *	long sendErpTime;///<首次同步给ERP时间
 *	short sendErpTime_u;///<首次同步给ERP时间
 *	String province;///<家庭地址所在省
 *	short province_u;///<家庭地址所在省
 *	String city;///<家庭地址所在市
 *	short city_u;///<家庭地址所在市
 *	String district;///<家庭地址所在区
 *	short district_u;///<家庭地址所在区
 *	UserProperty4CsPo userPropertyPo;///<用户属性，参见E_USER_PROPERTY
 *	short userPropertyPo_u;///<用户属性，参见E_USER_PROPERTY
 *	Set<String> userLableList;///<用户标签列表
 *	short userLableList_u;///<用户标签列表
 *	String userLableRemarks;///<用户标签备注
 *	short userLableRemarks_u;///<用户标签备注
 *****以上是版本20160317所包含的字段*******
 *
 *****以下是版本20160413所包含的字段*******
 *	long version;///<版本号
 *	long uid;///<uid, 用户id
 *	short uid_u;///<uid, 用户id
 *	short accountType;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	short accountType_u;///<帐号类型，参见user_comm_define.h中的E_ACCOUNT_TYPE
 *	String mobile;///<手机号
 *	short mobile_u;///<手机号
 *	String email;///<电子邮箱
 *	short email_u;///<电子邮箱
 *	String loginAccount;///<个性化账号
 *	short loginAccount_u;///<个性化账号
 *	Map<String,String> wechatOpenid;///<微信OpenID：appid-openid
 *	short wechatOpenid_u;///<微信OpenID：appid-openid
 *	String wechatUnionid;///<微信unionID
 *	short wechatUnionid_u;///<微信unionID
 *	short userType;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	short userType_u;///<用户类型，参见user_comm_define.h中的E_USER_TYPE
 *	BitSet bitProperty;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short bitProperty_u;///<用户属性位BitSet，具体意义参见b2b2c_define.h中的E_USER_PROPERTY
 *	short passwordSecureLevel;///<登录密码安全级别
 *	short passwordSecureLevel_u;///<登录密码安全级别
 *	Map<uint32_t,uint32_t> diffSrcRegTime;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short diffSrcRegTime_u;///<不同来源用户注册时间, key为来源，value为注册时间
 *	short rating;///<用户评级
 *	short rating_u;///<用户评级
 *	Vector<BabyInfo4CsPo> babyInfo;///<宝宝列表
 *	short babyInfo_u;///<宝宝列表
 *	short relationWithBaby;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	short relationWithBaby_u;///<与宝宝关系，参见user_comm_define.h中的E_RELATION_WITH_BABY
 *	String nickname;///<昵称
 *	short nickname_u;///<昵称
 *	String truename;///<真实姓名
 *	short truename_u;///<真实姓名
 *	short sex;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	short sex_u;///<性别：0-未知，1-女，2-男。参见E_USER_SEX
 *	long birthday;///<生日
 *	short birthday_u;///<生日
 *	long QQNumber;///<QQ号
 *	short QQNumber_u;///<QQ号
 *	String phone;///<固定电话
 *	short phone_u;///<固定电话
 *	String fax;///<传真
 *	short fax_u;///<传真
 *	String region;///<所在地区id
 *	short region_u;///<所在地区id
 *	String address;///<详细住址
 *	short address_u;///<详细住址
 *	String community;///<小区
 *	short community_u;///<小区
 *	String postcode;///<邮政编码
 *	short postcode_u;///<邮政编码
 *	short identityType;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	short identityType_u;///<身份证件类型，参见user_comm_define.h中E_USER_IDTYPE
 *	String identityNum;///<身份证件号码
 *	short identityNum_u;///<身份证件号码
 *	String photo;///<头像
 *	short photo_u;///<头像
 *	String signature;///<签名
 *	short signature_u;///<签名
 *	Map<uint32_t,String> euid;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	short euid_u;///<外部导入用户euid, key为来源渠道（参见b2b2c_define.h中的E_USER_EUID_SOURCE）, value为外部uid
 *	long addTime;///<添加时间
 *	short addTime_u;///<添加时间
 *	String referrer;///<推荐人
 *	short referrer_u;///<推荐人
 *	long lastUpdateTime;///<最后修改时间
 *	short lastUpdateTime_u;///<最后修改时间
 *	String reserve;///<预留字段
 *	short reserve_u;///<预留字段
 *	String wechatAccount;///<微信账号
 *	short wechatAccount_u;///<微信账号
 *	short memberLevel;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	short memberLevel_u;///<会员等级(1-银卡，2-金卡，3-铂金卡)
 *	Vector<MembercardInfo4CsPo> membercardList;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	short membercardList_u;///<会员卡列表(会员卡类型:外卡号,内卡号;…)(卡类型：1-实体卡，2-联名卡，3-虚拟卡)(最多绑定10张)
 *	Vector<String> pregnantPassportList;///<好孕护照列表
 *	short pregnantPassportList_u;///<好孕护照列表
 *	String recruiter;///<招募人(员工工号)
 *	short recruiter_u;///<招募人(员工工号)
 *	String manager;///<顾客关系经营人(原维护人)(员工工号)
 *	short manager_u;///<顾客关系经营人(原维护人)(员工工号)
 *	String creator;///<建档人(员工工号)
 *	short creator_u;///<建档人(员工工号)
 *	String creatorDepartment;///<建档部门(门店编号)
 *	short creatorDepartment_u;///<建档部门(门店编号)
 *	short registerSource;///<注册来源
 *	short registerSource_u;///<注册来源
 *	short memberSource;///<会员来源
 *	short memberSource_u;///<会员来源
 *	short ifSendErp;///<是否同步给ERP
 *	short ifSendErp_u;///<是否同步给ERP
 *	long sendErpTime;///<首次同步给ERP时间
 *	short sendErpTime_u;///<首次同步给ERP时间
 *	String province;///<家庭地址所在省
 *	short province_u;///<家庭地址所在省
 *	String city;///<家庭地址所在市
 *	short city_u;///<家庭地址所在市
 *	String district;///<家庭地址所在区
 *	short district_u;///<家庭地址所在区
 *	UserProperty4CsPo userPropertyPo;///<用户属性，参见E_USER_PROPERTY
 *	short userPropertyPo_u;///<用户属性，参见E_USER_PROPERTY
 *	Set<String> userLableList;///<用户标签列表
 *	short userLableList_u;///<用户标签列表
 *	String userLableRemarks;///<用户标签备注
 *	short userLableRemarks_u;///<用户标签备注
 *	short mobileStatus;///<手机号状态
 *	short mobileStatus_u;///<手机号状态
 *****以上是版本20160413所包含的字段*******
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
