package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.RoleMenuMapper;
import com.whz.model.sys.RoleMenu;
import com.whz.model.sys.RoleMenuExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.RoleMenuService;
/**
 * 角色菜单服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class RoleMenuServiceImpl extends BaseServiceImpl<RoleMenuMapper, RoleMenu, RoleMenuExample> implements RoleMenuService{

}
