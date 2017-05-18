 
 
//auto gen by paipai.java.augogen ver 1.0
//auther skyzhuang
//source idl: com.oms.seller.SellerAo.java

package com.haiziwang.platform.study.lake.api.protocol;


import com.paipai.netframework.kernal.NetMessage;
import com.paipai.util.io.ByteStream;

/**
 *@date 2015-12-01 10:53:29
 *
 *@since version:0
*/
public class  GetSellerInfoReq extends NetMessage
{

	 private String machineKey = new String();

	 private String source = new String();

	 private long sceneId;

	 private long option;

	 private String inReserve = new String();


	public int serialize(ByteStream bs) throws Exception
	{
		bs.pushString(machineKey);
		bs.pushString(source);
		bs.pushUInt(sceneId);
		bs.pushLong(option);
		bs.pushString(inReserve);
		return bs.getWrittenLength();
	}
	
	public int unSerialize(ByteStream bs) throws Exception
	{
		machineKey = bs.popString();
		source = bs.popString();
		sceneId = bs.popUInt();
		option = bs.popLong();
		inReserve = bs.popString();
		return bs.getReadLength();
	}

	public long getCmdId()
	{
		return 0x200c1801L;
	}

	public String getMachineKey()
	{
		return machineKey;
	}

	public void setMachineKey(String value)
	{
		this.machineKey = value;
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String value)
	{
		this.source = value;
	}

	public long getSceneId()
	{
		return sceneId;
	}


	public void setSceneId(long value)
	{
		this.sceneId = value;
	}


	public long getOption()
	{
		return option;
	}

	public void setOption(long value)
	{
		this.option = value;
	}


	public String getInReserve()
	{
		return inReserve;
	}


	public void setInReserve(String value)
	{
		this.inReserve = value;
	}


	protected int getClassSize()
	{
		return  getSize() - 4;
	}

	
	public int getSize()
	{
		int length = 0;
		try{
				length = 0;  //size_of(GetSellerInfoReq)
				length += ByteStream.getObjectSize(machineKey, null);  //size_of(String)
				length += ByteStream.getObjectSize(source, null);      //size_of(String)
				length += 4;  //size_of(uint32_t)
				length += 17;  //size_of(uint64_t)
				length += ByteStream.getObjectSize(inReserve, null);   //size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
	public int getSize(String encoding)
	{
		int length = 0;
		try{
				length = 0;  //size_of(GetSellerInfoReq)
				length += ByteStream.getObjectSize(machineKey, encoding);  //size_of(String)
				length += ByteStream.getObjectSize(source, encoding);  //size_of(String)
				length += 4;  //size_of(uint32_t)
				length += 17;  //size_of(uint64_t)
				length += ByteStream.getObjectSize(inReserve, encoding);  //size_of(String)
		}catch(Exception e){
				e.printStackTrace();
		}
		return length;
	}
}
