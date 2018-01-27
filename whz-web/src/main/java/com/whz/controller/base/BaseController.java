package com.whz.controller.base;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.whz.common.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  控制器基类
 * @author wenhz
 * @date 2018-1-27 下午03:41:12
 */
public abstract class BaseController {

	private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 统一异常处理
	 * @param request
	 * @param response
	 * @param exception
	 * @return
	 * @author wenhz
	 * @date 2018-1-27 下午03:41:45
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		LOGGER.error("统一异常处理：", exception);
		request.setAttribute("ex", exception);
		if (WebUtils.isAjax(request)) {
			request.setAttribute("requestHeader", "ajax");
		}
		// shiro没有权限异常
		if (exception instanceof UnauthorizedException) {
			return "/403.jsp";
		}
		// shiro会话已过期异常
		if (exception instanceof InvalidSessionException) {
			return "/error.jsp";
		}
		return "/error.jsp";
	}

	/**
	 * 返回jsp视图
	 * @param path
	 * @return
	 * @author wenhz
	 * @date 2018-1-27 下午03:41:25
	 */
	public static String jsp(String path) {
		System.out.println(path);
		return path.concat(".jsp");
	}

}
