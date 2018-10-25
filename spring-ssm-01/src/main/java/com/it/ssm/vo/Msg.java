package com.it.ssm.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>Title: Msg.java</p>  
 * <p>Description: 返回数据的封装类</p>  
 * <p>Copyright: Copyright (c) 2018</p>  
 * <p>Company: </p>  
 * @author thinkc  
 * @date 2018年4月30日  
 * @version 1.0
 */
public class Msg {
	//返回状态码
	private int code;
	//返回提示信息
	private String msg;
	//返回的数据
	private Map<String , Object> map = new HashMap<String, Object>();
	
	public static Msg success() {
		Msg messge = new Msg();
		messge.setCode(100);
		messge.setMsg("操作成功");
		return messge;
	}
	public static Msg fail() {
		Msg messge = new Msg();
		messge.setCode(200);
		messge.setMsg("操作失败");
		return messge;
	}
	public Msg add(String key, Object value){
        this.getMap().put(key, value);
        return this;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	

}










