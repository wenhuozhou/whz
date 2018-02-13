package com.whz.shiro.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;

import com.whz.common.util.WebUtils;
import com.whz.model.common.MessageVo;
/**
 * 扩展shiro 的权限过滤器，如果是ajax返回json数据提示，不跳转到页面 
 * @author wenhz
 * @date 2018-2-4 下午11:09:18
 */
public class MyShiroPermissionsFilter extends PermissionsAuthorizationFilter{

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
			throws IOException {
		Subject subject = getSubject(request, response);
		if(subject.getPrincipal() == null){
			if(WebUtils.isAjax(request)){
				MessageVo messageVo = new MessageVo(false, "您尚未登录，或登录超时，请重新登录！");
				WebUtils.writeToJson(response, messageVo);
			}else{
				saveRequestAndRedirectToLogin(request, response);
			}
		}else{
			if(WebUtils.isAjax(request)){
				MessageVo messageVo = new MessageVo(false, "权限不足,请联系管理赋予相应权限！");
				WebUtils.writeToJson(response, messageVo);
			}else{
				String unauthorizedUrl = getUnauthorizedUrl();
				if(StringUtils.hasText(unauthorizedUrl)){
					org.apache.shiro.web.util.WebUtils.issueRedirect(request, response, unauthorizedUrl);
				}else{
					org.apache.shiro.web.util.WebUtils.toHttp(response).sendError(401);
				}
			}
		}
		return false;
	}
	
	
}
