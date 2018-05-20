package com.whz.common.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import com.alibaba.fastjson.JSONObject;
/**
 * web 工具类
 * @author wenhz
 * @date 2018-1-27 下午03:36:17
 */
public class WebUtils {
	
	/**
	 * 判断请求是否ajax请求
	 * @param request
	 * @return
	 * @author wenhz
	 * @date 2018-1-27 下午03:36:49
	 */
	public static boolean isAjax(ServletRequest request){
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		if(null != httpServletRequest.getHeader("X-Requested-With") 
				&& "XMLHttpRequest".equalsIgnoreCase(httpServletRequest.getHeader("X-Requested-With"))){
			return true;
		}
		return false;
	}
	
	/**
	 * 将对象以json输出
	 * @param response
	 * @param object
	 * @author wenhz
	 * @date 2018-1-27 下午03:33:50
	 */
	public static void writeToJson(ServletResponse response, Object object){
		try {
			PrintWriter writer = response.getWriter();
			String jsonStr = JSONObject.toJSONString(object);
			writer.print(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
