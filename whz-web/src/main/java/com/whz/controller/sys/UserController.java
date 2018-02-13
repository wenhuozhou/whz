package com.whz.controller.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whz.controller.base.BaseController;
import com.whz.model.sys.User;
import com.whz.service.sys.UserService;

/**
 * 系统用户控制器
 * @author wenhz
 * @date 2018-1-27 下午03:43:54
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	@Resource
	private UserService userService;
	
	@RequestMapping("/get/{id}")
	public @ResponseBody User get(@PathVariable Integer id){
		return userService.selectByPrimaryKey(id);
	}
	
}
