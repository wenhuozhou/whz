package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.RoleMapper;
import com.whz.model.sys.Role;
import com.whz.model.sys.RoleExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.RoleService;
/**
 * 角色服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role, RoleExample> implements RoleService{

}
