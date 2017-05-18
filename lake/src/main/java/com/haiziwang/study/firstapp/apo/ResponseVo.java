package com.haiziwang.study.firstapp.apo;

import java.io.Serializable;

import com.haiziwang.study.firstapp.constant.Cons;

public class ResponseVo implements Serializable {

	private static final long serialVersionUID = 7651427154041673447L;
	// 错误码
	private String errorCode = Cons.Code.OPERATE_SUCCESS;
	// 成功标记
	private boolean success = true;

	private String msg;

	private Object data;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseVo [errorCode=" + this.errorCode + ", success=" + this.success + ", msg=" + this.msg + ", data=" + this.data + "]";
	}
}
