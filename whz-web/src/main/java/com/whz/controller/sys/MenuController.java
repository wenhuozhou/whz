package com.whz.controller.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whz.controller.base.BaseController;
import com.whz.model.sys.Menu;
import com.whz.model.sys.MenuExample;
import com.whz.service.sys.MenuService;

/**
 * 系统菜单控制器
 * @author wenhz
 * @date 2018-1-27 下午03:43:54
 */
@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{
	@Resource
	private MenuService menuService;
	
	@RequestMapping("/get/{id}")
	public @ResponseBody Menu get(@PathVariable Integer id){
		return menuService.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据id查询该菜单的子菜单
	 * @param id
	 * @return
	 * @author wenhz
	 * @date 2018-2-4 下午04:07:13
	 */
	@RequestMapping("/listById")
	public @ResponseBody List<Menu> listById(Integer id){
		if(id == null){
			id = -1;
		}
		MenuExample example = new MenuExample();
		example.createCriteria().andPidEqualTo(id);
		return menuService.selectByExample(example);
	}
}
