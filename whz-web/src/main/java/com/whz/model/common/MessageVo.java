package com.whz.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author wenhz
 * @date 2018-2-4 下午10:44:51
 */
public class MessageVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 92509429545475637L;

	private boolean success ;
	
	private Object message;
	
	private Long total;
	
	private List rows = new ArrayList();
	
	private Object other;
	
	
	public MessageVo() {
		super();
	}

	public MessageVo(boolean success, Object message) {
		super();
		this.success = success;
		this.message = message;
	}

	public MessageVo(Long total, List rows) {
		super();
		this.success = true;
		this.message = "查询成功!";
		this.total = total;
		this.rows = rows;
	}

	public MessageVo(boolean success, Object message, Long total, List rows) {
		super();
		this.success = success;
		this.message = message;
		this.total = total;
		this.rows = rows;
	}

	public MessageVo(boolean success, Object message, Long total, List rows,
			Object other) {
		super();
		this.success = success;
		this.message = message;
		this.total = total;
		this.rows = rows;
		this.other = other;
	}
	
	public void init(Long total, List rows){
		this.success = true;
		this.message = "查询成功!";
		this.total = total;
		this.rows = rows;
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public Object getOther() {
		return other;
	}

	public void setOther(Object other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "MessageVo [success=" + success + ", message=" + message
				+ ", total=" + total + ", rows=" + rows + ", other=" + other
				+ "]";
	}
}
