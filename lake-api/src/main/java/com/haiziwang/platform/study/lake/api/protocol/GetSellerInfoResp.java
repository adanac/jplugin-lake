 
 
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.oms.seller.SellerAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import java.util.Vector;

import com.paipai.netframework.kernal.NetMessage;
import com.paipai.util.io.ByteStream;

/**
 *
 *@date 2015-12-01 10:53:29
 *
 *@since version:0
*/
public class  GetSellerInfoResp extends NetMessage
{
	 private String errmsg = new String();

	/**
	 *  SellerInfoPo 
	 *
	 */
	 private Vector<SellerInfoPo> vecsellerInfoPo = new Vector<SellerInfoPo>();

	/**
	 *
	 */
	 private String outReserve = new String();


	public int serialize(ByteStream bs) throws Exception
	{

		bs.pushUInt(result);
		bs.pushString(errmsg);
		bs.pushObject(vecsellerInfoPo);
		bs.pushString(outReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{

		result = bs.popUInt();
		errmsg = bs.popString();
		vecsellerInfoPo = (Vector<SellerInfoPo>)bs.popVector(SellerInfoPo.class);
		outReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x200c8801L;
	}

	public String getErrmsg()
	{
		return errmsg;
	}


	public void setErrmsg(String value)
	{
		this.errmsg = value;
	}


	public Vector<SellerInfoPo> getVecsellerInfoPo()
	{
		return vecsellerInfoPo;
	}


	public void setVecsellerInfoPo(Vector<SellerInfoPo> value)
	{
		if (value != null) {
				this.vecsellerInfoPo = value;
		}else{
				this.vecsellerInfoPo = new Vector<SellerInfoPo>();
		}
	}


	public String getOutReserve()
	{
		return outReserve;
	}


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
				length = 4;  //size_of(GetSellerInfoResp)
				length += ByteStream.getObjectSize(errmsg, null);  //�����ֶ�errmsg�ĳ��� size_of(String)
				length += ByteStream.getObjectSize(vecsellerInfoPo, null);  //�����ֶ�vecsellerInfoPo�ĳ��� size_of(Vector)
				length += ByteStream.getObjectSize(outReserve, null);  //�����ֶ�outReserve�ĳ��� size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
	public int getSize(String encoding)
	{
		int length = 0;
		try{
				length = 0;  //size_of(GetSellerInfoResp)
				length += ByteStream.getObjectSize(errmsg, encoding);  //�����ֶ�errmsg�ĳ��� size_of(String)
				length += ByteStream.getObjectSize(vecsellerInfoPo, encoding);  //�����ֶ�vecsellerInfoPo�ĳ��� size_of(Vector)
				length += ByteStream.getObjectSize(outReserve, encoding);  //�����ֶ�outReserve�ĳ��� size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
}
