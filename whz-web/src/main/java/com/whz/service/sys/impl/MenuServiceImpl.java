package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.MenuMapper;
import com.whz.model.sys.Menu;
import com.whz.model.sys.MenuExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.MenuService;
/**
 * 菜单服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, Menu, MenuExample> implements MenuService{

}
