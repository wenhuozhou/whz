package com.whz.controller.sys;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whz.common.constant.MessageConstant;
import com.whz.controller.base.BaseController;
import com.whz.model.common.MessageVo;
import com.whz.model.sys.User;
import com.whz.model.sys.UserExample;
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
	
	@RequestMapping("/list")
	public @ResponseBody MessageVo list(User user, int page, int rows){
		MessageVo mv = new MessageVo();	
		UserExample example = new UserExample();
		if(user != null){
			com.whz.model.sys.UserExample.Criteria criteria = example.createCriteria();
			if(StringUtils.isNotBlank(user.getAccount())){
				criteria.andAccountEqualTo(user.getAccount());
			}
			if(StringUtils.isNotBlank(user.getName())){
				criteria.andNameLike("%"+user.getName()+"%");
			}
		}
		PageHelper.startPage(page, rows);
		List<User> userList= userService.selectByExample(example);
		PageInfo<User> pageInfo = new PageInfo<User>(userList);
		mv.init(pageInfo.getTotal(), userList);
		return mv;
	}
	
	@RequestMapping("/insert")
	public @ResponseBody MessageVo insert(User user){
		UserExample example = new UserExample();
		example.createCriteria().andAccountEqualTo(user.getAccount());
		User oldUser = userService.selectFirstByExample(example);
		if(oldUser != null){
			MessageVo mv = new MessageVo(false,MessageConstant.DATA_IS_EXIST);
			return mv;
		}
		user.setPassword("123456");
		user.setUseStatus(true);
		user.setGmtCreate(new Date());
		user.setGmtModfied(new Date());
		userService.insert(user);
		MessageVo mv = new MessageVo(true,MessageConstant.SAVE_SUCCESS);
		return mv;
	}
	
	@RequestMapping("/update")
	public @ResponseBody MessageVo update(User user){		
		User oldUser = userService.selectByPrimaryKey(user.getId());
		if(oldUser == null){
			MessageVo mv = new MessageVo(false,MessageConstant.DATA_NOT_EXIST);
			return mv;
		}
		oldUser.setName(user.getName());
		oldUser.setDescription(user.getDescription());
		oldUser.setGmtModfied(new Date());
		userService.updateByPrimaryKeySelective(oldUser);
		MessageVo mv = new MessageVo(true,MessageConstant.UPDATE_SUCCESS);
		return mv;
	}
	
	
	@RequestMapping("/delete")
	public @ResponseBody MessageVo deleteUser(Integer id){
		userService.deleteByPrimaryKey(id);
		MessageVo mv = new MessageVo(true,MessageConstant.DELETE_SUCCESS);
		return mv;
	}
	
}
